package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyController {
	
	Stage myStage;
	
	// TODO: Add an action listener and FXML input
	
	@FXML
	Button myButton;
	
	public MyController(Stage s) {
		myStage = s;
	}
	
	@FXML
	public void myButtonClicked() {
		System.out.println("Hello! I'm working!");
	}

}
