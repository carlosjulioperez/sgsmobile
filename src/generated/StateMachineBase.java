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
        UIBuilder.registerCustomComponent("DateSpinner", com.codename1.ui.spinner.DateSpinner.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
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
        UIBuilder.registerCustomComponent("DateSpinner", com.codename1.ui.spinner.DateSpinner.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
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

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
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

    public com.codename1.ui.Button findBotonDatos(Component root) {
        return (com.codename1.ui.Button)findByName("BotonDatos", root);
    }

    public com.codename1.ui.Button findBotonDatos() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BotonDatos", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BotonDatos", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer5(Component root) {
        return (com.codename1.ui.Container)findByName("Container5", root);
    }

    public com.codename1.ui.Container findContainer5() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findLadosInternosIzquierda(Component root) {
        return (com.codename1.ui.CheckBox)findByName("LadosInternosIzquierda", root);
    }

    public com.codename1.ui.CheckBox findLadosInternosIzquierda() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("LadosInternosIzquierda", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("LadosInternosIzquierda", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findPiso(Component root) {
        return (com.codename1.ui.CheckBox)findByName("Piso", root);
    }

    public com.codename1.ui.CheckBox findPiso() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("Piso", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("Piso", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBotonInspeccion(Component root) {
        return (com.codename1.ui.Button)findByName("BotonInspeccion", root);
    }

    public com.codename1.ui.Button findBotonInspeccion() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BotonInspeccion", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BotonInspeccion", aboutToShowThisContainer);
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

    public com.codename1.ui.Button findBotonConfiguracion(Component root) {
        return (com.codename1.ui.Button)findByName("BotonConfiguracion", root);
    }

    public com.codename1.ui.Button findBotonConfiguracion() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BotonConfiguracion", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BotonConfiguracion", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findEstructuraInterna(Component root) {
        return (com.codename1.ui.CheckBox)findByName("EstructuraInterna", root);
    }

    public com.codename1.ui.CheckBox findEstructuraInterna() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("EstructuraInterna", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("EstructuraInterna", aboutToShowThisContainer);
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

    public com.codename1.ui.CheckBox findLadosExternosIzquierda(Component root) {
        return (com.codename1.ui.CheckBox)findByName("LadosExternosIzquierda", root);
    }

    public com.codename1.ui.CheckBox findLadosExternosIzquierda() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("LadosExternosIzquierda", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("LadosExternosIzquierda", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findParedFrontalInternaIzquierda(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ParedFrontalInternaIzquierda", root);
    }

    public com.codename1.ui.CheckBox findParedFrontalInternaIzquierda() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ParedFrontalInternaIzquierda", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ParedFrontalInternaIzquierda", aboutToShowThisContainer);
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

    public com.codename1.ui.Button findBotonControlEmbarque(Component root) {
        return (com.codename1.ui.Button)findByName("BotonControlEmbarque", root);
    }

    public com.codename1.ui.Button findBotonControlEmbarque() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("BotonControlEmbarque", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("BotonControlEmbarque", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findTecho(Component root) {
        return (com.codename1.ui.CheckBox)findByName("Techo", root);
    }

    public com.codename1.ui.CheckBox findTecho() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("Techo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("Techo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findObservaciones(Component root) {
        return (com.codename1.ui.TextArea)findByName("Observaciones", root);
    }

    public com.codename1.ui.TextArea findObservaciones() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("Observaciones", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("Observaciones", aboutToShowThisContainer);
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

    public com.codename1.ui.spinner.DateSpinner findDateSpinner(Component root) {
        return (com.codename1.ui.spinner.DateSpinner)findByName("DateSpinner", root);
    }

    public com.codename1.ui.spinner.DateSpinner findDateSpinner() {
        com.codename1.ui.spinner.DateSpinner cmp = (com.codename1.ui.spinner.DateSpinner)findByName("DateSpinner", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.DateSpinner)findByName("DateSpinner", aboutToShowThisContainer);
        }
        return cmp;
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

    public com.codename1.ui.ComponentGroup findComponentGroup1(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup1() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findGrabar(Component root) {
        return (com.codename1.ui.Button)findByName("grabar", root);
    }

    public com.codename1.ui.Button findGrabar() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("grabar", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("grabar", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findPuerto(Component root) {
        return (com.codename1.ui.TextField)findByName("puerto", root);
    }

    public com.codename1.ui.TextField findPuerto() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("puerto", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("puerto", aboutToShowThisContainer);
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

    public com.codename1.ui.CheckBox findPuertaIzquierda(Component root) {
        return (com.codename1.ui.CheckBox)findByName("PuertaIzquierda", root);
    }

    public com.codename1.ui.CheckBox findPuertaIzquierda() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("PuertaIzquierda", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("PuertaIzquierda", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findServidor(Component root) {
        return (com.codename1.ui.TextField)findByName("servidor", root);
    }

    public com.codename1.ui.TextField findServidor() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("servidor", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("servidor", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findInspector(Component root) {
        return (com.codename1.ui.TextField)findByName("inspector", root);
    }

    public com.codename1.ui.TextField findInspector() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("inspector", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("inspector", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findParedFrontalInternaDerecha(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ParedFrontalInternaDerecha", root);
    }

    public com.codename1.ui.CheckBox findParedFrontalInternaDerecha() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ParedFrontalInternaDerecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ParedFrontalInternaDerecha", aboutToShowThisContainer);
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

    public com.codename1.ui.CheckBox findPuertaDerecha(Component root) {
        return (com.codename1.ui.CheckBox)findByName("PuertaDerecha", root);
    }

    public com.codename1.ui.CheckBox findPuertaDerecha() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("PuertaDerecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("PuertaDerecha", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findLadosExternosDerecha(Component root) {
        return (com.codename1.ui.CheckBox)findByName("LadosExternosDerecha", root);
    }

    public com.codename1.ui.CheckBox findLadosExternosDerecha() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("LadosExternosDerecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("LadosExternosDerecha", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findChasisCheck(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ChasisCheck", root);
    }

    public com.codename1.ui.CheckBox findChasisCheck() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ChasisCheck", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ChasisCheck", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findLadosInternosDerecha(Component root) {
        return (com.codename1.ui.CheckBox)findByName("LadosInternosDerecha", root);
    }

    public com.codename1.ui.CheckBox findLadosInternosDerecha() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("LadosInternosDerecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("LadosInternosDerecha", aboutToShowThisContainer);
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

    public com.codename1.ui.CheckBox findEstructuraInferior(Component root) {
        return (com.codename1.ui.CheckBox)findByName("EstructuraInferior", root);
    }

    public com.codename1.ui.CheckBox findEstructuraInferior() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("EstructuraInferior", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("EstructuraInferior", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainConfiguraciN = 2;
    public static final int COMMAND_MainInspecciNDeContenedores = 1;

    protected boolean onMainConfiguraciN() {
        return false;
    }

    protected boolean onMainInspecciNDeContenedores() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainConfiguraciN:
                if(onMainConfiguraciN()) {
                    ev.consume();
                    return;
                }
                break;

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
        if("Configuracion".equals(f.getName())) {
            exitConfiguracion(f);
            aboutToShowThisContainer = null;
            return;
        }

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


    protected void exitConfiguracion(Form f) {
    }


    protected void exitInspeccion(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Configuracion".equals(f.getName())) {
            beforeConfiguracion(f);
            aboutToShowThisContainer = null;
            return;
        }

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


    protected void beforeConfiguracion(Form f) {
    }


    protected void beforeInspeccion(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Configuracion".equals(c.getName())) {
            beforeContainerConfiguracion(c);
            aboutToShowThisContainer = null;
            return;
        }

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


    protected void beforeContainerConfiguracion(Container c) {
    }


    protected void beforeContainerInspeccion(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Configuracion".equals(f.getName())) {
            postConfiguracion(f);
            aboutToShowThisContainer = null;
            return;
        }

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


    protected void postConfiguracion(Form f) {
    }


    protected void postInspeccion(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Configuracion".equals(c.getName())) {
            postContainerConfiguracion(c);
            aboutToShowThisContainer = null;
            return;
        }

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


    protected void postContainerConfiguracion(Container c) {
    }


    protected void postContainerInspeccion(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Configuracion".equals(rootName)) {
            onCreateConfiguracion();
            aboutToShowThisContainer = null;
            return;
        }

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


    protected void onCreateConfiguracion() {
    }


    protected void onCreateInspeccion() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Configuracion".equals(f.getName())) {
            getStateConfiguracion(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

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


    protected void getStateConfiguracion(Form f, Hashtable h) {
    }


    protected void getStateInspeccion(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Configuracion".equals(f.getName())) {
            setStateConfiguracion(f, state);
            aboutToShowThisContainer = null;
            return;
        }

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


    protected void setStateConfiguracion(Form f, Hashtable state) {
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
        if(rootContainerName.equals("Configuracion")) {
            if("servidor".equals(c.getName())) {
                onConfiguracion_ServidorAction(c, event);
                return;
            }
            if("puerto".equals(c.getName())) {
                onConfiguracion_PuertoAction(c, event);
                return;
            }
            if("inspector".equals(c.getName())) {
                onConfiguracion_InspectorAction(c, event);
                return;
            }
            if("grabar".equals(c.getName())) {
                onConfiguracion_GrabarAction(c, event);
                return;
            }
        }
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
            if("PuertaIzquierda".equals(c.getName())) {
                onInspeccion_PuertaIzquierdaAction(c, event);
                return;
            }
            if("PuertaDerecha".equals(c.getName())) {
                onInspeccion_PuertaDerechaAction(c, event);
                return;
            }
            if("ParedFrontalInternaIzquierda".equals(c.getName())) {
                onInspeccion_ParedFrontalInternaIzquierdaAction(c, event);
                return;
            }
            if("ParedFrontalInternaDerecha".equals(c.getName())) {
                onInspeccion_ParedFrontalInternaDerechaAction(c, event);
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
            if("LadosExternosIzquierda".equals(c.getName())) {
                onInspeccion_LadosExternosIzquierdaAction(c, event);
                return;
            }
            if("LadosExternosDerecha".equals(c.getName())) {
                onInspeccion_LadosExternosDerechaAction(c, event);
                return;
            }
            if("LadosInternosIzquierda".equals(c.getName())) {
                onInspeccion_LadosInternosIzquierdaAction(c, event);
                return;
            }
            if("LadosInternosDerecha".equals(c.getName())) {
                onInspeccion_LadosInternosDerechaAction(c, event);
                return;
            }
            if("Techo".equals(c.getName())) {
                onInspeccion_TechoAction(c, event);
                return;
            }
            if("Piso".equals(c.getName())) {
                onInspeccion_PisoAction(c, event);
                return;
            }
            if("EstructuraInferior".equals(c.getName())) {
                onInspeccion_EstructuraInferiorAction(c, event);
                return;
            }
            if("EstructuraInterna".equals(c.getName())) {
                onInspeccion_EstructuraInternaAction(c, event);
                return;
            }
            if("ChasisCheck".equals(c.getName())) {
                onInspeccion_ChasisCheckAction(c, event);
                return;
            }
            if("Observaciones".equals(c.getName())) {
                onInspeccion_ObservacionesAction(c, event);
                return;
            }
            if("Grabar".equals(c.getName())) {
                onInspeccion_GrabarAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("BotonInspeccion".equals(c.getName())) {
                onMain_BotonInspeccionAction(c, event);
                return;
            }
            if("BotonDatos".equals(c.getName())) {
                onMain_BotonDatosAction(c, event);
                return;
            }
            if("BotonControlEmbarque".equals(c.getName())) {
                onMain_BotonControlEmbarqueAction(c, event);
                return;
            }
            if("BotonConfiguracion".equals(c.getName())) {
                onMain_BotonConfiguracionAction(c, event);
                return;
            }
        }
    }

      protected void onConfiguracion_ServidorAction(Component c, ActionEvent event) {
      }

      protected void onConfiguracion_PuertoAction(Component c, ActionEvent event) {
      }

      protected void onConfiguracion_InspectorAction(Component c, ActionEvent event) {
      }

      protected void onConfiguracion_GrabarAction(Component c, ActionEvent event) {
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

      protected void onInspeccion_PuertaIzquierdaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_PuertaDerechaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_ParedFrontalInternaIzquierdaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_ParedFrontalInternaDerechaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_CablesAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_FlucsAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_LadosExternosIzquierdaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_LadosExternosDerechaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_LadosInternosIzquierdaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_LadosInternosDerechaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_TechoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_PisoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_EstructuraInferiorAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_EstructuraInternaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_ChasisCheckAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_ObservacionesAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_GrabarAction(Component c, ActionEvent event) {
      }

      protected void onMain_BotonInspeccionAction(Component c, ActionEvent event) {
      }

      protected void onMain_BotonDatosAction(Component c, ActionEvent event) {
      }

      protected void onMain_BotonControlEmbarqueAction(Component c, ActionEvent event) {
      }

      protected void onMain_BotonConfiguracionAction(Component c, ActionEvent event) {
      }

}
