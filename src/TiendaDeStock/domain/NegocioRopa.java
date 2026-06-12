package TiendaDeStock.domain;

import TiendaDeStock.Negocio;

import java.util.ArrayList;

public class NegocioRopa extends Negocio {


    public NegocioRopa(String name){
        super(name);
    }
    public ProductoRopa crearProducto(String nombre, double precio, int stock, String talla, String material) {
        return new ProductoRopa(nombre, precio, stock, talla, material); // Crea un ProductoRopa
    }

    @Override
    public Producto crearProducto(String nombre, double precio, int stock) {
        return null;
    }
}
