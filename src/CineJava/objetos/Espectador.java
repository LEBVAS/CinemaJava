package CineJava.objetos;

public class Espectador {

    //Atributos
    private String Nombre;
    private Float Edad;
    private Double DiDisponible;
    private Float Dinero;

    public Espectador(String Nombre, Float Edad, 
            Double DiDisponible, Float Dinero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DiDisponible = DiDisponible;
        this.Dinero = Dinero;
    }

    //DEfinir guetter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Float getEdad() {
        return Edad;
    }

    public void setEdad(Float Edad) {
        this.Edad = Edad;
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

    //Imprime los valores
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Espetador{");
        sb.append("Nombre=").append(Nombre);
        sb.append(", Edad=").append(Edad);
        sb.append(", DiDisponible=").append(DiDisponible);
        sb.append(", Dinero=").append(Dinero);
        sb.append('}');
        return sb.toString();
    }

}
