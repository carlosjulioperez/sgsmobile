/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.sgs.mobile.bean.util;

/**
 *
 * @author carper
 */
public class Utileria {
    
    // Crear un objeto de Utileria
    public static Utileria instancia = new Utileria();

    // Hacer el construcor privado para que esta clase no pueda ser instanciada
    private Utileria(){}

    // Obtener el único objeto disponible
    public static Utileria getInstancia(){
        return instancia;
    }
    
    /**
     * Convierte un String a tipo primitivo int
     *
     * @param valor (String: Cadena que representa el valor a convetir)
     * @return int equivalente de la cadena
     */
    public static int parseToInt(String valor) {
        int numero = 0;
        try {
            numero = Integer.parseInt(valor);
        } catch (Exception e) {
            numero = 0;
        }
        return numero;
    }
    
    /**
     * Convierte un String a tipo primitivo short
     *
     * @param valor (String: Cadena que representa el valor a convetir)
     * @return short equivalente de la cadena
     */
    public static short parseToShort(String valor) {
        short numero = 0;
        try {
            numero = Short.parseShort(valor);
        } catch (Exception e) {
            numero = 0;
        }
        return numero;
    }

    /**
     * Convierte un String a Double
     * 
     * @param valor
     *            (String: Cadena que representa el valor a convetir)
     * @return Double equivalente de la cadena
     */
    public static Double parseToDouble(String valor) {
        Double numero = 0.0;
        try {
            numero = Double.parseDouble(valor);
        } catch (Exception e) {
            e.printStackTrace();
            numero = 0.0;
        }
        return numero;
    }

    //Print the greeting message of the alive object...
    public void showMessage() {
        System.out.println("Hello world, I'm a single object ;)");
    }
    
}
