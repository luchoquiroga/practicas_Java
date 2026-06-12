package TiendaDeStock.domain;

public class ProductoRopa extends Producto {
    private String talla;
    private String material;

    public ProductoRopa(String nombre, double precio, int stock, String talla, String material) {
        super(nombre, precio, stock);
        this.talla = talla;
        this.material = material;
    }


    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " (Talla: " + talla + " material: " + material + ")";
    }
}
