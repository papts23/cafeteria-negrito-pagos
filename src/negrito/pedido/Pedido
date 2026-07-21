package negrito.pedido;

import negrito.bebida.Bebida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {

    private final String codigoPedido;
    private final String nombreCliente;
    private final List<ItemPedido> items;

    public Pedido(String codigoPedido, String nombreCliente) {
        if (codigoPedido == null || codigoPedido.isBlank()) {
            throw new IllegalArgumentException("El codigo del pedido es obligatorio");
        }
        if (nombreCliente == null || nombreCliente.isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente es obligatorio");
        }
        this.codigoPedido = codigoPedido;
        this.nombreCliente = nombreCliente;
        this.items = new ArrayList<>();
    }

    public void agregarBebida(Bebida bebida, int cantidad) {
        items.add(new ItemPedido(bebida, cantidad));
    }

    public List<ItemPedido> getItems() {
        return Collections.unmodifiableList(items);
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public String generarResumen() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Pedido ").append(codigoPedido).append(" - Cliente: ").append(nombreCliente).append(System.lineSeparator());
        for (ItemPedido item : items) {
            resumen.append("  ").append(item).append(System.lineSeparator());
        }
        resumen.append("Total: S/ ").append(String.format("%.2f", calcularTotal()));
        return resumen.toString();
    }
}