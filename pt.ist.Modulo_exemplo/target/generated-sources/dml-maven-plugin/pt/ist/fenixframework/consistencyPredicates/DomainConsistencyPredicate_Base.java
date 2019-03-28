package pt.ist.fenixframework.consistencyPredicates;


@SuppressWarnings("all")
public abstract class DomainConsistencyPredicate_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getRelationDomainConsistencyPredicateInconsistentDependenceRecords() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getRelationDomainMetaClassDeclaredConsistencyPredicates() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getRelationDomainConsistencyPredicateDomainDependenceRecords() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  DomainConsistencyPredicate_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.reflect.Method getPredicate() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setPredicate(java.lang.reflect.Method predicate) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.Boolean getInitialized() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setInitialized(java.lang.Boolean initialized) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public void addInconsistentDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord inconsistentDependenceRecord) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeInconsistentDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord inconsistentDependenceRecord) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getInconsistentDependenceRecordSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.fenixframework.DomainMetaClass getDomainMetaClass() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDomainMetaClass(pt.ist.fenixframework.DomainMetaClass domainMetaClass) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void addDomainDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord domainDependenceRecord) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeDomainDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord domainDependenceRecord) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getDomainDependenceRecordSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
