import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label title = new Label("Smart Canteen System");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        ComboBox<String> roleCombo = new ComboBox<>();
        roleCombo.getItems().addAll("Admin", "Student");
        roleCombo.setPromptText("Select Role");

        ListView<String> menuList = new ListView<>();
        menuList.getItems().addAll(
            "Idli - ₹20",
            "Dosa - ₹40",
            "Tea - ₹10"
        );

        Button loginBtn = new Button("Continue");
        loginBtn.setOnAction(e -> {
            System.out.println("Role selected: " + roleCombo.getValue());
        });

        VBox layout = new VBox(12, title, roleCombo, menuList, loginBtn);
        Scene scene = new Scene(layout, 350, 350);

        primaryStage.setTitle("SmartCanteen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
