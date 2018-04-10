
package DiarioFacil.ulatina;

import java.util.List;


public class DiarioFacil {
    private List<Producto> lstProductos;
    private List<Promocion> lstPromociones;
    private List<Combo> lstCombos;
    private List<Proveedor> lstProveedor;
    private List<Cliente> lstCliente;
    private List<Orden> lstOrden;
    private List<Categoria> lstCategorias;
    private List<Admin> lstAdministradores;
    private List<ProductoConsumido> lstProductosConsumidos;

    public DiarioFacil() {
    }

    public DiarioFacil(List<Producto> lstProductos, List<Promocion> lstPromociones, List<Combo> lstCombos, List<Proveedor> lstProveedor, List<Cliente> lstCliente, List<Orden> lstOrden, List<Categoria> lstCategorias, List<Admin> lstAdministradores, List<ProductoConsumido> lstProductosConsumidos) {
        this.lstProductos = lstProductos;
        this.lstPromociones = lstPromociones;
        this.lstCombos = lstCombos;
        this.lstProveedor = lstProveedor;
        this.lstCliente = lstCliente;
        this.lstOrden = lstOrden;
        this.lstCategorias = lstCategorias;
        this.lstAdministradores = lstAdministradores;
        this.lstProductosConsumidos = lstProductosConsumidos;
    }

    

    public List<Producto> getLstProductos() {
        return lstProductos;
    }

    public void setLstProductos(List<Producto> lstProductos) {
        this.lstProductos = lstProductos;
    }

    public List<Promocion> getLstPromociones() {
        return lstPromociones;
    }

    public void setLstPromociones(List<Promocion> lstPromociones) {
        this.lstPromociones = lstPromociones;
    }

    public List<Combo> getLstCombos() {
        return lstCombos;
    }

    public void setLstCombos(List<Combo> lstCombos) {
        this.lstCombos = lstCombos;
    }

    public List<Proveedor> getLstProveedor() {
        return lstProveedor;
    }

    public void setLstProveedor(List<Proveedor> lstProveedor) {
        this.lstProveedor = lstProveedor;
    }

    public List<Cliente> getLstCliente() {
        return lstCliente;
    }

    public void setLstCliente(List<Cliente> lstCliente) {
        this.lstCliente = lstCliente;
    }

    public List<Orden> getLstOrden() {
        return lstOrden;
    }

    public void setLstOrden(List<Orden> lstOrden) {
        this.lstOrden = lstOrden;
    }

    public List<Categoria> getLstCategorias() {
        return lstCategorias;
    }

    public void setLstCategorias(List<Categoria> lstCategorias) {
        this.lstCategorias = lstCategorias;
    }

    public List<Admin> getLstAdministradores() {
        return lstAdministradores;
    }

    public void setLstAdministradores(List<Admin> lstAdministradores) {
        this.lstAdministradores = lstAdministradores;
    }

    public List<ProductoConsumido> getLstProductosConsumidos() {
        return lstProductosConsumidos;
    }

    public void setLstProductosConsumidos(List<ProductoConsumido> lstProductosConsumidos) {
        this.lstProductosConsumidos = lstProductosConsumidos;
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("=============================================================================\n");
        sb.append("Lista Productos:"+this.lstProductos);
        sb.append("\n");
        sb.append("Lista Promociones:"+this.lstPromociones);
        sb.append("\n");
        sb.append("Lista Combos:"+this.lstCombos);
        sb.append("\n");
        sb.append("Lista Proveedores:"+this.lstProveedor);
        sb.append("\n");
        sb.append("Lista Clientes:"+this.lstCliente);
        sb.append("\n");
        sb.append("Lista Ordenes:"+this.lstOrden);
        sb.append("\n");
        sb.append("Lista Categorias:"+this.lstCategorias);
        sb.append("\n");
        sb.append("Lista Administradores:"+this.lstAdministradores);
        sb.append("\n");
        sb.append("Lista Productos Consumidos:"+this.lstProductosConsumidos);
        sb.append("\n=============================================================================");
        
        return   sb.toString();
    }

   
    
}
