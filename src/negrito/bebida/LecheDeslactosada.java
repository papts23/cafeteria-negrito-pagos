package negrito.bebida;

public class LecheDeslactosada extends BebidaDecorator {

    private static final double COSTO_ADICIONAL = 1.00;

    public LecheDeslactosada(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", leche deslactosada";
    }

    @Override
    public double calcularPrecio() {
        return bebidaDecorada.calcularPrecio() + COSTO_ADICIONAL;
    }
}