public class Computer {
    private String brand;
    private String model;
    private int storage;
    private int memory;
    private String operatingSystem;
    private String processor;
    private String graphicsCard;
    private boolean touchScreen;

    public Computer(String brand, String model, int storage, int memory, String operatingSystem, String processor, String graphicsCard, boolean touchScreen) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.touchScreen = touchScreen;
        System.out.println("A new Computer instance has been created with ID: " + this.hashCode());
    }

    public void displaySpecs() {
        System.out.println("Display Specs");
    }

    public void runPrograms() {
        System.out.println("Run Programs");
    }

    public void playGames() {
        System.out.println("Play Games");
    }

    public static class Keyboard {
        private String layout;
        private boolean backlit;

        public Keyboard(String layout, boolean backlit) {
            this.layout = layout;
            this.backlit = backlit;
        }
    }

    public static class Mouse {
        private String type;
        private int buttons;

        public Mouse(String type, int buttons) {
            this.type = type;
            this.buttons = buttons;
        }
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("Dell", "Inspiron", 256, 8, "Windows 10", "Intel i5", "Nvidia GTX", false);
        Computer computer2 = new Computer("Apple", "Macbook Pro", 512, 16, "MacOS", "Intel i7", "AMD Radeon Pro", false);
        Computer computer3 = new Computer("HP", "Envy", 128, 4, "Windows 10", "Intel i3", "Intel UHD Graphics", true);

        Computer.Keyboard keyboard1 = new Computer.Keyboard("QWERTY", true);
        Computer.Mouse mouse1 = new Computer.Mouse("Wireless", 3);
    }
}



