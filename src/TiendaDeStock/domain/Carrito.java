package TiendaDeStock.domain;

import java.util.List;
import java.util.ArrayList;

public class Carrito {
    private List<ItemCarrito> items = new ArrayList<>();

    public void addItem(ItemCarrito itemCarrito){
        this.items.add(itemCarrito);
    }

    public String infoCar(){
        int i = 1;
        StringBuilder sb = new StringBuilder();
        for (ItemCarrito itemDeCarrito : items) {
            sb.append(i).append(") ").append(itemDeCarrito.mostrarInfo()).append("\n");
            i++;
        }
        return sb.toString();
    }
    // sumas itemCarrito.precio * itemcarrito.cantidad
}
