package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World"); // Sets the title of the window
		
		Label helloWorldLabel = new Label("Hello World!");
		Scene scene = new Scene(helloWorldLabel, /*Width=*/ 400, /*Height=*/200);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
