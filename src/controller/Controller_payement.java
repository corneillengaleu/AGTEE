package controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller_payement {
	


	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TableView<?> TABLEVIEW;

	    @FXML
	    private TextField heure;

	    @FXML
	    private CheckBox matin;

	    @FXML
	    private Button modification;

	    @FXML
	    private TextField montant;

	    @FXML
	    private Label nom;

	    @FXML
	    private ComboBox<?> periode;

	    @FXML
	    private CheckBox soir;

	    @FXML
	    private TableColumn<?, ?> tableamount;

	    @FXML
	    private TableColumn<?, ?> tableheure;

	    @FXML
	    private TableColumn<?, ?> tablenom;

	    @FXML
	    private TableColumn<?, ?> tablepayement;

	    @FXML
	    private TableColumn<?, ?> tabletransport;

	    @FXML
	    private ComboBox<?> telparent;

	    @FXML
	    private ComboBox<?> tpaiement;

	    @FXML
	    private ComboBox<?> ttransport;

	    @FXML
	    private Button validation;

	    @FXML
	    private Button valiimpression;

	    @FXML
	    void modification(ActionEvent event) {

	    }

	    @FXML
	    void validation(ActionEvent event) {

	    }

	    @FXML
	    void valiimpression(ActionEvent event) {

	    }

	    @FXML
	    void initialize() {
	        assert TABLEVIEW != null : "fx:id=\"TABLEVIEW\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert heure != null : "fx:id=\"heure\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert matin != null : "fx:id=\"matin\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert modification != null : "fx:id=\"modification\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert montant != null : "fx:id=\"montant\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert nom != null : "fx:id=\"nom\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert periode != null : "fx:id=\"periode\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert soir != null : "fx:id=\"soir\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert tableamount != null : "fx:id=\"tableamount\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert tableheure != null : "fx:id=\"tableheure\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert tablenom != null : "fx:id=\"tablenom\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert tablepayement != null : "fx:id=\"tablepayement\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert tabletransport != null : "fx:id=\"tabletransport\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert telparent != null : "fx:id=\"telparent\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert tpaiement != null : "fx:id=\"tpaiement\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert ttransport != null : "fx:id=\"ttransport\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert validation != null : "fx:id=\"validation\" was not injected: check your FXML file 'Payment.fxml'.";
	        assert valiimpression != null : "fx:id=\"valiimpression\" was not injected: check your FXML file 'Payment.fxml'.";

	    }

	}


