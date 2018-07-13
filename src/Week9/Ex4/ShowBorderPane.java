package Week9.Ex4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create our border pane
        BorderPane pane = new BorderPane();

        // Add components
        pane.setTop(new CustomPane("Top", "white"));
        pane.setRight(new CustomPane("Right", "green"));
        pane.setBottom(new CustomPane("Bottom", "orange"));
        pane.setLeft(new CustomPane("Left", "blue"));
        pane.setCenter(new CustomPane("Center", "pink"));

        // Application setup
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Show Border Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class CustomPane extends StackPane {
    public CustomPane(String title, String col) {
        getChildren().add(new Label(title));
        // setStyle("-fx-border-color: red");
        setStyle("-fx-background-color: " + col);
        setPadding(new Insets(11, 12, 13, 14));
    }
}
