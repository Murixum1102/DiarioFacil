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
public class Categoria {
    private String categoria;
    private List<Producto> LstProductosCategoria;

    public Categoria(){
        
    }
    public Categoria(String categoria, List<Producto> LstProductosCategoria) {
        this.categoria = categoria;
        this.LstProductosCategoria = LstProductosCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Producto> getLstProductosCategoria() {
        return LstProductosCategoria;
    }

    public void setLstProductosCategoria(List<Producto> LstProductosCategoria) {
        this.LstProductosCategoria = LstProductosCategoria;
    }

    @Override
    public String toString() {
                StringBuffer sb=new StringBuffer();
        sb.append("=============================================================================\n");
        sb.append("Categoria: "+this.categoria);
        sb.append("\n");
        sb.append("Productos De La Categoria: "+this.LstProductosCategoria);
        sb.append("\n=============================================================================");
        return   sb.toString();
    }
    
}
