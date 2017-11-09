/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.TextField findVapor(Component root) {
        return (com.codename1.ui.TextField)findByName("Vapor", root);
    }

    public com.codename1.ui.TextField findVapor() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Vapor", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Vapor", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTamano(Component root) {
        return (com.codename1.ui.TextField)findByName("Tamano", root);
    }

    public com.codename1.ui.TextField findTamano() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Tamano", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Tamano", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTrailerPlaca(Component root) {
        return (com.codename1.ui.TextField)findByName("TrailerPlaca", root);
    }

    public com.codename1.ui.TextField findTrailerPlaca() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TrailerPlaca", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TrailerPlaca", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findConfiguracion(Component root) {
        return (com.codename1.ui.Button)findByName("Configuracion", root);
    }

    public com.codename1.ui.Button findConfiguracion() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Configuracion", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Configuracion", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFecha(Component root) {
        return (com.codename1.ui.TextField)findByName("Fecha", root);
    }

    public com.codename1.ui.TextField findFecha() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Fecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Fecha", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findInpeccion(Component root) {
        return (com.codename1.ui.Button)findByName("Inpeccion", root);
    }

    public com.codename1.ui.Button findInpeccion() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Inpeccion", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Inpeccion", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAgencia(Component root) {
        return (com.codename1.ui.TextField)findByName("Agencia", root);
    }

    public com.codename1.ui.TextField findAgencia() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Agencia", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Agencia", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerTab4(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerTab4", root);
    }

    public com.codename1.ui.Container findContainerTab4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerTab4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerTab4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findChasis(Component root) {
        return (com.codename1.ui.TextField)findByName("Chasis", root);
    }

    public com.codename1.ui.TextField findChasis() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Chasis", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Chasis", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findCliente(Component root) {
        return (com.codename1.ui.TextField)findByName("Cliente", root);
    }

    public com.codename1.ui.TextField findCliente() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Cliente", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Cliente", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findContenedorNum(Component root) {
        return (com.codename1.ui.TextField)findByName("ContenedorNum", root);
    }

    public com.codename1.ui.TextField findContenedorNum() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ContenedorNum", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ContenedorNum", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findControlEmbarque(Component root) {
        return (com.codename1.ui.Button)findByName("ControlEmbarque", root);
    }

    public com.codename1.ui.Button findControlEmbarque() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("ControlEmbarque", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("ControlEmbarque", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findDestino(Component root) {
        return (com.codename1.ui.TextField)findByName("Destino", root);
    }

    public com.codename1.ui.TextField findDestino() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Destino", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Destino", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerTab3(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerTab3", root);
    }

    public com.codename1.ui.Container findContainerTab3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerTab3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerTab3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerTab2(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerTab2", root);
    }

    public com.codename1.ui.Container findContainerTab2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerTab2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerTab2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerTab1(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerTab1", root);
    }

    public com.codename1.ui.Container findContainerTab1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerTab1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerTab1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findCables(Component root) {
        return (com.codename1.ui.CheckBox)findByName("Cables", root);
    }

    public com.codename1.ui.CheckBox findCables() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("Cables", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("Cables", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findFlucs(Component root) {
        return (com.codename1.ui.CheckBox)findByName("Flucs", root);
    }

    public com.codename1.ui.CheckBox findFlucs() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("Flucs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("Flucs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findPFII(Component root) {
        return (com.codename1.ui.CheckBox)findByName("PFII", root);
    }

    public com.codename1.ui.CheckBox findPFII() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("PFII", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("PFII", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findPD(Component root) {
        return (com.codename1.ui.CheckBox)findByName("PD", root);
    }

    public com.codename1.ui.CheckBox findPD() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("PD", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("PD", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findPFID(Component root) {
        return (com.codename1.ui.CheckBox)findByName("PFID", root);
    }

    public com.codename1.ui.CheckBox findPFID() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("PFID", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("PFID", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findDatos(Component root) {
        return (com.codename1.ui.Button)findByName("Datos", root);
    }

    public com.codename1.ui.Button findDatos() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Datos", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Datos", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findPI(Component root) {
        return (com.codename1.ui.CheckBox)findByName("PI", root);
    }

    public com.codename1.ui.CheckBox findPI() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("PI", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("PI", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs", root);
    }

    public com.codename1.ui.Tabs findTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFactura(Component root) {
        return (com.codename1.ui.TextField)findByName("Factura", root);
    }

    public com.codename1.ui.TextField findFactura() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Factura", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Factura", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainInspecciNDeContenedores = 1;

    protected boolean onMainInspecciNDeContenedores() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainInspecciNDeContenedores:
                if(onMainInspecciNDeContenedores()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("Inspeccion".equals(f.getName())) {
            exitInspeccion(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitInspeccion(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Inspeccion".equals(f.getName())) {
            beforeInspeccion(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeInspeccion(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Inspeccion".equals(c.getName())) {
            beforeContainerInspeccion(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerInspeccion(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Inspeccion".equals(f.getName())) {
            postInspeccion(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postInspeccion(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Inspeccion".equals(c.getName())) {
            postContainerInspeccion(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerInspeccion(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Inspeccion".equals(rootName)) {
            onCreateInspeccion();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateInspeccion() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Inspeccion".equals(f.getName())) {
            getStateInspeccion(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateInspeccion(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Inspeccion".equals(f.getName())) {
            setStateInspeccion(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateInspeccion(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Inspeccion")) {
            if("ContenedorNum".equals(c.getName())) {
                onInspeccion_ContenedorNumAction(c, event);
                return;
            }
            if("Tamano".equals(c.getName())) {
                onInspeccion_TamanoAction(c, event);
                return;
            }
            if("Chasis".equals(c.getName())) {
                onInspeccion_ChasisAction(c, event);
                return;
            }
            if("TrailerPlaca".equals(c.getName())) {
                onInspeccion_TrailerPlacaAction(c, event);
                return;
            }
            if("Cliente".equals(c.getName())) {
                onInspeccion_ClienteAction(c, event);
                return;
            }
            if("Fecha".equals(c.getName())) {
                onInspeccion_FechaAction(c, event);
                return;
            }
            if("Agencia".equals(c.getName())) {
                onInspeccion_AgenciaAction(c, event);
                return;
            }
            if("Vapor".equals(c.getName())) {
                onInspeccion_VaporAction(c, event);
                return;
            }
            if("Destino".equals(c.getName())) {
                onInspeccion_DestinoAction(c, event);
                return;
            }
            if("Factura".equals(c.getName())) {
                onInspeccion_FacturaAction(c, event);
                return;
            }
            if("PI".equals(c.getName())) {
                onInspeccion_PIAction(c, event);
                return;
            }
            if("PD".equals(c.getName())) {
                onInspeccion_PDAction(c, event);
                return;
            }
            if("PFII".equals(c.getName())) {
                onInspeccion_PFIIAction(c, event);
                return;
            }
            if("PFID".equals(c.getName())) {
                onInspeccion_PFIDAction(c, event);
                return;
            }
            if("Cables".equals(c.getName())) {
                onInspeccion_CablesAction(c, event);
                return;
            }
            if("Flucs".equals(c.getName())) {
                onInspeccion_FlucsAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Inpeccion".equals(c.getName())) {
                onMain_InpeccionAction(c, event);
                return;
            }
            if("Datos".equals(c.getName())) {
                onMain_DatosAction(c, event);
                return;
            }
            if("ControlEmbarque".equals(c.getName())) {
                onMain_ControlEmbarqueAction(c, event);
                return;
            }
            if("Configuracion".equals(c.getName())) {
                onMain_ConfiguracionAction(c, event);
                return;
            }
        }
    }

      protected void onInspeccion_ContenedorNumAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_TamanoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_ChasisAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_TrailerPlacaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_ClienteAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_FechaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_AgenciaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_VaporAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_DestinoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_FacturaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_PIAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_PDAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_PFIIAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_PFIDAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_CablesAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_FlucsAction(Component c, ActionEvent event) {
      }

      protected void onMain_InpeccionAction(Component c, ActionEvent event) {
      }

      protected void onMain_DatosAction(Component c, ActionEvent event) {
      }

      protected void onMain_ControlEmbarqueAction(Component c, ActionEvent event) {
      }

      protected void onMain_ConfiguracionAction(Component c, ActionEvent event) {
      }

}
