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
public class Producto {
    private String idProducto;
    private String nombreProducto;
    private Double precioProducto;
    private Integer inventarioActual;
    private Integer stockMinimo;
    private Categoria categoriaProducto;

    public Producto() {
    }

    public Producto(String idProducto, String nombreProducto, Double precioProducto, Integer inventarioActual, Integer stockMinimo, Categoria categoriaProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.inventarioActual = inventarioActual;
        this.stockMinimo = stockMinimo;
        this.categoriaProducto = categoriaProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getInventarioActual() {
        return inventarioActual;
    }

    public void setInventarioActual(Integer inventarioActual) {
        this.inventarioActual = inventarioActual;
    }

    public Integer getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public Categoria getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(Categoria categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", inventarioActual=" + inventarioActual + ", stockMinimo=" + stockMinimo + ", categoriaProducto=" + categoriaProducto + '}';
    }
    
    
}
