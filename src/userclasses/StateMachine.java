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
import com.codename1.io.Storage;
import com.codename1.io.Util;
import com.codename1.l10n.L10NManager;
import com.codename1.processing.Result;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.spinner.DateSpinner;
import com.codename1.ui.util.Resources;
import com.codename1.ui.validation.LengthConstraint;
import com.codename1.ui.validation.Validator;
import ec.sgs.mobile.cn1.Configuracion;
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
    
    private final L10NManager lnm = L10NManager.getInstance();
    private Storage storage;
    private String inspeccionService;
    
    //Controles de Configuracion
    TextField servidor;
    TextField puerto;
    TextField inspector;
    
    // Controles de Inspeccion
    TextField contenedorNum;
    TextField tamano;
    TextField chasis;
    TextField trailerPlaca;
    TextField cliente;
    DateSpinner fecha;
    TextField agencia;
    TextField vapor;
    TextField destino;
    TextField factura;

    CheckBox puertaIzquierda;
    CheckBox puertaDerecha;
    CheckBox paredFrontalInternaIzquierda;
    CheckBox paredFrontalInternaDerecha;
    CheckBox cables;
    CheckBox flucs;
    CheckBox ladosExternosIzquierda;
    CheckBox ladosExternosDerecha;
    CheckBox ladosInternosIzquierda;
    CheckBox ladosInternosDerecha;
    CheckBox techo;
    CheckBox piso;
    CheckBox estructuraInferior;
    CheckBox estructuraInterna;
    CheckBox chasisEstado;

    TextArea observaciones;
    
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
        Util.register("Configuracion", Configuracion.class);
    }

    @Override
    protected void postMain(Form f) {
        storage = Storage.getInstance();
        
        //Lee la configuración del móvil
        Configuracion obj = (Configuracion)storage.readObject("configuracion");
        
        if (obj!=null){
            inspeccionService = "http://" + obj.getServidor() +":" + obj.getPuerto() +"/server/rest/inspeccion/"  ;
            System.out.println(inspeccionService);
        }else{
            Dialog.show ("Configuración", "Defina los datos de configuración del equipo", "OK", null);
            showForm("Configuracion", null);
        }

    }
    
        @Override
    protected void beforeConfiguracion(Form f) {
        //Si ya existe el registro, llenar los controles con su dato
        Configuracion obj = (Configuracion)storage.readObject("configuracion");
        if (obj==null){
            obj = new Configuracion();
            obj.setServidor("localhost");
            obj.setPuerto("8080");
            obj.setInspector("carper");
            storage.writeObject("configuracion", obj);
        }
        servidor  = findServidor();
        puerto    = findPuerto();
        inspector = findInspector();       

        servidor  . setText ( obj.getServidor  ());
        puerto    . setText ( obj.getPuerto    ());
        inspector . setText ( obj.getInspector ());
    }

    @Override
    protected void onConfiguracion_GrabarAction(Component c, ActionEvent event) {
        Configuracion obj = new Configuracion();
        obj.setServidor  ( servidor  . getText() );
        obj.setPuerto    ( puerto    . getText() );
        obj.setInspector ( inspector . getText() );
        
        storage.writeObject("configuracion", obj);
    	showForm("Main", null);
    }

    @Override
    protected void postInspeccion(Form f) {
    }

    @Override
    protected void beforeInspeccion(Form f) {
        //Constraints
        contenedorNum                = findContenedorNum();
        tamano                       = findTamano();
        chasis                       = findChasis();       
        trailerPlaca                 = findTrailerPlaca();
        cliente                      = findCliente();
        fecha                        = findFecha();
        agencia                      = findAgencia();
        vapor                        = findVapor();
        destino                      = findDestino();
        factura                      = findFactura();

	puertaIzquierda              = findPuertaIzquierda();
	puertaDerecha                = findPuertaDerecha();
	paredFrontalInternaIzquierda = findParedFrontalInternaIzquierda();
	paredFrontalInternaDerecha   = findParedFrontalInternaDerecha();
	cables                       = findCables();
	flucs                        = findFlucs();
	ladosExternosIzquierda       = findLadosExternosIzquierda();
	ladosExternosDerecha         = findLadosExternosDerecha();
	ladosInternosIzquierda       = findLadosInternosIzquierda();
	ladosInternosDerecha         = findLadosInternosDerecha();
	techo                        = findTecho();
	piso                         = findPiso();
	estructuraInferior           = findEstructuraInferior();
	estructuraInterna            = findEstructuraInterna();
	chasisEstado                 = findChasisEstado();
        
        observaciones                = findObservaciones();

        Button grabar = findGrabar();
        Validator v = new Validator();
        v.
            addConstraint(contenedorNum, new LengthConstraint(11)).
            addConstraint(tamano, new LengthConstraint(2)
        );
        //v.addSubmitButtons(grabar);
    }

    @Override
    protected void onInspeccion_GrabarAction(Component c, ActionEvent event) {
        //https://groups.google.com/forum/#!topic/codenameone-discussions/tGPeQrNRO58
        //https://stackoverflow.com/questions/39063909/how-to-post-json-to-a-rest-webservice-in-codenameone
        
        Hashtable h = new Hashtable();
        // (populate the requestuest object here)
        String mes = "" + fecha.getCurrentMonth();
        String dia = "" + fecha.getCurrentDay();
        
        String strMes = "00".substring(mes.length()) + mes;
        String strDia = "00".substring(dia.length()) + dia;
        
        //TODO: Verificar aplicación de fecha
        String fechaSeleccionada = fecha.getCurrentYear() +"-"+
        strMes +"-"+strDia;
        
        h.put("id"           , "");
        h.put("contenedor"   , contenedorNum                . getText() );
        h.put("tamano"       , tamano                       . getText() );
        h.put("chasis"       , chasis                       . getText() );
        h.put("placa"        , trailerPlaca                 . getText() );
        h.put("cliente"      , cliente                      . getText() );
        h.put("fecha"        , fechaSeleccionada            . toString() );
        h.put("agencia"      , agencia                      . getText() );
        h.put("vapor"        , vapor                        . getText() );
        h.put("destino"      , destino                      . getText() );
        h.put("factura"      , factura                      . getText() );
        h.put("pta_izq"      , puertaIzquierda              . isSelected() );
        h.put("pta_der"      , puertaDerecha                . isSelected() );
        h.put("pfi_izq"      , paredFrontalInternaIzquierda . isSelected() );
        h.put("pfi_der"      , paredFrontalInternaDerecha   . isSelected() );
        h.put("ur_izq"       , cables                       . isSelected() );
        h.put("ur_der"       , flucs                        . isSelected() );
        h.put("le_izq"       , ladosExternosIzquierda       . isSelected() );
        h.put("le_der"       , ladosExternosDerecha         . isSelected() );
        h.put("li_izq"       , ladosInternosIzquierda       . isSelected() );
        h.put("li_der"       , ladosInternosDerecha         . isSelected() );
        h.put("techo"        , techo                        . isSelected() );
        h.put("piso"         , piso                         . isSelected() );
        h.put("est_inf"      , estructuraInferior           . isSelected() );
        h.put("est_int"      , estructuraInterna            . isSelected() );
        h.put("chasis_estado", chasisEstado                  . isSelected() );
        h.put("observaciones", observaciones                . getText() );
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
               // response completed, this is called on the EDT do the application logic here...S
//                if (request.getResponseCode()==202)
//                {
//                };
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
        
        if (request.getResponseCode()==200){
            Dialog.show ("Inspecciones", "Datos grabados correctamente.", "OK", null);
        }
        showForm("Main", null);
        
    }

}
