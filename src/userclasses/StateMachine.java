/**
 * Your application code goes here<br>
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */


package userclasses;

import com.codename1.components.InfiniteProgress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import com.codename1.processing.Result;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import com.codename1.ui.validation.LengthConstraint;
import com.codename1.ui.validation.Validator;
import generated.StateMachineBase;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    
    TextField ContenedorNum;
    TextField Tamano;
    TextField Chasis;
    TextField TrailerPlaca;
    TextField Cliente;
    TextField Fecha;
    TextField Agencia;
    TextField Vapor;
    TextField Destino;
    TextField Factura;

    CheckBox PuertaIzquierda;
    CheckBox PuertaDerecha;
    CheckBox ParedFrontalInternaIzquierda;
    CheckBox ParedFrontalInternaDerecha;
    CheckBox Cables;
    CheckBox Flucs;
    CheckBox LadosExternosIzquierda;
    CheckBox LadosExternosDerecha;
    CheckBox LadosInternosIzquierda;
    CheckBox LadosInternosDerecha;
    CheckBox Techo;
    CheckBox Piso;
    CheckBox EstructuraInferior;
    CheckBox EstructuraInterna;
    CheckBox ChasisCheck;

    TextArea Observaciones;
    
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }

    @Override
    protected void postInspeccion(Form f) {
    }

    @Override
    protected void beforeInspeccion(Form f) {
        //Constraints
        ContenedorNum                = findContenedorNum();
        Tamano                       = findTamano();
        Chasis                       = findChasis();       
        TrailerPlaca                 = findTrailerPlaca();
        Cliente                      = findCliente();
        Fecha                        = findFecha();
        Agencia                      = findAgencia();
        Vapor                        = findVapor();
        Destino                      = findDestino();
        Factura                      = findFactura();

	PuertaIzquierda              = findPuertaIzquierda();
	PuertaDerecha                = findPuertaDerecha();
	ParedFrontalInternaIzquierda = findParedFrontalInternaIzquierda();
	ParedFrontalInternaDerecha   = findParedFrontalInternaDerecha();
	Cables                       = findCables();
	Flucs                        = findFlucs();
	LadosExternosIzquierda       = findLadosExternosIzquierda();
	LadosExternosDerecha         = findLadosExternosDerecha();
	LadosInternosIzquierda       = findLadosInternosIzquierda();
	LadosInternosDerecha         = findLadosInternosDerecha();
	Techo                        = findTecho();
	Piso                         = findPiso();
	EstructuraInferior           = findEstructuraInferior();
	EstructuraInterna            = findEstructuraInterna();
	ChasisCheck                  = findChasisCheck();

        Button Grabar = findGrabar();
        Validator v = new Validator();
        v.
            addConstraint(ContenedorNum, new LengthConstraint(11)).
            addConstraint(Tamano, new LengthConstraint(2)
        );
        
        v.addSubmitButtons(Grabar);
    }

    @Override
    protected void onInspeccion_GrabarAction(Component c, ActionEvent event) {
        grabar();
    }
    
    private void grabar(){
        //https://groups.google.com/forum/#!topic/codenameone-discussions/tGPeQrNRO58
        //https://stackoverflow.com/questions/39063909/how-to-post-json-to-a-rest-webservice-in-codenameone
        
        Hashtable h = new Hashtable();
        // (populate the requestuest object here)
        h.put("id"           , "");
        h.put("contenedor"   , ContenedorNum                . getText() );
        h.put("tamano"       , Tamano                       . getText() );
        h.put("chasis"       , Chasis                       . getText() );
        h.put("placa"        , TrailerPlaca                 . getText() );
        h.put("cliente"      , Cliente                      . getText() );
        h.put("fecha"        , Fecha                        . getText() );
        h.put("agencia"      , Agencia                      . getText() );
        h.put("vapor"        , Vapor                        . getText() );
        h.put("destino"      , Destino                      . getText() );
        h.put("factura"      , Factura                      . getText() );
        h.put("pta_izq"      , PuertaIzquierda              . isSelected() );
        h.put("pta_der"      , PuertaDerecha                . isSelected() );
        h.put("pfi_izq"      , ParedFrontalInternaIzquierda . isSelected() );
        h.put("pfi_der"      , ParedFrontalInternaDerecha   . isSelected() );
        h.put("ur_izq"       , Cables                       . isSelected() );
        h.put("ur_der"       , Flucs                        . isSelected() );
        h.put("le_izq"       , LadosExternosIzquierda       . isSelected() );
        h.put("le_der"       , LadosExternosDerecha         . isSelected() );
        h.put("li_izq"       , LadosInternosIzquierda       . isSelected() );
        h.put("li_der"       , LadosInternosDerecha         . isSelected() );
        h.put("techo"        , Techo                        . isSelected() );
        h.put("piso"         , Piso                         . isSelected() );
        h.put("est_inf"      , EstructuraInferior           . isSelected() );
        h.put("est_int"      , EstructuraInterna            . isSelected() );
        h.put("chasis_estado", ChasisCheck                  . isSelected() );
        h.put("observaciones", Observaciones                . getText() );
        h.put("inspector"    , "carper" );

        // convert the object to a JSON document
        final String inspeccion = Result.fromContent(h).toString();
        
        JSONParser parser = new JSONParser();

        // override, by default this method writes NVPs.
        ConnectionRequest request = new ConnectionRequest() {
            protected void buildRequestBody(OutputStream os) throws IOException {
                os.write(inspeccion.getBytes("UTF-8"));
            }
            protected void readResponse(InputStream inputStream) throws IOException  {
                Map result = parser.parseJSON(new InputStreamReader(inputStream, "UTF-8"));
                System.out.println(result);
            }
            protected void postResponse() {
               // response completed, this is called on the EDT do the application logic here...
            }
        };
        request.setUrl("http://localhost:8080/server/rest/inspeccion/add");
        request.setPost(true);
        request.setContentType("application/json");
        
        InfiniteProgress infiniteProgress = new InfiniteProgress();
        Dialog dialog = infiniteProgress.showInifiniteBlocking();
        request.setDisposeOnCompletion(dialog);
        
        //NetworkManager.getInstance().addToQueue(request);
        NetworkManager.getInstance().addToQueueAndWait(request);
        System.out.println(request.getResponseCode());
        
    }

}
