package CineJava.objetos;

public class PrecioEntrada {

    private int PrecioEntrada;

    public PrecioEntrada(int PrecioEntrada) {
        this.PrecioEntrada = 10000;
    }

   

    public int getPrecioEntrada() {
        return PrecioEntrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrecioEntrada{");
        sb.append("PrecioEntrada=").append(PrecioEntrada);
        sb.append('}');
        return sb.toString();
    }
    
   
    
}
