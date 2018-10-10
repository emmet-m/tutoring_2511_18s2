package listtool;

// Credits to Gary Bai!
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ListController {
    @FXML
    private ListView<String> list;

    @FXML
    private TextField addTextField;

    @FXML
    private Button addButton;

    @FXML
    private Label selectedLabel;

    @FXML
    private Button removeButton;

    private Stage s;

    ListController(Stage s) {
        this.s = s;
    }

    @FXML
    public void initialize() {
        list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                onSelection(oldValue);
            }
        });
    }

    private void onSelection(String newValue) {
        selectedLabel.setText(newValue + " selected.");
    }

    @FXML
    public void onAddButtonClicked() {
        String toAdd = addTextField.getText();
        if (!toAdd.isEmpty()) {
            list.getItems().add(toAdd);
        }
    }

    @FXML
    public void onRemoveButtonClicked() {
        String toRemove = list.getSelectionModel().getSelectedItem();
        if (toRemove != null) {
            list.getItems().remove(toRemove);
        }

        String selected = list.getSelectionModel().getSelectedItem();
        if (selected != null) {
            onSelection(selected);
        } else {
            selectedLabel.setText("No Items Currently Selected.");
        }
    }
}
