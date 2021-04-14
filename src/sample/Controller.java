package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    Scanner tc = new Scanner(System.in);

    @FXML
    RadioButton boton1, boton2, boton3, boton4, boton5, boton6, botonAdd;

    @FXML
    Label label1, label2, label3, label4, label5, label6;

    ArrayList <Label> alLabels = new ArrayList<>(Arrays.asList(label1, label2, label3, label4, label5, label6));

    public Controller(){




    }

    @FXML
    public void clickBoton1() {
        label1.setText("");
    }

    @FXML
    public void clickBoton2() {
        label2.setText("");
    }

    @FXML
    public void clickBoton3() {
        label3.setText("");
    }

    @FXML
    public void clickBoton4() {
        label4.setText("");
    }

    @FXML
    public void clickBoton5() {
        label5.setText("");
    }

    @FXML
    public void clickBoton6() {
        label6.setText("");
    }

    @FXML
    public void clickBotonAdd() {
        final int TAM = alLabels.size()-1;
        int i = 0;
        boolean encontrado = false;
        do{
            if(alLabels.get(i).getText().isEmpty()){
                alLabels.get(i).setText(tc.nextLine());
                encontrado=true;
            }
            i++;
        }while(!encontrado && i < TAM);


    }


}
