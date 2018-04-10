package DiarioFacil.ulatina;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Prueba {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        DiarioFacil diarioFacil = new DiarioFacil();
        List<Cliente> listaClientes = new ArrayList<>();

        int opc;
        boolean noSalir = true;
        boolean conexion = true;

        do {
            mostrarMenu();
            opc = leerOpcion();
            noSalir = ejecutarAccionMenuInicio(opc, diarioFacil, listaClientes, conexion);

        } while (noSalir == true);
    }

    public static void mostrarMenu() {

        out.println("\n===========================================================");
        out.println("1.  Iniciar Seccion.");
        out.println("2.  Registrarse en el Sistema.");
        out.println("3.  Salir.");
        out.println("===========================================================\n");
    }

    public static void mostrarPaginaCliente(Cliente usuario) {

        out.println("\n===========================================================");
        out.println("1.  Ver Catalogo.");
        out.println("2.  Ver Carrito.");
        out.println("3.  Ver Combos.");
        if (usuario.getTipoCliente() == true) {
            out.println("4.  Ver Promociones.");
        }
        out.println("5.  Salir.");
        out.println("===========================================================\n");
    }

    public static int leerOpcion() throws java.io.IOException {

        int opcion;
        out.println("\n===========================================================\n");

        out.print("Seleccione su opción:\n");
        opcion = Integer.parseInt(in.readLine());
        out.println("\n===========================================================\n");

        return opcion;
    }

    public static boolean ejecutarAccionMenuInicio(int opcion, DiarioFacil D, List<Cliente> lstCliente, boolean conexion) throws java.io.IOException {
        int opc;
        boolean noSalir = true;
        int numProd = opcion;

        switch (numProd) {

            case 1: //Opcion Ingresar en el sistema como cliente
                Cliente usuario = new Cliente();
                out.print("\nIngrese su nombre de usuario\n");
                String nombre = in.readLine();
                out.print("Ingrese su contrasena\n");
                String contrasena = in.readLine();
                usuario = Cliente.inicioSeccion(D, nombre, contrasena);
                if (usuario.login = true) {
                    conexion = true;
                    do {
                        mostrarPaginaCliente(usuario);
                        opc = leerOpcion();
                        ejecutarAccionPaginaCliente(opc);
                    } while (conexion == true);
                }
                break;

            case 2:// Registrarse

                lstCliente.add(Cliente.Registrarse());
                D.setLstCliente(lstCliente);
                break;

            case 3://Salir del sistema por completo

                noSalir = false;

                break;

            default: //Cualquier otro valor dado por el usuario se considera inválido

                out.println("Opcion inválida");
                out.println();
                break;
        }
        return noSalir;
    }

    public static boolean ejecutarAccionPaginaCliente(int opcion) throws java.io.IOException {

        boolean conexion = true;
        int numProd = opcion;

        switch (numProd) {

            case 1: //Opcion ver catalogo

                break;

            case 2:// Opcion Ver carrito

                break;

            case 3:// Opcion Ver combos

                break;

            case 4:// Opcion Ver Promociones(Solo Premium)

                break;

            case 5:// Login 

                conexion = false;

                break;

            default: //Cualquier otro valor dado por el usuario se considera inválido

                out.println("Opcion inválida");
                out.println();
                break;
        }
        return conexion;
    }

}
