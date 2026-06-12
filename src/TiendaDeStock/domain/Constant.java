package TiendaDeStock.domain;

import TiendaDeStock.Negocio;

import java.util.ArrayList;
import java.util.Arrays;

public class Constant {

    public static final ArrayList<Producto> PRODUCTOS_NEGOCIO_1 = new ArrayList<>(Arrays.asList(
            ProductoFactory.crearProducto("comida", "papas", 5000, 10, "300", "Vegetariano"),
            ProductoFactory.crearProducto("comida", "huevo", 3000, 20, "200", "Vegetariano"),
            ProductoFactory.crearProducto("Comida", "leche", 500, 50, "300", "Vegetariano"), // Ejemplo de producto genérico
            ProductoFactory.crearProducto("Comida", "Carne molida", 15000, 5, "2000", "Carnivoro")
    ));
    public static final ArrayList<Producto> PRODUCTOS_NEGOCIO_2 = new ArrayList<>(Arrays.asList(
            ProductoFactory.crearProducto("comida","medialunas", 5000, 10, "500", "merienda"),
            ProductoFactory.crearProducto("comida","Huevo revueltos", 3000, 20,"400", "desayuno"),
            ProductoFactory.crearProducto("comida","croissant", 500, 50, "350", "merienda"),
            ProductoFactory.crearProducto("comida","pan integral", 700, 12, "350", "Variado")
    ));
    public static final ArrayList<Producto> PRODUCTOS_NEGOCIO_3 = new ArrayList<>(Arrays.asList(
            new Producto("Café", 1300, 10),
            new Producto("Tortitas", 300, 20),
            new Producto("Café con leche", 1500, 50),
            new Producto("Facturas", 500, 12)
    ));
    public static final ArrayList<Producto> PRODUCTOS_NEGOCIO_4 = new ArrayList<>(Arrays.asList(
            new Producto("Galletas Oreo", 5000, 10),
            new Producto("Galletas Pepito", 3000, 20),
            new Producto("Galletas Surtidas", 500, 50),
            new Producto("Alfajores", 700, 12)
    ));
    public static final ArrayList<Negocio> NEGOCIOS = new ArrayList<>(Arrays.asList(
            new NegocioComida("negocio1"),
            new NegocioComida("negocio2"),
            new NegocioRopa("negocio3"),
            new NegocioRopa("negocio4")
    ));
}
