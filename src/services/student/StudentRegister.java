package services.student;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentRegister {

    public static void show(Stage stage) {
        stage.setTitle("Student Registration");

        Label title = new Label("Register New Student");
        title.setStyle("-fx-font-size: 22; -fx-font-weight: bold;");

        TextField username = new TextField();
        username.setPromptText("Enter username");

        PasswordField pass = new PasswordField();
        pass.setPromptText("Enter password");

        PasswordField confirmPass = new PasswordField();
        confirmPass.setPromptText("Confirm password");

        Button registerBtn = new Button("Register");
        Button backBtn = new Button("Back to Login");

        registerBtn.setOnAction(e -> {
            if (username.getText().isEmpty() || pass.getText().isEmpty()) {
                showAlert("Please fill all fields!");
                return;
            }

            if (!pass.getText().equals(confirmPass.getText())) {
                showAlert("Passwords do not match!");
                return;
            }

            showAlert("Registration successful!");
            StudentLogin.show(stage);
        });

        backBtn.setOnAction(e -> StudentLogin.show(stage));

        VBox root = new VBox(15, title, username, pass, confirmPass, registerBtn, backBtn);
        root.setPadding(new Insets(20));

        stage.setScene(new Scene(root, 400, 350));
        stage.show();
    }

    private static void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.show();
    }
}
