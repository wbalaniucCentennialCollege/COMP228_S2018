package Week9.Ex5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Setup our pane
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);

        // Create our components
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");

        // Register components for events
        OKHandleClass handler1 = new OKHandleClass();
        btOK.setOnAction(handler1);

        CancelHandleClass handler2 = new CancelHandleClass();
        btCancel.setOnAction(handler2);

        // Add components
        pane.getChildren().addAll(btOK, btCancel);

        // Application setup
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Handling Events");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class OKHandleClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("OK button clicked");
    }
}

class CancelHandleClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Cancel button clicked");
    }
}
