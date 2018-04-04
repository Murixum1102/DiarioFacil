package DiarioFacil.ulatina;

public abstract class Usuario {

    protected Integer id;
    protected String name;
    protected String password;
    protected Boolean login;

    public Usuario() {

    }

    public Usuario(Integer id,String name, String password, Boolean login) {
        this.id = id;
        this.name=name;
        this.password = password;
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
