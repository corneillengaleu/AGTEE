package controller;


import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
public class Contoller_dashbord {

    @FXML
    private PieChart bus;

    @FXML
    private PieChart inscript;

    @FXML
    private PieChart ninscript;

    @FXML
    private PieChart presence;


    @FXML
    void initialize() {
    	bus.getData().setAll(new PieChart.Data("vip", 
    			5), new PieChart.Data("classique", 10)
    			 ); 
    	bus.getOnZoomStarted();
    	inscript.getData().setAll(new PieChart.Data("fille", 
    			70), new PieChart.Data("garcon", 30)
    			 ); 
    	ninscript.getData().setAll(new PieChart.Data("fille", 
    			11), new PieChart.Data("garcon", 10)
    			 ); 
    	presence.getData().setAll(new PieChart.Data("fille", 
    			70), new PieChart.Data("garcon", 30)
    			 ); 

    }
    

}
