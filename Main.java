import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text and Image Display");
        Label label = new Label("Hello, JavaFX!");
        label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        Image image = new Image("https://picsum.photos/300/200");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);
        imageView.setPreserveRatio(true);
        VBox vbox = new VBox(20);
        vbox.getChildren().addAll(label, imageView);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
