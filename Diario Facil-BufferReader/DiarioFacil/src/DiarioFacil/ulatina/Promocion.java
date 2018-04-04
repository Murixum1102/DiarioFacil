/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiarioFacil.ulatina;

/**
 *
 * @author murip
 */
public class Promocion {
    private Producto productoPromocion;
    private Double descuento;

    public Promocion() {
    }

    
    public Promocion(Producto productoPromocion, Double descuento) {
        this.productoPromocion = productoPromocion;
        this.descuento = descuento;
    }

    public Producto getProductoPromocion() {
        return productoPromocion;
    }

    public void setProductoPromocion(Producto productoPromocion) {
        this.productoPromocion = productoPromocion;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Promocion{" + "productoPromocion=" + productoPromocion + ", descuento=" + descuento + '}';
    }
    
    
    
}
