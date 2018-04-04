package DiarioFacil.ulatina;

import java.io.*;


public class Prueba {
    
 static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    public static void main(String[] args) throws IOException {
        


        int opc;
        boolean noSalir = true;

        do {
            mostrarMenu();
            opc = leerOpcion();
            noSalir = ejecutarAccion(opc);
        } while (noSalir);
    }

    public static void mostrarMenu() {

        out.println();
        out.println("1.  Agregar producto");
        out.println("2.  Modificar producto.");
        out.println("3.  Login.");
        out.println("4. Salir");
        out.println();
    }

    public static int leerOpcion() throws java.io.IOException {

        int opcion;

        out.print("Seleccione su opción: ");
        opcion = Integer.parseInt(in.readLine());
        out.println();

        return opcion;
    }

    public static boolean ejecutarAccion(int popcion) throws java.io.IOException {

        boolean noSalir = true;
        int numProd = 0;

        switch (popcion) {

            case 1: //Opcion Agregar Producto

                agregarProducto();
                break;

            case 2:// Modificar Producto

                out.println();
                modificarProducto();
                break;

            case 3:// Login 

                out.println();
                login();
                break;
            case 4: //Salir de la aplicacion
                noSalir = false;
                break;

            default: //Cualquier otro valor dado por el usuario se considera inválido

                out.println("Opcion inválida");
                out.println();
                break;
        }
        return noSalir;
    }

    public static void agregarProducto() {
        System.out.println("Hacer logica para AGREGAR el producto");
    }

    public static void modificarProducto() {
        System.out.println("Hacer logica para MODIFICAR el producto");
    }

    public static void login() throws IOException {
        out.println("Digite usuario:");
        String user = in.readLine();
        out.println("Digite Contraseña:");
        String pass = in.readLine();

        System.out.println("usuario: " + user + " clave: " + pass);

    }


    
    
}
