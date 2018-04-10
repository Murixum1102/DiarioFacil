package DiarioFacil.ulatina;

public class Admin extends Usuario {

    public Admin() {
    }

    public Admin(Integer id,String name, String password, Boolean login) {
        super(id, name, password, login);
    }
  public static void agregarProducto() {
        
        System.out.println("Hacer logica para AGREGAR el producto");
    }
    @Override
    public String toString() {
               StringBuffer sb=new StringBuffer();
        sb.append("=============================================================================\n");
        sb.append("Id: "+this.id);
        sb.append("\n");
        sb.append("Nombre: "+this.name);
        sb.append("\n");
        sb.append("Contrasena: *******");
        sb.append("\n");
        sb.append("Estado de conexion: "+this.login);
        sb.append("\n=============================================================================");
        return   sb.toString();
    }

    
    public void Registrarse() {
       
    }

}
