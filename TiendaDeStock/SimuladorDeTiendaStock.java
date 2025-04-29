package TiendaDeStock;

import TiendaDeStock.domain.Carrito;
import TiendaDeStock.domain.Constant;
import TiendaDeStock.domain.ItemCarrito;
import TiendaDeStock.domain.Producto;

import java.util.Scanner;

public class SimuladorDeTiendaStock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Constant.NEGOCIOS.get(0).addProductos(Constant.PRODUCTOS_NEGOCIO_1);
        Constant.NEGOCIOS.get(1).addProductos(Constant.PRODUCTOS_NEGOCIO_2);
        Constant.NEGOCIOS.get(2).addProductos(Constant.PRODUCTOS_NEGOCIO_3);
        Constant.NEGOCIOS.get(3).addProductos(Constant.PRODUCTOS_NEGOCIO_4);

        Carrito carrito = new Carrito();
        int opc, cant = 10;

        System.out.println("Bienvenido a nuestras tienda");
        System.out.println("[Menú de Negocios]----------------------");
        for (Negocio negocio : Constant.NEGOCIOS) {
            System.out.println(negocio.getName());
        }
        opc = sc.nextInt();
        Negocio negocioSeleccionado = Constant.NEGOCIOS.get(opc);
        System.out.println(negocioSeleccionado.ShowProducts());


        // preguntar al usuario que productosNegocio1 y cantidad

        // aca filtras en los productosdisponibles, el que eligio el user


        Producto productoSeleccionado = negocioSeleccionado.getProductos(negocioSeleccionado).stream()
                .filter(p -> p.getNombre().equalsIgnoreCase("huevo"))
                .findFirst()
                .orElse(null); // si no existe, devuelve null

        if (productoSeleccionado == null) {
            System.out.println("producto no encontrado");
        } else {
            System.out.println("TiendaDeStock.domain.Producto encontrado: " + productoSeleccionado.mostrarInfo());
            ItemCarrito item = new ItemCarrito(productoSeleccionado, cant);
            carrito.addItem(item);
        }
        System.out.println(carrito.infoCar());

    }
}
