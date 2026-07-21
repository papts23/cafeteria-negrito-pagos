package negrito.bebida;

public class TamanoGrande extends BebidaDecorator {

    private static final double COSTO_ADICIONAL = 2.50;

    public TamanoGrande(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return "Grande - " + bebidaDecorada.getDescripcion();
    }

    @Override
    public double calcularPrecio() {
        return bebidaDecorada.calcularPrecio() + COSTO_ADICIONAL;
    }
}