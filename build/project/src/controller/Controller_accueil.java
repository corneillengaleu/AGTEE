package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller_accueil {

    @FXML
    private Button connexion;

    @FXML
    private AnchorPane h;

    @FXML
    private AnchorPane home;

 
Parent fxml;
    @FXML
    void connexion(MouseEvent event) throws IOException {
    	fxml=FXMLLoader.load(getClass().getResource("/vue/chargement.fxml"));
    	home.getChildren().removeAll();
    	home.getChildren().setAll(fxml);
   
    }
    

}