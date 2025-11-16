package views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class AdminView {

    public VBox getView() {
        Label title = new Label("Admin - View Orders");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        ListView<String> ordersList = new ListView<>();
        ordersList.getItems().add("No orders yet");

        VBox layout = new VBox(10, title, ordersList);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
