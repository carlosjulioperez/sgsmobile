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
        UIBuilder.registerCustomComponent("Table", com.codename1.ui.table.Table.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
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
        UIBuilder.registerCustomComponent("Table", com.codename1.ui.table.Table.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
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

    public com.codename1.ui.Button findGrabarClasificacionC1(Component root) {
        return (com.codename1.ui.Button)findByName("grabarClasificacionC1", root);
    }

    public com.codename1.ui.Button findGrabarClasificacionC1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("grabarClasificacionC1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("grabarClasificacionC1", aboutToShowThisContainer);
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

    public com.codename1.ui.RadioButton findClienteRad(Component root) {
        return (com.codename1.ui.RadioButton)findByName("clienteRad", root);
    }

    public com.codename1.ui.RadioButton findClienteRad() {
        com.codename1.ui.RadioButton cmp = (com.codename1.ui.RadioButton)findByName("clienteRad", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.RadioButton)findByName("clienteRad", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findTecho(Component root) {
        return (com.codename1.ui.CheckBox)findByName("techo", root);
    }

    public com.codename1.ui.CheckBox findTecho() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("techo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("techo", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findChasis(Component root) {
        return (com.codename1.ui.TextField)findByName("chasis", root);
    }

    public com.codename1.ui.TextField findChasis() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("chasis", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("chasis", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findDescripcionPesosP1(Component root) {
        return (com.codename1.ui.TextField)findByName("descripcionPesosP1", root);
    }

    public com.codename1.ui.TextField findDescripcionPesosP1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("descripcionPesosP1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("descripcionPesosP1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findEmbalajeCE(Component root) {
        return (com.codename1.ui.TextField)findByName("embalajeCE", root);
    }

    public com.codename1.ui.TextField findEmbalajeCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("embalajeCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("embalajeCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findMarcaP1(Component root) {
        return (com.codename1.ui.TextField)findByName("marcaP1", root);
    }

    public com.codename1.ui.TextField findMarcaP1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("marcaP1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("marcaP1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findPiso(Component root) {
        return (com.codename1.ui.CheckBox)findByName("piso", root);
    }

    public com.codename1.ui.CheckBox findPiso() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("piso", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("piso", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPresentacionP1(Component root) {
        return (com.codename1.ui.TextField)findByName("presentacionP1", root);
    }

    public com.codename1.ui.TextField findPresentacionP1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("presentacionP1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("presentacionP1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSelloOtrosCE(Component root) {
        return (com.codename1.ui.TextField)findByName("selloOtrosCE", root);
    }

    public com.codename1.ui.TextField findSelloOtrosCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("selloOtrosCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("selloOtrosCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findModeloC1(Component root) {
        return (com.codename1.ui.TextField)findByName("modeloC1", root);
    }

    public com.codename1.ui.TextField findModeloC1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("modeloC1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("modeloC1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findQuitarElementoC1(Component root) {
        return (com.codename1.ui.CheckBox)findByName("quitarElementoC1", root);
    }

    public com.codename1.ui.CheckBox findQuitarElementoC1() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("quitarElementoC1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("quitarElementoC1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findParedFrontalInternaIzquierda(Component root) {
        return (com.codename1.ui.CheckBox)findByName("paredFrontalInternaIzquierda", root);
    }

    public com.codename1.ui.CheckBox findParedFrontalInternaIzquierda() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("paredFrontalInternaIzquierda", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("paredFrontalInternaIzquierda", aboutToShowThisContainer);
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

    public com.codename1.ui.CheckBox findQuitarElementoCE(Component root) {
        return (com.codename1.ui.CheckBox)findByName("quitarElementoCE", root);
    }

    public com.codename1.ui.CheckBox findQuitarElementoCE() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("quitarElementoCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("quitarElementoCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTamano(Component root) {
        return (com.codename1.ui.TextField)findByName("tamano", root);
    }

    public com.codename1.ui.TextField findTamano() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("tamano", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("tamano", aboutToShowThisContainer);
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

    public com.codename1.ui.Container findListaClasificacionP1(Component root) {
        return (com.codename1.ui.Container)findByName("listaClasificacionP1", root);
    }

    public com.codename1.ui.Container findListaClasificacionP1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("listaClasificacionP1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("listaClasificacionP1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSelloAgenciaCE(Component root) {
        return (com.codename1.ui.TextField)findByName("selloAgenciaCE", root);
    }

    public com.codename1.ui.TextField findSelloAgenciaCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("selloAgenciaCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("selloAgenciaCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainerBusqueda(Component root) {
        return (com.codename1.ui.Container)findByName("ContainerBusqueda", root);
    }

    public com.codename1.ui.Container findContainerBusqueda() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ContainerBusqueda", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ContainerBusqueda", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findListaProductosCE(Component root) {
        return (com.codename1.ui.Container)findByName("listaProductosCE", root);
    }

    public com.codename1.ui.Container findListaProductosCE() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("listaProductosCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("listaProductosCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findListadoInspecciones(Component root) {
        return (com.codename1.ui.Container)findByName("listadoInspecciones", root);
    }

    public com.codename1.ui.Container findListadoInspecciones() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("listadoInspecciones", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("listadoInspecciones", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSelloExportadorCE(Component root) {
        return (com.codename1.ui.TextField)findByName("selloExportadorCE", root);
    }

    public com.codename1.ui.TextField findSelloExportadorCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("selloExportadorCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("selloExportadorCE", aboutToShowThisContainer);
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

    public com.codename1.ui.table.Table findTable(Component root) {
        return (com.codename1.ui.table.Table)findByName("Table", root);
    }

    public com.codename1.ui.table.Table findTable() {
        com.codename1.ui.table.Table cmp = (com.codename1.ui.table.Table)findByName("Table", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.table.Table)findByName("Table", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findContenedorNum(Component root) {
        return (com.codename1.ui.TextField)findByName("contenedorNum", root);
    }

    public com.codename1.ui.TextField findContenedorNum() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("contenedorNum", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("contenedorNum", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findVapor(Component root) {
        return (com.codename1.ui.TextField)findByName("vapor", root);
    }

    public com.codename1.ui.TextField findVapor() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("vapor", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("vapor", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findLadosInternosIzquierda(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ladosInternosIzquierda", root);
    }

    public com.codename1.ui.CheckBox findLadosInternosIzquierda() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ladosInternosIzquierda", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ladosInternosIzquierda", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findCantidadDC(Component root) {
        return (com.codename1.ui.TextField)findByName("cantidadDC", root);
    }

    public com.codename1.ui.TextField findCantidadDC() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("cantidadDC", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("cantidadDC", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findValor(Component root) {
        return (com.codename1.ui.TextField)findByName("valor", root);
    }

    public com.codename1.ui.TextField findValor() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("valor", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("valor", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findConsignatarioCE(Component root) {
        return (com.codename1.ui.TextField)findByName("consignatarioCE", root);
    }

    public com.codename1.ui.TextField findConsignatarioCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("consignatarioCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("consignatarioCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findOinCE(Component root) {
        return (com.codename1.ui.TextField)findByName("oinCE", root);
    }

    public com.codename1.ui.TextField findOinCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("oinCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("oinCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNumeoRyanCE(Component root) {
        return (com.codename1.ui.TextField)findByName("numeoRyanCE", root);
    }

    public com.codename1.ui.TextField findNumeoRyanCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("numeoRyanCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("numeoRyanCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findAgregarDetalleCajasC1(Component root) {
        return (com.codename1.ui.Button)findByName("agregarDetalleCajasC1", root);
    }

    public com.codename1.ui.Button findAgregarDetalleCajasC1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("agregarDetalleCajasC1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("agregarDetalleCajasC1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findCantidadCajasCE(Component root) {
        return (com.codename1.ui.TextField)findByName("cantidadCajasCE", root);
    }

    public com.codename1.ui.TextField findCantidadCajasCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("cantidadCajasCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("cantidadCajasCE", aboutToShowThisContainer);
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

    public com.codename1.ui.CheckBox findPuertaIzquierda(Component root) {
        return (com.codename1.ui.CheckBox)findByName("puertaIzquierda", root);
    }

    public com.codename1.ui.CheckBox findPuertaIzquierda() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("puertaIzquierda", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("puertaIzquierda", aboutToShowThisContainer);
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

    public com.codename1.ui.Button findGrabarProductoP1(Component root) {
        return (com.codename1.ui.Button)findByName("grabarProductoP1", root);
    }

    public com.codename1.ui.Button findGrabarProductoP1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("grabarProductoP1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("grabarProductoP1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFactura(Component root) {
        return (com.codename1.ui.TextField)findByName("factura", root);
    }

    public com.codename1.ui.TextField findFactura() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("factura", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("factura", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findEstructuraInferior(Component root) {
        return (com.codename1.ui.CheckBox)findByName("estructuraInferior", root);
    }

    public com.codename1.ui.CheckBox findEstructuraInferior() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("estructuraInferior", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("estructuraInferior", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField", root);
    }

    public com.codename1.ui.TextField findTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField", aboutToShowThisContainer);
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

    public com.codename1.ui.CheckBox findLadosInternosDerecha(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ladosInternosDerecha", root);
    }

    public com.codename1.ui.CheckBox findLadosInternosDerecha() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ladosInternosDerecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ladosInternosDerecha", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNumeroSelloRyanCE(Component root) {
        return (com.codename1.ui.TextField)findByName("numeroSelloRyanCE", root);
    }

    public com.codename1.ui.TextField findNumeroSelloRyanCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("numeroSelloRyanCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("numeroSelloRyanCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.table.Table findTable1(Component root) {
        return (com.codename1.ui.table.Table)findByName("Table1", root);
    }

    public com.codename1.ui.table.Table findTable1() {
        com.codename1.ui.table.Table cmp = (com.codename1.ui.table.Table)findByName("Table1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.table.Table)findByName("Table1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findDetalleCajasC1(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("detalleCajasC1", root);
    }

    public com.codename1.ui.list.MultiList findDetalleCajasC1() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("detalleCajasC1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("detalleCajasC1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTrailerPlaca(Component root) {
        return (com.codename1.ui.TextField)findByName("trailerPlaca", root);
    }

    public com.codename1.ui.TextField findTrailerPlaca() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("trailerPlaca", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("trailerPlaca", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findCables(Component root) {
        return (com.codename1.ui.CheckBox)findByName("cables", root);
    }

    public com.codename1.ui.CheckBox findCables() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("cables", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("cables", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.table.Table findCajasTable(Component root) {
        return (com.codename1.ui.table.Table)findByName("cajasTable", root);
    }

    public com.codename1.ui.table.Table findCajasTable() {
        com.codename1.ui.table.Table cmp = (com.codename1.ui.table.Table)findByName("cajasTable", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.table.Table)findByName("cajasTable", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findCliente(Component root) {
        return (com.codename1.ui.TextField)findByName("cliente", root);
    }

    public com.codename1.ui.TextField findCliente() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("cliente", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("cliente", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.DateSpinner findFecha(Component root) {
        return (com.codename1.ui.spinner.DateSpinner)findByName("fecha", root);
    }

    public com.codename1.ui.spinner.DateSpinner findFecha() {
        com.codename1.ui.spinner.DateSpinner cmp = (com.codename1.ui.spinner.DateSpinner)findByName("fecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.DateSpinner)findByName("fecha", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBuscar(Component root) {
        return (com.codename1.ui.Button)findByName("buscar", root);
    }

    public com.codename1.ui.Button findBuscar() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("buscar", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("buscar", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findObservaciones(Component root) {
        return (com.codename1.ui.TextArea)findByName("observaciones", root);
    }

    public com.codename1.ui.TextArea findObservaciones() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("observaciones", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("observaciones", aboutToShowThisContainer);
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

    public com.codename1.ui.CheckBox findChasisEstado(Component root) {
        return (com.codename1.ui.CheckBox)findByName("chasisEstado", root);
    }

    public com.codename1.ui.CheckBox findChasisEstado() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("chasisEstado", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("chasisEstado", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findQuitarElementoP1(Component root) {
        return (com.codename1.ui.CheckBox)findByName("quitarElementoP1", root);
    }

    public com.codename1.ui.CheckBox findQuitarElementoP1() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("quitarElementoP1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("quitarElementoP1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findLadosExternosIzquierda(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ladosExternosIzquierda", root);
    }

    public com.codename1.ui.CheckBox findLadosExternosIzquierda() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ladosExternosIzquierda", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ladosExternosIzquierda", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findEstructuraInterna(Component root) {
        return (com.codename1.ui.CheckBox)findByName("estructuraInterna", root);
    }

    public com.codename1.ui.CheckBox findEstructuraInterna() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("estructuraInterna", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("estructuraInterna", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findAgregarClasificacionP1(Component root) {
        return (com.codename1.ui.Button)findByName("agregarClasificacionP1", root);
    }

    public com.codename1.ui.Button findAgregarClasificacionP1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("agregarClasificacionP1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("agregarClasificacionP1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAgencia(Component root) {
        return (com.codename1.ui.TextField)findByName("agencia", root);
    }

    public com.codename1.ui.TextField findAgencia() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("agencia", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("agencia", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findFlucs(Component root) {
        return (com.codename1.ui.CheckBox)findByName("flucs", root);
    }

    public com.codename1.ui.CheckBox findFlucs() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("flucs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("flucs", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findDestino(Component root) {
        return (com.codename1.ui.TextField)findByName("destino", root);
    }

    public com.codename1.ui.TextField findDestino() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("destino", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("destino", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSelloSGSCE(Component root) {
        return (com.codename1.ui.TextField)findByName("selloSGSCE", root);
    }

    public com.codename1.ui.TextField findSelloSGSCE() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("selloSGSCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("selloSGSCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findGrabarDetalleCajasDC(Component root) {
        return (com.codename1.ui.Button)findByName("grabarDetalleCajasDC", root);
    }

    public com.codename1.ui.Button findGrabarDetalleCajasDC() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("grabarDetalleCajasDC", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("grabarDetalleCajasDC", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findParedFrontalInternaDerecha(Component root) {
        return (com.codename1.ui.CheckBox)findByName("paredFrontalInternaDerecha", root);
    }

    public com.codename1.ui.CheckBox findParedFrontalInternaDerecha() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("paredFrontalInternaDerecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("paredFrontalInternaDerecha", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findEmpaqueP1(Component root) {
        return (com.codename1.ui.TextField)findByName("empaqueP1", root);
    }

    public com.codename1.ui.TextField findEmpaqueP1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("empaqueP1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("empaqueP1", aboutToShowThisContainer);
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

    public com.codename1.ui.CheckBox findLadosExternosDerecha(Component root) {
        return (com.codename1.ui.CheckBox)findByName("ladosExternosDerecha", root);
    }

    public com.codename1.ui.CheckBox findLadosExternosDerecha() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("ladosExternosDerecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("ladosExternosDerecha", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findAgregarProductoCE(Component root) {
        return (com.codename1.ui.Button)findByName("agregarProductoCE", root);
    }

    public com.codename1.ui.Button findAgregarProductoCE() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("agregarProductoCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("agregarProductoCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.RadioButton findContenedorRad(Component root) {
        return (com.codename1.ui.RadioButton)findByName("contenedorRad", root);
    }

    public com.codename1.ui.RadioButton findContenedorRad() {
        com.codename1.ui.RadioButton cmp = (com.codename1.ui.RadioButton)findByName("contenedorRad", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.RadioButton)findByName("contenedorRad", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findPuertaDerecha(Component root) {
        return (com.codename1.ui.CheckBox)findByName("puertaDerecha", root);
    }

    public com.codename1.ui.CheckBox findPuertaDerecha() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("puertaDerecha", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("puertaDerecha", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTipoProductoP1(Component root) {
        return (com.codename1.ui.TextField)findByName("tipoProductoP1", root);
    }

    public com.codename1.ui.TextField findTipoProductoP1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("tipoProductoP1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("tipoProductoP1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.table.Table findInfoCE(Component root) {
        return (com.codename1.ui.table.Table)findByName("infoCE", root);
    }

    public com.codename1.ui.table.Table findInfoCE() {
        com.codename1.ui.table.Table cmp = (com.codename1.ui.table.Table)findByName("infoCE", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.table.Table)findByName("infoCE", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFilaDC(Component root) {
        return (com.codename1.ui.TextField)findByName("filaDC", root);
    }

    public com.codename1.ui.TextField findFilaDC() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("filaDC", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("filaDC", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainConfiguraciN = 2;
    public static final int COMMAND_MainInspecciNDeContenedores = 1;
    public static final int COMMAND_MainDatosDelContenedor = 4;
    public static final int COMMAND_MainControlDeEmbarqueGranel = 3;

    protected boolean onMainConfiguraciN() {
        return false;
    }

    protected boolean onMainInspecciNDeContenedores() {
        return false;
    }

    protected boolean onMainDatosDelContenedor() {
        return false;
    }

    protected boolean onMainControlDeEmbarqueGranel() {
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

            case COMMAND_MainDatosDelContenedor:
                if(onMainDatosDelContenedor()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainControlDeEmbarqueGranel:
                if(onMainControlDeEmbarqueGranel()) {
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
        if("ClasificacionesFrm".equals(f.getName())) {
            exitClasificacionesFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProductoFrm".equals(f.getName())) {
            exitProductoFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionBusqueda".equals(f.getName())) {
            exitInspeccionBusqueda(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DetalleCajasFrm".equals(f.getName())) {
            exitDetalleCajasFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ClasificacionFrm".equals(f.getName())) {
            exitClasificacionFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ConfiguracionFrm".equals(f.getName())) {
            exitConfiguracionFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarqueFrm".equals(f.getName())) {
            exitControlEmbarqueFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionFrm".equals(f.getName())) {
            exitInspeccionFrm(f);
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


    protected void exitClasificacionesFrm(Form f) {
    }


    protected void exitProductoFrm(Form f) {
    }


    protected void exitInspeccionBusqueda(Form f) {
    }


    protected void exitDetalleCajasFrm(Form f) {
    }


    protected void exitClasificacionFrm(Form f) {
    }


    protected void exitConfiguracionFrm(Form f) {
    }


    protected void exitControlEmbarqueFrm(Form f) {
    }


    protected void exitInspeccionFrm(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("ClasificacionesFrm".equals(f.getName())) {
            beforeClasificacionesFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProductoFrm".equals(f.getName())) {
            beforeProductoFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionBusqueda".equals(f.getName())) {
            beforeInspeccionBusqueda(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DetalleCajasFrm".equals(f.getName())) {
            beforeDetalleCajasFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ClasificacionFrm".equals(f.getName())) {
            beforeClasificacionFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ConfiguracionFrm".equals(f.getName())) {
            beforeConfiguracionFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarqueFrm".equals(f.getName())) {
            beforeControlEmbarqueFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionFrm".equals(f.getName())) {
            beforeInspeccionFrm(f);
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


    protected void beforeClasificacionesFrm(Form f) {
    }


    protected void beforeProductoFrm(Form f) {
    }


    protected void beforeInspeccionBusqueda(Form f) {
    }


    protected void beforeDetalleCajasFrm(Form f) {
    }


    protected void beforeClasificacionFrm(Form f) {
    }


    protected void beforeConfiguracionFrm(Form f) {
    }


    protected void beforeControlEmbarqueFrm(Form f) {
    }


    protected void beforeInspeccionFrm(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("ClasificacionesFrm".equals(c.getName())) {
            beforeContainerClasificacionesFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProductoFrm".equals(c.getName())) {
            beforeContainerProductoFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionBusqueda".equals(c.getName())) {
            beforeContainerInspeccionBusqueda(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("DetalleCajasFrm".equals(c.getName())) {
            beforeContainerDetalleCajasFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ClasificacionFrm".equals(c.getName())) {
            beforeContainerClasificacionFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ConfiguracionFrm".equals(c.getName())) {
            beforeContainerConfiguracionFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarqueFrm".equals(c.getName())) {
            beforeContainerControlEmbarqueFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionFrm".equals(c.getName())) {
            beforeContainerInspeccionFrm(c);
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


    protected void beforeContainerClasificacionesFrm(Container c) {
    }


    protected void beforeContainerProductoFrm(Container c) {
    }


    protected void beforeContainerInspeccionBusqueda(Container c) {
    }


    protected void beforeContainerDetalleCajasFrm(Container c) {
    }


    protected void beforeContainerClasificacionFrm(Container c) {
    }


    protected void beforeContainerConfiguracionFrm(Container c) {
    }


    protected void beforeContainerControlEmbarqueFrm(Container c) {
    }


    protected void beforeContainerInspeccionFrm(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("ClasificacionesFrm".equals(f.getName())) {
            postClasificacionesFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProductoFrm".equals(f.getName())) {
            postProductoFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionBusqueda".equals(f.getName())) {
            postInspeccionBusqueda(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("DetalleCajasFrm".equals(f.getName())) {
            postDetalleCajasFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ClasificacionFrm".equals(f.getName())) {
            postClasificacionFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ConfiguracionFrm".equals(f.getName())) {
            postConfiguracionFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarqueFrm".equals(f.getName())) {
            postControlEmbarqueFrm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionFrm".equals(f.getName())) {
            postInspeccionFrm(f);
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


    protected void postClasificacionesFrm(Form f) {
    }


    protected void postProductoFrm(Form f) {
    }


    protected void postInspeccionBusqueda(Form f) {
    }


    protected void postDetalleCajasFrm(Form f) {
    }


    protected void postClasificacionFrm(Form f) {
    }


    protected void postConfiguracionFrm(Form f) {
    }


    protected void postControlEmbarqueFrm(Form f) {
    }


    protected void postInspeccionFrm(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("ClasificacionesFrm".equals(c.getName())) {
            postContainerClasificacionesFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProductoFrm".equals(c.getName())) {
            postContainerProductoFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionBusqueda".equals(c.getName())) {
            postContainerInspeccionBusqueda(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("DetalleCajasFrm".equals(c.getName())) {
            postContainerDetalleCajasFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ClasificacionFrm".equals(c.getName())) {
            postContainerClasificacionFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ConfiguracionFrm".equals(c.getName())) {
            postContainerConfiguracionFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarqueFrm".equals(c.getName())) {
            postContainerControlEmbarqueFrm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionFrm".equals(c.getName())) {
            postContainerInspeccionFrm(c);
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


    protected void postContainerClasificacionesFrm(Container c) {
    }


    protected void postContainerProductoFrm(Container c) {
    }


    protected void postContainerInspeccionBusqueda(Container c) {
    }


    protected void postContainerDetalleCajasFrm(Container c) {
    }


    protected void postContainerClasificacionFrm(Container c) {
    }


    protected void postContainerConfiguracionFrm(Container c) {
    }


    protected void postContainerControlEmbarqueFrm(Container c) {
    }


    protected void postContainerInspeccionFrm(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("ClasificacionesFrm".equals(rootName)) {
            onCreateClasificacionesFrm();
            aboutToShowThisContainer = null;
            return;
        }

        if("ProductoFrm".equals(rootName)) {
            onCreateProductoFrm();
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionBusqueda".equals(rootName)) {
            onCreateInspeccionBusqueda();
            aboutToShowThisContainer = null;
            return;
        }

        if("DetalleCajasFrm".equals(rootName)) {
            onCreateDetalleCajasFrm();
            aboutToShowThisContainer = null;
            return;
        }

        if("ClasificacionFrm".equals(rootName)) {
            onCreateClasificacionFrm();
            aboutToShowThisContainer = null;
            return;
        }

        if("ConfiguracionFrm".equals(rootName)) {
            onCreateConfiguracionFrm();
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarqueFrm".equals(rootName)) {
            onCreateControlEmbarqueFrm();
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionFrm".equals(rootName)) {
            onCreateInspeccionFrm();
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


    protected void onCreateClasificacionesFrm() {
    }


    protected void onCreateProductoFrm() {
    }


    protected void onCreateInspeccionBusqueda() {
    }


    protected void onCreateDetalleCajasFrm() {
    }


    protected void onCreateClasificacionFrm() {
    }


    protected void onCreateConfiguracionFrm() {
    }


    protected void onCreateControlEmbarqueFrm() {
    }


    protected void onCreateInspeccionFrm() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("ClasificacionesFrm".equals(f.getName())) {
            getStateClasificacionesFrm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ProductoFrm".equals(f.getName())) {
            getStateProductoFrm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("InspeccionBusqueda".equals(f.getName())) {
            getStateInspeccionBusqueda(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("DetalleCajasFrm".equals(f.getName())) {
            getStateDetalleCajasFrm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ClasificacionFrm".equals(f.getName())) {
            getStateClasificacionFrm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ConfiguracionFrm".equals(f.getName())) {
            getStateConfiguracionFrm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ControlEmbarqueFrm".equals(f.getName())) {
            getStateControlEmbarqueFrm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("InspeccionFrm".equals(f.getName())) {
            getStateInspeccionFrm(f, h);
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


    protected void getStateClasificacionesFrm(Form f, Hashtable h) {
    }


    protected void getStateProductoFrm(Form f, Hashtable h) {
    }


    protected void getStateInspeccionBusqueda(Form f, Hashtable h) {
    }


    protected void getStateDetalleCajasFrm(Form f, Hashtable h) {
    }


    protected void getStateClasificacionFrm(Form f, Hashtable h) {
    }


    protected void getStateConfiguracionFrm(Form f, Hashtable h) {
    }


    protected void getStateControlEmbarqueFrm(Form f, Hashtable h) {
    }


    protected void getStateInspeccionFrm(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("ClasificacionesFrm".equals(f.getName())) {
            setStateClasificacionesFrm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ProductoFrm".equals(f.getName())) {
            setStateProductoFrm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionBusqueda".equals(f.getName())) {
            setStateInspeccionBusqueda(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("DetalleCajasFrm".equals(f.getName())) {
            setStateDetalleCajasFrm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ClasificacionFrm".equals(f.getName())) {
            setStateClasificacionFrm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ConfiguracionFrm".equals(f.getName())) {
            setStateConfiguracionFrm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarqueFrm".equals(f.getName())) {
            setStateControlEmbarqueFrm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("InspeccionFrm".equals(f.getName())) {
            setStateInspeccionFrm(f, state);
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


    protected void setStateClasificacionesFrm(Form f, Hashtable state) {
    }


    protected void setStateProductoFrm(Form f, Hashtable state) {
    }


    protected void setStateInspeccionBusqueda(Form f, Hashtable state) {
    }


    protected void setStateDetalleCajasFrm(Form f, Hashtable state) {
    }


    protected void setStateClasificacionFrm(Form f, Hashtable state) {
    }


    protected void setStateConfiguracionFrm(Form f, Hashtable state) {
    }


    protected void setStateControlEmbarqueFrm(Form f, Hashtable state) {
    }


    protected void setStateInspeccionFrm(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("detalleCajasC1".equals(listName)) {
            return initListModelDetalleCajasC1(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelDetalleCajasC1(List cmp) {
        return false;
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
        if(rootContainerName.equals("ClasificacionesFrm")) {
            if("TextField".equals(c.getName())) {
                onClasificacionesFrm_TextFieldAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ProductoFrm")) {
            if("marcaP1".equals(c.getName())) {
                onProductoFrm_MarcaP1Action(c, event);
                return;
            }
            if("descripcionPesosP1".equals(c.getName())) {
                onProductoFrm_DescripcionPesosP1Action(c, event);
                return;
            }
            if("presentacionP1".equals(c.getName())) {
                onProductoFrm_PresentacionP1Action(c, event);
                return;
            }
            if("empaqueP1".equals(c.getName())) {
                onProductoFrm_EmpaqueP1Action(c, event);
                return;
            }
            if("tipoProductoP1".equals(c.getName())) {
                onProductoFrm_TipoProductoP1Action(c, event);
                return;
            }
            if("grabarProductoP1".equals(c.getName())) {
                onProductoFrm_GrabarProductoP1Action(c, event);
                return;
            }
            if("agregarClasificacionP1".equals(c.getName())) {
                onProductoFrm_AgregarClasificacionP1Action(c, event);
                return;
            }
            if("quitarElementoP1".equals(c.getName())) {
                onProductoFrm_QuitarElementoP1Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("InspeccionBusqueda")) {
            if("contenedorRad".equals(c.getName())) {
                onInspeccionBusqueda_ContenedorRadAction(c, event);
                return;
            }
            if("clienteRad".equals(c.getName())) {
                onInspeccionBusqueda_ClienteRadAction(c, event);
                return;
            }
            if("valor".equals(c.getName())) {
                onInspeccionBusqueda_ValorAction(c, event);
                return;
            }
            if("buscar".equals(c.getName())) {
                onInspeccionBusqueda_BuscarAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("DetalleCajasFrm")) {
            if("filaDC".equals(c.getName())) {
                onDetalleCajasFrm_FilaDCAction(c, event);
                return;
            }
            if("cantidadDC".equals(c.getName())) {
                onDetalleCajasFrm_CantidadDCAction(c, event);
                return;
            }
            if("grabarDetalleCajasDC".equals(c.getName())) {
                onDetalleCajasFrm_GrabarDetalleCajasDCAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ClasificacionFrm")) {
            if("modeloC1".equals(c.getName())) {
                onClasificacionFrm_ModeloC1Action(c, event);
                return;
            }
            if("grabarClasificacionC1".equals(c.getName())) {
                onClasificacionFrm_GrabarClasificacionC1Action(c, event);
                return;
            }
            if("agregarDetalleCajasC1".equals(c.getName())) {
                onClasificacionFrm_AgregarDetalleCajasC1Action(c, event);
                return;
            }
            if("quitarElementoC1".equals(c.getName())) {
                onClasificacionFrm_QuitarElementoC1Action(c, event);
                return;
            }
            if("detalleCajasC1".equals(c.getName())) {
                onClasificacionFrm_DetalleCajasC1Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ConfiguracionFrm")) {
            if("servidor".equals(c.getName())) {
                onConfiguracionFrm_ServidorAction(c, event);
                return;
            }
            if("puerto".equals(c.getName())) {
                onConfiguracionFrm_PuertoAction(c, event);
                return;
            }
            if("inspector".equals(c.getName())) {
                onConfiguracionFrm_InspectorAction(c, event);
                return;
            }
            if("grabar".equals(c.getName())) {
                onConfiguracionFrm_GrabarAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ControlEmbarqueFrm")) {
            if("oinCE".equals(c.getName())) {
                onControlEmbarqueFrm_OinCEAction(c, event);
                return;
            }
            if("consignatarioCE".equals(c.getName())) {
                onControlEmbarqueFrm_ConsignatarioCEAction(c, event);
                return;
            }
            if("cantidadCajasCE".equals(c.getName())) {
                onControlEmbarqueFrm_CantidadCajasCEAction(c, event);
                return;
            }
            if("selloSGSCE".equals(c.getName())) {
                onControlEmbarqueFrm_SelloSGSCEAction(c, event);
                return;
            }
            if("selloAgenciaCE".equals(c.getName())) {
                onControlEmbarqueFrm_SelloAgenciaCEAction(c, event);
                return;
            }
            if("selloExportadorCE".equals(c.getName())) {
                onControlEmbarqueFrm_SelloExportadorCEAction(c, event);
                return;
            }
            if("selloOtrosCE".equals(c.getName())) {
                onControlEmbarqueFrm_SelloOtrosCEAction(c, event);
                return;
            }
            if("numeoRyanCE".equals(c.getName())) {
                onControlEmbarqueFrm_NumeoRyanCEAction(c, event);
                return;
            }
            if("numeroSelloRyanCE".equals(c.getName())) {
                onControlEmbarqueFrm_NumeroSelloRyanCEAction(c, event);
                return;
            }
            if("embalajeCE".equals(c.getName())) {
                onControlEmbarqueFrm_EmbalajeCEAction(c, event);
                return;
            }
            if("agregarProductoCE".equals(c.getName())) {
                onControlEmbarqueFrm_AgregarProductoCEAction(c, event);
                return;
            }
            if("quitarElementoCE".equals(c.getName())) {
                onControlEmbarqueFrm_QuitarElementoCEAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("InspeccionFrm")) {
            if("contenedorNum".equals(c.getName())) {
                onInspeccionFrm_ContenedorNumAction(c, event);
                return;
            }
            if("tamano".equals(c.getName())) {
                onInspeccionFrm_TamanoAction(c, event);
                return;
            }
            if("chasis".equals(c.getName())) {
                onInspeccionFrm_ChasisAction(c, event);
                return;
            }
            if("trailerPlaca".equals(c.getName())) {
                onInspeccionFrm_TrailerPlacaAction(c, event);
                return;
            }
            if("cliente".equals(c.getName())) {
                onInspeccionFrm_ClienteAction(c, event);
                return;
            }
            if("agencia".equals(c.getName())) {
                onInspeccionFrm_AgenciaAction(c, event);
                return;
            }
            if("vapor".equals(c.getName())) {
                onInspeccionFrm_VaporAction(c, event);
                return;
            }
            if("destino".equals(c.getName())) {
                onInspeccionFrm_DestinoAction(c, event);
                return;
            }
            if("factura".equals(c.getName())) {
                onInspeccionFrm_FacturaAction(c, event);
                return;
            }
            if("puertaIzquierda".equals(c.getName())) {
                onInspeccionFrm_PuertaIzquierdaAction(c, event);
                return;
            }
            if("puertaDerecha".equals(c.getName())) {
                onInspeccionFrm_PuertaDerechaAction(c, event);
                return;
            }
            if("paredFrontalInternaIzquierda".equals(c.getName())) {
                onInspeccionFrm_ParedFrontalInternaIzquierdaAction(c, event);
                return;
            }
            if("paredFrontalInternaDerecha".equals(c.getName())) {
                onInspeccionFrm_ParedFrontalInternaDerechaAction(c, event);
                return;
            }
            if("cables".equals(c.getName())) {
                onInspeccionFrm_CablesAction(c, event);
                return;
            }
            if("flucs".equals(c.getName())) {
                onInspeccionFrm_FlucsAction(c, event);
                return;
            }
            if("ladosExternosIzquierda".equals(c.getName())) {
                onInspeccionFrm_LadosExternosIzquierdaAction(c, event);
                return;
            }
            if("ladosExternosDerecha".equals(c.getName())) {
                onInspeccionFrm_LadosExternosDerechaAction(c, event);
                return;
            }
            if("ladosInternosIzquierda".equals(c.getName())) {
                onInspeccionFrm_LadosInternosIzquierdaAction(c, event);
                return;
            }
            if("ladosInternosDerecha".equals(c.getName())) {
                onInspeccionFrm_LadosInternosDerechaAction(c, event);
                return;
            }
            if("techo".equals(c.getName())) {
                onInspeccionFrm_TechoAction(c, event);
                return;
            }
            if("piso".equals(c.getName())) {
                onInspeccionFrm_PisoAction(c, event);
                return;
            }
            if("estructuraInferior".equals(c.getName())) {
                onInspeccionFrm_EstructuraInferiorAction(c, event);
                return;
            }
            if("estructuraInterna".equals(c.getName())) {
                onInspeccionFrm_EstructuraInternaAction(c, event);
                return;
            }
            if("chasisEstado".equals(c.getName())) {
                onInspeccionFrm_ChasisEstadoAction(c, event);
                return;
            }
            if("observaciones".equals(c.getName())) {
                onInspeccionFrm_ObservacionesAction(c, event);
                return;
            }
            if("grabar".equals(c.getName())) {
                onInspeccionFrm_GrabarAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("BotonInspeccion".equals(c.getName())) {
                onMain_BotonInspeccionAction(c, event);
                return;
            }
            if("BotonControlEmbarque".equals(c.getName())) {
                onMain_BotonControlEmbarqueAction(c, event);
                return;
            }
            if("BotonDatos".equals(c.getName())) {
                onMain_BotonDatosAction(c, event);
                return;
            }
            if("BotonConfiguracion".equals(c.getName())) {
                onMain_BotonConfiguracionAction(c, event);
                return;
            }
        }
    }

      protected void onClasificacionesFrm_TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onProductoFrm_MarcaP1Action(Component c, ActionEvent event) {
      }

      protected void onProductoFrm_DescripcionPesosP1Action(Component c, ActionEvent event) {
      }

      protected void onProductoFrm_PresentacionP1Action(Component c, ActionEvent event) {
      }

      protected void onProductoFrm_EmpaqueP1Action(Component c, ActionEvent event) {
      }

      protected void onProductoFrm_TipoProductoP1Action(Component c, ActionEvent event) {
      }

      protected void onProductoFrm_GrabarProductoP1Action(Component c, ActionEvent event) {
      }

      protected void onProductoFrm_AgregarClasificacionP1Action(Component c, ActionEvent event) {
      }

      protected void onProductoFrm_QuitarElementoP1Action(Component c, ActionEvent event) {
      }

      protected void onInspeccionBusqueda_ContenedorRadAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionBusqueda_ClienteRadAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionBusqueda_ValorAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionBusqueda_BuscarAction(Component c, ActionEvent event) {
      }

      protected void onDetalleCajasFrm_FilaDCAction(Component c, ActionEvent event) {
      }

      protected void onDetalleCajasFrm_CantidadDCAction(Component c, ActionEvent event) {
      }

      protected void onDetalleCajasFrm_GrabarDetalleCajasDCAction(Component c, ActionEvent event) {
      }

      protected void onClasificacionFrm_ModeloC1Action(Component c, ActionEvent event) {
      }

      protected void onClasificacionFrm_GrabarClasificacionC1Action(Component c, ActionEvent event) {
      }

      protected void onClasificacionFrm_AgregarDetalleCajasC1Action(Component c, ActionEvent event) {
      }

      protected void onClasificacionFrm_QuitarElementoC1Action(Component c, ActionEvent event) {
      }

      protected void onClasificacionFrm_DetalleCajasC1Action(Component c, ActionEvent event) {
      }

      protected void onConfiguracionFrm_ServidorAction(Component c, ActionEvent event) {
      }

      protected void onConfiguracionFrm_PuertoAction(Component c, ActionEvent event) {
      }

      protected void onConfiguracionFrm_InspectorAction(Component c, ActionEvent event) {
      }

      protected void onConfiguracionFrm_GrabarAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_OinCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_ConsignatarioCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_CantidadCajasCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_SelloSGSCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_SelloAgenciaCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_SelloExportadorCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_SelloOtrosCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_NumeoRyanCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_NumeroSelloRyanCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_EmbalajeCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_AgregarProductoCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarqueFrm_QuitarElementoCEAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_ContenedorNumAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_TamanoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_ChasisAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_TrailerPlacaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_ClienteAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_AgenciaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_VaporAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_DestinoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_FacturaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_PuertaIzquierdaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_PuertaDerechaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_ParedFrontalInternaIzquierdaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_ParedFrontalInternaDerechaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_CablesAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_FlucsAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_LadosExternosIzquierdaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_LadosExternosDerechaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_LadosInternosIzquierdaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_LadosInternosDerechaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_TechoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_PisoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_EstructuraInferiorAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_EstructuraInternaAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_ChasisEstadoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_ObservacionesAction(Component c, ActionEvent event) {
      }

      protected void onInspeccionFrm_GrabarAction(Component c, ActionEvent event) {
      }

      protected void onMain_BotonInspeccionAction(Component c, ActionEvent event) {
      }

      protected void onMain_BotonControlEmbarqueAction(Component c, ActionEvent event) {
      }

      protected void onMain_BotonDatosAction(Component c, ActionEvent event) {
      }

      protected void onMain_BotonConfiguracionAction(Component c, ActionEvent event) {
      }

}
