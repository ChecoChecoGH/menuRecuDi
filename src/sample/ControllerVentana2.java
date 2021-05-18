package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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

    Tarea tareaOriginal = new Tarea(false,"","");

    public void configurarTarea(Tarea tarea){
        tareaOriginal.texto = tarea.texto;
        tareaOriginal.detalles = tarea.detalles;
        tareaOriginal.favorito = tarea.favorito;
        tareaOriginal.fechaCreacion = tarea.fechaCreacion;
        tareaOriginal.ultimaModificacion = tarea.ultimaModificacion;
        idTextArea.setText(tarea.texto);
        idDetalles.setText(tarea.detalles);

        if(idTextArea.getText().isEmpty()){
            Date resultdate = new Date(System.currentTimeMillis());
            idFechaCreacion.setText(resultdate.toString());
        }

        if(tarea.favorito)
            idFavorito.setImage(imagenEstrellaAmarilla);
        else
            idFavorito.setImage(imagenEstrella);

        if(tarea.fechaCreacion != null)
            idFechaCreacion.setText(tarea.fechaCreacion.toString());

        if(tarea.ultimaModificacion != null)
            idFechaModificacion.setText(tarea.ultimaModificacion.toString());
    }

    @FXML
    public void clickTextArea(){
        Date resultdate = new Date(System.currentTimeMillis());
        idFechaModificacion.setText(resultdate.toString());

        if(tareaOriginal.texto.equals(idTextArea.getText()))
            if(tareaOriginal.ultimaModificacion != null)
                idFechaModificacion.setText(tareaOriginal.ultimaModificacion.toString());
            else
                idFechaModificacion.setText("");

    }

    @FXML
    public void clickFavorito(){
        if(idFavorito.getImage() == imagenEstrella)
            idFavorito.setImage(imagenEstrellaAmarilla);
        else
            idFavorito.setImage(imagenEstrella);
    }


}
