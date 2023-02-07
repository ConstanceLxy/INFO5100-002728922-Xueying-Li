public class Lipstick {
    private int id;
    private String name;
    private double price;
    private String color;
    private String finish;
    private int ounces;
    private boolean isOrganic;
    private boolean isGlutenFree;

    // nested classes
    class Ingredients {
        private String ingredientName;
        private String ingredientDescription;
    }

    class Reviews {
        private int rating;
        private String comments;
    }

    // constructor
    public Lipstick(int id, String name, double price, String color, String finish, int ounces, boolean isOrganic, boolean isGlutenFree) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.finish = finish;
        this.ounces = ounces;
        this.isOrganic = isOrganic;
        this.isGlutenFree = isGlutenFree;
        System.out.println("Lipstick instance created with name " + name + " and id " + id);
    }

    // methods
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Displaying lipstick details...");
    }

    // main method
    public static void main(String[] args) {
        Lipstick lipstick1 = new Lipstick(1, "Ruby Woo", 20.00, "Red", "Matte", 1, false, false);
        Lipstick lipstick2 = new Lipstick(2, "Harmony", 18.00, "Pink", "Gloss", 1, false, false);
        Lipstick lipstick3 = new Lipstick(3, "Satin", 16.00, "Nude", "Satin", 1, false, false);
    }
}




