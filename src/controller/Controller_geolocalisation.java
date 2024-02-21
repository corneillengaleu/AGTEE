package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;

public class Controller_geolocalisation {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
  
    @FXML
    private VBox vbox;
    @FXML
    void initialize() {
    	 WebView webview = new WebView();
        webview.getEngine().load("http://localhost/agtee/localisation/");
        vbox.getChildren().add(webview);
    }

}
