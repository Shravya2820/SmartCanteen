package views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class StudentView {

    public VBox getView() {
        Label title = new Label("Student - Order Food");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        ComboBox<String> menuDropdown = new ComboBox<>();
        menuDropdown.getItems().addAll("Idli - ₹30", "Dosa - ₹40", "Vada - ₹20");

        TextField qtyField = new TextField();
        qtyField.setPromptText("Enter quantity");

        Button orderBtn = new Button("Place Order");

        VBox layout = new VBox(10, title, menuDropdown, qtyField, orderBtn);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
