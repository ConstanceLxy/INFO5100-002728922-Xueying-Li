import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FourFunctionCalculator extends Application {

    private TextField number1Field;
    private TextField number2Field;
    private Label resultLabel;

    @Override
    public void start(Stage primaryStage) {

        // Create the input fields and result label
        number1Field = new TextField();
        number2Field = new TextField();
        resultLabel = new Label("Result");

        // Create the operation buttons
        Button addButton = new Button("+");
        addButton.setOnAction(e -> addNumbers());
        Button subtractButton = new Button("-");
        subtractButton.setOnAction(e -> subtractNumbers());
        Button multiplyButton = new Button("*");
        multiplyButton.setOnAction(e -> multiplyNumbers());
        Button divideButton = new Button("/");
        divideButton.setOnAction(e -> divideNumbers());

        // Create the grid pane and add the components
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Number 1:"), 0, 0);
        gridPane.add(number1Field, 1, 0);
        gridPane.add(new Label("Number 2:"), 0, 1);
        gridPane.add(number2Field, 1, 1);
        gridPane.add(addButton, 0, 2);
        gridPane.add(subtractButton, 1, 2);
        gridPane.add(multiplyButton, 0, 3);
        gridPane.add(divideButton, 1, 3);
        gridPane.add(resultLabel, 0, 4);

        // Create the scene and set it on the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Four-Function Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addNumbers() {
        double number1 = Double.parseDouble(number1Field.getText());
        double number2 = Double.parseDouble(number2Field.getText());
        double result = number1 + number2;
        resultLabel.setText("Result: " + result);
    }

    private void subtractNumbers() {
        double number1 = Double.parseDouble(number1Field.getText());
        double number2 = Double.parseDouble(number2Field.getText());
        double result = number1 - number2;
        resultLabel.setText("Result: " + result);
    }

    private void multiplyNumbers() {
        double number1 = Double.parseDouble(number1Field.getText());
        double number2 = Double.parseDouble(number2Field.getText());
        double result = number1 * number2;
        resultLabel.setText("Result: " + result);
    }

    private void divideNumbers() {
        double number1 = Double.parseDouble(number1Field.getText());
        double number2 = Double.parseDouble(number2Field.getText());
        double result = number1 / number2;
        resultLabel.setText("Result: " + result);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

