package controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import application.ConnexionBD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modele.Student;

public class Controller_student {

	@FXML
	private Button add;

	@FXML
	private ComboBox<String> clas;

	@FXML
	private TableColumn<Student, String> classe;

	@FXML
	private Button dele;

	@FXML
	private RadioButton female;

	@FXML
	private Button impression;

	@FXML
	private RadioButton male;

	@FXML
	private Button modi;

	@FXML
	private DatePicker naiss;

	@FXML
	private TableColumn<Student, String> naissance;

	@FXML
	private TextField nation;

	@FXML
	private TextField nom;

	@FXML
	private TableColumn<Student, String> parent;

	@FXML
	private TextField physique;

	@FXML
	private TextField pnom;

	@FXML
	private ComboBox<String> quartier;
	@FXML
	private TableColumn<Student, String> physiques;
	@FXML
	private TableColumn<Student, String> name;
	@FXML
	private ToggleGroup s;

	@FXML
	private Button search;

	@FXML
	private TableColumn<Student, String> sexe;

	@FXML
	private TableView<Student> table;
	@FXML
	private TableColumn<Student, String> quartie;

	@FXML
	private TableColumn<Student, String> tel;

	@FXML
	private ComboBox<String> telp;

	@FXML
	private TextField lieu;

	@FXML
	private TextField textsearch;
	ConnexionBD cn = new ConnexionBD();

	/*
	 * Student sd = new Student(nom.getText(), pnom.getText(), physique.getText(),
	 * clas.getTypeSelector(), quartier.getTypeSelector(), nation.getText(),
	 * naissance.getText(), lieu.getTypeSelector(), sexe.getText());
	 */

	@FXML
	void ajouter(ActionEvent event) {

		char sex;
		if (male.isSelected()) {

			sex = 'M';
		} else {
			sex = 'F';
		}
		try {
			String sql = "INSERT INTO `student` (`id_student`, `names`, `prenom`, `date_naissance`, `physique`, `sexe`, `classe`, `adresse`, `nationnalite`, `lieu`,telephone_parent) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = cn.connect().prepareStatement(sql);
			ps.setInt(1, this.getnextid());
			ps.setString(2, nom.getText());
			ps.setString(3, pnom.getText());
			ps.setString(4, String.valueOf(naiss.getValue()));
			ps.setString(5, physique.getText());
			ps.setString(6, String.valueOf(sex));
			ps.setString(7, clas.getValue());
			ps.setString(8, quartier.getValue());
			ps.setString(9, nation.getText());
			ps.setString(10, lieu.getText());
			ps.setString(11, telp.getValue());

// retourne la valeur du buttonRadio selectionner

			// verifier si l'utilisateur a tout remplitous les champs
			if (nom.getText().isEmpty() || pnom.getText().isEmpty() || physique.getText().isEmpty()
					|| clas.getValue().isEmpty() || quartier.getValue().isEmpty() || nation.getText().isEmpty()
					|| naissance.getText().isEmpty() || lieu.getText().isEmpty() || male.getText().isEmpty()
					|| female.getText().isEmpty() || telp.getValue().isEmpty()) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Enregistrement d'un eleve au transport");
				alert.setContentText("Veillez verifier si tous champs sont remplier et ressayer");
				alert.showAndWait();
				System.out.println("Veillez verifier si tous champs sont remplier wt continuez");
			} else {
				Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setHeaderText("Veillez valider l'ajout de :  " + nom.getText() + " " + pnom.getText());
				ButtonType vd = new ButtonType("valider");
				ButtonType cc = new ButtonType("cancel", ButtonData.CANCEL_CLOSE);
				alert.getButtonTypes().setAll(vd, cc);
				Optional<ButtonType> choice = alert.showAndWait();
				if (choice.get() == vd) {
					ps.executeUpdate();
					nom.setText(" ");
					pnom.setText(" ");
					physique.setText(" ");
					clas.setValue("");
					quartier.setValue("");
					nation.setText(" ");
					naissance.setText(" ");

				} else {
					System.out.println("sexe: " + sex + " lieu " + lieu.getText() + "date" + naiss.getValue());

					System.out.print("CLOSE");

				}

			}

		} catch (Exception ex) {
			Alert alert = new Alert(AlertType.WARNING);

			alert.setTitle("Enregistrement d'un eleve au transport");
			alert.setContentText("Une erreur c'est produite verifiez et ressayer");
			alert.showAndWait();
			System.out.println("erreur insertion: " + ex.getMessage());

		}
	}

	@FXML
	void delete(ActionEvent event) {

	}

	@FXML
	void modify(ActionEvent event) {

	}

	@FXML
	void search(ActionEvent event) {

	}

	@FXML
	void table(ActionEvent event) {

	}

	@FXML
	void telp(ActionEvent event) {

	}

	@FXML
	void parent(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/Parent_dialog.fxml"));
		Parent root = loader.load();
		Stage stage = new Stage();
		stage.setResizable(false);
		stage.setScene(new Scene(root));
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(((Node) event.getSource()).getScene().getWindow());
		stage.show();
	}

	ObservableList<Student> listM;
	ObservableList<Student> dataList;
	int index = -1;
	ResultSet rs = null;
	PreparedStatement pst = null;

	public void UpdateTable() {
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		classe.setCellValueFactory(new PropertyValueFactory<Student, String>("classeroom"));
		sexe.setCellValueFactory(new PropertyValueFactory<Student, String>("gender"));
		naissance.setCellValueFactory(new PropertyValueFactory<Student, String>("naissance"));
		quartie.setCellValueFactory(new PropertyValueFactory<Student, String>("lieu"));
		physiques.setCellValueFactory(new PropertyValueFactory<Student, String>("physical"));
		parent.setCellValueFactory(new PropertyValueFactory<Student, String>("nationality"));
		tel.setCellValueFactory(new PropertyValueFactory<Student, String>("adress"));
		listM = ConnexionBD.getDatastudent();
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_ALL_COLUMNS);
		table.setItems(listM);
	}

    @FXML
    void search_student() {
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		classe.setCellValueFactory(new PropertyValueFactory<Student, String>("classeroom"));
		sexe.setCellValueFactory(new PropertyValueFactory<Student, String>("gender"));
		naissance.setCellValueFactory(new PropertyValueFactory<Student, String>("naissance"));
		quartie.setCellValueFactory(new PropertyValueFactory<Student, String>("lieu"));
		physiques.setCellValueFactory(new PropertyValueFactory<Student, String>("physical"));
		parent.setCellValueFactory(new PropertyValueFactory<Student, String>("nationality"));
		tel.setCellValueFactory(new PropertyValueFactory<Student, String>("adress"));
        dataList = ConnexionBD.getDatastudent();
        table.setItems(dataList);
        FilteredList<Student> filteredData = new FilteredList<>(dataList, b -> true);  
 textsearch.textProperty().addListener((observable, oldValue, newValue) -> {
 filteredData.setPredicate(eleve -> {
    if (newValue == null || newValue.isEmpty()) {
     return true;
    }    
    String lowerCaseFilter = newValue.toLowerCase();
    
    if (eleve.getName().toLowerCase().indexOf(lowerCaseFilter) != -1 ) {
     return true; 
    } else if (eleve.getClasseroom().toLowerCase().indexOf(lowerCaseFilter) != -1) {
     return true; 
    }else if (eleve.getGender().indexOf(lowerCaseFilter) != -1) {
     return true; 
    }
    else if (eleve.getNaissance().indexOf(lowerCaseFilter)!=-1) {
         return true;}
    else if (eleve.getLieu().indexOf(lowerCaseFilter)!=-1) {
        return true;
 }
    else if (eleve.getPhysical().indexOf(lowerCaseFilter)!=-1) {
        return true;
 } 
 else if (eleve.getNationality().indexOf(lowerCaseFilter)!=-1) {
     return true;
} 
 else if (eleve.getAdress().indexOf(lowerCaseFilter)!=-1) {
     return true;
}
         else  
          return false; // Does not match.
   });
  });  
  SortedList<Student> sortedData = new SortedList<>(filteredData);  
  sortedData.comparatorProperty().bind(table.comparatorProperty());  
  table.setItems(sortedData);      
    }
	// select telephone BD et afficher dans le combobox
    void combox_student() {
    	try {
			String sql = "select telephone1,telephone2 from parent";
			Statement st = cn.connect().createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				telp.getItems().addAll(rs.getString("telephone1"), rs.getString("telephone2"));
			}
		} catch (Exception ex) {
			System.out.print("erreur select* bd telephone" + ex.getMessage());
		}
		// combobox quartier
		try {

			quartier.getItems().addAll("Centre commercial", "Elig-Essono", "Etoa-Meki 1", "Nlongkak", "Elig-Edzoa",
					"Bastos", "Manguier", "Tongolo", "Mballa 1", "Mballa 2", "Nkolondom", "Etoudi", "Messassi", "Okolo",
					"Olembe", "Nyom", "Etoa-Meki 2", "Mballa 3", "Emana", "Nkoleton", "Cite Verte", "Madagascar",
					"Mokolo", "Grand Messa", "Ekoudou", "Tsinga", "Nkom-Kana", "Oliga", "Messa Carrière",
					"Ecole de Police", "Febe", "Ntoungou", "Obili", "Ngoa-Ekele 1", "Nlong", "Mvolye", "Ahala 1",
					"Efoulan", "Obobogo", "Nsam", "Melen 2 - Centre Administratif", "Etoa", "Nkolmesseng 1",
					"Afanoya 1", "Afanoya 2", "Afanoya 3", "Afanoya 4", "Nkolfon", "Mekoumbou 2", "Ntouessong",
					"Mekoumbou 1", "Ahala 2", "Nsimeyong 1", "Nsimeyong 2", "Nsimeyong 3", "Olezoa", "Dakar",
					"Ngoa-Ekele 2", "Mvan-Nord", "Ndamvout", "Messame-Ndongo", "Odza", "Ekoumdoum", "Awae", "Nkomo",
					"Ekounou", "Biteng", "Kondengui 1", "Mimboman 1", "Etam-Bafia", "Mvog-Mbi", "Nkol-Ndongo 2",
					"Mebandan", "Mvan-Sud", "Ekie", "Emombo", "Kondengui 2", "Kondengui 3", "Nkol-Ndongo 1",
					"Mimboman 3", "Ntui-Essong", "Nkolo", "Abom", "Mvog-Ada", "Essos", "Nkol-Messing", "Nkol-Ebogo",
					"Quartier Fouda", "Ngousso 1", "Eleveur", "Mfandena 1", "Mfandena 2", "Ngousso 2", "Ngousso-Ntem",
					"Ngoulmekong", "Melen 8B et C", "Etoug-Ebe 2", "Mvog-betsi", "Biyem-Assi", "Mendong 2", "Melen 8",
					"Simbock", "Etoug-Ebe 1", "Melen", "Elig-Effa", "Nkolbikok", "Simbock Ecole de guerre", "Etetak",
					"Oyom-Abang", "Nkolbisson", "Minkoameyos", "Nkolso");
			lieu.setPromptText("lieu");

		} catch (Exception ex) {
			System.out.print("erreur quartier" + ex.getMessage());
		}
		// combobox classe
		try {
			clas.getItems().addAll("6e", "5e", "4e", "3e", "2nde", "1ère", "Tle");

		} catch (Exception ex) {
			System.out.print("erreur telephone parent" + ex.getMessage());
		}
    }
	@FXML
	void initialize() {
		UpdateTable();
		search_student();
		combox_student();
	}

	public int getnextid() {
		int id = 0;
		String sql = "select max(id_student) as nextID from student";
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