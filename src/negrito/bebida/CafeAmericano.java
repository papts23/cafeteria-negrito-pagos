package negrito.bebida;

public class CafeAmericano implements Bebida {

    private static final double PRECIO_BASE = 5.00;

    @Override
    public String getDescripcion() {
        return "Cafe Americano";
    }

    @Override
    public double calcularPrecio() {
        return PRECIO_BASE;
    }
}