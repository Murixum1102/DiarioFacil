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
public class Combo {
    private String idCombo;
    private Double precioCombo;
    private List<Producto> LstProductosCombo;
    
    public Combo(){
        
    }

    public Combo(String idCombo, Double precioCombo, List<Producto> LstProductosCombo) {
        this.idCombo = idCombo;
        this.precioCombo = precioCombo;
        this.LstProductosCombo = LstProductosCombo;
    }

    public String getIdCombo() {
        return idCombo;
    }

    public void setIdCombo(String idCombo) {
        this.idCombo = idCombo;
    }

    public Double getPrecioCombo() {
        return precioCombo;
    }

    public void setPrecioCombo(Double precioCombo) {
        this.precioCombo = precioCombo;
    }

    public List<Producto> getLstProductosCombo() {
        return LstProductosCombo;
    }

    public void setLstProductosCombo(List<Producto> LstProductosCombo) {
        this.LstProductosCombo = LstProductosCombo;
    }

    @Override
    public String toString() {
        return "Combo{" + "idCombo=" + idCombo + ", precioCombo=" + precioCombo + ", LstProductosCombo=" + LstProductosCombo + '}';
    }
    
}
