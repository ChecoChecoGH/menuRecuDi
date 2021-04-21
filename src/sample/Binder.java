package sample;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Binder {
    public static void binderTarea(Tarea tarea, Label label, ImageView imageView){
        label.setText(tarea.texto);
    }
}
