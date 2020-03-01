package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller {

    public ListView numberListView;
    public TextField minNumber;
    public Label generatedNumber;
    public TextField maxNumber;

    public void initialize(URL location, ResourceBundle resources){



    }

    public void loadData(ActionEvent actionEvent) {
    }

    public void generateRandom(ActionEvent actionEvent) {
        Numbers one = new Numbers();
        one.setMin(Integer.parseInt(minNumber.getText()));
        one.setMax(Integer.parseInt(maxNumber.getText()));
        one.genRandomNumber();
        numberListView.getItems().add(one);
        generatedNumber.setText(String.valueOf(one.genNum));





    }
}
