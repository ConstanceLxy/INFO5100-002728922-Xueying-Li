public class ChanelBag {
    private int id;
    private String name;
    private double price;
    private String color;
    private String material;
    private boolean isLeather;
    private boolean isLimitedEdition;
    private int stock;

    // nested classes
    class Features {
        private String featureName;
        private String featureDescription;
    }

    class Reviews {
        private int rating;
        private String comments;
    }

    // constructor
    public ChanelBag(int id, String name, double price, String color, String material, boolean isLeather, boolean isLimitedEdition, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.material = material;
        this.isLeather = isLeather;
        this.isLimitedEdition = isLimitedEdition;
        this.stock = stock;
        System.out.println("ChanelBag instance created with name " + name + " and id " + id);
    }

    // methods
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Displaying Chanel bag details...");
    }

    // main method
    public static void main(String[] args) {
        ChanelBag bag1 = new ChanelBag(1, "Classic Flap", 4500.00, "Black", "Leather", true, false, 20);
        ChanelBag bag2 = new ChanelBag(2, "Boy Bag", 4200.00, "Beige", "Caviar", true, false, 25);
        ChanelBag bag3 = new ChanelBag(3, "Gabrielle", 3900.00, "White", "Lambskin", true, true, 15);
    }
}


