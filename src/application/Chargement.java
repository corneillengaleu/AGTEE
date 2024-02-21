package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Chargement implements Initializable {
	@FXML
	public ProgressIndicator Myprogessbar;

		 @FXML
		    public AnchorPane changer;
		 @FXML
		    private Label label;
		    private Parent fxml;
		    @FXML
		    private ProgressBar mychargement;
		
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	
	    	 try {
			    	//  animation qui fait passer la valeur du ProgressIndicator de 0 à 1 en une seconde
			    	Timeline timeline = new Timeline();
			    	timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1), new KeyValue(mychargement.progressProperty(), 1)));
			    	timeline.setCycleCount(1);
			    	timeline.play();
			    	timeline.setOnFinished(new EventHandler<ActionEvent>() {

						public void handle(ActionEvent arg0) {
						
							
							try {
								fxml=FXMLLoader.load(getClass().getResource("/vue/connexion_app.fxml"));
								changer.getChildren().removeAll();
								changer.getChildren().setAll(fxml);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
						
			    	}
			    	});
	    	 
			    	} catch (Exception e) {
			    		e.printStackTrace();
			    		}
	    	 
}
}
