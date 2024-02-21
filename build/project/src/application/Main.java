package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		
			Parent root=FXMLLoader.load(getClass().getResource("/vue/Home.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.centerOnScreen();
			primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("message erreur accueil"+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
