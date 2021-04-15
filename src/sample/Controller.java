package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    @FXML
    RadioButton boton1, boton2, boton3, boton4, boton5, boton6;

    @FXML
    ImageView botonAdd;

    @FXML
    Label label1, label2, label3, label4, label5, label6;

    @FXML
    AnchorPane anchorPane2;

    @FXML
    TextField textField;

    ArrayList <Label> alLabels = new ArrayList<>(Arrays.asList(label1, label2, label3, label4, label5, label6));

    final int TAM = alLabels.size()-1;

    Scanner tc = new Scanner(System.in);
    boolean encontrado = false;
    int i = 0;


    @FXML
    public void clickBoton1() {
        label1.setText("");
        checkLabels();
    }

    @FXML
    public void clickBoton2() {
        label2.setText("");
        checkLabels();
    }

    @FXML
    public void clickBoton3() {
        label3.setText("");
        checkLabels();
    }

    @FXML
    public void clickBoton4() {
        label4.setText("");
        checkLabels();
    }

    @FXML
    public void clickBoton5() {
        label5.setText("");
        checkLabels();
    }

    @FXML
    public void clickBoton6() {
        label6.setText("");
        checkLabels();
    }

    @FXML
    public void clickTextField(){
        textField.setText(tc.nextLine());
    }

    public void checkLabels(){
        i = 0;
        encontrado = false;
        do{
            if(alLabels.get(i).getText().isEmpty()){
                anchorPane2.setDisable(true);
                encontrado = true;
            }else
                i++;
        }while(!encontrado && i < TAM);
    }


    @FXML
    public void clickBotonAdd() {
        i = 0;
        encontrado = false;
        do{
            if(alLabels.get(i).getText().isEmpty()){
                System.out.println("alLabels("+i+")" + alLabels.get(i));
                System.out.println("TextField" + textField.getText());
                alLabels.get(i).setText(textField.getText());
                encontrado=true;
            }
            i++;
        }while(!encontrado && i < TAM);


    }


}
