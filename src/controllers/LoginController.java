package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.User;
import services.AuthService;
import utils.DatabaseSetup;

public class LoginController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label messageLabel;

    private final AuthService authService = new AuthService();

    // Called by FXMLLoader after fields injected
    public void initialize() {
        DatabaseSetup.initialize(); // ensure DB + default users exist
    }

    @FXML
    private void onLogin() {
        String u = usernameField.getText().trim();
        String p = passwordField.getText().trim();
        if (u.isEmpty() || p.isEmpty()) {
            messageLabel.setText("Fill both fields");
            return;
        }
        User user = authService.login(u,p);
        if (user == null) {
            messageLabel.setText("Invalid credentials");
            return;
        }

        // route by role
        try {
            Stage s = (Stage) usernameField.getScene().getWindow();
            if ("admin".equalsIgnoreCase(user.getRole())) {
                // load admin dashboard placeholder
                Scene scene = new Scene(new javafx.scene.control.Label("Admin Dashboard - (replace with real view)"), 600, 400);
                s.setScene(scene);
            } else {
                Scene scene = new Scene(new javafx.scene.control.Label("Student Dashboard - (replace with real view)"), 600, 400);
                s.setScene(scene);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void onGuest() {
        try {
            Stage s = (Stage) usernameField.getScene().getWindow();
            Scene scene = new Scene(new javafx.scene.control.Label("Guest - Student Dashboard (replace)"), 600, 400);
            s.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
