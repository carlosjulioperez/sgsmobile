/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.sgs.mobile.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Clasificacion JavaBean
 * @author carper
 * 2017-12-07
 */
public class Clasificacion {

    public Clasificacion() {
        this.detalleCajas = new ArrayList();
    }
    
    private String modelo;
    
    private List<DetalleCajas>detalleCajas;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<DetalleCajas> getDetalleCajas() {
        return detalleCajas;
    }

    public void setDetalleCajas(List<DetalleCajas> detalleCajas) {
        this.detalleCajas = detalleCajas;
    }
    
    public int getTotalCajas(){
        int total = 0;
        for (DetalleCajas detalle: detalleCajas)
            total += detalle.getCantidad();
        return total;
    }
    
    public int getCantidadEnFila(int fila){
        int valor = 0;
        for (DetalleCajas detalle: detalleCajas){
            if (detalle.getFila() == fila){
                valor = detalle.getCantidad();
                break;
            }
        }
        return valor;
    }
    
}
