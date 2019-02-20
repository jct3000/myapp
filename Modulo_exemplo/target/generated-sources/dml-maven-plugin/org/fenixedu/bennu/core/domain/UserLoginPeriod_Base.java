package org.fenixedu.bennu.core.domain;


@SuppressWarnings("all")
public abstract class UserLoginPeriod_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> getRelationUserLoginPeriods() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  UserLoginPeriod_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected org.joda.time.LocalDate getBeginDate() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setBeginDate(org.joda.time.LocalDate beginDate) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.joda.time.LocalDate getEndDate() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setEndDate(org.joda.time.LocalDate endDate) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.User getUser() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setUser(org.fenixedu.bennu.core.domain.User user) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
