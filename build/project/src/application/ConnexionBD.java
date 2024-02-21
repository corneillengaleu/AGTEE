package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modele.Student;

public class ConnexionBD {
	ConnexionBD cn;
	String url = "jdbc:mysql://127.0.0.1:3306/agtee";

	String user = "agtee";
	String password = "677505";

	public Connection connect() {
		Connection con = null;
		System.out.println("connexion en cour veillez patienter ...");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				System.out.println("connexion reussie");
			}

		} catch (Exception ex) {
			System.out.println("erreur  de connexion.......... " + ex.getMessage());
			System.out.println("failed");

		}
		System.out.print("close");
		return con;

	}
	
	
	/************************************ Student 
	 * @return ******************************/

	// -----------select student for table view-----------------
	public static ObservableList<Student> getDatastudent() {
		ConnexionBD cn =new ConnexionBD();
		ObservableList<Student> list=FXCollections.observableArrayList();
		try{
			PreparedStatement pst=cn.connect().prepareStatement("SELECT * FROM `student`");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getString("names")+" "+rs.getString("prenom"), rs.getString("classe"), rs.getString("sexe"), rs.getString("date_naissance"), rs.getString("lieu"), rs.getString("physique"), rs.getString("nationnalite"), rs.getString("adresse")));
			}

		}catch (Exception ex) {
			System.out.print("erreur"+ex.getMessage());
		}
		
		return list;
		
	}
	
	
	

	/*
	 * private boolean verifyCredentials(String username, String password) { try {
	 * String sql = "SELECT * FROM inscription WHERE username = ? AND password = ?";
	 * PreparedStatement statement = this.connect().prepareStatement(sql);
	 * statement.setString(1, username); statement.setString(2, password);
	 * 
	 * // Exécution de la requête ResultSet resultSet = statement.executeQuery();
	 * 
	 * // Si une ligne est retournée, les identifiants sont valides return
	 * resultSet.next(); } catch (SQLException e) { e.printStackTrace(); return
	 * false; } finally { // Fermeture de la connexion à la base de données try { if
	 * (this.connect() != null) this.connect().close(); } catch (SQLException e) {
	 * e.printStackTrace(); } }
	 * 
	 * 
	 * }
	 */
	public int getnextid() {
		int id = 0;
		String sql = "select max(id_login) as nextID from login";
		Statement statement;
		try {
			statement = this.connect().createStatement();
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