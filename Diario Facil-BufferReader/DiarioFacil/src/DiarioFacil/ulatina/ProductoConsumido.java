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
public class ProductoConsumido {
    private Producto productoConsumido;
    private Integer cantidadConsumida;

    public ProductoConsumido() {
    }

    public ProductoConsumido(Producto productoConsumido, Integer cantidadConsumida) {
        this.productoConsumido = productoConsumido;
        this.cantidadConsumida = cantidadConsumida;
    }

    public Producto getProductoConsumido() {
        return productoConsumido;
    }

    public void setProductoConsumido(Producto productoConsumido) {
        this.productoConsumido = productoConsumido;
    }

    public Integer getCantidadConsumida() {
        return cantidadConsumida;
    }

    public void setCantidadConsumida(Integer cantidadConsumida) {
        this.cantidadConsumida = cantidadConsumida;
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("=============================================================================\n");
        sb.append("Producto Consumido: "+this.productoConsumido);
        sb.append("\n");
        sb.append("Cantidad Consumida: "+this.cantidadConsumida);
        sb.append("\n=============================================================================");
        return   sb.toString();
    }
    
    
}
