package TiendaDeStock.domain;

import TiendaDeStock.Negocio;

import java.util.ArrayList;
import java.util.Arrays;

public class Constant {

    public static final ArrayList<Producto> PRODUCTOS_NEGOCIO_1 = new ArrayList<>(Arrays.asList(
            new Producto("harina", 5000, 10),
            new Producto("huevo", 3000, 20),
            new Producto("leche", 500, 50),
            new Producto("pan", 700, 12)
    ));
    public static final ArrayList<Producto> PRODUCTOS_NEGOCIO_2 = new ArrayList<>(Arrays.asList(
            new Producto("falopa", 5000, 10),
            new Producto("droga", 3000, 20),
            new Producto("putas", 500, 50),
            new Producto("merca", 700, 12)
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
            new Negocio("negocio1"),
            new Negocio("negocio2"),
            new Negocio("negocio3"),
            new Negocio("negocio4")
    ));
}
