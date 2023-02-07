public class Toothpaste {
    private String brand;
    private String flavor;
    private String ingredients;
    private boolean isWhitening;
    private boolean isFluoride;
    private int size;
    private String packaging;
    private boolean isOrganic;

    public Toothpaste(String brand, String flavor, String ingredients, boolean isWhitening, boolean isFluoride, int size, String packaging, boolean isOrganic) {
        this.brand = brand;
        this.flavor = flavor;
        this.ingredients = ingredients;
        this.isWhitening = isWhitening;
        this.isFluoride = isFluoride;
        this.size = size;
        this.packaging = packaging;
        this.isOrganic = isOrganic;
        System.out.println("A new Toothpaste instance has been created with ID: " + this.hashCode());
    }

    public void use() {
        System.out.println("Use");
    }

    public void store() {
        System.out.println("Store");
    }

    public void dispose() {
        System.out.println("Dispose");
    }

    public static class Brush {
        private String material;
        private String color;

        public Brush(String material, String color) {
            this.material = material;
            this.color = color;
        }
    }

    public static class Container {
        private String material;
        private String shape;

        public Container(String material, String shape) {
            this.material = material;
            this.shape = shape;
        }
    }

    public static void main(String[] args) {
        Toothpaste toothpaste1 = new Toothpaste("Colgate", "Mint", "Calcium Carbonate, Sorbitol, etc.", true, true, 100, "Tube", false);
        Toothpaste toothpaste2 = new Toothpaste("Sensodyne", "Extra Fresh", "Potassium Nitrate, etc.", false, true, 75, "Tube", false);
        Toothpaste toothpaste3 = new Toothpaste("Tom's of Maine", "Peppermint", "Calcium Carbonate, etc.", false, true, 50, "Tube", true);

        Toothpaste.Brush brush1 = new Toothpaste.Brush("Nylon", "Blue");
        Toothpaste.Container container1 = new Toothpaste.Container("Plastic", "Round");
    }
}



