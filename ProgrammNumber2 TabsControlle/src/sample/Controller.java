package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.io.IOException;

public class Controller {

    @FXML
    private TabPane projekteListe;

    @FXML
    private Tab vorlageTab;

    @FXML
    private Button neuesProjektButton;

    @FXML

    void neuenTabErstellen(ActionEvent event) throws IOException {

        // Lädt die FXML Datei von ProjektTab als neuen Tab
        projekteListe.getTabs().addAll((Tab)FXMLLoader.load(this.getClass().getResource("ProjektTab.fxml")));

    }

}
