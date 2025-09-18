package classeinternas;

import java.util.*;

public class TesteComparator {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(3));
        pedidos.add(new Pedido(1));
        pedidos.add(new Pedido(2));

        // Comparator anônimo para ordenar por id
        Collections.sort(pedidos, new Comparator<Pedido>() {
            @Override
            public int compare(Pedido p1, Pedido p2) {
                return Integer.compare(p1.getId(), p2.getId());
            }
        });

        System.out.println("Pedidos ordenados: " + pedidos);
    }
}
