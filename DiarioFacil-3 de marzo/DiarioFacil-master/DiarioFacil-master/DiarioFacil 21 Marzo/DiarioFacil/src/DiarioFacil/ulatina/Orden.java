/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiarioFacil.ulatina;
import java.sql.Time;
import java.util.List;

/**
 *
 * @author murip
 */
public class Orden {
    private Integer idOrden;
    private Time fechaOrden;
    private Integer totalOrden;
    private List<Producto> LstProductos;
    
    public Orden(){
        
    }

    public Orden(Integer idOrden, Time fechaOrden, Integer totalOrden, List<Producto> LstProductos) {
        this.idOrden = idOrden;
        this.fechaOrden = fechaOrden;
        this.totalOrden = totalOrden;
        this.LstProductos = LstProductos;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Time getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Time fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Integer getTotalOrden() {
        return totalOrden;
    }

    public void setTotalOrden(Integer totalOrden) {
        this.totalOrden = totalOrden;
    }

    public List<Producto> getLstProductos() {
        return LstProductos;
    }

    public void setLstProductos(List<Producto> LstProductos) {
        this.LstProductos = LstProductos;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", fechaOrden=" + fechaOrden + ", totalOrden=" + totalOrden + ", LstProductos=" + LstProductos + '}';
    }
    
    
}
