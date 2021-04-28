package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    final int TAMINICIALARRAYS = 6;

    @FXML
    RadioButton boton1, boton2, boton3, boton4, boton5, boton6;
    @FXML
    ImageView botonAdd;
    @FXML
    Label label1, label2, label3, label4, label5, label6;
    @FXML
    ImageView favorito1, favorito2, favorito3, favorito4, favorito5, favorito6;

    @FXML
    AnchorPane anchorPane2;
    @FXML
    TextField textField;

    ArrayList <String> listaNombreBotones = new ArrayList<>();
    ArrayList <Label> listaLabels = new ArrayList<>();
    ArrayList <Tarea> listaTareas = new ArrayList<>();
    ArrayList <ImageView> listaFavoritos = new ArrayList<>();

    String nombre = "boton1";

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

        listaNombreBotones.addAll(Arrays.asList(boton1.getId(), boton2.getId(), boton3.getId(), boton4.getId(), boton5.getId(), boton6.getId()));
        listaTareas.addAll(Arrays.asList(tarea1, tarea2, tarea3, tarea4, tarea5, tarea6));
        listaLabels.addAll(Arrays.asList(label1, label2, label3, label4, label5, label6));
        listaFavoritos.addAll(Arrays.asList(favorito1, favorito2, favorito3, favorito4, favorito5, favorito6));

        for(int i = 0; i < TAMINICIALARRAYS; i++)
            Binder.binderTarea(listaTareas.get(i), listaLabels.get(i), listaFavoritos.get(i));

    }

    //CLICK EN BORRAR
    //Funcion que le paso un clickBoton
    //System.out.println(MouseInfo.getNumberOfButtons());
    @FXML
   public void clickBotonBorrado(MouseEvent mouseEvent){
        System.out.println(mouseEvent.getSource());
        if(mouseEvent.getSource() instanceof RadioButton){
            String aux = ((RadioButton) mouseEvent.getSource()).getId();
            int i = 0;
            int TAM = listaNombreBotones.size();
            boolean encontrado = false;
            do{
                if(!listaNombreBotones.get(i).equals(aux))
                    encontrado = true;
                else
                    i++;
            }while(!encontrado && i < TAM);

            //System.out.println(((RadioButton) mouseEvent.getSource()).getId());
            //String cadena = boton1.getId();
            switch(((RadioButton) mouseEvent.getSource()).getId()){
                case nombre:
            }
        }


        //casting para que entienda que es un boton puesto que solo sabe que le paso un objeto

    }


    @FXML
    public void clickBoton1() {
        tarea1.texto = "";
        tarea1.favorito = false;
        Binder.binderTarea(tarea1, label1, favorito1);
        anchorPane2.setDisable(false);
    }
    @FXML
    public void clickBoton2() {
        tarea2.texto = "";
        tarea2.favorito = false;
        Binder.binderTarea(tarea2, label2, favorito2);
        anchorPane2.setDisable(false);
    }
    @FXML
    public void clickBoton3() {
        tarea3.texto = "";
        tarea3.favorito = false;
        Binder.binderTarea(tarea3, label3, favorito3);
        anchorPane2.setDisable(false);
    }
    @FXML
    public void clickBoton4() {
        tarea4.texto = "";
        tarea4.favorito = false;
        Binder.binderTarea(tarea4, label4, favorito4);
        anchorPane2.setDisable(false);
    }
    @FXML
    public void clickBoton5() {
        tarea5.texto = "";
        tarea5.favorito = false;
        Binder.binderTarea(tarea5, label5, favorito5);
        anchorPane2.setDisable(false);
    }
    @FXML
     public void clickBoton6() {
         tarea6.texto = "";
         tarea6.favorito = false;
         Binder.binderTarea(tarea6, label6, favorito6);
         anchorPane2.setDisable(false);
     }

    //CLICK EN ESTRELLAS
    //funcion que le paso un clickEstrella
    @FXML
    public void clickEstrella1(){
        if(!tarea1.texto.isEmpty()) {
            tarea1.favorito = !tarea1.favorito;
            Binder.binderTarea(tarea1, label1, favorito1);
        }
    }
    @FXML
    public void clickEstrella2(){
        if(!tarea2.texto.isEmpty()){
            tarea2.favorito = !tarea2.favorito;
            Binder.binderTarea(tarea2, label2, favorito2);
        }
    }
    @FXML
    public void clickEstrella3(){
        if(!tarea3.texto.isEmpty()) {
            tarea3.favorito = !tarea3.favorito;
            Binder.binderTarea(tarea3, label3, favorito3);
        }
    }
    @FXML
    public void clickEstrella4(){
        if(!tarea4.texto.isEmpty()) {
            tarea4.favorito = !tarea4.favorito;
            Binder.binderTarea(tarea4, label4, favorito4);
        }
    }
    @FXML
    public void clickEstrella5(){
        if(!tarea5.texto.isEmpty()) {
            tarea5.favorito = !tarea5.favorito;
            Binder.binderTarea(tarea5, label5, favorito5);
        }
    }
    @FXML
    public void clickEstrella6(){
        if(!tarea6.texto.isEmpty()) {
            tarea6.favorito = !tarea6.favorito;
            Binder.binderTarea(tarea6, label6, favorito6);
        }
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
        final int TAMANO = listaLabels.size();
        i = 0;
        encontrado = false;
        do{
            Label label = listaLabels.get(i);
            Tarea tarea = listaTareas.get(i);
            ImageView imageView = listaFavoritos.get(i);
            if(listaLabels.get(i).getText().isEmpty()){
                tarea.texto = textField.getText();
                textField.setText("");
                Binder.binderTarea(tarea, label, imageView);
                encontrado=true;
            }
            i++;
            System.out.println(i);
        }while(!encontrado && i < TAMANO);
        checkLabels();
    }

}
