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
public class com_devlomi_fireapp_model_realms_TextStatusRealmProxy extends com.devlomi.fireapp.model.realms.TextStatus
    implements RealmObjectProxy, com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface {

    static final class TextStatusColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long statusIdIndex;
        long textIndex;
        long fontNameIndex;
        long backgroundColorIndex;

        TextStatusColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("TextStatus");
            this.statusIdIndex = addColumnDetails("statusId", "statusId", objectSchemaInfo);
            this.textIndex = addColumnDetails("text", "text", objectSchemaInfo);
            this.fontNameIndex = addColumnDetails("fontName", "fontName", objectSchemaInfo);
            this.backgroundColorIndex = addColumnDetails("backgroundColor", "backgroundColor", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TextStatusColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TextStatusColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TextStatusColumnInfo src = (TextStatusColumnInfo) rawSrc;
            final TextStatusColumnInfo dst = (TextStatusColumnInfo) rawDst;
            dst.statusIdIndex = src.statusIdIndex;
            dst.textIndex = src.textIndex;
            dst.fontNameIndex = src.fontNameIndex;
            dst.backgroundColorIndex = src.backgroundColorIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TextStatusColumnInfo columnInfo;
    private ProxyState<com.devlomi.fireapp.model.realms.TextStatus> proxyState;

    com_devlomi_fireapp_model_realms_TextStatusRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TextStatusColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.devlomi.fireapp.model.realms.TextStatus>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$statusId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIdIndex);
    }

    @Override
    public void realmSet$statusId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'statusId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$text() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.textIndex);
    }

    @Override
    public void realmSet$text(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
            }
            row.getTable().setString(columnInfo.textIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.textIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fontName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fontNameIndex);
    }

    @Override
    public void realmSet$fontName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'fontName' to null.");
            }
            row.getTable().setString(columnInfo.fontNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'fontName' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.fontNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$backgroundColor() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.backgroundColorIndex);
    }

    @Override
    public void realmSet$backgroundColor(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backgroundColor' to null.");
            }
            row.getTable().setString(columnInfo.backgroundColorIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'backgroundColor' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.backgroundColorIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("TextStatus", 4, 0);
        builder.addPersistedProperty("statusId", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("text", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("fontName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("backgroundColor", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TextStatusColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TextStatusColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "TextStatus";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TextStatus";
    }

    @SuppressWarnings("cast")
    public static com.devlomi.fireapp.model.realms.TextStatus createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.devlomi.fireapp.model.realms.TextStatus obj = null;
        if (update) {
            Table table = realm.getTable(com.devlomi.fireapp.model.realms.TextStatus.class);
            TextStatusColumnInfo columnInfo = (TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.TextStatus.class);
            long pkColumnIndex = columnInfo.statusIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("statusId")) {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("statusId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.TextStatus.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_devlomi_fireapp_model_realms_TextStatusRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("statusId")) {
                if (json.isNull("statusId")) {
                    obj = (io.realm.com_devlomi_fireapp_model_realms_TextStatusRealmProxy) realm.createObjectInternal(com.devlomi.fireapp.model.realms.TextStatus.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_devlomi_fireapp_model_realms_TextStatusRealmProxy) realm.createObjectInternal(com.devlomi.fireapp.model.realms.TextStatus.class, json.getString("statusId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'statusId'.");
            }
        }

        final com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface objProxy = (com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) obj;
        if (json.has("text")) {
            if (json.isNull("text")) {
                objProxy.realmSet$text(null);
            } else {
                objProxy.realmSet$text((String) json.getString("text"));
            }
        }
        if (json.has("fontName")) {
            if (json.isNull("fontName")) {
                objProxy.realmSet$fontName(null);
            } else {
                objProxy.realmSet$fontName((String) json.getString("fontName"));
            }
        }
        if (json.has("backgroundColor")) {
            if (json.isNull("backgroundColor")) {
                objProxy.realmSet$backgroundColor(null);
            } else {
                objProxy.realmSet$backgroundColor((String) json.getString("backgroundColor"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.devlomi.fireapp.model.realms.TextStatus createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.devlomi.fireapp.model.realms.TextStatus obj = new com.devlomi.fireapp.model.realms.TextStatus();
        final com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface objProxy = (com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("statusId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$statusId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$statusId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("text")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$text((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$text(null);
                }
            } else if (name.equals("fontName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fontName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fontName(null);
                }
            } else if (name.equals("backgroundColor")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$backgroundColor((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$backgroundColor(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'statusId'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_devlomi_fireapp_model_realms_TextStatusRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.TextStatus.class), false, Collections.<String>emptyList());
        io.realm.com_devlomi_fireapp_model_realms_TextStatusRealmProxy obj = new io.realm.com_devlomi_fireapp_model_realms_TextStatusRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.devlomi.fireapp.model.realms.TextStatus copyOrUpdate(Realm realm, TextStatusColumnInfo columnInfo, com.devlomi.fireapp.model.realms.TextStatus object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.devlomi.fireapp.model.realms.TextStatus) cachedRealmObject;
        }

        com.devlomi.fireapp.model.realms.TextStatus realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.devlomi.fireapp.model.realms.TextStatus.class);
            long pkColumnIndex = columnInfo.statusIdIndex;
            long rowIndex = table.findFirstString(pkColumnIndex, ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$statusId());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_devlomi_fireapp_model_realms_TextStatusRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.devlomi.fireapp.model.realms.TextStatus copy(Realm realm, TextStatusColumnInfo columnInfo, com.devlomi.fireapp.model.realms.TextStatus newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.devlomi.fireapp.model.realms.TextStatus) cachedRealmObject;
        }

        com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface realmObjectSource = (com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) newObject;

        Table table = realm.getTable(com.devlomi.fireapp.model.realms.TextStatus.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.statusIdIndex, realmObjectSource.realmGet$statusId());
        builder.addString(columnInfo.textIndex, realmObjectSource.realmGet$text());
        builder.addString(columnInfo.fontNameIndex, realmObjectSource.realmGet$fontName());
        builder.addString(columnInfo.backgroundColorIndex, realmObjectSource.realmGet$backgroundColor());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_devlomi_fireapp_model_realms_TextStatusRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.devlomi.fireapp.model.realms.TextStatus object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.TextStatus.class);
        long tableNativePtr = table.getNativePtr();
        TextStatusColumnInfo columnInfo = (TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.TextStatus.class);
        long pkColumnIndex = columnInfo.statusIdIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$statusId();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$text = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        }
        String realmGet$fontName = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$fontName();
        if (realmGet$fontName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fontNameIndex, rowIndex, realmGet$fontName, false);
        }
        String realmGet$backgroundColor = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$backgroundColor();
        if (realmGet$backgroundColor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.backgroundColorIndex, rowIndex, realmGet$backgroundColor, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.TextStatus.class);
        long tableNativePtr = table.getNativePtr();
        TextStatusColumnInfo columnInfo = (TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.TextStatus.class);
        long pkColumnIndex = columnInfo.statusIdIndex;
        com.devlomi.fireapp.model.realms.TextStatus object = null;
        while (objects.hasNext()) {
            object = (com.devlomi.fireapp.model.realms.TextStatus) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$statusId();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$text = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            }
            String realmGet$fontName = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$fontName();
            if (realmGet$fontName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fontNameIndex, rowIndex, realmGet$fontName, false);
            }
            String realmGet$backgroundColor = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$backgroundColor();
            if (realmGet$backgroundColor != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.backgroundColorIndex, rowIndex, realmGet$backgroundColor, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.devlomi.fireapp.model.realms.TextStatus object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.TextStatus.class);
        long tableNativePtr = table.getNativePtr();
        TextStatusColumnInfo columnInfo = (TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.TextStatus.class);
        long pkColumnIndex = columnInfo.statusIdIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$statusId();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$text = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
        }
        String realmGet$fontName = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$fontName();
        if (realmGet$fontName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fontNameIndex, rowIndex, realmGet$fontName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fontNameIndex, rowIndex, false);
        }
        String realmGet$backgroundColor = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$backgroundColor();
        if (realmGet$backgroundColor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.backgroundColorIndex, rowIndex, realmGet$backgroundColor, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.backgroundColorIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.TextStatus.class);
        long tableNativePtr = table.getNativePtr();
        TextStatusColumnInfo columnInfo = (TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.TextStatus.class);
        long pkColumnIndex = columnInfo.statusIdIndex;
        com.devlomi.fireapp.model.realms.TextStatus object = null;
        while (objects.hasNext()) {
            object = (com.devlomi.fireapp.model.realms.TextStatus) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$statusId();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$text = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$text();
            if (realmGet$text != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.textIndex, rowIndex, realmGet$text, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.textIndex, rowIndex, false);
            }
            String realmGet$fontName = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$fontName();
            if (realmGet$fontName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fontNameIndex, rowIndex, realmGet$fontName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fontNameIndex, rowIndex, false);
            }
            String realmGet$backgroundColor = ((com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) object).realmGet$backgroundColor();
            if (realmGet$backgroundColor != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.backgroundColorIndex, rowIndex, realmGet$backgroundColor, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.backgroundColorIndex, rowIndex, false);
            }
        }
    }

    public static com.devlomi.fireapp.model.realms.TextStatus createDetachedCopy(com.devlomi.fireapp.model.realms.TextStatus realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.devlomi.fireapp.model.realms.TextStatus unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.devlomi.fireapp.model.realms.TextStatus();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.devlomi.fireapp.model.realms.TextStatus) cachedObject.object;
            }
            unmanagedObject = (com.devlomi.fireapp.model.realms.TextStatus) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface unmanagedCopy = (com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) unmanagedObject;
        com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface realmSource = (com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$statusId(realmSource.realmGet$statusId());
        unmanagedCopy.realmSet$text(realmSource.realmGet$text());
        unmanagedCopy.realmSet$fontName(realmSource.realmGet$fontName());
        unmanagedCopy.realmSet$backgroundColor(realmSource.realmGet$backgroundColor());

        return unmanagedObject;
    }

    static com.devlomi.fireapp.model.realms.TextStatus update(Realm realm, TextStatusColumnInfo columnInfo, com.devlomi.fireapp.model.realms.TextStatus realmObject, com.devlomi.fireapp.model.realms.TextStatus newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface realmObjectTarget = (com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) realmObject;
        com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface realmObjectSource = (com_devlomi_fireapp_model_realms_TextStatusRealmProxyInterface) newObject;
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.TextStatus.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.statusIdIndex, realmObjectSource.realmGet$statusId());
        builder.addString(columnInfo.textIndex, realmObjectSource.realmGet$text());
        builder.addString(columnInfo.fontNameIndex, realmObjectSource.realmGet$fontName());
        builder.addString(columnInfo.backgroundColorIndex, realmObjectSource.realmGet$backgroundColor());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("TextStatus = proxy[");
        stringBuilder.append("{statusId:");
        stringBuilder.append(realmGet$statusId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{text:");
        stringBuilder.append(realmGet$text());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fontName:");
        stringBuilder.append(realmGet$fontName());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{backgroundColor:");
        stringBuilder.append(realmGet$backgroundColor());
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
        com_devlomi_fireapp_model_realms_TextStatusRealmProxy aTextStatus = (com_devlomi_fireapp_model_realms_TextStatusRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aTextStatus.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTextStatus.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aTextStatus.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
