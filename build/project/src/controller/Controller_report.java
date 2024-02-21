package controller;

import javafx.fxml.FXML;
import javafx.print.PrinterJob;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Controller_report {

    @FXML
    private WebView webview;


@FXML
void initialize() {
	PrinterJob job = PrinterJob.createPrinterJob();
Stage primaryStage = null;
    webview.getEngine().load("http://localhost:8080/jasperserver/flow.html/flowFile/LISTE_DES_ELEVS_DU_TRANSPORT.pdf");
    if(job!=null && job.showPrintDialog(primaryStage)) {
    webview.getEngine().print(job);
    job.endJob();
    }
}
}