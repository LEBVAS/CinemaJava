package cinemajava.Objectos;

public class Espectador {

    // lo que ya esta en el ejercicio
    // Definir atributos
    private String nombre;
    private Float edad;
    private Double DiDisponible;
    private Float Dinero;

    // Crear constructor
    public Espectador(String nombre, Float edad,
            Double DiDisponible, Float Dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.DiDisponible = DiDisponible;
        this.Dinero = Dinero;
    }

    // Definir metodos
    // Para obtener nombre, edad, dinero del espectador
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getEdad() {
        return edad;
    }

    public void setEdad(Float edad) {
        this.edad = edad;
    }

    public Double getDiDisponible() {
        return DiDisponible;
    }

    public void setDiDisponible(Double DiDisponible) {
        this.DiDisponible = DiDisponible;
    }

    public Float getDinero() {
        return Dinero;
    }

    public void setDinero(Float Dinero) {
        this.Dinero = Dinero;
    }

    // override para imprimir los valores del espectador
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Espectador{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", DiDisponible=").append(DiDisponible);
        sb.append(", Dinero=").append(Dinero);
        sb.append('}');
        return sb.toString();
    }

}
