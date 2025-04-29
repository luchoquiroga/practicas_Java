package TiendaDeStock;

import TiendaDeStock.domain.Producto;

import java.util.List;
import java.util.ArrayList;

public class Negocio {
    private String name;
    private List<Producto> productos;

    public Negocio(String name){
        this.name = name;
        this.productos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProductos(List<Producto> ListProducts){
        productos.addAll(ListProducts);
    }

    public String ShowProducts() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bienvenido al negocio: ").append(this.name).append("\n");
        int i = 1;
        for (Producto p : productos) {
            sb.append(i).append(") ").append(p.mostrarInfo()).append("\n");
            i++;
        }
        return sb.toString(); // Devolver el texto en lugar de imprimirlo
    }

    public List<Producto> getProductos(Negocio negocio){
        return this.productos;
    }
}
