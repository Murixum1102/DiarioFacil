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
        return "Categoria{" + "categoria=" + categoria + ", LstProductosCategoria=" + LstProductosCategoria + '}';
    }
    
}
