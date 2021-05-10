package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.Date;

public class BinderVentana2 {
    public static void binderTarea2(Tarea tarea, ImageView imageView){
        if(tarea.favorito){
            File fileEstrellaAmarilla = new File("src/imagenes/estrella.png");
            Image imagenEstrellaAmarilla = new Image(fileEstrellaAmarilla.toURI().toString());

            imageView.setImage(imagenEstrellaAmarilla);
        }else {
            File fileEstrella = new File("src/imagenes/star.png");
            Image imagenEstrella = new Image(fileEstrella.toURI().toString());

            imageView.setImage(imagenEstrella);
        }
    }
}
