package negrito.bebida;

public class Canela extends BebidaDecorator {

    private static final double COSTO_ADICIONAL = 0.50;

    public Canela(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", canela espolvoreada";
    }

    @Override
    public double calcularPrecio() {
        return bebidaDecorada.calcularPrecio() + COSTO_ADICIONAL;
    }
}