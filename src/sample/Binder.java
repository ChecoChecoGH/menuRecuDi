package sample;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Binder {

    public static void binderTarea(Tarea tarea, Label label, ImageView imageView){

        label.setText(tarea.texto);

        if(tarea.favorito){
            File fileEstrellaAmarilla = new File("src/imagenes/estrella.png");
            Image imagenEstrellaAmarilla = new Image(fileEstrellaAmarilla.toURI().toString());

            imageView.setImage(imagenEstrellaAmarilla);
        }else {
            File fileEstrella = new File("src/imagenes/star.png");
            Image imagenEstrella = new Image(fileEstrella.toURI().toString());

            imageView.setImage(imagenEstrella);
        }


        //le tengo que cambiar la imagen aqui dependiendo de si es o no favorito

    }
}
