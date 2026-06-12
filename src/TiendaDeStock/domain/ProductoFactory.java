package TiendaDeStock.domain;

public class ProductoFactory {

    public static Producto crearProducto(String tipo, String nombre, double precio, int stock, String... atributosAdicionales) {
        switch (tipo.toLowerCase()) {
            case "ropa":
                // Aquí usamos los atributosAdicionales
                String talla = atributosAdicionales[0];
                String material = atributosAdicionales[1];
                return new ProductoRopa(nombre, precio, stock, talla, material);
            case "comida":
                String calorias = atributosAdicionales[0];
                String tipoC = atributosAdicionales[1];
                return new ProductoComida(nombre, precio, stock, calorias, tipoC);
            default:
                return new Producto(nombre, precio, stock);
        }
    }
}
