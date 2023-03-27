import java.util.ArrayList;
import java.util.List;

// Main program that demonstrates the use of the three design patterns
public class DesignPatternsDemo {
    public static void main(String[] args) {
        // Builder Pattern Example
        CatBuilder builder = new CatBuilder();
        builder.buildName("Luna");
        builder.buildAge(2);
        builder.buildBreed("Siamese");
        builder.buildColor("white");
        builder.buildFavoriteToy("mouse");
        builder.buildFavoriteToy("string");
        Cat cat = builder.getCat();
        System.out.println("Created cat: " + cat.getDescription());

        // Command Pattern Example
        CatShelter shelter = new CatShelter();
        shelter.addCat(cat);
        AdoptCatCommand adoptCommand = new AdoptCatCommand(cat, shelter);
        shelter.addCommand(adoptCommand);
        ReturnCatCommand returnCommand = new ReturnCatCommand(cat, shelter);
        shelter.addCommand(returnCommand);
        shelter.executeCommands();

        // Iterator Pattern Example
        List<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(new Cat());
        cats.add(new Cat());
        CatIterator iterator = new CatList(cats);
        while (iterator.hasNext()) {
            Cat currentCat = iterator.next();
            System.out.println(currentCat.getDescription());
        }
    }
}
