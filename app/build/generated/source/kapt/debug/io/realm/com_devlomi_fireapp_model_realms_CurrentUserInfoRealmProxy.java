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
public class com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy extends com.devlomi.fireapp.model.realms.CurrentUserInfo
    implements RealmObjectProxy, com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface {

    static final class CurrentUserInfoColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long uidIndex;
        long phoneIndex;

        CurrentUserInfoColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CurrentUserInfo");
            this.uidIndex = addColumnDetails("uid", "uid", objectSchemaInfo);
            this.phoneIndex = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CurrentUserInfoColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CurrentUserInfoColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CurrentUserInfoColumnInfo src = (CurrentUserInfoColumnInfo) rawSrc;
            final CurrentUserInfoColumnInfo dst = (CurrentUserInfoColumnInfo) rawDst;
            dst.uidIndex = src.uidIndex;
            dst.phoneIndex = src.phoneIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CurrentUserInfoColumnInfo columnInfo;
    private ProxyState<com.devlomi.fireapp.model.realms.CurrentUserInfo> proxyState;

    com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CurrentUserInfoColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.devlomi.fireapp.model.realms.CurrentUserInfo>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$uid() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.uidIndex);
    }

    @Override
    public void realmSet$uid(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'uid' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneIndex);
    }

    @Override
    public void realmSet$phone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phoneIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phoneIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("CurrentUserInfo", 2, 0);
        builder.addPersistedProperty("uid", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CurrentUserInfoColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CurrentUserInfoColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CurrentUserInfo";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CurrentUserInfo";
    }

    @SuppressWarnings("cast")
    public static com.devlomi.fireapp.model.realms.CurrentUserInfo createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.devlomi.fireapp.model.realms.CurrentUserInfo obj = null;
        if (update) {
            Table table = realm.getTable(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
            CurrentUserInfoColumnInfo columnInfo = (CurrentUserInfoColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
            long pkColumnIndex = columnInfo.uidIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("uid")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("uid"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.CurrentUserInfo.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("uid")) {
                if (json.isNull("uid")) {
                    obj = (io.realm.com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy) realm.createObjectInternal(com.devlomi.fireapp.model.realms.CurrentUserInfo.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy) realm.createObjectInternal(com.devlomi.fireapp.model.realms.CurrentUserInfo.class, json.getString("uid"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'uid'.");
            }
        }

        final com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface objProxy = (com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) obj;
        if (json.has("phone")) {
            if (json.isNull("phone")) {
                objProxy.realmSet$phone(null);
            } else {
                objProxy.realmSet$phone((String) json.getString("phone"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.devlomi.fireapp.model.realms.CurrentUserInfo createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.devlomi.fireapp.model.realms.CurrentUserInfo obj = new com.devlomi.fireapp.model.realms.CurrentUserInfo();
        final com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface objProxy = (com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("uid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$uid((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$uid(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("phone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phone(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'uid'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.CurrentUserInfo.class), false, Collections.<String>emptyList());
        io.realm.com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy obj = new io.realm.com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.devlomi.fireapp.model.realms.CurrentUserInfo copyOrUpdate(Realm realm, CurrentUserInfoColumnInfo columnInfo, com.devlomi.fireapp.model.realms.CurrentUserInfo object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.devlomi.fireapp.model.realms.CurrentUserInfo) cachedRealmObject;
        }

        com.devlomi.fireapp.model.realms.CurrentUserInfo realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
            long pkColumnIndex = columnInfo.uidIndex;
            String value = ((com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) object).realmGet$uid();
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
                    realmObject = new io.realm.com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.devlomi.fireapp.model.realms.CurrentUserInfo copy(Realm realm, CurrentUserInfoColumnInfo columnInfo, com.devlomi.fireapp.model.realms.CurrentUserInfo newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.devlomi.fireapp.model.realms.CurrentUserInfo) cachedRealmObject;
        }

        com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface realmObjectSource = (com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) newObject;

        Table table = realm.getTable(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.uidIndex, realmObjectSource.realmGet$uid());
        builder.addString(columnInfo.phoneIndex, realmObjectSource.realmGet$phone());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.devlomi.fireapp.model.realms.CurrentUserInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        long tableNativePtr = table.getNativePtr();
        CurrentUserInfoColumnInfo columnInfo = (CurrentUserInfoColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        long pkColumnIndex = columnInfo.uidIndex;
        String primaryKeyValue = ((com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) object).realmGet$uid();
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
        String realmGet$phone = ((com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        long tableNativePtr = table.getNativePtr();
        CurrentUserInfoColumnInfo columnInfo = (CurrentUserInfoColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        long pkColumnIndex = columnInfo.uidIndex;
        com.devlomi.fireapp.model.realms.CurrentUserInfo object = null;
        while (objects.hasNext()) {
            object = (com.devlomi.fireapp.model.realms.CurrentUserInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) object).realmGet$uid();
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
            String realmGet$phone = ((com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.devlomi.fireapp.model.realms.CurrentUserInfo object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        long tableNativePtr = table.getNativePtr();
        CurrentUserInfoColumnInfo columnInfo = (CurrentUserInfoColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        long pkColumnIndex = columnInfo.uidIndex;
        String primaryKeyValue = ((com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) object).realmGet$uid();
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
        String realmGet$phone = ((com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        long tableNativePtr = table.getNativePtr();
        CurrentUserInfoColumnInfo columnInfo = (CurrentUserInfoColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        long pkColumnIndex = columnInfo.uidIndex;
        com.devlomi.fireapp.model.realms.CurrentUserInfo object = null;
        while (objects.hasNext()) {
            object = (com.devlomi.fireapp.model.realms.CurrentUserInfo) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) object).realmGet$uid();
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
            String realmGet$phone = ((com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneIndex, rowIndex, false);
            }
        }
    }

    public static com.devlomi.fireapp.model.realms.CurrentUserInfo createDetachedCopy(com.devlomi.fireapp.model.realms.CurrentUserInfo realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.devlomi.fireapp.model.realms.CurrentUserInfo unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.devlomi.fireapp.model.realms.CurrentUserInfo();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.devlomi.fireapp.model.realms.CurrentUserInfo) cachedObject.object;
            }
            unmanagedObject = (com.devlomi.fireapp.model.realms.CurrentUserInfo) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface unmanagedCopy = (com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) unmanagedObject;
        com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface realmSource = (com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$uid(realmSource.realmGet$uid());
        unmanagedCopy.realmSet$phone(realmSource.realmGet$phone());

        return unmanagedObject;
    }

    static com.devlomi.fireapp.model.realms.CurrentUserInfo update(Realm realm, CurrentUserInfoColumnInfo columnInfo, com.devlomi.fireapp.model.realms.CurrentUserInfo realmObject, com.devlomi.fireapp.model.realms.CurrentUserInfo newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface realmObjectTarget = (com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) realmObject;
        com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface realmObjectSource = (com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxyInterface) newObject;
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.CurrentUserInfo.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.uidIndex, realmObjectSource.realmGet$uid());
        builder.addString(columnInfo.phoneIndex, realmObjectSource.realmGet$phone());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CurrentUserInfo = proxy[");
        stringBuilder.append("{uid:");
        stringBuilder.append(realmGet$uid() != null ? realmGet$uid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phone:");
        stringBuilder.append(realmGet$phone() != null ? realmGet$phone() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
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
        com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy aCurrentUserInfo = (com_devlomi_fireapp_model_realms_CurrentUserInfoRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCurrentUserInfo.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCurrentUserInfo.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCurrentUserInfo.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
