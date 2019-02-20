package pt.ist.fenixframework;

import com.google.gson.JsonObject;
import pt.ist.fenixframework.util.JsonConverter;

@SuppressWarnings("all")
public final class ValueTypeSerializer {
    
    // VT: Locale serializes as java.lang.String
    public static final java.lang.String serialize$Locale(java.util.Locale obj) {
        return (obj == null) ? null : (java.lang.String)obj.toLanguageTag();
    }
    public static final java.util.Locale deSerialize$Locale(java.lang.String obj) {
        return (obj == null) ? null : (java.util.Locale)java.util.Locale.forLanguageTag(obj);
    }
    
    // VT: BackingArrays serializes as java.io.Serializable
    public static final java.io.Serializable serialize$BackingArrays(pt.ist.fenixframework.adt.bplustree.DoubleArray obj) {
        return (obj == null) ? null : (java.io.Serializable)pt.ist.fenixframework.adt.bplustree.AbstractNodeArray.externalizeArrays(obj);
    }
    public static final pt.ist.fenixframework.adt.bplustree.DoubleArray deSerialize$BackingArrays(java.io.Serializable obj) {
        return (obj == null) ? null : (pt.ist.fenixframework.adt.bplustree.DoubleArray)pt.ist.fenixframework.adt.bplustree.AbstractNodeArray.internalizeArrays(obj);
    }
    
    // VT: GroupStrategyValueType serializes as java.lang.String
    public static final java.lang.String serialize$GroupStrategyValueType(org.fenixedu.bennu.core.groups.GroupStrategy obj) {
        return (obj == null) ? null : (java.lang.String)obj.externalize();
    }
    public static final org.fenixedu.bennu.core.groups.GroupStrategy deSerialize$GroupStrategyValueType(java.lang.String obj) {
        return (obj == null) ? null : (org.fenixedu.bennu.core.groups.GroupStrategy)org.fenixedu.bennu.core.groups.GroupStrategy.strategyForType(obj);
    }
    
    // VT: DomainObjectMap serializes as java.lang.String
    public static final java.lang.String serialize$DomainObjectMap(java.util.TreeMap obj) {
        return (obj == null) ? null : (java.lang.String)pt.ist.fenixframework.adt.bplustree.DomainLeafNode.externalizeDomainObjectMap(obj);
    }
    public static final java.util.TreeMap deSerialize$DomainObjectMap(java.lang.String obj) {
        return (obj == null) ? null : (java.util.TreeMap)pt.ist.fenixframework.adt.bplustree.DomainLeafNode.internalizeDomainObjectMap(obj);
    }
    
    // VT: LocalizedString serializes as com.google.gson.JsonElement
    public static final com.google.gson.JsonElement serialize$LocalizedString(org.fenixedu.commons.i18n.LocalizedString obj) {
        return (obj == null) ? null : (com.google.gson.JsonElement)obj.json();
    }
    public static final org.fenixedu.commons.i18n.LocalizedString deSerialize$LocalizedString(com.google.gson.JsonElement obj) {
        return (obj == null) ? null : (org.fenixedu.commons.i18n.LocalizedString)org.fenixedu.commons.i18n.LocalizedString.fromJson(obj);
    }
    
    // VT: NashornStrategy serializes as com.google.gson.JsonElement
    public static final com.google.gson.JsonElement serialize$NashornStrategy(org.fenixedu.bennu.core.domain.NashornStrategy obj) {
        if (obj == null) return null;
        JsonObject json = new JsonObject();
        json.add("type", JsonConverter.getJsonFor(serialize$Class((java.lang.Class)obj.getType())));
        json.add("code", JsonConverter.getJsonFor((java.lang.String)obj.getCode()));
        return json;
    }
    public static final org.fenixedu.bennu.core.domain.NashornStrategy deSerialize$NashornStrategy(com.google.gson.JsonElement obj) {
        return (obj == null) ? null : (org.fenixedu.bennu.core.domain.NashornStrategy)new org.fenixedu.bennu.core.domain.NashornStrategy(
        deSerialize$Class(JsonConverter.getStringFromJson(obj.getAsJsonObject().get("type"))),
        JsonConverter.getStringFromJson(obj.getAsJsonObject().get("code")));
    }
    
    // VT: PredicateMethod serializes as java.lang.String
    public static final java.lang.String serialize$PredicateMethod(java.lang.reflect.Method obj) {
        return (obj == null) ? null : (java.lang.String)obj.toString();
    }
    public static final java.lang.reflect.Method deSerialize$PredicateMethod(java.lang.String obj) {
        return (obj == null) ? null : (java.lang.reflect.Method)pt.ist.fenixframework.consistencyPredicates.Externalization.internalizePredicateMethod(obj);
    }
    
    // VT: GenericTreeMap serializes as java.io.Serializable
    public static final java.io.Serializable serialize$GenericTreeMap(java.util.TreeMap obj) {
        return (obj == null) ? null : (java.io.Serializable)pt.ist.fenixframework.adt.bplustree.AbstractNode.externalizeTreeMap(obj);
    }
    public static final java.util.TreeMap deSerialize$GenericTreeMap(java.io.Serializable obj) {
        return (obj == null) ? null : (java.util.TreeMap)pt.ist.fenixframework.adt.bplustree.AbstractNode.internalizeTreeMap(obj);
    }
    
    // VT: NodeKeyVal serializes as java.io.Serializable
    public static final java.io.Serializable serialize$NodeKeyVal(pt.ist.fenixframework.adt.linkedlist.KeyValue obj) {
        return (obj == null) ? null : (java.io.Serializable)pt.ist.fenixframework.adt.linkedlist.KeyValue.externalizeKeyValue(obj);
    }
    public static final pt.ist.fenixframework.adt.linkedlist.KeyValue deSerialize$NodeKeyVal(java.io.Serializable obj) {
        return (obj == null) ? null : (pt.ist.fenixframework.adt.linkedlist.KeyValue)pt.ist.fenixframework.adt.linkedlist.KeyValue.internalizeKeyValue(obj);
    }
    
    // VT: CounterStats serializes as java.lang.String
    public static final java.lang.String serialize$CounterStats(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats obj) {
        return (obj == null) ? null : (java.lang.String)obj.externalizeInOneElement();
    }
    public static final pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats deSerialize$CounterStats(java.lang.String obj) {
        return (obj == null) ? null : (pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats)new pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats(obj);
    }
    
    // VT: ModuleData serializes as com.google.gson.JsonElement
    public static final com.google.gson.JsonElement serialize$ModuleData(pt.ist.fenixframework.data.ModuleData obj) {
        return (obj == null) ? null : (com.google.gson.JsonElement)obj.json();
    }
    public static final pt.ist.fenixframework.data.ModuleData deSerialize$ModuleData(com.google.gson.JsonElement obj) {
        return (obj == null) ? null : (pt.ist.fenixframework.data.ModuleData)new pt.ist.fenixframework.data.ModuleData(obj);
    }
    
    // VT: Class serializes as java.lang.String
    public static final java.lang.String serialize$Class(java.lang.Class obj) {
        return (obj == null) ? null : (java.lang.String)obj.getName();
    }
    public static final java.lang.Class deSerialize$Class(java.lang.String obj) {
        return (obj == null) ? null : (java.lang.Class)org.fenixedu.bennu.core.util.ClassInternalizer.internalize(obj);
    }
    
    // VT: OidIndexedMap serializes as java.lang.String
    public static final java.lang.String serialize$OidIndexedMap(java.util.TreeMap obj) {
        return (obj == null) ? null : (java.lang.String)pt.ist.fenixframework.adt.bplustree.DomainInnerNode.externalizeOidIndexedMap(obj);
    }
    public static final java.util.TreeMap deSerialize$OidIndexedMap(java.lang.String obj) {
        return (obj == null) ? null : (java.util.TreeMap)pt.ist.fenixframework.adt.bplustree.DomainInnerNode.internalizeOidIndexedMap(obj);
    }
    
}
