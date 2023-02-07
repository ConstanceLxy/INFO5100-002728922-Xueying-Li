public class Shoe {

    private String brand;
    private String model;
    private String color;
    private int size;
    private double price;
    private boolean isLaceUp;
    private int stock;
    private String material;
    private static int count;

    public Shoe(String brand, String model, String color, int size, double price, boolean isLaceUp, int stock, String material) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isLaceUp = isLaceUp;
        this.stock = stock;
        this.material = material;
        count++;
        System.out.println("Shoe instance created with ID: " + count);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return this.stock;
    }

    public void showDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Size: " + this.size);
        System.out.println("Price: " + this.price);
        System.out.println("Lace-up: " + this.isLaceUp);
        System.out.println("Stock: " + this.stock);
        System.out.println("Material: " + this.material);
    }

    class ShoeInner1 {
        private int innerProp1;
        private String innerProp2;
    }

    class ShoeInner2 {
        private double innerProp3;
        private boolean innerProp4;
    }

    public static void main(String[] args) {
        Shoe shoe1 = new Shoe("Nike", "Air Max", "Black", 8, 120.0, true, 10, "Leather");
        Shoe shoe2 = new Shoe("Adidas", "Ultra Boost", "White", 9, 140.0, true, 8, "Mesh");
        Shoe shoe3 = new Shoe("Puma", "Clyde", "Red", 10, 90.0, false, 12, "Suede");
    }
}


