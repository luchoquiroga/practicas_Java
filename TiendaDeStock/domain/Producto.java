package TiendaDeStock.domain;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //setters

    public void setPrecio(double precio) {
         this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }


    private void descontarStock (int cantidad){
        if (cantidad > 0 && cantidad <= getStock()){
            this.stock -= cantidad;
        }else {
            System.out.println("no se puede comprar esa cantidad");
        }
    }

    public String mostrarInfo(){
        return this.nombre + " $" + this.precio;
    }

}
