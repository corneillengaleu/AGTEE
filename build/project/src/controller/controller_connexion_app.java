package controller;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import application.ConnexionBD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class controller_connexion_app {
boolean start;
    @FXML
    private Button connecterr;

    @FXML
    private Label evolution;

    @FXML
    private Label inscription;

    @FXML
    private PasswordField pass;
    @FXML
    private AnchorPane homeconnexion;
    @FXML
    private TextField user;
    private Parent fxml;
    ConnexionBD bd=new ConnexionBD();
   

    @FXML
    void connecter(ActionEvent event) {
    	
    	try {
            String sql = "SELECT id_login as id FROM login WHERE (mail=? OR telephone1 = ? OR telephone2=?) AND password = ?";
            PreparedStatement statement = bd.connect().prepareStatement(sql);
				  statement.setString(1,user.getText());
				  statement.setString(2,user.getText());
		            statement.setString(3, user.getText());
		            statement.setString(4, pass.getText());
		            ResultSet resultSet = statement.executeQuery();
		            if(resultSet.next()) {
		            	homeconnexion.getChildren().removeAll();
		            	FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/BigMainHome.fxml"));
				    	Parent root = loader.load();
				        Stage stage = new Stage();
				        stage.setResizable(true);
				        stage.setScene(new Scene(root));
				        stage.initModality(Modality.WINDOW_MODAL);
				        stage.initOwner(
				        	    ((Node)event.getSource()).getScene().getWindow() );		        
				        stage.show();
		            user.setText("");
		            pass.setText("");
		            evolution.setText("");

		            }
		             if(user.getText().isEmpty() || pass.getText().isEmpty() ) {
		            	evolution.setTextFill(Color.RED);
		            	evolution.setText("Veillez remplir  vos information de connexion ");
		            	
		            	
		            }
		            else {
		            
		            	evolution.setTextFill(Color.RED);
		            	evolution.setText("information incorrecte Veillez verifier");
		            }
    	} catch(Exception e) {
			e.printStackTrace();
        	System.out.println("message"+e.getCause()+"\n"+e.getMessage());

		}
    }

   

    

    @FXML
    void lost(ActionEvent event) throws IOException {

    	fxml=FXMLLoader.load(getClass().getResource("/vue/Login_lost.fxml"));
    	homeconnexion.getChildren().removeAll();
    	homeconnexion.getChildren().setAll(fxml);
    
    }
 /*public int getid() {
		
    	int id = 0;
		try {
			 String sql = "SELECT id_login as id FROM login WHERE (telephone1 = ? OR mail=? OR telephone2=?) AND password = ?";
	            PreparedStatement statement = bd.connect().prepareStatement(sql);
					  statement.setString(1,user.getText());
					  statement.setString(2,user.getText());
			            statement.setString(3, user.getText());
			            statement.setString(4, pass.getText());
			            ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				 id=resultSet.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return id;
    }*/
    

}
