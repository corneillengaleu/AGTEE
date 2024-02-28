	package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class Controller_BigMainClass {

    @FXML
    private Pane bus;

    @FXML
    private AnchorPane changer;

    @FXML
    private Label connect;

    @FXML
    private Pane driver;

    @FXML
    private Pane help;

    @FXML
    private Label label_profil;

    @FXML
    private Pane localisation;

    @FXML
    private Pane parameter;

    @FXML
    private Pane payment;

    @FXML
    private ImageView profil;

    @FXML
    private Pane report;

    @FXML
    private Pane role;

    @FXML
    private Pane student;

    @FXML
    private Pane terminal;

    @FXML
    private Button dasbord;
			    Parent fxml;
			int select=0;
			void student(){
				
			}
			    @FXML
			    int student(MouseEvent event) throws IOException {
			    	select=1;
			    	fxml=FXMLLoader.load(getClass().getResource("/vue/Student.fxml"));
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);
					return select;
			   
			    }
			    @FXML
			    void aide(MouseEvent event) {
			    	select=2;

			    }
			
			    @FXML
			    int bus(MouseEvent event) throws IOException {
			    	select=3;

			    	fxml=FXMLLoader.load(getClass().getResource("/vue/Bus.fxml"));
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);
					return select;
			    }
			
			
			    @FXML
			    void dashbord(MouseEvent event) throws IOException {
			    	select=4;

			    	fxml=FXMLLoader.load(getClass().getResource("/vue/Dashbord.fxml"));
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);
			   
			
			    }
			
			    @FXML
			    void driver(MouseEvent event) throws IOException {
			    	select=5;
			    	fxml=FXMLLoader.load(getClass().getResource("/vue/Driver.fxml"));
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);
			
			    }
			    @FXML
			    void etatbus(ActionEvent event) throws IOException {
			    	fxml=FXMLLoader.load(getClass().getResource("/vue/etat_bus.fxml"));
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);
			    }
			
			    @FXML
			    void localisation(MouseEvent event) throws IOException {
			    	select=6;

			    	fxml=FXMLLoader.load(getClass().getResource("/vue/geolocalisation.fxml"));
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);
			    }
			
			    @FXML
			    void paiement(MouseEvent event) throws IOException {
			    	select=7;

			    	fxml=FXMLLoader.load(getClass().getResource("/vue/Payment.fxml"));
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);
			    }
			
			    @FXML
			    void parametre(MouseEvent event) {
			    	select=8;

			    }
			
			    @FXML
			    void role(MouseEvent event) throws IOException {
			    	select=9;

			    	fxml=FXMLLoader.load(getClass().getResource("/vue/Role.fxml"));
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);
			    }
			
			    @FXML
			    void sage(MouseEvent event) {
			    	select=10;
			    	try {
						fxml=FXMLLoader.load(getClass().getResource("/vue/reporting.fxml"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);

			    }
			
			   
			
			    @FXML
			    void terminal(MouseEvent event) {
			    	select=11;

			    }
		
			    @FXML
			    void initialize() throws IOException {
			    	fxml=FXMLLoader.load(getClass().getResource("/vue/Dashbord.fxml"));
			    	changer.getChildren().removeAll();
			    	changer.getChildren().setAll(fxml);
			    	/* controller_connexion_app cn =new controller_connexion_app();
			    	String sql = "SELECT first_name,last_name FROM login WHERE id_login=?";
			        PreparedStatement statement = bd.connect().prepareStatement(sql);
						  statement.setObject(1,cn.getid());
						  ResultSet resultSet = statement.executeQuery();
						  while(resultSet.next()) {
							  String nom=resultSet.getString("first_name");
							  String prenom=resultSet.getString("last_name");
							  label_profil.setText(prenom+"@"+nom);
								System.out.print(" big /id du logueur est"+cn.getid());
							  
						  }*/
			    	if(this.select==1) {
			    		student.setStyle("-fx-background-color:ORANGE");
			    	}
			    	else if(select==2) {
			    		
			    	}else if(select==3) {
			    		
			    	}else if(select==4) {
			    		
			    	}else if(select==5) {
			    		
			    	}else if(select==6) {
			    		
			    	}else if(select==7) {
			    		
			    	}else if(select==8) {
			    		
			    	}else if(select==9) {
			    		
			    	}else if(select==10) {
			    		
			    	}else if(select==11) {
			    		
			    	}else if(select==0){

			    	}
			    }
			   
			}
			
