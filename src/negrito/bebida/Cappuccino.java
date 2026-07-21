package negrito.bebida;

public class Cappuccino implements Bebida {

    private static final double PRECIO_BASE = 6.50;

    @Override
    public String getDescripcion() {
        return "Cappuccino";
    }

    @Override
    public double calcularPrecio() {
        return PRECIO_BASE;
    }
}