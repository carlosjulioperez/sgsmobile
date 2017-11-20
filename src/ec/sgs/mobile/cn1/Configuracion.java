/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.sgs.mobile.cn1;

import com.codename1.io.Externalizable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Clase Configuracion para persistir en el dispositivo
 * @author carper
 * 2017-11-14, 16
 */
public class Configuracion implements Externalizable{
    private String servidor;
    private String puerto;
    private String inspector;

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getObjectId() {
        return "Configuracion";
    }

    public int getVersion() {
        return 1;
    }

    public void externalize(DataOutputStream out) throws IOException {
        out.writeUTF( getServidor() );
        out.writeUTF( getPuerto() );
        out.writeUTF( getInspector() );
    }

    public void internalize(int version, DataInputStream in) throws IOException {
        setServidor ( in.readUTF() );
        setPuerto   ( in.readUTF() );
        setInspector( in.readUTF() );
    }

}
