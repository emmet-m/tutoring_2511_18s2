package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class SceneBuilderMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World");
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("HelloWorld.fxml"));
		
		loader.setController(new MyController(primaryStage));

		primaryStage.setScene(new Scene(loader.load()));
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
