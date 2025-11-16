package views;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class LoginView {

    public VBox getView() {
        Text title = new Text("SmartCanteen");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        Button studentBtn = new Button("Login as Student");
        Button adminBtn = new Button("Login as Admin");

        VBox layout = new VBox(15, title, studentBtn, adminBtn);
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
