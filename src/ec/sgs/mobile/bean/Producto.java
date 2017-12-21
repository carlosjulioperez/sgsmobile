/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.sgs.mobile.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Producto JavaBean
 * @author carper
 * 2017-12-06, 07
 */
public class Producto {
    private String marca;
    private String descripcionPesos;
    private String presentacion;
    private String empaque;
    private String tipoProducto;
    
    private List <Clasificacion> clasificaciones = new ArrayList();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcionPesos() {
        return descripcionPesos;
    }

    public void setDescripcionPesos(String descripcionPesos) {
        this.descripcionPesos = descripcionPesos;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public List<Clasificacion> getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(List<Clasificacion> clasificaciones) {
        this.clasificaciones = clasificaciones;
    }
    
}
