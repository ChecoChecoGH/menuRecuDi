package sample;

import java.util.Comparator;
import java.util.Date;

public class Tarea{// implements Comparator {
    public boolean favorito;
    public String texto;
    public String detalles;
    public Date fechaCreacion;
    public Date ultimaModificacion;
    public Integer id;

    public Tarea(boolean favorito, String texto, String detalles, Integer id){
        this.favorito = favorito;
        this.texto = texto;
        this.detalles = detalles;
        Date resultdate = new Date(System.currentTimeMillis());
        this.fechaCreacion = resultdate;
        this.ultimaModificacion = resultdate;
        this.id = id;
    }
/*

    @Override
    public long compare(Tarea t1, Tarea t2) {
        int result;
        return t1.ultimaModificacion.getTime() - t2.ultimaModificacion.getTime();
    }

 */

    public Date getUltimaModificacion() {
        return ultimaModificacion;
    }
}
