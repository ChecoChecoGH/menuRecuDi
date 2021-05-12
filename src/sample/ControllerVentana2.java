package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.util.Date;

public class ControllerVentana2 {
    @FXML
    Label idFechaCreacion, idFechaModificacion, idDetalles;
    @FXML
    ImageView idFavorito;
    @FXML
    TextArea idTextArea;

    File fileEstrellaAmarilla = new File("src/imagenes/estrella.png");
    Image imagenEstrellaAmarilla = new Image(fileEstrellaAmarilla.toURI().toString());

    File fileEstrella = new File("src/imagenes/star.png");
    Image imagenEstrella = new Image(fileEstrella.toURI().toString());


    public Tarea configurarTarea(Tarea tarea){
        //Tarea tareaAux = new Tarea(false, "", "");

        idTextArea.setText(tarea.texto);
        idDetalles.setText(tarea.detalles);
        if(tarea.favorito)
            idFavorito.setImage(imagenEstrellaAmarilla);
        else
            idFavorito.setImage(imagenEstrella);

        idFechaCreacion.setText(tarea.fechaCreacion.toString());
        idFechaModificacion.setText(tarea.ultimaModificacion.toString());

        return tarea;
    }



    @FXML
    public void clickTextArea(MouseEvent mouseEvent){
        Date resultdate = new Date(System.currentTimeMillis());
        idFechaModificacion.setText(resultdate.toString());
    }
}
