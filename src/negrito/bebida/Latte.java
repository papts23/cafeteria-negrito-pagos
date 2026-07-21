package negrito.bebida;

public class Latte implements Bebida {

    private static final double PRECIO_BASE = 7.00;

    @Override
    public String getDescripcion() {
        return "Latte";
    }

    @Override
    public double calcularPrecio() {
        return PRECIO_BASE;
    }
}