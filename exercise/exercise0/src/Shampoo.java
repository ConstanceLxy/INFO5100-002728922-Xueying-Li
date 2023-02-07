public class Shampoo {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String brand;
    private String type;
    private boolean isOrganic;
    private boolean isForMen;

    // nested classes
    class Ingredients {
        private String name;
        private int quantity;
    }

    class Reviews {
        private int rating;
        private String comments;
    }

    // constructor
    public Shampoo(int id, String name, double price, int quantity, String brand, String type, boolean isOrganic, boolean isForMen) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.type = type;
        this.isOrganic = isOrganic;
        this.isForMen = isForMen;
        System.out.println("Shampoo instance created with name " + name + " and id " + id);
    }

    // methods
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Displaying shampoo details...");
    }

    // main method
    public static void main(String[] args) {
        Shampoo shampoo1 = new Shampoo(1, "Head & Shoulders", 15.99, 100, "P&G", "Dandruff", false, false);
        Shampoo shampoo2 = new Shampoo(2, " Dove", 12.49, 50, "Unilever", "Moisturizing", false, false);
        Shampoo shampoo3 = new Shampoo(3, "Herbal Essences", 17.99, 75, "P&G", "Volumizing", true, false);
    }
}



