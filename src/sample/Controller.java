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
        one.min = Integer.parseInt(minNumber.getText());
        one.max = Integer.parseInt(maxNumber.getText());
        String num = String.valueOf(one.genRandomNumber());
        numberListView.getItems().add(num);
        generatedNumber.setText(num);





    }
}
