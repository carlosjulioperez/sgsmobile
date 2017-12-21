/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.sgs.mobile.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * ControlEmbarque JavaBean
 * @author carper
 * 2017-12-21
 */
public class ControlEmbarque {
    
    private List<Producto> productos = new ArrayList();

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
