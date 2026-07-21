package negrito.bebida;

public class SaborVainilla extends BebidaDecorator {

    private static final double COSTO_ADICIONAL = 1.20;

    public SaborVainilla(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", saborizante de vainilla";
    }

    @Override
    public double calcularPrecio() {
        return bebidaDecorada.calcularPrecio() + COSTO_ADICIONAL;
    }
}