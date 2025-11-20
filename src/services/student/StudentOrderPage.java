package services.student;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentOrderPage {

    public static void show(Stage stage) {
        stage.setTitle("Place Order");

        Label title = new Label("Order Food");
        title.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");

        Label info = new Label("Order functionality will be added soon!");

        Button backBtn = new Button("Back");
        backBtn.setOnAction(e -> StudentDashboard.show(stage));

        VBox root = new VBox(15, title, info, backBtn);
        root.setPadding(new Insets(20));

        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }
}
