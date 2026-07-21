package negrito.pedido;

import negrito.bebida.Bebida;

public class ItemPedido {

    private final Bebida bebida;
    private int cantidad;

    public ItemPedido(Bebida bebida, int cantidad) {
        if (bebida == null) {
            throw new IllegalArgumentException("La bebida del item no puede ser nula");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero");
        }
        this.bebida = bebida;
        this.cantidad = cantidad;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void incrementarCantidad(int unidades) {
        if (unidades <= 0) {
            throw new IllegalArgumentException("Las unidades a incrementar deben ser mayores a cero");
        }
        this.cantidad += unidades;
    }

    public double calcularSubtotal() {
        return bebida.calcularPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return String.format("%dx %s = S/ %.2f", cantidad, bebida.getDescripcion(), calcularSubtotal());
    }
}