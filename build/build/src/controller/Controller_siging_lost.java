package controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.ConnexionBD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;



public class Controller_siging_lost {

    @FXML
    private AnchorPane home;
    private Parent fxml;
    @FXML
    private Label erreur;

    @FXML
    private Label information;

    @FXML
    private TextField mail;

    @FXML
    private TextField phone;
    PreparedStatement ps;
	ResultSet rs;
    @FXML
    void valider(ActionEvent event) {
        String sql = "SELECT * FROM inscription WHERE mail = '"+phone.getText()+"' AND password = '"+mail.getText()+"'";
    	
    	    try {
    	    	ConnexionBD bd=new ConnexionBD();
    			 ps=bd.connect().prepareStatement(sql)	;
    			ps.setObject(1, phone.getText());
    			ps.setString(2, mail.getText());
    			 rs=ps.executeQuery();
    			if (phone.getText().isEmpty() && mail.getText().isEmpty()) {
    				System.out.print("remplir un champ");
    			}
    			else if(phone.getText().isEmpty() || mail.getText().isEmpty()) {
    			if(phone.getText().isEmpty()) {
    			if(rs.next()) {

					erreur.setText(" ");
    				information.setText("Un mots de passe vous etes envoye par mail \n Veillez recupere et vous connectez");
    			}
    			else {
    				information.setText(" ");
    				erreur.setText("Cette adresse est introuvable \n Verifiez l'orthographe et ressayer");
    			}
    			}
    			else if(mail.getText().isEmpty()) {
    				if(rs.next()) { 

    					erreur.setText(" ");

        				information.setText("Un mots de passe vous etes envoye par sms sur ce numero \n Veillez recupere et vous connectez");
        			}
        			else {
        				information.setText(" ");

        				erreur.setText("Ce numero est introuvable \n Verifiez  et ressayer");
        			}
    			}
    			}
    			else {

    				erreur.setText("Veillez choisir l'un des deux \n soit le Mail ou soit le Numero de telephone");
    	    }
    	    
    	    	
    	    }
    	   catch (SQLException e) {
    			e.printStackTrace();
    			System.out.print("\n message erreur:"+e.getMessage()+"\n");
    		}
    }
    @FXML
    void connecter(ActionEvent event) throws IOException {
    	fxml=FXMLLoader.load(getClass().getResource("/vue/connexion_app.fxml"));
    	home.getChildren().removeAll();
    	home.getChildren().setAll(fxml);
    }
    
    }
