package services.student;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentLogin {

    public static void show(Stage stage) {
        stage.setTitle("Student Login");

        Label title = new Label("Student Login");
        title.setStyle("-fx-font-size: 22; -fx-font-weight: bold;");

        TextField username = new TextField();
        username.setPromptText("Enter username");

        PasswordField password = new PasswordField();
        password.setPromptText("Enter password");

        Button loginBtn = new Button("Login");
        Button registerBtn = new Button("New User? Register");

        loginBtn.setOnAction(e -> {
            // For now no DB check — directly open dashboard
            StudentDashboard.show(stage);
        });

        registerBtn.setOnAction(e -> StudentRegister.show(stage));

        VBox root = new VBox(15, title, username, password, loginBtn, registerBtn);
        root.setPadding(new Insets(20));

        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }
}
