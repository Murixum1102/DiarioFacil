package DiarioFacil.ulatina;

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
        return "Cliente{" + "tipoCliente=" + tipoCliente + ", cantidadCompras=" + cantidadCompras + '}';
    }

}
