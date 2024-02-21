package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller_driver {

    @FXML
    private Hyperlink addBus;

    @FXML
    private Button ajouter;

    @FXML
    private ComboBox<?> choisir_bus;

    @FXML
    private TextField contenu_recherche;

    @FXML
    private TextField date;

    @FXML
    private TextField experience;

    @FXML
    private Button impression;

    @FXML
    private Button modifier;

    @FXML
    private TextField nation;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    private Button recherche;

    @FXML
    private Button supprimer;

    @FXML
    private TreeTableView<?> table;

    @FXML
    private TextField telephone;
    @FXML
    void addC(ActionEvent event) {

    }

    @FXML
    void addbus(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/Bus_dialogue.fxml"));
    	Parent root = loader.load();
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
        	    ((Node)event.getSource()).getScene().getWindow() );		        
        stage.show();
    }

    @FXML
    void choisir_bus(ActionEvent event) {

    }

    @FXML
    void contenu_recherche(ActionEvent event) {

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void impression(ActionEvent event) {

    }

    @FXML
    void modify(ActionEvent event) {

    }

    @FXML
    void search(ActionEvent event) {

    }

}
