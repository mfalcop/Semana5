package uninorte.semana5;

/**
 * Created by Laboratorio on 13/03/2017.
 */

public class Fichas {


    private String titulo;
    private String fecha;
    private String texto;

    public Fichas(String titulo, String texto) {
        this.titulo = titulo;
        this.fecha = ""; // agregar fecha de hoy
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
