package cinemajava.Objectos;

public class Pelicula {

    // lo que ya esta en el ejercicio
    // Definir atributos
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    // Crear constructor
    public Pelicula(String director, int duracion, int edadMinima,
            String peter_Jackson) {
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    // Definir metodos
    // Para obtener titulo, duracion, edadMinima, director de la pelicula
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // override para imprimir los valores del asiento
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append("titulo=").append(titulo);
        sb.append(", duracion=").append(duracion);
        sb.append(", edadMinima=").append(edadMinima);
        sb.append(", director=").append(director);
        sb.append('}');
        return sb.toString();
    }

}
