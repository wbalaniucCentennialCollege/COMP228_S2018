package Week9.Ex2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;

public class ShowFlowPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create and setup flow pane properties
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);

        // Add components to the pane.
        pane.getChildren().addAll(new Label("First Name: "), new TextField(), new Label("MI: "));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name: "), new TextField());

        // Application setup
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Show Flow Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
