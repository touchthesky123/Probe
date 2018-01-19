package sample;

        import javafx.beans.value.ChangeListener;
        import javafx.beans.value.ObservableValue;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.Tab;
        import javafx.scene.control.TabPane;
        import javafx.scene.input.MouseEvent;

        import java.util.Random;

public class Controller {

    @FXML
    private Label Anzeige;

    @FXML
    private Button knopf;

    @FXML
    private TabPane TabPane;

    @FXML
    private Tab neuerTab;

    @FXML
    private Tab normalerTab;





    @FXML
    void randomNumber(MouseEvent event) {

        Random rdm = new Random();
        String a = String.valueOf(rdm.nextInt());
        Anzeige.setText(a);
        Tab neuerTabe = new Tab();
        TabPane.getTabs().add(neuerTabe);
    }

}
