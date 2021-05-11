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


    public Tarea configurarTarea(Tarea t){
        
        return t;
    }



    @FXML
    public void clickTextArea(MouseEvent mouseEvent){

    }
}
