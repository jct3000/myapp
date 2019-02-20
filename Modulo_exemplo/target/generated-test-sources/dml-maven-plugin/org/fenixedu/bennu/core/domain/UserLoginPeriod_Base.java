package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class UserLoginPeriod_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserLoginPeriod,org.fenixedu.bennu.core.domain.User> role$$user = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserLoginPeriod,org.fenixedu.bennu.core.domain.User>() {
        public org.fenixedu.bennu.core.domain.User getValue(org.fenixedu.bennu.core.domain.UserLoginPeriod o1) {
            return ((UserLoginPeriod_Base)o1).user.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.UserLoginPeriod o1, org.fenixedu.bennu.core.domain.User o2) {
            ((UserLoginPeriod_Base)o1).user.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$loginValidity;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> getRelationUserLoginPeriods() {
        return org.fenixedu.bennu.core.domain.User.getRelationUserLoginPeriods();
    }
    
    // Slots
    private OwnedVBox<org.joda.time.LocalDate> beginDate;
    private OwnedVBox<org.joda.time.LocalDate> endDate;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.core.domain.User> user;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        beginDate = OwnedVBox.makeNew(this, "beginDate", allocateOnly, false);
        if (!allocateOnly) this.beginDate.put(null);
        endDate = OwnedVBox.makeNew(this, "endDate", allocateOnly, false);
        if (!allocateOnly) this.endDate.put(null);
        user = OwnedVBox.makeNew(this, "user", allocateOnly, true);
        if (!allocateOnly) this.user.put(null);
        
    }
    
    // Constructors
    protected  UserLoginPeriod_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected org.joda.time.LocalDate getBeginDate() {
        return this.beginDate.get();
    }
    
    protected void setBeginDate(org.joda.time.LocalDate beginDate) {
        this.beginDate.put(beginDate);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected org.joda.time.LocalDate getEndDate() {
        return this.endDate.get();
    }
    
    protected void setEndDate(org.joda.time.LocalDate endDate) {
        this.endDate.put(endDate);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.User getUser() {
        return this.user.get();
    }
    
    protected void setUser(org.fenixedu.bennu.core.domain.User user) {
        getRelationUserLoginPeriods().add(user, (org.fenixedu.bennu.core.domain.UserLoginPeriod)this);
    }
    
    
}
