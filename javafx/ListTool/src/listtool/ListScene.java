package listtool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Credits to Gary Bai!
public class ListScene {
    private Stage s;
    private String title;
    private FXMLLoader fxmlLoader;

    public ListScene(Stage s) {
        this.s = s;
        this.title = "List Tool";
        this.fxmlLoader = new FXMLLoader(getClass().getResource("ListTool.fxml"));
    }

    public void display() throws Exception {
        s.setTitle(title);
        fxmlLoader.setController(new ListController(s));

        Parent root = fxmlLoader.load();
        s.setScene(new Scene(root));
        s.show();
    }
}
