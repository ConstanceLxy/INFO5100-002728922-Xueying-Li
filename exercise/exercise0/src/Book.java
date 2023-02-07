public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int pageCount;
    private String publisher;
    private int publicationYear;
    private String genre;
    private String format;

    public Book(String title, String author, String ISBN, int pageCount, String publisher, int publicationYear, String genre, String format) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.format = format;
        System.out.println("A new Book instance has been created with ID: " + this.hashCode());
    }

    public void read() {
        System.out.println("Read");
    }

    public void borrow() {
        System.out.println("Borrow");
    }

    public void donate() {
        System.out.println("Donate");
    }

    public static class Edition {
        private int editionNumber;
        private String language;

        public Edition(int editionNumber, String language) {
            this.editionNumber = editionNumber;
            this.language = language;
        }
    }

    public static class Cover {
        private String color;
        private String material;

        public Cover(String color, String material) {
            this.color = color;
            this.material = material;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789", 281, "Grand Central Publishing", 1960, "Fiction", "Hardcover");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 180, "Scribner", 1925, "Fiction", "Paperback");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "9780199535569", 279, "Oxford University Press", 1813, "Fiction", "Hardcover");

        Book.Edition edition1 = new Book.Edition(1, "English");
        Book.Cover cover1 = new Book.Cover("Black", "Leather");
    }
}


