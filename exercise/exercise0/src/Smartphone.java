public class Smartphone {
    private String brand;
    private String model;
    private int storage;
    private int memory;
    private String operatingSystem;
    private String processor;
    private int cameraPixels;
    private int batteryLife;

    public Smartphone(String brand, String model, int storage, int memory, String operatingSystem, String processor, int cameraPixels, int batteryLife) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.cameraPixels = cameraPixels;
        this.batteryLife = batteryLife;
        System.out.println("A new Smartphone instance has been created with ID: " + this.hashCode());
    }

    public void call() {
        System.out.println("Call");
    }

    public void text() {
        System.out.println("Text");
    }

    public void takePicture() {
        System.out.println("Take Picture");
    }

    public static class Screen {
        private int size;
        private String resolution;

        public Screen(int size, String resolution) {
            this.size = size;
            this.resolution = resolution;
        }
    }

    public static class Battery {
        private int capacity;
        private boolean fastCharging;

        public Battery(int capacity, boolean fastCharging) {
            this.capacity = capacity;
            this.fastCharging = fastCharging;
        }
    }

    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Apple", "iPhone X", 64, 4, "iOS", "A11 Bionic Chip", 12, 2716);
        Smartphone smartphone2 = new Smartphone("Samsung", "Galaxy S10", 128, 8, "Android", "Snapdragon 855", 12, 3400);
        Smartphone smartphone3 = new Smartphone("Google", "Pixel 4", 64, 6, "Android", "Snapdragon 855", 12, 2800);

        Smartphone.Screen screen1 = new Smartphone.Screen(5, "1125 x 2436");
        Smartphone.Battery battery1 = new Smartphone.Battery(2716, true);
    }
}



