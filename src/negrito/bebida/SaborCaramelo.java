package negrito.bebida;

public class SaborCaramelo extends BebidaDecorator {

    private static final double COSTO_ADICIONAL = 1.20;

    public SaborCaramelo(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", saborizante de caramelo";
    }

    @Override
    public double calcularPrecio() {
        return bebidaDecorada.calcularPrecio() + COSTO_ADICIONAL;
    }
}