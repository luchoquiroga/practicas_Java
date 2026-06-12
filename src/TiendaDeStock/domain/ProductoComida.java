package TiendaDeStock.domain;

public class ProductoComida extends Producto{

    private String calorias;
    private String tipo;

    public ProductoComida(String nombre, double precio, int stock, String calorias, String tipo){
        super(nombre,precio,stock);
        this.calorias = calorias;
        this.tipo = tipo;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " (Tipo: " + this.tipo + ", Calorias: " + this.calorias + ")";
    }
}


