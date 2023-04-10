import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BookParser {
    public static void main(String[] args) {
        try {
            // Parse XML
            File inputFile = new File("books.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Parse JSON
            File jsonFile = new File("books.json");
            JSONTokener tokener = new JSONTokener(new FileInputStream(jsonFile));
            JSONObject jsonObject = new JSONObject(tokener);

            // Print XML books
            System.out.println("Books from XML:");
            NodeList bookNodes = doc.getElementsByTagName("Book");
            for (int i = 0; i < bookNodes.getLength(); i++) {
                Node node = bookNodes.item(i);
                printBook(node);
            }

            // Print JSON books
            System.out.println("\nBooks from JSON:");
            JSONArray bookArray = jsonObject.getJSONArray("BookShelf");
            for (int i = 0; i < bookArray.length(); i++) {
                JSONObject book = bookArray.getJSONObject(i);
                printBook(book);
            }

            // Add a book to XML
            Element newBook = doc.createElement("Book");

            Element newTitle = doc.createElement("title");
            newTitle.appendChild(doc.createTextNode("Book 4"));
            newBook.appendChild(newTitle);

            Element newPublishedYear = doc.createElement("publishedYear");
            newPublishedYear.appendChild(doc.createTextNode("2022"));
            newBook.appendChild(newPublishedYear);

            Element newNumberOfPages = doc.createElement("numberOfPages");
            newNumberOfPages.appendChild(doc.createTextNode("400"));
            newBook.appendChild(newNumberOfPages);

            Element newAuthors = doc.createElement("authors");
            Element newAuthor1 = doc.createElement("author");
            newAuthor1.appendChild(doc.createTextNode("Author G"));
            newAuthors.appendChild(newAuthor1);

            Element newAuthor2 = doc.createElement("author");
            newAuthor2.appendChild(doc.createTextNode("Author H"));
            newAuthors.appendChild(newAuthor2);

            newBook.appendChild(newAuthors);

            doc.getDocumentElement().appendChild(newBook);

            // Add a book to JSON
            JSONObject newJsonBook = new JSONObject();
            newJsonBook.put("title", "Book 4");
            newJsonBook.put("publishedYear", 2022);
            newJsonBook.put("numberOfPages", 400);
            JSONArray newJsonAuthors = new JSONArray();
            newJsonAuthors.put("Author G");
            newJsonAuthors.put("Author H");
            newJsonBook.put("authors", newJsonAuthors);

            bookArray.put(newJsonBook);

            // Print updated XML books
            System.out.println("\nUpdated books from XML:");
            bookNodes = doc.getElementsByTagName("Book");
            for (int i = 0; i < bookNodes.getLength(); i++) {
                Node node = bookNodes.item(i);
                printBook(node);
            }

            // Print updated JSON books
            System.out.println("\nUpdated books from JSON:");
            for (int i = 0; i < bookArray.length(); i++) {
                JSONObject book = bookArray.getJSONObject(i);
                printBook(book);
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {


