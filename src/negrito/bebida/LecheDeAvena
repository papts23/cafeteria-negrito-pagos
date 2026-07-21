package negrito.bebida;

public class LecheDeAvena extends BebidaDecorator {

    private static final double COSTO_ADICIONAL = 2.00;

    public LecheDeAvena(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", leche de avena";
    }

    @Override
    public double calcularPrecio() {
        return bebidaDecorada.calcularPrecio() + COSTO_ADICIONAL;
    }
}