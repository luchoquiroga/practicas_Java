package TiendaDeStock.domain;

import TiendaDeStock.Negocio;

public class NegocioComida extends Negocio {


    public NegocioComida(String name){
        super(name);
    }
    public ProductoComida crearProducto(String nombre, double precio, int stock, String calorias, String tipo) {
        return new ProductoComida(nombre, precio, stock, calorias, tipo);
    }

    @Override
    public Producto crearProducto(String nombre, double precio, int stock) {
        return null;
    }
}

