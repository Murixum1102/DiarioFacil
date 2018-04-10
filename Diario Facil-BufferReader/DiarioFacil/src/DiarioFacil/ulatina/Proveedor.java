/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiarioFacil.ulatina;

import java.util.List;

/**
 *
 * @author murip
 */
public class Proveedor {
    private String idProveedor;
    private String nombreProveedor;
    private String correoProveedor;
    private String telefonoProveedor;
    private String direccionProveedor;
    private List<Producto> LstProductosProveedor;

    public Proveedor() {
    }

    public Proveedor(String idProveedor, String nombreProveedor, String correoProveedor, String telefonoProveedor, String direccionProveedor, List<Producto> LstProductosProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.correoProveedor = correoProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.direccionProveedor = direccionProveedor;
        this.LstProductosProveedor = LstProductosProveedor;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public List<Producto> getLstProductosProveedor() {
        return LstProductosProveedor;
    }

    public void setLstProductosProveedor(List<Producto> LstProductosProveedor) {
        this.LstProductosProveedor = LstProductosProveedor;
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("=============================================================================\n");
        sb.append("Id.Proveedor: "+this.idProveedor);
        sb.append("\n");
        sb.append("Nombre Del Proveedor: "+this.nombreProveedor);
        sb.append("\n");
        sb.append("Correo Del Proveedor: "+this.correoProveedor);
        sb.append("\n");
        sb.append("Telefono Del Proveedor: "+this.telefonoProveedor);
        sb.append("\n");
        sb.append("Direccion Del Proveedor: "+this.direccionProveedor);
        sb.append("\n");
        sb.append("Productos Del Proveedor: "+this.LstProductosProveedor);
        sb.append("\n=============================================================================");
        return   sb.toString();     
    }
    
    
}
