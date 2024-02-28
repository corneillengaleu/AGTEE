package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class Comtroller_bus {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ajouter;

    @FXML
    private TextField conso;
    @FXML
    private TextField couleur;
    @FXML
    private TextField nom;


    @FXML
    private TextField contenu_recherche;

    @FXML
    private TextField etat;

    @FXML
    private Button impression;

    @FXML
    private TextField matriculation;

    @FXML
    private Button modifier;

    @FXML
    private TextField nbreplace;

    @FXML
    private TextField proprietaire;

    @FXML
    private Button recherche;

    @FXML
    private TreeTableColumn<?, ?> tableconsom;

    @FXML
    private TreeTableColumn<?, ?> tableetat;

    @FXML
    private TreeTableColumn<?, ?> tablematri;

    @FXML
    private TreeTableColumn<?, ?> tablenbreplace;

    @FXML
    private TreeTableColumn<?, ?> tableproprie;

    @FXML
    private TreeTableView<?> tableview;

    @FXML
    private TreeTableColumn<?, ?> tablevoiture;

    @FXML
    private TextField typevoiture;

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
        assert ajouter != null : "fx:id=\"ajouter\" was not injected: check your FXML file 'Bus.fxml'.";
        assert conso != null : "fx:id=\"conso\" was not injected: check your FXML file 'Bus.fxml'.";
        assert contenu_recherche != null : "fx:id=\"contenu_recherche\" was not injected: check your FXML file 'Bus.fxml'.";
        assert etat != null : "fx:id=\"etat\" was not injected: check your FXML file 'Bus.fxml'.";
        assert impression != null : "fx:id=\"impression\" was not injected: check your FXML file 'Bus.fxml'.";
        assert matriculation != null : "fx:id=\"matriculation\" was not injected: check your FXML file 'Bus.fxml'.";
        assert modifier != null : "fx:id=\"modifier\" was not injected: check your FXML file 'Bus.fxml'.";
        assert nbreplace != null : "fx:id=\"nbreplace\" was not injected: check your FXML file 'Bus.fxml'.";
        assert proprietaire != null : "fx:id=\"proprietaire\" was not injected: check your FXML file 'Bus.fxml'.";
        assert recherche != null : "fx:id=\"recherche\" was not injected: check your FXML file 'Bus.fxml'.";
        assert tableconsom != null : "fx:id=\"tableconsom\" was not injected: check your FXML file 'Bus.fxml'.";
        assert tableetat != null : "fx:id=\"tableetat\" was not injected: check your FXML file 'Bus.fxml'.";
        assert tablematri != null : "fx:id=\"tablematri\" was not injected: check your FXML file 'Bus.fxml'.";
        assert tablenbreplace != null : "fx:id=\"tablenbreplace\" was not injected: check your FXML file 'Bus.fxml'.";
        assert tableproprie != null : "fx:id=\"tableproprie\" was not injected: check your FXML file 'Bus.fxml'.";
        assert tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'Bus.fxml'.";
        assert tablevoiture != null : "fx:id=\"tablevoiture\" was not injected: check your FXML file 'Bus.fxml'.";
        assert typevoiture != null : "fx:id=\"typevoiture\" was not injected: check your FXML file 'Bus.fxml'.";

    }

}
