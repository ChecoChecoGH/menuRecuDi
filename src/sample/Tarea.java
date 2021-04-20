package sample;

public class Tarea {
    public boolean favorito = false;
    public String texto = "";

    public Tarea(boolean favorito, String texto) {
        this.favorito = favorito;
        this.texto = texto;
    }

    public Tarea(boolean favorito) {
        this.favorito = favorito;
    }

    public Tarea(String texto) {
        this.texto = texto;
    }
}
