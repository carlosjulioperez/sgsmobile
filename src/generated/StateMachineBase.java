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
        UIBuilder.registerCustomComponent("Table", com.codename1.ui.table.Table.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
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
        UIBuilder.registerCustomComponent("Table", com.codename1.ui.table.Table.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
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

    public com.codename1.ui.TextField findDescripcionPesos(Component root) {
        return (com.codename1.ui.TextField)findByName("descripcionPesos", root);
    }

    public com.codename1.ui.TextField findDescripcionPesos() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("descripcionPesos", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("descripcionPesos", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findMarca(Component root) {
        return (com.codename1.ui.TextField)findByName("marca", root);
    }

    public com.codename1.ui.TextField findMarca() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("marca", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("marca", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findTipoProducto(Component root) {
        return (com.codename1.ui.TextField)findByName("tipoProducto", root);
    }

    public com.codename1.ui.TextField findTipoProducto() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("tipoProducto", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("tipoProducto", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findEmpaque(Component root) {
        return (com.codename1.ui.TextField)findByName("empaque", root);
    }

    public com.codename1.ui.TextField findEmpaque() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("empaque", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("empaque", aboutToShowThisContainer);
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

    public com.codename1.ui.TextField findPresentacion(Component root) {
        return (com.codename1.ui.TextField)findByName("presentacion", root);
    }

    public com.codename1.ui.TextField findPresentacion() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("presentacion", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("presentacion", aboutToShowThisContainer);
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

    public com.codename1.ui.Container findListaContenedoresCnt(Component root) {
        return (com.codename1.ui.Container)findByName("listaContenedoresCnt", root);
    }

    public com.codename1.ui.Container findListaContenedoresCnt() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("listaContenedoresCnt", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("listaContenedoresCnt", aboutToShowThisContainer);
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
        if("ControlEmbarque1".equals(f.getName())) {
            exitControlEmbarque1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarque2".equals(f.getName())) {
            exitControlEmbarque2(f);
            aboutToShowThisContainer = null;
            return;
        }

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

        if("Producto1".equals(f.getName())) {
            exitProducto1(f);
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


    protected void exitControlEmbarque1(Form f) {
    }


    protected void exitControlEmbarque2(Form f) {
    }


    protected void exitConfiguracion(Form f) {
    }


    protected void exitInspeccion(Form f) {
    }


    protected void exitProducto1(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("ControlEmbarque1".equals(f.getName())) {
            beforeControlEmbarque1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarque2".equals(f.getName())) {
            beforeControlEmbarque2(f);
            aboutToShowThisContainer = null;
            return;
        }

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

        if("Producto1".equals(f.getName())) {
            beforeProducto1(f);
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


    protected void beforeControlEmbarque1(Form f) {
    }


    protected void beforeControlEmbarque2(Form f) {
    }


    protected void beforeConfiguracion(Form f) {
    }


    protected void beforeInspeccion(Form f) {
    }


    protected void beforeProducto1(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("ControlEmbarque1".equals(c.getName())) {
            beforeContainerControlEmbarque1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarque2".equals(c.getName())) {
            beforeContainerControlEmbarque2(c);
            aboutToShowThisContainer = null;
            return;
        }

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

        if("Producto1".equals(c.getName())) {
            beforeContainerProducto1(c);
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


    protected void beforeContainerControlEmbarque1(Container c) {
    }


    protected void beforeContainerControlEmbarque2(Container c) {
    }


    protected void beforeContainerConfiguracion(Container c) {
    }


    protected void beforeContainerInspeccion(Container c) {
    }


    protected void beforeContainerProducto1(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("ControlEmbarque1".equals(f.getName())) {
            postControlEmbarque1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarque2".equals(f.getName())) {
            postControlEmbarque2(f);
            aboutToShowThisContainer = null;
            return;
        }

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

        if("Producto1".equals(f.getName())) {
            postProducto1(f);
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


    protected void postControlEmbarque1(Form f) {
    }


    protected void postControlEmbarque2(Form f) {
    }


    protected void postConfiguracion(Form f) {
    }


    protected void postInspeccion(Form f) {
    }


    protected void postProducto1(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("ControlEmbarque1".equals(c.getName())) {
            postContainerControlEmbarque1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarque2".equals(c.getName())) {
            postContainerControlEmbarque2(c);
            aboutToShowThisContainer = null;
            return;
        }

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

        if("Producto1".equals(c.getName())) {
            postContainerProducto1(c);
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


    protected void postContainerControlEmbarque1(Container c) {
    }


    protected void postContainerControlEmbarque2(Container c) {
    }


    protected void postContainerConfiguracion(Container c) {
    }


    protected void postContainerInspeccion(Container c) {
    }


    protected void postContainerProducto1(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("ControlEmbarque1".equals(rootName)) {
            onCreateControlEmbarque1();
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarque2".equals(rootName)) {
            onCreateControlEmbarque2();
            aboutToShowThisContainer = null;
            return;
        }

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

        if("Producto1".equals(rootName)) {
            onCreateProducto1();
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


    protected void onCreateControlEmbarque1() {
    }


    protected void onCreateControlEmbarque2() {
    }


    protected void onCreateConfiguracion() {
    }


    protected void onCreateInspeccion() {
    }


    protected void onCreateProducto1() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("ControlEmbarque1".equals(f.getName())) {
            getStateControlEmbarque1(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ControlEmbarque2".equals(f.getName())) {
            getStateControlEmbarque2(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

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

        if("Producto1".equals(f.getName())) {
            getStateProducto1(f, h);
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


    protected void getStateControlEmbarque1(Form f, Hashtable h) {
    }


    protected void getStateControlEmbarque2(Form f, Hashtable h) {
    }


    protected void getStateConfiguracion(Form f, Hashtable h) {
    }


    protected void getStateInspeccion(Form f, Hashtable h) {
    }


    protected void getStateProducto1(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("ControlEmbarque1".equals(f.getName())) {
            setStateControlEmbarque1(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ControlEmbarque2".equals(f.getName())) {
            setStateControlEmbarque2(f, state);
            aboutToShowThisContainer = null;
            return;
        }

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

        if("Producto1".equals(f.getName())) {
            setStateProducto1(f, state);
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


    protected void setStateControlEmbarque1(Form f, Hashtable state) {
    }


    protected void setStateControlEmbarque2(Form f, Hashtable state) {
    }


    protected void setStateConfiguracion(Form f, Hashtable state) {
    }


    protected void setStateInspeccion(Form f, Hashtable state) {
    }


    protected void setStateProducto1(Form f, Hashtable state) {
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
        if(rootContainerName.equals("ControlEmbarque1")) {
            if("contenedorRad".equals(c.getName())) {
                onControlEmbarque1_ContenedorRadAction(c, event);
                return;
            }
            if("clienteRad".equals(c.getName())) {
                onControlEmbarque1_ClienteRadAction(c, event);
                return;
            }
            if("valor".equals(c.getName())) {
                onControlEmbarque1_ValorAction(c, event);
                return;
            }
            if("buscar".equals(c.getName())) {
                onControlEmbarque1_BuscarAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ControlEmbarque2")) {
            if("oinCE".equals(c.getName())) {
                onControlEmbarque2_OinCEAction(c, event);
                return;
            }
            if("consignatarioCE".equals(c.getName())) {
                onControlEmbarque2_ConsignatarioCEAction(c, event);
                return;
            }
            if("cantidadCajasCE".equals(c.getName())) {
                onControlEmbarque2_CantidadCajasCEAction(c, event);
                return;
            }
            if("selloSGSCE".equals(c.getName())) {
                onControlEmbarque2_SelloSGSCEAction(c, event);
                return;
            }
            if("selloAgenciaCE".equals(c.getName())) {
                onControlEmbarque2_SelloAgenciaCEAction(c, event);
                return;
            }
            if("selloExportadorCE".equals(c.getName())) {
                onControlEmbarque2_SelloExportadorCEAction(c, event);
                return;
            }
            if("selloOtrosCE".equals(c.getName())) {
                onControlEmbarque2_SelloOtrosCEAction(c, event);
                return;
            }
            if("numeoRyanCE".equals(c.getName())) {
                onControlEmbarque2_NumeoRyanCEAction(c, event);
                return;
            }
            if("numeroSelloRyanCE".equals(c.getName())) {
                onControlEmbarque2_NumeroSelloRyanCEAction(c, event);
                return;
            }
            if("embalajeCE".equals(c.getName())) {
                onControlEmbarque2_EmbalajeCEAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onControlEmbarque2_ButtonAction(c, event);
                return;
            }
        }
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
            if("contenedorNum".equals(c.getName())) {
                onInspeccion_ContenedorNumAction(c, event);
                return;
            }
            if("tamano".equals(c.getName())) {
                onInspeccion_TamanoAction(c, event);
                return;
            }
            if("chasis".equals(c.getName())) {
                onInspeccion_ChasisAction(c, event);
                return;
            }
            if("trailerPlaca".equals(c.getName())) {
                onInspeccion_TrailerPlacaAction(c, event);
                return;
            }
            if("cliente".equals(c.getName())) {
                onInspeccion_ClienteAction(c, event);
                return;
            }
            if("agencia".equals(c.getName())) {
                onInspeccion_AgenciaAction(c, event);
                return;
            }
            if("vapor".equals(c.getName())) {
                onInspeccion_VaporAction(c, event);
                return;
            }
            if("destino".equals(c.getName())) {
                onInspeccion_DestinoAction(c, event);
                return;
            }
            if("factura".equals(c.getName())) {
                onInspeccion_FacturaAction(c, event);
                return;
            }
            if("puertaIzquierda".equals(c.getName())) {
                onInspeccion_PuertaIzquierdaAction(c, event);
                return;
            }
            if("puertaDerecha".equals(c.getName())) {
                onInspeccion_PuertaDerechaAction(c, event);
                return;
            }
            if("paredFrontalInternaIzquierda".equals(c.getName())) {
                onInspeccion_ParedFrontalInternaIzquierdaAction(c, event);
                return;
            }
            if("paredFrontalInternaDerecha".equals(c.getName())) {
                onInspeccion_ParedFrontalInternaDerechaAction(c, event);
                return;
            }
            if("cables".equals(c.getName())) {
                onInspeccion_CablesAction(c, event);
                return;
            }
            if("flucs".equals(c.getName())) {
                onInspeccion_FlucsAction(c, event);
                return;
            }
            if("ladosExternosIzquierda".equals(c.getName())) {
                onInspeccion_LadosExternosIzquierdaAction(c, event);
                return;
            }
            if("ladosExternosDerecha".equals(c.getName())) {
                onInspeccion_LadosExternosDerechaAction(c, event);
                return;
            }
            if("ladosInternosIzquierda".equals(c.getName())) {
                onInspeccion_LadosInternosIzquierdaAction(c, event);
                return;
            }
            if("ladosInternosDerecha".equals(c.getName())) {
                onInspeccion_LadosInternosDerechaAction(c, event);
                return;
            }
            if("techo".equals(c.getName())) {
                onInspeccion_TechoAction(c, event);
                return;
            }
            if("piso".equals(c.getName())) {
                onInspeccion_PisoAction(c, event);
                return;
            }
            if("estructuraInferior".equals(c.getName())) {
                onInspeccion_EstructuraInferiorAction(c, event);
                return;
            }
            if("estructuraInterna".equals(c.getName())) {
                onInspeccion_EstructuraInternaAction(c, event);
                return;
            }
            if("chasisEstado".equals(c.getName())) {
                onInspeccion_ChasisEstadoAction(c, event);
                return;
            }
            if("observaciones".equals(c.getName())) {
                onInspeccion_ObservacionesAction(c, event);
                return;
            }
            if("grabar".equals(c.getName())) {
                onInspeccion_GrabarAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Producto1")) {
            if("marca".equals(c.getName())) {
                onProducto1_MarcaAction(c, event);
                return;
            }
            if("descripcionPesos".equals(c.getName())) {
                onProducto1_DescripcionPesosAction(c, event);
                return;
            }
            if("presentacion".equals(c.getName())) {
                onProducto1_PresentacionAction(c, event);
                return;
            }
            if("empaque".equals(c.getName())) {
                onProducto1_EmpaqueAction(c, event);
                return;
            }
            if("tipoProducto".equals(c.getName())) {
                onProducto1_TipoProductoAction(c, event);
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

      protected void onControlEmbarque1_ContenedorRadAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque1_ClienteRadAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque1_ValorAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque1_BuscarAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_OinCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_ConsignatarioCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_CantidadCajasCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_SelloSGSCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_SelloAgenciaCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_SelloExportadorCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_SelloOtrosCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_NumeoRyanCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_NumeroSelloRyanCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_EmbalajeCEAction(Component c, ActionEvent event) {
      }

      protected void onControlEmbarque2_ButtonAction(Component c, ActionEvent event) {
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

      protected void onInspeccion_ChasisEstadoAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_ObservacionesAction(Component c, ActionEvent event) {
      }

      protected void onInspeccion_GrabarAction(Component c, ActionEvent event) {
      }

      protected void onProducto1_MarcaAction(Component c, ActionEvent event) {
      }

      protected void onProducto1_DescripcionPesosAction(Component c, ActionEvent event) {
      }

      protected void onProducto1_PresentacionAction(Component c, ActionEvent event) {
      }

      protected void onProducto1_EmpaqueAction(Component c, ActionEvent event) {
      }

      protected void onProducto1_TipoProductoAction(Component c, ActionEvent event) {
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
