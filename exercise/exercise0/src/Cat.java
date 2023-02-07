class Cat {
    private String name;
    private int age;
    private String breed;
    private String color;
    private double weight;
    private boolean isDomesticated;
    private static int idCounter = 0;
    private int id;

    public Cat(String name, int age, String breed, String color, double weight, boolean isDomesticated) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.isDomesticated = isDomesticated;
        idCounter++;
        this.id = idCounter;
        System.out.println("Cat instance created with ID: " + id + " and name: " + name);
    }

    class Fur {
        private boolean isShort;
        private String length;

        public Fur(boolean isShort, String length) {
            this.isShort = isShort;
            this.length = length;
        }
    }

    class Claw {
        private boolean isRetractable;
        private int length;

        public Claw(boolean isRetractable, int length) {
            this.isRetractable = isRetractable;
            this.length = length;
        }
    }

    public void purr() {
        System.out.println("Purr");
    }

    public void meow() {
        System.out.println("Meow");
    }

    public void scratch() {
        System.out.println("Scratch");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Mittens", 3, "Siamese", "Gray", 10.5, true);
        Cat cat2 = new Cat("Whiskers", 5, "Persian", "White", 12.5, true);
        Cat cat3 = new Cat("Shadow", 2, "Russian Blue", "Gray", 9.5, true);
    }
}



