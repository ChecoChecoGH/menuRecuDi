package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ControllerVentana2 {
    @FXML
    Label idFechaCreacion, idFechaModificacion, idDetalles;
    @FXML
    ImageView idFavorito;
    @FXML
    TextArea idTextArea;

    Controller controller;

    @FXML
    public void initialize() {
        for(int i = 0; i < controller.TAMINICIALARRAYS; i++)
            BinderVentana2.binderTarea2(controller.listaTareas.get(i), controller.listaFavoritos.get(i));
    }

    @FXML
    public void clickTextArea(MouseEvent mouseEvent){

    }
}
