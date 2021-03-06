package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_devlomi_fireapp_model_realms_GroupRealmProxy extends com.devlomi.fireapp.model.realms.Group
    implements RealmObjectProxy, com_devlomi_fireapp_model_realms_GroupRealmProxyInterface {

    static final class GroupColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long groupIdIndex;
        long isActiveIndex;
        long createdByNumberIndex;
        long timestampIndex;
        long usersIndex;
        long adminsUidsIndex;
        long onlyAdminsCanPostIndex;
        long currentGroupLinkIndex;

        GroupColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Group");
            this.groupIdIndex = addColumnDetails("groupId", "groupId", objectSchemaInfo);
            this.isActiveIndex = addColumnDetails("isActive", "isActive", objectSchemaInfo);
            this.createdByNumberIndex = addColumnDetails("createdByNumber", "createdByNumber", objectSchemaInfo);
            this.timestampIndex = addColumnDetails("timestamp", "timestamp", objectSchemaInfo);
            this.usersIndex = addColumnDetails("users", "users", objectSchemaInfo);
            this.adminsUidsIndex = addColumnDetails("adminsUids", "adminsUids", objectSchemaInfo);
            this.onlyAdminsCanPostIndex = addColumnDetails("onlyAdminsCanPost", "onlyAdminsCanPost", objectSchemaInfo);
            this.currentGroupLinkIndex = addColumnDetails("currentGroupLink", "currentGroupLink", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        GroupColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GroupColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GroupColumnInfo src = (GroupColumnInfo) rawSrc;
            final GroupColumnInfo dst = (GroupColumnInfo) rawDst;
            dst.groupIdIndex = src.groupIdIndex;
            dst.isActiveIndex = src.isActiveIndex;
            dst.createdByNumberIndex = src.createdByNumberIndex;
            dst.timestampIndex = src.timestampIndex;
            dst.usersIndex = src.usersIndex;
            dst.adminsUidsIndex = src.adminsUidsIndex;
            dst.onlyAdminsCanPostIndex = src.onlyAdminsCanPostIndex;
            dst.currentGroupLinkIndex = src.currentGroupLinkIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GroupColumnInfo columnInfo;
    private ProxyState<com.devlomi.fireapp.model.realms.Group> proxyState;
    private RealmList<com.devlomi.fireapp.model.realms.User> usersRealmList;
    private RealmList<String> adminsUidsRealmList;

    com_devlomi_fireapp_model_realms_GroupRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GroupColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.devlomi.fireapp.model.realms.Group>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$groupId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.groupIdIndex);
    }

    @Override
    public void realmSet$groupId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'groupId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isActive() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isActiveIndex);
    }

    @Override
    public void realmSet$isActive(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isActiveIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isActiveIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$createdByNumber() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.createdByNumberIndex);
    }

    @Override
    public void realmSet$createdByNumber(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.createdByNumberIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.createdByNumberIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.createdByNumberIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.createdByNumberIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timestamp() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timestampIndex);
    }

    @Override
    public void realmSet$timestamp(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timestampIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timestampIndex, value);
    }

    @Override
    public RealmList<com.devlomi.fireapp.model.realms.User> realmGet$users() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (usersRealmList != null) {
            return usersRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.usersIndex);
            usersRealmList = new RealmList<com.devlomi.fireapp.model.realms.User>(com.devlomi.fireapp.model.realms.User.class, osList, proxyState.getRealm$realm());
            return usersRealmList;
        }
    }

    @Override
    public void realmSet$users(RealmList<com.devlomi.fireapp.model.realms.User> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("users")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.devlomi.fireapp.model.realms.User> original = value;
                value = new RealmList<com.devlomi.fireapp.model.realms.User>();
                for (com.devlomi.fireapp.model.realms.User item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.usersIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.devlomi.fireapp.model.realms.User linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.devlomi.fireapp.model.realms.User linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    public RealmList<String> realmGet$adminsUids() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (adminsUidsRealmList != null) {
            return adminsUidsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.adminsUidsIndex, RealmFieldType.STRING_LIST);
            adminsUidsRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return adminsUidsRealmList;
        }
    }

    @Override
    public void realmSet$adminsUids(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("adminsUids")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.adminsUidsIndex, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$onlyAdminsCanPost() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.onlyAdminsCanPostIndex);
    }

    @Override
    public void realmSet$onlyAdminsCanPost(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.onlyAdminsCanPostIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.onlyAdminsCanPostIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$currentGroupLink() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.currentGroupLinkIndex);
    }

    @Override
    public void realmSet$currentGroupLink(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.currentGroupLinkIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.currentGroupLinkIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.currentGroupLinkIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.currentGroupLinkIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Group", 8, 0);
        builder.addPersistedProperty("groupId", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isActive", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("createdByNumber", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timestamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("users", RealmFieldType.LIST, "User");
        builder.addPersistedValueListProperty("adminsUids", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        builder.addPersistedProperty("onlyAdminsCanPost", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("currentGroupLink", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GroupColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GroupColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Group";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Group";
    }

    @SuppressWarnings("cast")
    public static com.devlomi.fireapp.model.realms.Group createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.devlomi.fireapp.model.realms.Group obj = null;
        if (update) {
            Table table = realm.getTable(com.devlomi.fireapp.model.realms.Group.class);
            GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Group.class);
            long pkColumnIndex = columnInfo.groupIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("groupId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("groupId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Group.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_devlomi_fireapp_model_realms_GroupRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("users")) {
                excludeFields.add("users");
            }
            if (json.has("adminsUids")) {
                excludeFields.add("adminsUids");
            }
            if (json.has("groupId")) {
                if (json.isNull("groupId")) {
                    obj = (io.realm.com_devlomi_fireapp_model_realms_GroupRealmProxy) realm.createObjectInternal(com.devlomi.fireapp.model.realms.Group.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_devlomi_fireapp_model_realms_GroupRealmProxy) realm.createObjectInternal(com.devlomi.fireapp.model.realms.Group.class, json.getString("groupId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'groupId'.");
            }
        }

        final com_devlomi_fireapp_model_realms_GroupRealmProxyInterface objProxy = (com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) obj;
        if (json.has("isActive")) {
            if (json.isNull("isActive")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isActive' to null.");
            } else {
                objProxy.realmSet$isActive((boolean) json.getBoolean("isActive"));
            }
        }
        if (json.has("createdByNumber")) {
            if (json.isNull("createdByNumber")) {
                objProxy.realmSet$createdByNumber(null);
            } else {
                objProxy.realmSet$createdByNumber((String) json.getString("createdByNumber"));
            }
        }
        if (json.has("timestamp")) {
            if (json.isNull("timestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
            } else {
                objProxy.realmSet$timestamp((long) json.getLong("timestamp"));
            }
        }
        if (json.has("users")) {
            if (json.isNull("users")) {
                objProxy.realmSet$users(null);
            } else {
                objProxy.realmGet$users().clear();
                JSONArray array = json.getJSONArray("users");
                for (int i = 0; i < array.length(); i++) {
                    com.devlomi.fireapp.model.realms.User item = com_devlomi_fireapp_model_realms_UserRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$users().add(item);
                }
            }
        }
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$adminsUids(), json, "adminsUids");
        if (json.has("onlyAdminsCanPost")) {
            if (json.isNull("onlyAdminsCanPost")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'onlyAdminsCanPost' to null.");
            } else {
                objProxy.realmSet$onlyAdminsCanPost((boolean) json.getBoolean("onlyAdminsCanPost"));
            }
        }
        if (json.has("currentGroupLink")) {
            if (json.isNull("currentGroupLink")) {
                objProxy.realmSet$currentGroupLink(null);
            } else {
                objProxy.realmSet$currentGroupLink((String) json.getString("currentGroupLink"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.devlomi.fireapp.model.realms.Group createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.devlomi.fireapp.model.realms.Group obj = new com.devlomi.fireapp.model.realms.Group();
        final com_devlomi_fireapp_model_realms_GroupRealmProxyInterface objProxy = (com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("groupId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$groupId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$groupId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("isActive")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isActive((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isActive' to null.");
                }
            } else if (name.equals("createdByNumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$createdByNumber((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$createdByNumber(null);
                }
            } else if (name.equals("timestamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timestamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
                }
            } else if (name.equals("users")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$users(null);
                } else {
                    objProxy.realmSet$users(new RealmList<com.devlomi.fireapp.model.realms.User>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.devlomi.fireapp.model.realms.User item = com_devlomi_fireapp_model_realms_UserRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$users().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("adminsUids")) {
                objProxy.realmSet$adminsUids(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
            } else if (name.equals("onlyAdminsCanPost")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$onlyAdminsCanPost((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'onlyAdminsCanPost' to null.");
                }
            } else if (name.equals("currentGroupLink")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$currentGroupLink((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$currentGroupLink(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'groupId'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_devlomi_fireapp_model_realms_GroupRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Group.class), false, Collections.<String>emptyList());
        io.realm.com_devlomi_fireapp_model_realms_GroupRealmProxy obj = new io.realm.com_devlomi_fireapp_model_realms_GroupRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.devlomi.fireapp.model.realms.Group copyOrUpdate(Realm realm, GroupColumnInfo columnInfo, com.devlomi.fireapp.model.realms.Group object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.devlomi.fireapp.model.realms.Group) cachedRealmObject;
        }

        com.devlomi.fireapp.model.realms.Group realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.devlomi.fireapp.model.realms.Group.class);
            long pkColumnIndex = columnInfo.groupIdIndex;
            String value = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$groupId();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_devlomi_fireapp_model_realms_GroupRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.devlomi.fireapp.model.realms.Group copy(Realm realm, GroupColumnInfo columnInfo, com.devlomi.fireapp.model.realms.Group newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.devlomi.fireapp.model.realms.Group) cachedRealmObject;
        }

        com_devlomi_fireapp_model_realms_GroupRealmProxyInterface realmObjectSource = (com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) newObject;

        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Group.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.groupIdIndex, realmObjectSource.realmGet$groupId());
        builder.addBoolean(columnInfo.isActiveIndex, realmObjectSource.realmGet$isActive());
        builder.addString(columnInfo.createdByNumberIndex, realmObjectSource.realmGet$createdByNumber());
        builder.addInteger(columnInfo.timestampIndex, realmObjectSource.realmGet$timestamp());
        builder.addStringList(columnInfo.adminsUidsIndex, realmObjectSource.realmGet$adminsUids());
        builder.addBoolean(columnInfo.onlyAdminsCanPostIndex, realmObjectSource.realmGet$onlyAdminsCanPost());
        builder.addString(columnInfo.currentGroupLinkIndex, realmObjectSource.realmGet$currentGroupLink());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_devlomi_fireapp_model_realms_GroupRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.devlomi.fireapp.model.realms.User> usersList = realmObjectSource.realmGet$users();
        if (usersList != null) {
            RealmList<com.devlomi.fireapp.model.realms.User> usersRealmList = realmObjectCopy.realmGet$users();
            usersRealmList.clear();
            for (int i = 0; i < usersList.size(); i++) {
                com.devlomi.fireapp.model.realms.User usersItem = usersList.get(i);
                com.devlomi.fireapp.model.realms.User cacheusers = (com.devlomi.fireapp.model.realms.User) cache.get(usersItem);
                if (cacheusers != null) {
                    usersRealmList.add(cacheusers);
                } else {
                    usersRealmList.add(com_devlomi_fireapp_model_realms_UserRealmProxy.copyOrUpdate(realm, (com_devlomi_fireapp_model_realms_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.User.class), usersItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.devlomi.fireapp.model.realms.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Group.class);
        long pkColumnIndex = columnInfo.groupIdIndex;
        String primaryKeyValue = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$groupId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isActiveIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$isActive(), false);
        String realmGet$createdByNumber = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$createdByNumber();
        if (realmGet$createdByNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdByNumberIndex, rowIndex, realmGet$createdByNumber, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$timestamp(), false);

        RealmList<com.devlomi.fireapp.model.realms.User> usersList = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$users();
        if (usersList != null) {
            OsList usersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.usersIndex);
            for (com.devlomi.fireapp.model.realms.User usersItem : usersList) {
                Long cacheItemIndexusers = cache.get(usersItem);
                if (cacheItemIndexusers == null) {
                    cacheItemIndexusers = com_devlomi_fireapp_model_realms_UserRealmProxy.insert(realm, usersItem, cache);
                }
                usersOsList.addRow(cacheItemIndexusers);
            }
        }

        RealmList<java.lang.String> adminsUidsList = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$adminsUids();
        if (adminsUidsList != null) {
            OsList adminsUidsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.adminsUidsIndex);
            for (java.lang.String adminsUidsItem : adminsUidsList) {
                if (adminsUidsItem == null) {
                    adminsUidsOsList.addNull();
                } else {
                    adminsUidsOsList.addString(adminsUidsItem);
                }
            }
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.onlyAdminsCanPostIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$onlyAdminsCanPost(), false);
        String realmGet$currentGroupLink = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$currentGroupLink();
        if (realmGet$currentGroupLink != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currentGroupLinkIndex, rowIndex, realmGet$currentGroupLink, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Group.class);
        long pkColumnIndex = columnInfo.groupIdIndex;
        com.devlomi.fireapp.model.realms.Group object = null;
        while (objects.hasNext()) {
            object = (com.devlomi.fireapp.model.realms.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$groupId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isActiveIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$isActive(), false);
            String realmGet$createdByNumber = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$createdByNumber();
            if (realmGet$createdByNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.createdByNumberIndex, rowIndex, realmGet$createdByNumber, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$timestamp(), false);

            RealmList<com.devlomi.fireapp.model.realms.User> usersList = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$users();
            if (usersList != null) {
                OsList usersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.usersIndex);
                for (com.devlomi.fireapp.model.realms.User usersItem : usersList) {
                    Long cacheItemIndexusers = cache.get(usersItem);
                    if (cacheItemIndexusers == null) {
                        cacheItemIndexusers = com_devlomi_fireapp_model_realms_UserRealmProxy.insert(realm, usersItem, cache);
                    }
                    usersOsList.addRow(cacheItemIndexusers);
                }
            }

            RealmList<java.lang.String> adminsUidsList = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$adminsUids();
            if (adminsUidsList != null) {
                OsList adminsUidsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.adminsUidsIndex);
                for (java.lang.String adminsUidsItem : adminsUidsList) {
                    if (adminsUidsItem == null) {
                        adminsUidsOsList.addNull();
                    } else {
                        adminsUidsOsList.addString(adminsUidsItem);
                    }
                }
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.onlyAdminsCanPostIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$onlyAdminsCanPost(), false);
            String realmGet$currentGroupLink = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$currentGroupLink();
            if (realmGet$currentGroupLink != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currentGroupLinkIndex, rowIndex, realmGet$currentGroupLink, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.devlomi.fireapp.model.realms.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Group.class);
        long pkColumnIndex = columnInfo.groupIdIndex;
        String primaryKeyValue = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$groupId();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isActiveIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$isActive(), false);
        String realmGet$createdByNumber = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$createdByNumber();
        if (realmGet$createdByNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdByNumberIndex, rowIndex, realmGet$createdByNumber, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.createdByNumberIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$timestamp(), false);

        OsList usersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.usersIndex);
        RealmList<com.devlomi.fireapp.model.realms.User> usersList = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$users();
        if (usersList != null && usersList.size() == usersOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = usersList.size();
            for (int i = 0; i < objects; i++) {
                com.devlomi.fireapp.model.realms.User usersItem = usersList.get(i);
                Long cacheItemIndexusers = cache.get(usersItem);
                if (cacheItemIndexusers == null) {
                    cacheItemIndexusers = com_devlomi_fireapp_model_realms_UserRealmProxy.insertOrUpdate(realm, usersItem, cache);
                }
                usersOsList.setRow(i, cacheItemIndexusers);
            }
        } else {
            usersOsList.removeAll();
            if (usersList != null) {
                for (com.devlomi.fireapp.model.realms.User usersItem : usersList) {
                    Long cacheItemIndexusers = cache.get(usersItem);
                    if (cacheItemIndexusers == null) {
                        cacheItemIndexusers = com_devlomi_fireapp_model_realms_UserRealmProxy.insertOrUpdate(realm, usersItem, cache);
                    }
                    usersOsList.addRow(cacheItemIndexusers);
                }
            }
        }


        OsList adminsUidsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.adminsUidsIndex);
        adminsUidsOsList.removeAll();
        RealmList<java.lang.String> adminsUidsList = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$adminsUids();
        if (adminsUidsList != null) {
            for (java.lang.String adminsUidsItem : adminsUidsList) {
                if (adminsUidsItem == null) {
                    adminsUidsOsList.addNull();
                } else {
                    adminsUidsOsList.addString(adminsUidsItem);
                }
            }
        }

        Table.nativeSetBoolean(tableNativePtr, columnInfo.onlyAdminsCanPostIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$onlyAdminsCanPost(), false);
        String realmGet$currentGroupLink = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$currentGroupLink();
        if (realmGet$currentGroupLink != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currentGroupLinkIndex, rowIndex, realmGet$currentGroupLink, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.currentGroupLinkIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Group.class);
        long pkColumnIndex = columnInfo.groupIdIndex;
        com.devlomi.fireapp.model.realms.Group object = null;
        while (objects.hasNext()) {
            object = (com.devlomi.fireapp.model.realms.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$groupId();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isActiveIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$isActive(), false);
            String realmGet$createdByNumber = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$createdByNumber();
            if (realmGet$createdByNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.createdByNumberIndex, rowIndex, realmGet$createdByNumber, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.createdByNumberIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$timestamp(), false);

            OsList usersOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.usersIndex);
            RealmList<com.devlomi.fireapp.model.realms.User> usersList = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$users();
            if (usersList != null && usersList.size() == usersOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = usersList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.devlomi.fireapp.model.realms.User usersItem = usersList.get(i);
                    Long cacheItemIndexusers = cache.get(usersItem);
                    if (cacheItemIndexusers == null) {
                        cacheItemIndexusers = com_devlomi_fireapp_model_realms_UserRealmProxy.insertOrUpdate(realm, usersItem, cache);
                    }
                    usersOsList.setRow(i, cacheItemIndexusers);
                }
            } else {
                usersOsList.removeAll();
                if (usersList != null) {
                    for (com.devlomi.fireapp.model.realms.User usersItem : usersList) {
                        Long cacheItemIndexusers = cache.get(usersItem);
                        if (cacheItemIndexusers == null) {
                            cacheItemIndexusers = com_devlomi_fireapp_model_realms_UserRealmProxy.insertOrUpdate(realm, usersItem, cache);
                        }
                        usersOsList.addRow(cacheItemIndexusers);
                    }
                }
            }


            OsList adminsUidsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.adminsUidsIndex);
            adminsUidsOsList.removeAll();
            RealmList<java.lang.String> adminsUidsList = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$adminsUids();
            if (adminsUidsList != null) {
                for (java.lang.String adminsUidsItem : adminsUidsList) {
                    if (adminsUidsItem == null) {
                        adminsUidsOsList.addNull();
                    } else {
                        adminsUidsOsList.addString(adminsUidsItem);
                    }
                }
            }

            Table.nativeSetBoolean(tableNativePtr, columnInfo.onlyAdminsCanPostIndex, rowIndex, ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$onlyAdminsCanPost(), false);
            String realmGet$currentGroupLink = ((com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) object).realmGet$currentGroupLink();
            if (realmGet$currentGroupLink != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currentGroupLinkIndex, rowIndex, realmGet$currentGroupLink, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.currentGroupLinkIndex, rowIndex, false);
            }
        }
    }

    public static com.devlomi.fireapp.model.realms.Group createDetachedCopy(com.devlomi.fireapp.model.realms.Group realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.devlomi.fireapp.model.realms.Group unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.devlomi.fireapp.model.realms.Group();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.devlomi.fireapp.model.realms.Group) cachedObject.object;
            }
            unmanagedObject = (com.devlomi.fireapp.model.realms.Group) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_devlomi_fireapp_model_realms_GroupRealmProxyInterface unmanagedCopy = (com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) unmanagedObject;
        com_devlomi_fireapp_model_realms_GroupRealmProxyInterface realmSource = (com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$groupId(realmSource.realmGet$groupId());
        unmanagedCopy.realmSet$isActive(realmSource.realmGet$isActive());
        unmanagedCopy.realmSet$createdByNumber(realmSource.realmGet$createdByNumber());
        unmanagedCopy.realmSet$timestamp(realmSource.realmGet$timestamp());

        // Deep copy of users
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$users(null);
        } else {
            RealmList<com.devlomi.fireapp.model.realms.User> managedusersList = realmSource.realmGet$users();
            RealmList<com.devlomi.fireapp.model.realms.User> unmanagedusersList = new RealmList<com.devlomi.fireapp.model.realms.User>();
            unmanagedCopy.realmSet$users(unmanagedusersList);
            int nextDepth = currentDepth + 1;
            int size = managedusersList.size();
            for (int i = 0; i < size; i++) {
                com.devlomi.fireapp.model.realms.User item = com_devlomi_fireapp_model_realms_UserRealmProxy.createDetachedCopy(managedusersList.get(i), nextDepth, maxDepth, cache);
                unmanagedusersList.add(item);
            }
        }

        unmanagedCopy.realmSet$adminsUids(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$adminsUids().addAll(realmSource.realmGet$adminsUids());
        unmanagedCopy.realmSet$onlyAdminsCanPost(realmSource.realmGet$onlyAdminsCanPost());
        unmanagedCopy.realmSet$currentGroupLink(realmSource.realmGet$currentGroupLink());

        return unmanagedObject;
    }

    static com.devlomi.fireapp.model.realms.Group update(Realm realm, GroupColumnInfo columnInfo, com.devlomi.fireapp.model.realms.Group realmObject, com.devlomi.fireapp.model.realms.Group newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_devlomi_fireapp_model_realms_GroupRealmProxyInterface realmObjectTarget = (com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) realmObject;
        com_devlomi_fireapp_model_realms_GroupRealmProxyInterface realmObjectSource = (com_devlomi_fireapp_model_realms_GroupRealmProxyInterface) newObject;
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Group.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.groupIdIndex, realmObjectSource.realmGet$groupId());
        builder.addBoolean(columnInfo.isActiveIndex, realmObjectSource.realmGet$isActive());
        builder.addString(columnInfo.createdByNumberIndex, realmObjectSource.realmGet$createdByNumber());
        builder.addInteger(columnInfo.timestampIndex, realmObjectSource.realmGet$timestamp());

        RealmList<com.devlomi.fireapp.model.realms.User> usersList = realmObjectSource.realmGet$users();
        if (usersList != null) {
            RealmList<com.devlomi.fireapp.model.realms.User> usersManagedCopy = new RealmList<com.devlomi.fireapp.model.realms.User>();
            for (int i = 0; i < usersList.size(); i++) {
                com.devlomi.fireapp.model.realms.User usersItem = usersList.get(i);
                com.devlomi.fireapp.model.realms.User cacheusers = (com.devlomi.fireapp.model.realms.User) cache.get(usersItem);
                if (cacheusers != null) {
                    usersManagedCopy.add(cacheusers);
                } else {
                    usersManagedCopy.add(com_devlomi_fireapp_model_realms_UserRealmProxy.copyOrUpdate(realm, (com_devlomi_fireapp_model_realms_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.User.class), usersItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.usersIndex, usersManagedCopy);
        } else {
            builder.addObjectList(columnInfo.usersIndex, new RealmList<com.devlomi.fireapp.model.realms.User>());
        }
        builder.addStringList(columnInfo.adminsUidsIndex, realmObjectSource.realmGet$adminsUids());
        builder.addBoolean(columnInfo.onlyAdminsCanPostIndex, realmObjectSource.realmGet$onlyAdminsCanPost());
        builder.addString(columnInfo.currentGroupLinkIndex, realmObjectSource.realmGet$currentGroupLink());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_devlomi_fireapp_model_realms_GroupRealmProxy aGroup = (com_devlomi_fireapp_model_realms_GroupRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aGroup.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGroup.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aGroup.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
