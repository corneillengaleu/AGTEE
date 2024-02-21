package controller;


	import java.io.IOException;

import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
	import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
	
	public class Controller_role {


	    @FXML
	    private RadioButton admin;

	    @FXML
	    private RadioButton client;



	    @FXML
	    private ToggleGroup role;
@FXML
private Label erreur ;

Button btn=new Button();
	    @FXML
	    void actionrole(ActionEvent event) {
	    	
	    }

	    @FXML
	    void  valider(ActionEvent event) throws IOException {
	    	if(admin.isSelected()) {

		        
	    	}
	    	else if(client.isSelected()) {
	    	}
	    	else {
	    		erreur.setTextFill(Color.RED);
	    		erreur.setText(" Veillez choisir un role");
	    	}
	    		}
	    
	}

