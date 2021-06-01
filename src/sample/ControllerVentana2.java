package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

import java.io.File;
import java.util.Date;
import java.util.List;

public class ControllerVentana2 {
    private Controller controllerVentana1;

    @FXML
    Label idFechaCreacion, idFechaModificacion;
    @FXML
    ImageView idFavorito;
    @FXML
    TextArea idTextArea, idDetalles;

    File fileEstrellaAmarilla = new File("src/imagenes/estrella.png");
    Image imagenEstrellaAmarilla = new Image(fileEstrellaAmarilla.toURI().toString());

    File fileEstrella = new File("src/imagenes/star.png");
    Image imagenEstrella = new Image(fileEstrella.toURI().toString());

    Tarea tareaOriginal = new Tarea(false,"","",null);

    @FXML
    public void initialize() {
    }

    public void configurarTarea(Tarea tarea){
        tareaOriginal.texto = tarea.texto;
        tareaOriginal.detalles = tarea.detalles;
        tareaOriginal.favorito = tarea.favorito;
        tareaOriginal.fechaCreacion = tarea.fechaCreacion;
        tareaOriginal.ultimaModificacion = tarea.ultimaModificacion;
        tareaOriginal.id = tarea.id;
        idTextArea.setText(tarea.texto);
        idDetalles.setText(tarea.detalles);

        if(idTextArea.getText().isEmpty()){
            Date resultDate = new Date(System.currentTimeMillis());
            idFechaCreacion.setText(resultDate.toString());
        }

        if(tarea.favorito)
            idFavorito.setImage(imagenEstrellaAmarilla);
        else
            idFavorito.setImage(imagenEstrella);

        if(tarea.fechaCreacion != null)
            idFechaCreacion.setText(tarea.fechaCreacion.toString());

        if(tarea.ultimaModificacion != null){
            idFechaModificacion.setText(tarea.ultimaModificacion.toString());
            tarea.ultimaModificacion = new Date(tarea.ultimaModificacion.getTime());
            System.out.println(tarea.ultimaModificacion);
        }
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

            controllerVentana1.cambiarLabel(tareaOriginal, idTextArea.getText());
    }

    @FXML
    public void clickDetalles(){
        Date resultdate = new Date(System.currentTimeMillis());
        idFechaModificacion.setText(resultdate.toString());

        if(tareaOriginal.detalles.equals(idDetalles.getText()))
            if(tareaOriginal.ultimaModificacion != null)
                idFechaModificacion.setText(tareaOriginal.ultimaModificacion.toString());
            else
                idFechaModificacion.setText("");

        controllerVentana1.cambiarDetalles(tareaOriginal, idDetalles.getText());
    }

    //todo llamada al binder
    @FXML
    public void clickFavorito(){
        if(idFavorito.getImage() == imagenEstrella) {
            idFavorito.setImage(imagenEstrellaAmarilla);
            controllerVentana1.cambiarEstrellaEnV1(tareaOriginal);
        }else {
            idFavorito.setImage(imagenEstrella);
            controllerVentana1.cambiarEstrellaEnV1(tareaOriginal);
        }
    }

    public void enviarController(Controller controller) { controllerVentana1 = controller; }




}
