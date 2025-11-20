package services.student;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TokenPage {

    public static void show(Stage stage) {
        stage.setTitle("Your Token");

        Label title = new Label("Token Generated!");
        title.setStyle("-fx-font-size: 22; -fx-font-weight: bold;");

        Label tokenLabel = new Label("Your token: #102");
        tokenLabel.setStyle("-fx-font-size: 18;");

        Button backBtn = new Button("Back to Dashboard");
        backBtn.setOnAction(e -> StudentDashboard.show(stage));

        VBox root = new VBox(15, title, tokenLabel, backBtn);
        root.setPadding(new Insets(20));

        stage.setScene(new Scene(root, 400, 250));
        stage.show();
    }
}
