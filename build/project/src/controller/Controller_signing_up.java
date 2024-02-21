package controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Pattern;

import application.ConnexionBD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
public class Controller_signing_up {
	private static final String PASSWORD_REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,10000}$";
	private static final Pattern PASSWORD_PATTERN =Pattern.compile(PASSWORD_REGEX);
	private static final String MAIL_CONDITION=" ^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$ ";
	private static final Pattern MAIL_CHECK = Pattern.compile(MAIL_CONDITION);
	

	ConnexionBD bd=new ConnexionBD();
    private Parent fxml;
    @FXML
    private Button connecter;

    @FXML
    private Label evolution;

    @FXML
    private TextField fname;

    @FXML
    private AnchorPane anchorpane;
    @FXML
    private Label inscription;
    @FXML
    private Label label;

    @FXML
    private Button inscrire;

    @FXML
    private TextField lname;

    @FXML
    private TextField mail;
    @FXML
    private Label mailabel;
    @FXML
    private PasswordField pass;

    @FXML
    private TextField phone;

    @FXML
    private PasswordField repass;
    
    
    //connexion et ajout a la bd
    public void inscriptionBD() throws IOException {
    String sql="INSERT INTO inscription VALUES(?,?,?,?,?,?)";
    
    try {
    	ConnexionBD bd=new ConnexionBD();
		PreparedStatement ps=bd.connect().prepareStatement(sql)	;
		ps.setInt(1, bd.getnextid());
		ps.setString(2, fname.getText());
		ps.setString(3, lname.getText());
		ps.setObject(4, phone.getText());
		ps.setString(5, mail.getText());
		ps.setString(6, pass.getText());
	
		
		//cette condition concerne a verifier toute les normes que doit respecter le firt name last name pour etre accepter
		 if(fname.getText().isEmpty() || lname.getText().isEmpty() || pass.getText().isEmpty()) {
		    Alert alert=new Alert(AlertType.ERROR);
		    alert.setTitle("Error");
		    alert.setContentText("Veillez Remplir les champs obligatoires \n NB: tous les champs avec etoile rouge sont obligatoire ");
		 alert.show();
		 
	
		 if((fname.getText().isEmpty())&&lname.getText().isEmpty()) {
				fname.getBackground();
		 }
		 else {
				lname.setStyle("-fx-border-color:#062c3f;");
				fname.setStyle("-fx-border-color:#062c3f;");;

		 }
	 if(fname.getText().isEmpty()) {

}
	 else {
			lname.setStyle("-fx-border-color:#062c3f;");;

	 }
 if(lname.getText().isEmpty()) {

} 
 else {
		lname.setStyle("-fx-border-color:#062c3f;");;

 }
 //cette condition apres la verification du precedent va check ici 	tout ce qui concerne le mots de passe pour etre accepter
		 } else if(!repass.getText().equals(pass.getText())){
			evolution.setTextFill(Color.RED);
			evolution.setText("les deux mots de passe sont differnt verifier et vous inscrire");
		 }
		  
		 //il s'agit d'un mots de passe fort de 4 a 1000 caractere qui au mois 02 carters speciaux
		 else if(!PASSWORD_PATTERN.matcher(pass.getText()).matches()) {
			 evolution.setTextFill(Color.RED);
				evolution.setText("le mots de passe neccessite au moins   4 \n Et 03 caracteres speciaux qui sont au moins (une letter majuscule, une lettre miniscule et un chiffre)");
		 }
		 
			  
		 //ici apres la verification de precent va check ici tout ce qui concerne le conformite d'un numero et d'un mail
		 else	if (phone.getText().isEmpty()&& mail.getText().isEmpty()) {
			evolution.setTextFill(Color.RED);
			evolution.setText("Veillez  soit remplir le numero de telephone ou choisir de remplir l'adrresse mail \n un des deux est obligatoire");
		}
		
		 //apres la verification de tous les precedent ici il permet d'executer l'insertion
		 else {
				

			evolution.setTextFill(Color.GREEN);
			evolution.setText("mots de passe acceptable");
			ps.executeUpdate();
			inscription.setText("Inscription reussie");
			fxml=FXMLLoader.load(getClass().getResource("/vue/connexion_app.fxml"));
	    	anchorpane.getChildren().removeAll();
	    	anchorpane.getChildren().setAll(fxml);

		}

		
	} catch (SQLException e) {
		e.printStackTrace();
		System.out.print("message erreur:"+e.getMessage());
	}
    }
 
    @FXML
    void labell(InputMethodEvent  event) {
    	if(!PASSWORD_PATTERN.matcher(pass.getText()).matches()) {
    		label.setTextFill(Color.RED);
    		label.setText("le mots de passe neccessite au moins   4 \n Et 03 caracteres speciaux qui sont au moins (une letter majuscule, une lettre miniscule et un chiffre)");
		 }
    	else {
    		if(pass.getText().length()>=4 && pass.getText().length()<=9) {
    			label.setText("mots de passe faible");
    			
    		}
    		else if(pass.getText().length()<=15) {
    			label.setText("mots de passe acceptable");

    		}
    		else {
    			label.setText("mots de passe fort");

    		}
    	}
		 
    }

    @FXML
    void inscrire(ActionEvent event) throws IOException {
    	 inscriptionBD();
    }

    @FXML
    void actualiser(MouseEvent event) {
    	evolution.setText("  ");
    	inscription.setText("");
    	fname.setText("");
    	lname.setText("");
    	mail.setText("");
    	phone.setText("");
    	pass.setText("");
    	repass.setText("");
    }

    @FXML
    void connecter(ActionEvent event) throws IOException {
    	fxml=FXMLLoader.load(getClass().getResource("/vue/connexion_app.fxml"));
    	anchorpane.getChildren().removeAll();
    	anchorpane.getChildren().setAll(fxml);
    }
    @FXML
    void checkmail(InputMethodEvent  event) {
    	if(!MAIL_CHECK.matcher(mail.getText()).matches()) {
    		mailabel.setText("mail incorrect veillez remplir un mail correct");
    	}
    	else {
    		mailabel.setText(" ");

    	}
    	
    }

}