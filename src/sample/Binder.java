package sample;

import javafx.scene.control.Label;

public class Binder {
    public static void binderTarea(Tarea tarea, Label label){
        label.setText(tarea.texto);
    }
}
