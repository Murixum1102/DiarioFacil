package DiarioFacil.ulatina;


import java.util.Scanner;


public class Cliente extends Usuario {

    private Boolean tipoCliente;
    private Integer cantidadCompras;

    public Cliente() {

    }

   

    public Cliente(Boolean tipoCliente, Integer cantidadCompras, Integer id,String name, String password, Boolean login) {
        super(id, name, password, login);
        this.tipoCliente = tipoCliente;
        this.cantidadCompras = cantidadCompras;
    }

    public Boolean getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Boolean tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Integer getCantidadCompras() {
        return cantidadCompras;
    }

    public void setCantidadCompras(Integer cantidadCompras) {
        this.cantidadCompras = cantidadCompras;
    }
    

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        String conexion;
        String tipoCliente;
        if(this.login==false){
            conexion="Desconectado";
        }else{
            conexion="En Linea";
        }
        if(this.tipoCliente==false){
            tipoCliente="Corriente";
        }else{
            tipoCliente="Premium";
        }
        sb.append("\n=============================================================================\n");
        sb.append("Id: "+this.id);
        sb.append("\n");
        sb.append("Nombre: "+this.name);
        sb.append("\n");
        sb.append("Contrasena: "+this.password);
        sb.append("\n");
        sb.append("Estado de conexion: "+conexion);
        sb.append("\n");
        sb.append("Tipo De Cliente: "+tipoCliente);
        sb.append("\n");
        sb.append("Cantidad De Compras: "+this.cantidadCompras);
        sb.append("\n=============================================================================\n");
        return   sb.toString();
    }

   
  

    public static Cliente Registrarse() throws java.io.IOException {
        Scanner sc=new Scanner(System.in);
        Cliente usuario = new Cliente();
        System.out.println("\n==================================================");
        System.out.println("Digite sus digitos de la cedula:");
        usuario.id = sc.nextInt();

        System.out.println("Digite su nombre de usuario:");
        usuario.name = sc.next();
        
        System.out.println("Digite su contrasena:");
        usuario.password = sc.next();
        
        usuario.login = false;
        
        usuario.tipoCliente=false;
        
        usuario.cantidadCompras=0;
        System.out.println("==================================================\n");

        System.out.println("\n==================================================");
        System.out.println("Se a registrado con exito.");
        System.out.println("==================================================\n");

        return usuario;
    }
    
    public static Cliente inicioSeccion(DiarioFacil D,String nombre,String contrasena){
        Cliente usuario=new Cliente();
        
        for (Cliente c : D.getLstCliente()) {
            if(nombre.equals(c.name)&&contrasena.equals(c.password)){
                usuario=c;
            }
        }
         if(usuario.name.isEmpty()==true){
                System.out.println("\n==================================================\nConexion Fallida:\nCredenciales Incorrectas\n==================================================\n");
         }else{
             System.out.println("\n==================================================\nBienvenido "+usuario.name+"!\n==================================================\n");
             usuario.login=true;
         }
        
        return usuario;
    }

}
