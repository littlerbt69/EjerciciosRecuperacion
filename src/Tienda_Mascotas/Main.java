package Tienda_Mascotas;

import java.util.List;

public class Main {
    private static Tienda tienda = new Tienda("AnimalCrossingShop");

    public static void main(String[] args) {
        addCliente();
        addCliente();
        addMascota();
        addMascota();
    }

    public static void addCliente() {
        tienda.annadirCliente(MiEntradaSalida.solicitarCadena("Introduce el nombre del cliente"));
    }

    public static void addMascota() {
        String nombre = MiEntradaSalida.solicitarCadena("Introduce el nombre de la mascota");
        int edad = MiEntradaSalida.leerEnteroPositivo("Introduce la edad de la mascota");
        double precio = MiEntradaSalida.leerDouble("Introduce el precio de la mascota");
        Especie especie = MiEntradaSalida.leerEnum("Que tipo de mascota es", Especie.values());
        boolean disponible = MiEntradaSalida.leerCaracterSN("¿Está disponible para la venta?") == 'S';
        tienda.annadirMascota(nombre, especie, edad, precio, disponible);

    }

    public static void addCompra() {
        List<Cliente> clientes = tienda.getListaClientes();
        List<Mascota> mascotas = tienda.getListaMascotasDispo();
        Cliente c = MiEntradaSalida.leerEnum("Seleccione el cliente", clientes.toArray(Cliente[] :: new));
        Mascota m = MiEntradaSalida.leerEnum("Selecciona la mascota", mascotas.toArray(Mascota[]::new));
        tienda.comprarMascota(c,m);
    }

    public static void devolucion() {
        List<Cliente> clientes = tienda.getListaClientes();
        Cliente c = MiEntradaSalida.leerEnum("Seleccione el cliente", clientes.toArray(Cliente[] :: new));
        List<Compra> compras = tienda.listarComprasDeCliente(c);
        Compra compra = MiEntradaSalida.leerEnum("Selecciona la comrpra", compras.toArray(Compra[] :: new));

    }
}
