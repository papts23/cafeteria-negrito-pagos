package negrito.app;

import negrito.bebida.Bebida;
import negrito.bebida.CafeAmericano;
import negrito.bebida.Canela;
import negrito.bebida.Cappuccino;
import negrito.bebida.Espresso;
import negrito.bebida.ExtraShotEspresso;
import negrito.bebida.Latte;
import negrito.bebida.LecheDeAvena;
import negrito.bebida.LecheDeslactosada;
import negrito.bebida.SaborCaramelo;
import negrito.bebida.SaborVainilla;
import negrito.bebida.TamanoGrande;
import negrito.pedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class AplicacionCafeteria {

    public static void main(String[] args) {
        List<Pedido> pedidosDelDia = new ArrayList<>();
        pedidosDelDia.add(construirPedidoCliente1());
        pedidosDelDia.add(construirPedidoCliente2());
        pedidosDelDia.add(construirPedidoCliente3());

        double totalRecaudadoDelDia = 0.0;

        for (Pedido pedido : pedidosDelDia) {
            System.out.println(pedido.generarResumen());
            System.out.println("------------------------------------------------------");
            totalRecaudadoDelDia += pedido.calcularTotal();
        }

        System.out.println("Recaudacion total del dia: S/ " + String.format("%.2f", totalRecaudadoDelDia));
    }

    private static Pedido construirPedidoCliente1() {
        Pedido pedido = new Pedido("PED-0001", "Maria Fernanda Rios");

        Bebida cappuccinoCompleto = new ExtraShotEspresso(
                new LecheDeAvena(
                        new Canela(
                                new Cappuccino())));

        Bebida latteGrandeSaborizado = new TamanoGrande(
                new SaborVainilla(
                        new Latte()));

        pedido.agregarBebida(cappuccinoCompleto, 2);
        pedido.agregarBebida(latteGrandeSaborizado, 1);

        return pedido;
    }

    private static Pedido construirPedidoCliente2() {
        Pedido pedido = new Pedido("PED-0002", "Jorge Luis Paredes");

        Bebida espressoDoble = new ExtraShotEspresso(new Espresso());

        Bebida americanoDeslactosado = new LecheDeslactosada(new CafeAmericano());

        Bebida latteCaramelo = new TamanoGrande(
                new SaborCaramelo(
                        new ExtraShotEspresso(
                                new Latte())));

        pedido.agregarBebida(espressoDoble, 1);
        pedido.agregarBebida(americanoDeslactosado, 4);
        pedido.agregarBebida(latteCaramelo, 2);

        return pedido;
    }

    private static Pedido construirPedidoCliente3() {
        Pedido pedido = new Pedido("PED-0003", "Andrea Castillo");

        Bebida cappuccinoSinExtras = new Cappuccino();

        Bebida cappuccinoConTodo = new TamanoGrande(
                new ExtraShotEspresso(
                        new LecheDeAvena(
                                new SaborCaramelo(
                                        new Canela(
                                                new Cappuccino())))));

        pedido.agregarBebida(cappuccinoSinExtras, 1);
        pedido.agregarBebida(cappuccinoConTodo, 1);

        return pedido;
    }
}