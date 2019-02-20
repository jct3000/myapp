package pt.ist.fenixframework.backend;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;
@SuppressWarnings("all")
public class CurrentBackEndId extends BackEndId {
    
    {
        setParam("ptIstTxIntrospectorEnable", "true");
    }
    
    public String getBackEndName() {
        return "jvstm";
    }
    
    public Class<? extends pt.ist.fenixframework.Config> getDefaultConfigClass() {
        try {
            return (Class<? extends pt.ist.fenixframework.Config>)Class.forName("pt.ist.fenixframework.backend.jvstm.JVSTMConfig");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public Class<? extends pt.ist.fenixframework.core.AbstractDomainObject> getDomainClassRoot() {
        return pt.ist.fenixframework.backend.jvstm.InMemDomainObject.class;
    }
    
    public String getAppName() {
        return "Modulo_exemplo";
    }
    
}
