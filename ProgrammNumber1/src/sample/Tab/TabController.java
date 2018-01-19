package sample.Tab;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;



public class TabController {

    @FXML
    private TabPane TabPane;

    @FXML
    private Tab voralgenTab;

    @FXML
    private AnchorPane vorlagenTab;

    @FXML
    private Tab NeuerTab;

    @FXML
    void neuenTabErstellen(MouseEvent event) {
        Tab neu = new Tab("neuer Tab");
        neu = voralgenTab;
        TabPane.getTabs().add(neu);
    }

}
