package Week9.Ex7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LambdaHandlerDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Layout
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        // Create and add buttons
        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        Button btSave = new Button("Save");
        Button btPrint = new Button("Print");
        hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);

        // Set up event handling
        btNew.setOnAction((ActionEvent e) -> {
            System.out.println("Process New");
        });

        btOpen.setOnAction((e) -> {
            System.out.println("Process Open");
        });
        btSave.setOnAction(e -> {
            System.out.println("Process Save");
        });
        btPrint.setOnAction(e->System.out.println("Process Print"));

        // Application setup
        Scene scene = new Scene(hBox, 300, 50);
        primaryStage.setTitle("Anonymous Handler");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
