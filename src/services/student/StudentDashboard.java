package services.student;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentDashboard {

    public static void show(Stage stage) {
        stage.setTitle("Student Dashboard");

        Label title = new Label("Welcome Student!");
        title.setStyle("-fx-font-size: 22; -fx-font-weight: bold;");

        Button orderBtn = new Button("Place Order");
        Button tokenBtn = new Button("View Token");
        Button logoutBtn = new Button("Logout");

        orderBtn.setOnAction(e -> StudentOrderPage.show(stage));
        tokenBtn.setOnAction(e -> TokenPage.show(stage));
        logoutBtn.setOnAction(e -> StudentLogin.show(stage));

        VBox root = new VBox(15, title, orderBtn, tokenBtn, logoutBtn);
        root.setPadding(new Insets(20));

        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }
}
