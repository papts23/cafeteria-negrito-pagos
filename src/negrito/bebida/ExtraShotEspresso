package negrito.bebida;

public class ExtraShotEspresso extends BebidaDecorator {

    private static final double COSTO_ADICIONAL = 1.80;

    public ExtraShotEspresso(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", shot extra de espresso";
    }

    @Override
    public double calcularPrecio() {
        return bebidaDecorada.calcularPrecio() + COSTO_ADICIONAL;
    }
}