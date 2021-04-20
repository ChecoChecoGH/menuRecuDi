package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Arrays;

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

    ArrayList <Label> listaLabels = new ArrayList<>();
    ArrayList <Tarea> listaTareas = new ArrayList<>();

    boolean encontrado = false;
    int i = 0;

    Tarea tarea1, tarea2, tarea3, tarea4, tarea5, tarea6;


    @FXML
    public void initialize() {

        tarea1 = new Tarea(false, "Hacer práctica 2 PSP");
        tarea2 = new Tarea(false, "Hacer práctica 1 PSP");
        tarea3 = new Tarea(false, "Hacer práctica 2 DI");
        tarea4 = new Tarea(false, "Hacer práctica 1 DI");
        tarea5 = new Tarea(false, "Hacer práctica 2 PMDM");
        tarea6 = new Tarea(false, "Hacer práctica 1 PMDM");

        Binder.binderTarea(tarea1, label1);
        Binder.binderTarea(tarea2, label2);
        Binder.binderTarea(tarea3, label3);
        Binder.binderTarea(tarea4, label4);
        Binder.binderTarea(tarea5, label5);
        Binder.binderTarea(tarea6, label6);

        listaLabels.addAll(Arrays.asList(label1, label2, label3, label4, label5, label6));
        listaTareas.addAll(Arrays.asList(tarea1, tarea2, tarea3, tarea4, tarea5, tarea6));
    }
    @FXML
    public void clickBoton1() {
        label1.setText("");
        anchorPane2.setDisable(false);
    }
    @FXML
    public void clickBoton2() {
        label2.setText("");
        anchorPane2.setDisable(false);
    }
    @FXML
    public void clickBoton3() {
        label3.setText("");
        anchorPane2.setDisable(false);
    }
    @FXML
    public void clickBoton4() {
        label4.setText("");
        anchorPane2.setDisable(false);
    }
    @FXML
    public void clickBoton5() {
        label5.setText("");
        anchorPane2.setDisable(false);
    }
    @FXML
    public void clickBoton6() {
        label6.setText("");
        anchorPane2.setDisable(false);
    }

    public void checkLabels(){
        final int TAMANO = listaLabels.size()-1;
        i = 0;
        encontrado = false;
        do{
            if(listaLabels.get(i).getText().isEmpty()){
                anchorPane2.setDisable(false);
                encontrado = true;
            }else
                i++;
        }while(!encontrado && i < TAMANO);

        if(i >= TAMANO)
            anchorPane2.setDisable(true);
    }

    @FXML
    public void clickBotonAdd() {
        final int TAMANO = listaLabels.size()-1;
        i = 0;
        encontrado = false;
        do{
            Label label = listaLabels.get(i);
            Tarea tarea = listaTareas.get(i);
            if(listaLabels.get(i).getText().isEmpty()){
                tarea.texto = textField.getText();
                textField.setText("");
                Binder.binderTarea(tarea, label);
                encontrado=true;
            }
            i++;
        }while(!encontrado && i < TAMANO);
        checkLabels();
    }

}
