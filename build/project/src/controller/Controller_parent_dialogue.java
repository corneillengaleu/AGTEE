package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import application.ConnexionBD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller_parent_dialogue {

	@FXML
	private RadioButton fem;

	@FXML
	private TextField mail;

	@FXML
	private RadioButton mas;

	@FXML
	private TextField nbreEnfant;

	@FXML
	private TextField nom;

	@FXML
	private TextField pnom;

	@FXML
	private TextField profession;

	@FXML
	private ToggleGroup sexe;

	@FXML
	private TextField tel1;

	@FXML
	private TextField tel2;
	ConnexionBD cn = new ConnexionBD();

	@FXML
	void valider(ActionEvent event) throws SQLException {
		char sex;
		if (mas.isSelected()) {

			sex = 'M';
		} else {
			sex = 'F';
		}
		try {
			String sql = "INSERT INTO `parent` (`parent_ID`, `names`, `prenom`, `mail`, `sexe`, `nationnalite`, `nbre_enfant`, `telephone1`, `telephone2`) VALUES (?, ?, ?, ?, ?, ?, ?,?, ?)";
			PreparedStatement ps = cn.connect().prepareStatement(sql);
			ps.setInt(1, this.getnextid());
			ps.setString(2, nom.getText());
			ps.setString(3, pnom.getText());
			ps.setString(4, mail.getText());
			ps.setString(5, String.valueOf(sex));
			ps.setString(6, profession.getText());
			ps.setString(7, nbreEnfant.getText());
			ps.setString(8, tel1.getText());
			ps.setString(9, tel2.getText());

// retourne la valeur du buttonRadio selectionner

			// verifier si l'utilisateur a tout remplitous les champs
			
			
			 if (nom.getText().isEmpty() || pnom.getText().isEmpty() || mail.getText().isEmpty()
					|| profession.getText().isEmpty() ||  nbreEnfant.getText().isEmpty()
					|| mas.getText().isEmpty() || fem.getText().isEmpty() || tel1.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Enregistrement d'un parent d'eleve");
				alert.setContentText("Veillez verifier si tous champs sont remplier et ressayer");
				alert.showAndWait();
				System.out.println("Veillez verifier si tous champs sont remplier wt continuez");
			} else  {
				Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setHeaderText("Veillez valider l'ajout de :  " + nom.getText() + " " + pnom.getText());
				ButtonType vd = new ButtonType("valider");
				ButtonType cc = new ButtonType("cancel", ButtonData.CANCEL_CLOSE);
				alert.getButtonTypes().setAll(vd, cc);
				Optional<ButtonType> choice = alert.showAndWait();
				if (choice.get() == vd) {
					ps.executeUpdate();

				} else {

					System.out.print("CLOSE");

				}

			}

		} catch (Exception ex) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Enregistrement d'un parent d'eleves");
			alert.setContentText("ce parent existe deja");
					System.out.println("erreur insertion: " + ex.getMessage());
				}
			
	}

	public int getnextid() {
		int id = 0;
		String sql = "select max(parent_ID) as nextID from parent";
		Statement statement;
		try {
			statement = cn.connect().createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				id = resultSet.getInt("nextID");
				id++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

}
