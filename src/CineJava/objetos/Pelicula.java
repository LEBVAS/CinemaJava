package CineJava.objetos;

public class Pelicula {

    private String Titulo;
    private int Duracion;
    private int EdadMinima;
    private String Director;

    public Pelicula(int Duracion, int EdadMinima, String peter_jackson) {
        this.Duracion = Duracion;
        this.EdadMinima = EdadMinima;
        this.Director = Director;
    }

  
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public int getEdadMinima() {
        return EdadMinima;
    }

    public void setEdadMinima(int EdadMinima) {
        this.EdadMinima = EdadMinima;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }
    
      @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append("Titulo=").append(Titulo);
        sb.append(", Duracion=").append(Duracion);
        sb.append(", EdadMinima=").append(EdadMinima);
        sb.append(", Director=").append(Director);
        sb.append('}');
        return sb.toString();
    }


}
