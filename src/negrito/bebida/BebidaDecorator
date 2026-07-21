package negrito.bebida;

public abstract class BebidaDecorator implements Bebida {

    protected final Bebida bebidaDecorada;

    protected BebidaDecorator(Bebida bebidaDecorada) {
        if (bebidaDecorada == null) {
            throw new IllegalArgumentException("La bebida a decorar no puede ser nula");
        }
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public double calcularPrecio() {
        return bebidaDecorada.calcularPrecio();
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion();
    }
}