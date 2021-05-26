package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

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
    AnchorPane anchorPane2Grande;
    @FXML
    TextField textField;

    ArrayList <String> listaNombreBotones = new ArrayList<>();
    ArrayList <Label> listaLabels = new ArrayList<>();
    ArrayList <Tarea> listaTareas = new ArrayList<>();
    ArrayList <ImageView> listaFavoritos = new ArrayList<>();

    boolean encontrado = false;
    int i = 0;

    Tarea tarea1, tarea2, tarea3, tarea4, tarea5, tarea6;

    @FXML
    public void initialize() {

        tarea1 = new Tarea(false, "Hacer práctica 2 PSP", "Ejercicios 1 y 2");
        tarea2 = new Tarea(false, "Hacer práctica 1 PSP", "Ejercicios propuestos en el aula");
        tarea3 = new Tarea(false, "Hacer práctica 2 DI", "Tarea 7");
        tarea4 = new Tarea(false, "Hacer práctica 1 DI", "Crear proyecto de DI");
        tarea5 = new Tarea(false, "Hacer práctica 2 PMDM", "Acabar proyecto DI");
        tarea6 = new Tarea(false, "Hacer práctica 1 PMDM", "tikitiki");

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
            //switch(((RadioButton) mouseEvent.getSource()).getId()){
              //  case nombre:
           // }
        }


        //casting para que entienda que es un boton puesto que solo sabe que le paso un objeto

    }


    @FXML
    public void clickBoton1() {
        tarea1.texto = "";
        tarea1.favorito = false;
        tarea1.detalles = "";
        tarea1.fechaCreacion = null;
        tarea1.ultimaModificacion = null;
        Binder.binderTarea(tarea1, label1, favorito1);
        anchorPane2Grande.setDisable(false);
    }
    @FXML
    public void clickBoton2() {
        tarea2.texto = "";
        tarea2.favorito = false;
        tarea2.detalles = "";
        tarea2.fechaCreacion = null;
        tarea2.ultimaModificacion = null;
        Binder.binderTarea(tarea2, label2, favorito2);
        anchorPane2Grande.setDisable(false);
    }
    @FXML
    public void clickBoton3() {
        tarea3.texto = "";
        tarea3.favorito = false;
        tarea3.detalles = "";
        tarea3.fechaCreacion = null;
        tarea3.ultimaModificacion = null;
        Binder.binderTarea(tarea3, label3, favorito3);
        anchorPane2Grande.setDisable(false);
    }
    @FXML
    public void clickBoton4() {
        tarea4.texto = "";
        tarea4.favorito = false;
        tarea4.detalles = "";
        tarea4.fechaCreacion = null;
        tarea4.ultimaModificacion = null;
        Binder.binderTarea(tarea4, label4, favorito4);
        anchorPane2Grande.setDisable(false);
    }
    @FXML
    public void clickBoton5() {
        tarea5.texto = "";
        tarea5.favorito = false;
        tarea5.detalles = "";
        tarea5.fechaCreacion = null;
        tarea5.ultimaModificacion = null;
        Binder.binderTarea(tarea5, label5, favorito5);
        anchorPane2Grande.setDisable(false);
    }
    @FXML
     public void clickBoton6() {
         tarea6.texto = "";
         tarea6.favorito = false;
         tarea6.detalles = "";
         tarea6.fechaCreacion = null;
         tarea6.ultimaModificacion = null;
         Binder.binderTarea(tarea6, label6, favorito6);
         anchorPane2Grande.setDisable(false);
     }

     //CLICK ANCHORPANE
    //hacer funcion para optimizarlo
    @FXML
    public void clickAnchorPane1(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root,683,243);
            stage.setScene(scene);

            ControllerVentana2 controller = loader.getController();
            controller.configurarTarea(tarea1);

            controller.enviarController(this);

            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clickAnchorPane2(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root,683,243);
            stage.setScene(scene);

            ControllerVentana2 controller = loader.getController();
            controller.configurarTarea(tarea2);

            controller.enviarController(this);

            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clickAnchorPane3(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root,683,243);
            stage.setScene(scene);

            ControllerVentana2 controller = loader.getController();
            controller.configurarTarea(tarea3);

            controller.enviarController(this);

            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clickAnchorPane4(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root,683,243);
            stage.setScene(scene);

            ControllerVentana2 controller = loader.getController();
            controller.configurarTarea(tarea4);

            controller.enviarController(this);

            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clickAnchorPane5(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root,683,243);
            stage.setScene(scene);

            ControllerVentana2 controller = loader.getController();
            controller.configurarTarea(tarea5);

            controller.enviarController(this);

            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clickAnchorPane6(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root,683,243);
            stage.setScene(scene);

            ControllerVentana2 controller = loader.getController();
            controller.configurarTarea(tarea6);

            controller.enviarController(this);

            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }




    //CLICK EN ESTRELLAS
    //funcion que le paso un clickEstrella
    @FXML
    public void clickEstrella1(MouseEvent e){
        if(!tarea1.texto.isEmpty()) {
            tarea1.favorito = !tarea1.favorito;
            Binder.binderTarea(tarea1, label1, favorito1);
        }
        e.consume();
    }
    @FXML
    public void clickEstrella2(MouseEvent e){
        if(!tarea2.texto.isEmpty()){
            tarea2.favorito = !tarea2.favorito;
            Binder.binderTarea(tarea2, label2, favorito2);
        }
        e.consume();
    }
    @FXML
    public void clickEstrella3(MouseEvent e){
        if(!tarea3.texto.isEmpty()) {
            tarea3.favorito = !tarea3.favorito;
            Binder.binderTarea(tarea3, label3, favorito3);
        }
        e.consume();
    }
    @FXML
    public void clickEstrella4(MouseEvent e){
        if(!tarea4.texto.isEmpty()) {
            tarea4.favorito = !tarea4.favorito;
            Binder.binderTarea(tarea4, label4, favorito4);
        }
        e.consume();
    }
    @FXML
    public void clickEstrella5(MouseEvent e){
        if(!tarea5.texto.isEmpty()) {
            tarea5.favorito = !tarea5.favorito;
            Binder.binderTarea(tarea5, label5, favorito5);
        }
        e.consume();
    }
    @FXML
    public void clickEstrella6(MouseEvent e){
        if(!tarea6.texto.isEmpty()) {
            tarea6.favorito = !tarea6.favorito;
            Binder.binderTarea(tarea6, label6, favorito6);
        }
        e.consume();
    }

    public void checkLabels(){
        final int TAMANO = listaLabels.size()-1;
        i = 0;
        encontrado = false;
        do{
            if(listaLabels.get(i).getText().isEmpty()){
                anchorPane2Grande.setDisable(false);
                encontrado = true;
            }else
                i++;
        }while(!encontrado && i < TAMANO);

        if(i >= TAMANO)
            anchorPane2Grande.setDisable(true);
    }

    @FXML
    public void clickBotonAdd() {
        final int TAMANO = listaLabels.size();
        i = 0;
        encontrado = false;
        do{
            Label label = listaLabels.get(i);
            Tarea tarea = listaTareas.get(i);
            Date resultdate = new Date(System.currentTimeMillis());
            ImageView imageView = listaFavoritos.get(i);
            if(listaLabels.get(i).getText().isEmpty()){
                tarea.texto = textField.getText();
                tarea.fechaCreacion = resultdate;
                tarea.ultimaModificacion = resultdate;
                textField.setText("");
                Binder.binderTarea(tarea, label, imageView);
                encontrado=true;
            }
            i++;
            System.out.println(i);
        }while(!encontrado && i < TAMANO);
        checkLabels();
    }


    public void cambiarEstrellaEnV1(Tarea tarea, Image image){
        int tam  = listaTareas.size();
        for (int i = 0; i < tam; i++)
            if (tarea.texto.equals(listaTareas.get(i).detalles))
                listaFavoritos.get(i).setImage(image);

        for(int i = 0; i < tam; i++)
            Binder.binderTarea(listaTareas.get(i), listaLabels.get(i), listaFavoritos.get(i));
    }


}
