package TiendaDeStock.domain;

public class ItemCarrito {
    private Producto producto;
    private final int cantidad;
    private double subtotal;

    public ItemCarrito(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecio() * cantidad;
    }

    public String mostrarInfo(){
        return this.producto.mostrarInfo() + cantidad;
    }
}
