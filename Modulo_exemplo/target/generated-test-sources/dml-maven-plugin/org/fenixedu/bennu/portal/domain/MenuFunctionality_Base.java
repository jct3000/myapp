package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class MenuFunctionality_Base extends org.fenixedu.bennu.portal.domain.MenuItem {
    // Static Slots
    
    // Slots
    private OwnedVBox<java.lang.String> itemKey;
    private OwnedVBox<java.lang.String> provider;
    private OwnedVBox<java.lang.String> documentationUrl;
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        itemKey = OwnedVBox.makeNew(this, "itemKey", allocateOnly, false);
        if (!allocateOnly) this.itemKey.put(null);
        provider = OwnedVBox.makeNew(this, "provider", allocateOnly, false);
        if (!allocateOnly) this.provider.put(null);
        documentationUrl = OwnedVBox.makeNew(this, "documentationUrl", allocateOnly, false);
        if (!allocateOnly) this.documentationUrl.put(null);
        
    }
    
    // Constructors
    protected  MenuFunctionality_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getItemKey() {
        return this.itemKey.get();
    }
    
    protected void setItemKey(java.lang.String itemKey) {
        this.itemKey.put(itemKey);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getProvider() {
        return this.provider.get();
    }
    
    protected void setProvider(java.lang.String provider) {
        this.provider.put(provider);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getDocumentationUrl() {
        return this.documentationUrl.get();
    }
    
    public void setDocumentationUrl(java.lang.String documentationUrl) {
        this.documentationUrl.put(documentationUrl);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    
}
