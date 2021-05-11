package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarea {
    public boolean favorito;
    public String texto;
    public String detalles;
    public Date fechaCreacion;
    public Date ultimaModificacion;

    public Tarea(boolean favorito, String texto, String detalles){
        this.favorito = favorito;
        this.texto = texto;
        this.detalles = detalles;
        Date resultdate = new Date(System.currentTimeMillis());
        this.fechaCreacion = resultdate;
        this.ultimaModificacion = resultdate;
    }


}
