package cinemajava.Objectos;

public class PrecioEntrada {

    // Definir atributos
    private int PrecioEntrada;

    // Crear constructor
    public PrecioEntrada() {
        this.PrecioEntrada = 10000; // Precio de la entrada
    }

    // Definir metodos
    public int getPrecioEntrada() {
        return PrecioEntrada;
    }

    // override para imprimir los valores del asiento
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrecioEntrada{");
        sb.append("PrecioEntrada=").append(PrecioEntrada);
        sb.append('}');
        return sb.toString();
    }

}
