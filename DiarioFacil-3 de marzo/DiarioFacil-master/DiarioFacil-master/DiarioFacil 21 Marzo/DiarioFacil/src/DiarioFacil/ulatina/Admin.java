package DiarioFacil.ulatina;

public class Admin extends Usuario {

    public Admin() {
    }

    public Admin(Integer id,String name, String password, Boolean login) {
        super(id, name, password, login);
    }

    @Override
    public String toString() {
        return "Admin{" + '}';
    }

}
