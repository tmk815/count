package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Label hello;

    public int a=0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void button(ActionEvent event) {
        a=a+1;
        String b=String.valueOf(a);
        hello.setText(b);
    }
}