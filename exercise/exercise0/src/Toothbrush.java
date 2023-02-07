public class Toothbrush {
    private String brand;
    private String model;
    private String color;
    private boolean rechargeable;
    private int brushHeadCount;
    private int batteryLife;
    private String material;
    private boolean hasTimer;

    public Toothbrush(String brand, String model, String color, boolean rechargeable, int brushHeadCount, int batteryLife, String material, boolean hasTimer) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.rechargeable = rechargeable;
        this.brushHeadCount = brushHeadCount;
        this.batteryLife = batteryLife;
        this.material = material;
        this.hasTimer = hasTimer;
        System.out.println("A new Toothbrush instance has been created with ID: " + this.hashCode());
    }

    public void brush() {
        System.out.println("Brush");
    }

    public void recharge() {
        System.out.println("Recharge");
    }

    public void replaceBrushHead() {
        System.out.println("Replace Brush Head");
    }

    public static class BrushHead {
        private String type;
        private String material;

        public BrushHead(String type, String material) {
            this.type = type;
            this.material = material;
        }
    }

    public static class Charger {
        private String type;
        private String material;

        public Charger(String type, String material) {
            this.type = type;
            this.material = material;
        }
    }

    public static void main(String[] args) {
        Toothbrush toothbrush1 = new Toothbrush("Oral-B", "Pro 1000", "Black", true, 2, 7, "Plastic", true);
        Toothbrush toothbrush2 = new Toothbrush("Sonicare", "EssentialClean", "White", true, 1, 14, "Plastic", false);
        Toothbrush toothbrush3 = new Toothbrush("Colgate", "ProClinical 250", "White", false, 2, 0, "Plastic", true);

        Toothbrush.BrushHead brushHead1 = new Toothbrush.BrushHead("CrossAction", "Nylon");
        Toothbrush.Charger charger1 = new Toothbrush.Charger("Travel", "Plastic");
    }
}



