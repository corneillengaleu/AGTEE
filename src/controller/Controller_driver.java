package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class Controller_driver {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ajouter;

    @FXML
    private TextField contenu_recherche;

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
    private ComboBox<?> quartier;

    @FXML
    private Button recherche;

    @FXML
    private TreeTableColumn<?, ?> tableexper;

    @FXML
    private TreeTableColumn<?, ?> tablenationnalite;

    @FXML
    private TreeTableColumn<?, ?> tablenom;

    @FXML
    private TreeTableColumn<?, ?> tableprenom;

    @FXML
    private TreeTableColumn<?, ?> tablequartier;

    @FXML
    private TreeTableColumn<?, ?> tabletel;

    @FXML
    private TreeTableView<?> tableview;

    @FXML
    private TextField telephone;

    @FXML
    void addbus(ActionEvent event) {

    }

    @FXML
    void contenu_recherche(ActionEvent event) {

    }

    @FXML
    void impression(ActionEvent event) {

    }

    @FXML
    void modifybus(ActionEvent event) {

    }

    @FXML
    void search(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert ajouter != null : "fx:id=\"ajouter\" was not injected: check your FXML file 'Driver.fxml'.";
        assert contenu_recherche != null : "fx:id=\"contenu_recherche\" was not injected: check your FXML file 'Driver.fxml'.";
        assert experience != null : "fx:id=\"experience\" was not injected: check your FXML file 'Driver.fxml'.";
        assert impression != null : "fx:id=\"impression\" was not injected: check your FXML file 'Driver.fxml'.";
        assert modifier != null : "fx:id=\"modifier\" was not injected: check your FXML file 'Driver.fxml'.";
        assert nation != null : "fx:id=\"nation\" was not injected: check your FXML file 'Driver.fxml'.";
        assert nom != null : "fx:id=\"nom\" was not injected: check your FXML file 'Driver.fxml'.";
        assert prenom != null : "fx:id=\"prenom\" was not injected: check your FXML file 'Driver.fxml'.";
        assert quartier != null : "fx:id=\"quartier\" was not injected: check your FXML file 'Driver.fxml'.";
        assert recherche != null : "fx:id=\"recherche\" was not injected: check your FXML file 'Driver.fxml'.";
        assert tableexper != null : "fx:id=\"tableexper\" was not injected: check your FXML file 'Driver.fxml'.";
        assert tablenationnalite != null : "fx:id=\"tablenationnalite\" was not injected: check your FXML file 'Driver.fxml'.";
        assert tablenom != null : "fx:id=\"tablenom\" was not injected: check your FXML file 'Driver.fxml'.";
        assert tableprenom != null : "fx:id=\"tableprenom\" was not injected: check your FXML file 'Driver.fxml'.";
        assert tablequartier != null : "fx:id=\"tablequartier\" was not injected: check your FXML file 'Driver.fxml'.";
        assert tabletel != null : "fx:id=\"tabletel\" was not injected: check your FXML file 'Driver.fxml'.";
        assert tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'Driver.fxml'.";
        assert telephone != null : "fx:id=\"telephone\" was not injected: check your FXML file 'Driver.fxml'.";

    }

}
