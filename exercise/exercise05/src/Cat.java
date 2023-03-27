import java.util.ArrayList;
import java.util.List;

// Design Pattern 1: Builder Pattern
// Allows the creation of complex objects step by step, with the ability to vary the internal representation of the object.
class Cat {
    private String name;
    private int age;
    private String breed;
    private String color;
    private List<String> favoriteToys = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addFavoriteToy(String toy) {
        favoriteToys.add(toy);
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" is a ").append(age).append(" year old ");
        sb.append(color).append(" ").append(breed).append(" cat, who loves playing with ");
        sb.append(favoriteToys.size()).append(" toys: ");
        for (String toy : favoriteToys) {
            sb.append(toy).append(", ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}

class CatBuilder {
    private Cat cat;

    public CatBuilder() {
        cat = new Cat();
    }

    public void buildName(String name) {
        cat.setName(name);
    }

    public void buildAge(int age) {
        cat.setAge(age);
    }

    public void buildBreed(String breed) {
        cat.setBreed(breed);
    }

    public void buildColor(String color) {
        cat.setColor(color);
    }

    public void buildFavoriteToy(String toy) {
        cat.addFavoriteToy(toy);
    }

    public Cat getCat() {
        return cat;
    }
}

// Design Pattern 2: Command Pattern
// Encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
interface Command {
    void execute();
}

class CatShelter {
    private List<Cat> cats = new ArrayList<>();
    private List<Command> commands = new ArrayList<>();

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public void removeCat(Cat cat) {
        cats.remove(cat);
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void listCats() {
        for (Cat cat : cats) {
            System.out.println(cat.getDescription());
        }
    }
}

class AdoptCatCommand implements Command {
    private Cat cat;
    private CatShelter shelter;

    public AdoptCatCommand(Cat cat, CatShelter shelter) {
        this.cat = cat;
        this.shelter = shelter;
    }

    @Override
    public void execute() {
        shelter.removeCat(cat);
        System.out.println("Adopted cat: " + cat.getDescription());
    }
}

class ReturnCatCommand implements Command {
    private Cat cat;
    private CatShelter shelter;

    public ReturnCatCommand(Cat cat, CatShelter shelter) {
        this.cat = cat;
        this.shelter = shelter;
    }

    @Override
    public void execute() {
        shelter.addCat(cat);
        System.out.println("Returned cat: " + cat.getDescription());
    }
}

// access the elements of an aggregate object sequentially without exposing its underlying representation.
interface CatIterator {
    boolean hasNext();

    Cat next();
}

class CatList implements CatIterator {
    private List<Cat> cats;
    private int currentIndex;

    public CatList(List<Cat> cats) {
        this.cats = cats;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < cats.size();
    }

    @Override
    public Cat next() {
        return cats.get(currentIndex++);
    }
}

