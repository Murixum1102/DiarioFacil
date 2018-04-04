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
public class Carrito {
    private List<Producto> LstProductosCarrito;
    private List<Promocion> LstPromocionesCarrito;
    private List<Combo> LstCombosCarrito;
     public Carrito(){
         
     }

    public Carrito(List<Producto> LstProductosCarrito, List<Promocion> LstPromocionesCarrito, List<Combo> LstCombosCarrito) {
        this.LstProductosCarrito = LstProductosCarrito;
        this.LstPromocionesCarrito = LstPromocionesCarrito;
        this.LstCombosCarrito = LstCombosCarrito;
    }

    public List<Producto> getLstProductosCarrito() {
        return LstProductosCarrito;
    }

    public void setLstProductosCarrito(List<Producto> LstProductosCarrito) {
        this.LstProductosCarrito = LstProductosCarrito;
    }

    public List<Promocion> getLstPromocionesCarrito() {
        return LstPromocionesCarrito;
    }

    public void setLstPromocionesCarrito(List<Promocion> LstPromocionesCarrito) {
        this.LstPromocionesCarrito = LstPromocionesCarrito;
    }

    public List<Combo> getLstCombosCarrito() {
        return LstCombosCarrito;
    }

    public void setLstCombosCarrito(List<Combo> LstCombosCarrito) {
        this.LstCombosCarrito = LstCombosCarrito;
    }

    @Override
    public String toString() {
        return "Carrito{" + "LstProductosCarrito=" + LstProductosCarrito + ", LstPromocionesCarrito=" + LstPromocionesCarrito + ", LstCombosCarrito=" + LstCombosCarrito + '}';
    }
     
}
