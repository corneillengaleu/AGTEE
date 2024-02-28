package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller_etatbus {
    Parent fxml;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> bus;

    @FXML
    private TextArea cause;

    @FXML
    private TextArea etat;

    @FXML
    private TreeTableColumn<?, ?> tablebus;

    @FXML
    private TreeTableColumn<?, ?> tablecause;

    @FXML
    private TreeTableColumn<?, ?> tabledate;

    @FXML
    private TreeTableColumn<?, ?> tableetat;

    @FXML
    private TreeTableView<?> tableview;

    @FXML
    void addbus(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/Bus_dialogue.fxml"));
		Parent root = loader.load();
		Stage stage = new Stage();
		stage.setResizable(false);
		stage.setScene(new Scene(root));
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(((Node) event.getSource()).getScene().getWindow());
		stage.show();
    }

    @FXML
    void addetat(ActionEvent event) {

    }

    @FXML
    void impression(ActionEvent event) {

    }

    @FXML
    void modifyetat(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert bus != null : "fx:id=\"bus\" was not injected: check your FXML file 'etat_bus.fxml'.";
        assert cause != null : "fx:id=\"cause\" was not injected: check your FXML file 'etat_bus.fxml'.";
        assert etat != null : "fx:id=\"etat\" was not injected: check your FXML file 'etat_bus.fxml'.";
        assert tablebus != null : "fx:id=\"tablebus\" was not injected: check your FXML file 'etat_bus.fxml'.";
        assert tablecause != null : "fx:id=\"tablecause\" was not injected: check your FXML file 'etat_bus.fxml'.";
        assert tabledate != null : "fx:id=\"tabledate\" was not injected: check your FXML file 'etat_bus.fxml'.";
        assert tableetat != null : "fx:id=\"tableetat\" was not injected: check your FXML file 'etat_bus.fxml'.";
        assert tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'etat_bus.fxml'.";

    }

}
