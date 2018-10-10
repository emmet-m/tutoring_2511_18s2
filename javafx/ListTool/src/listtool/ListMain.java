package listtool;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by red on 16-Sep-18.
 * Credits to Gary Bai!
 */
public class ListMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        /* Set Width and Height */
        primaryStage.setWidth(600);
        primaryStage.setHeight(400);

        /* Create the Home Scene */
        new ListScene(primaryStage).display();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
