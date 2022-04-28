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
public class com_devlomi_fireapp_model_realms_StatusRealmProxy extends com.devlomi.fireapp.model.realms.Status
    implements RealmObjectProxy, com_devlomi_fireapp_model_realms_StatusRealmProxyInterface {

    static final class StatusColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long statusIdIndex;
        long userIdIndex;
        long timestampIndex;
        long thumbImgIndex;
        long contentIndex;
        long localPathIndex;
        long textStatusIndex;
        long typeIndex;
        long durationIndex;
        long seenCountIndex;
        long seenCountSentIndex;
        long isSeenIndex;
        long seenByIndex;

        StatusColumnInfo(OsSchemaInfo schemaInfo) {
            super(13);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Status");
            this.statusIdIndex = addColumnDetails("statusId", "statusId", objectSchemaInfo);
            this.userIdIndex = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.timestampIndex = addColumnDetails("timestamp", "timestamp", objectSchemaInfo);
            this.thumbImgIndex = addColumnDetails("thumbImg", "thumbImg", objectSchemaInfo);
            this.contentIndex = addColumnDetails("content", "content", objectSchemaInfo);
            this.localPathIndex = addColumnDetails("localPath", "localPath", objectSchemaInfo);
            this.textStatusIndex = addColumnDetails("textStatus", "textStatus", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.durationIndex = addColumnDetails("duration", "duration", objectSchemaInfo);
            this.seenCountIndex = addColumnDetails("seenCount", "seenCount", objectSchemaInfo);
            this.seenCountSentIndex = addColumnDetails("seenCountSent", "seenCountSent", objectSchemaInfo);
            this.isSeenIndex = addColumnDetails("isSeen", "isSeen", objectSchemaInfo);
            this.seenByIndex = addColumnDetails("seenBy", "seenBy", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        StatusColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new StatusColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final StatusColumnInfo src = (StatusColumnInfo) rawSrc;
            final StatusColumnInfo dst = (StatusColumnInfo) rawDst;
            dst.statusIdIndex = src.statusIdIndex;
            dst.userIdIndex = src.userIdIndex;
            dst.timestampIndex = src.timestampIndex;
            dst.thumbImgIndex = src.thumbImgIndex;
            dst.contentIndex = src.contentIndex;
            dst.localPathIndex = src.localPathIndex;
            dst.textStatusIndex = src.textStatusIndex;
            dst.typeIndex = src.typeIndex;
            dst.durationIndex = src.durationIndex;
            dst.seenCountIndex = src.seenCountIndex;
            dst.seenCountSentIndex = src.seenCountSentIndex;
            dst.isSeenIndex = src.isSeenIndex;
            dst.seenByIndex = src.seenByIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private StatusColumnInfo columnInfo;
    private ProxyState<com.devlomi.fireapp.model.realms.Status> proxyState;
    private RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> seenByRealmList;

    com_devlomi_fireapp_model_realms_StatusRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (StatusColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.devlomi.fireapp.model.realms.Status>(this);
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
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIdIndex, value);
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
    @SuppressWarnings("cast")
    public String realmGet$thumbImg() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thumbImgIndex);
    }

    @Override
    public void realmSet$thumbImg(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thumbImgIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.thumbImgIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thumbImgIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thumbImgIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$content() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contentIndex);
    }

    @Override
    public void realmSet$content(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.contentIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.contentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.contentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.contentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$localPath() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.localPathIndex);
    }

    @Override
    public void realmSet$localPath(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.localPathIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.localPathIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.localPathIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.localPathIndex, value);
    }

    @Override
    public com.devlomi.fireapp.model.realms.TextStatus realmGet$textStatus() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.textStatusIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.devlomi.fireapp.model.realms.TextStatus.class, proxyState.getRow$realm().getLink(columnInfo.textStatusIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$textStatus(com.devlomi.fireapp.model.realms.TextStatus value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("textStatus")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.textStatusIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.textStatusIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.textStatusIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.textStatusIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.typeIndex);
    }

    @Override
    public void realmSet$type(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.typeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.typeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$duration() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.durationIndex);
    }

    @Override
    public void realmSet$duration(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.durationIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.durationIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$seenCount() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.seenCountIndex);
    }

    @Override
    public void realmSet$seenCount(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.seenCountIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.seenCountIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$seenCountSent() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.seenCountSentIndex);
    }

    @Override
    public void realmSet$seenCountSent(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.seenCountSentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.seenCountSentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isSeen() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isSeenIndex);
    }

    @Override
    public void realmSet$isSeen(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isSeenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isSeenIndex, value);
    }

    @Override
    public RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> realmGet$seenBy() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (seenByRealmList != null) {
            return seenByRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.seenByIndex);
            seenByRealmList = new RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy>(com.devlomi.fireapp.model.realms.StatusSeenBy.class, osList, proxyState.getRealm$realm());
            return seenByRealmList;
        }
    }

    @Override
    public void realmSet$seenBy(RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("seenBy")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> original = value;
                value = new RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy>();
                for (com.devlomi.fireapp.model.realms.StatusSeenBy item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.seenByIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.devlomi.fireapp.model.realms.StatusSeenBy linkedObject = value.get(i);
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
                com.devlomi.fireapp.model.realms.StatusSeenBy linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Status", 13, 0);
        builder.addPersistedProperty("statusId", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timestamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("thumbImg", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("content", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("localPath", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("textStatus", RealmFieldType.OBJECT, "TextStatus");
        builder.addPersistedProperty("type", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("duration", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("seenCount", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("seenCountSent", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isSeen", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("seenBy", RealmFieldType.LIST, "StatusSeenBy");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static StatusColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new StatusColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Status";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Status";
    }

    @SuppressWarnings("cast")
    public static com.devlomi.fireapp.model.realms.Status createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.devlomi.fireapp.model.realms.Status obj = null;
        if (update) {
            Table table = realm.getTable(com.devlomi.fireapp.model.realms.Status.class);
            StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Status.class);
            long pkColumnIndex = columnInfo.statusIdIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("statusId")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("statusId"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Status.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_devlomi_fireapp_model_realms_StatusRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("textStatus")) {
                excludeFields.add("textStatus");
            }
            if (json.has("seenBy")) {
                excludeFields.add("seenBy");
            }
            if (json.has("statusId")) {
                if (json.isNull("statusId")) {
                    obj = (io.realm.com_devlomi_fireapp_model_realms_StatusRealmProxy) realm.createObjectInternal(com.devlomi.fireapp.model.realms.Status.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_devlomi_fireapp_model_realms_StatusRealmProxy) realm.createObjectInternal(com.devlomi.fireapp.model.realms.Status.class, json.getString("statusId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'statusId'.");
            }
        }

        final com_devlomi_fireapp_model_realms_StatusRealmProxyInterface objProxy = (com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) obj;
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("timestamp")) {
            if (json.isNull("timestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
            } else {
                objProxy.realmSet$timestamp((long) json.getLong("timestamp"));
            }
        }
        if (json.has("thumbImg")) {
            if (json.isNull("thumbImg")) {
                objProxy.realmSet$thumbImg(null);
            } else {
                objProxy.realmSet$thumbImg((String) json.getString("thumbImg"));
            }
        }
        if (json.has("content")) {
            if (json.isNull("content")) {
                objProxy.realmSet$content(null);
            } else {
                objProxy.realmSet$content((String) json.getString("content"));
            }
        }
        if (json.has("localPath")) {
            if (json.isNull("localPath")) {
                objProxy.realmSet$localPath(null);
            } else {
                objProxy.realmSet$localPath((String) json.getString("localPath"));
            }
        }
        if (json.has("textStatus")) {
            if (json.isNull("textStatus")) {
                objProxy.realmSet$textStatus(null);
            } else {
                com.devlomi.fireapp.model.realms.TextStatus textStatusObj = com_devlomi_fireapp_model_realms_TextStatusRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("textStatus"), update);
                objProxy.realmSet$textStatus(textStatusObj);
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            } else {
                objProxy.realmSet$type((int) json.getInt("type"));
            }
        }
        if (json.has("duration")) {
            if (json.isNull("duration")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
            } else {
                objProxy.realmSet$duration((long) json.getLong("duration"));
            }
        }
        if (json.has("seenCount")) {
            if (json.isNull("seenCount")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'seenCount' to null.");
            } else {
                objProxy.realmSet$seenCount((int) json.getInt("seenCount"));
            }
        }
        if (json.has("seenCountSent")) {
            if (json.isNull("seenCountSent")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'seenCountSent' to null.");
            } else {
                objProxy.realmSet$seenCountSent((boolean) json.getBoolean("seenCountSent"));
            }
        }
        if (json.has("isSeen")) {
            if (json.isNull("isSeen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isSeen' to null.");
            } else {
                objProxy.realmSet$isSeen((boolean) json.getBoolean("isSeen"));
            }
        }
        if (json.has("seenBy")) {
            if (json.isNull("seenBy")) {
                objProxy.realmSet$seenBy(null);
            } else {
                objProxy.realmGet$seenBy().clear();
                JSONArray array = json.getJSONArray("seenBy");
                for (int i = 0; i < array.length(); i++) {
                    com.devlomi.fireapp.model.realms.StatusSeenBy item = com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$seenBy().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.devlomi.fireapp.model.realms.Status createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.devlomi.fireapp.model.realms.Status obj = new com.devlomi.fireapp.model.realms.Status();
        final com_devlomi_fireapp_model_realms_StatusRealmProxyInterface objProxy = (com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) obj;
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
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("timestamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timestamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
                }
            } else if (name.equals("thumbImg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thumbImg((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thumbImg(null);
                }
            } else if (name.equals("content")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$content((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$content(null);
                }
            } else if (name.equals("localPath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$localPath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$localPath(null);
                }
            } else if (name.equals("textStatus")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$textStatus(null);
                } else {
                    com.devlomi.fireapp.model.realms.TextStatus textStatusObj = com_devlomi_fireapp_model_realms_TextStatusRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$textStatus(textStatusObj);
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
                }
            } else if (name.equals("duration")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$duration((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
                }
            } else if (name.equals("seenCount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seenCount((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'seenCount' to null.");
                }
            } else if (name.equals("seenCountSent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seenCountSent((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'seenCountSent' to null.");
                }
            } else if (name.equals("isSeen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isSeen((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isSeen' to null.");
                }
            } else if (name.equals("seenBy")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$seenBy(null);
                } else {
                    objProxy.realmSet$seenBy(new RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.devlomi.fireapp.model.realms.StatusSeenBy item = com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$seenBy().add(item);
                    }
                    reader.endArray();
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

    private static com_devlomi_fireapp_model_realms_StatusRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Status.class), false, Collections.<String>emptyList());
        io.realm.com_devlomi_fireapp_model_realms_StatusRealmProxy obj = new io.realm.com_devlomi_fireapp_model_realms_StatusRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.devlomi.fireapp.model.realms.Status copyOrUpdate(Realm realm, StatusColumnInfo columnInfo, com.devlomi.fireapp.model.realms.Status object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.devlomi.fireapp.model.realms.Status) cachedRealmObject;
        }

        com.devlomi.fireapp.model.realms.Status realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.devlomi.fireapp.model.realms.Status.class);
            long pkColumnIndex = columnInfo.statusIdIndex;
            String value = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
                    realmObject = new io.realm.com_devlomi_fireapp_model_realms_StatusRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.devlomi.fireapp.model.realms.Status copy(Realm realm, StatusColumnInfo columnInfo, com.devlomi.fireapp.model.realms.Status newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.devlomi.fireapp.model.realms.Status) cachedRealmObject;
        }

        com_devlomi_fireapp_model_realms_StatusRealmProxyInterface realmObjectSource = (com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) newObject;

        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Status.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.statusIdIndex, realmObjectSource.realmGet$statusId());
        builder.addString(columnInfo.userIdIndex, realmObjectSource.realmGet$userId());
        builder.addInteger(columnInfo.timestampIndex, realmObjectSource.realmGet$timestamp());
        builder.addString(columnInfo.thumbImgIndex, realmObjectSource.realmGet$thumbImg());
        builder.addString(columnInfo.contentIndex, realmObjectSource.realmGet$content());
        builder.addString(columnInfo.localPathIndex, realmObjectSource.realmGet$localPath());
        builder.addInteger(columnInfo.typeIndex, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.durationIndex, realmObjectSource.realmGet$duration());
        builder.addInteger(columnInfo.seenCountIndex, realmObjectSource.realmGet$seenCount());
        builder.addBoolean(columnInfo.seenCountSentIndex, realmObjectSource.realmGet$seenCountSent());
        builder.addBoolean(columnInfo.isSeenIndex, realmObjectSource.realmGet$isSeen());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_devlomi_fireapp_model_realms_StatusRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.devlomi.fireapp.model.realms.TextStatus textStatusObj = realmObjectSource.realmGet$textStatus();
        if (textStatusObj == null) {
            realmObjectCopy.realmSet$textStatus(null);
        } else {
            com.devlomi.fireapp.model.realms.TextStatus cachetextStatus = (com.devlomi.fireapp.model.realms.TextStatus) cache.get(textStatusObj);
            if (cachetextStatus != null) {
                realmObjectCopy.realmSet$textStatus(cachetextStatus);
            } else {
                realmObjectCopy.realmSet$textStatus(com_devlomi_fireapp_model_realms_TextStatusRealmProxy.copyOrUpdate(realm, (com_devlomi_fireapp_model_realms_TextStatusRealmProxy.TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.TextStatus.class), textStatusObj, update, cache, flags));
            }
        }

        RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> seenByList = realmObjectSource.realmGet$seenBy();
        if (seenByList != null) {
            RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> seenByRealmList = realmObjectCopy.realmGet$seenBy();
            seenByRealmList.clear();
            for (int i = 0; i < seenByList.size(); i++) {
                com.devlomi.fireapp.model.realms.StatusSeenBy seenByItem = seenByList.get(i);
                com.devlomi.fireapp.model.realms.StatusSeenBy cacheseenBy = (com.devlomi.fireapp.model.realms.StatusSeenBy) cache.get(seenByItem);
                if (cacheseenBy != null) {
                    seenByRealmList.add(cacheseenBy);
                } else {
                    seenByRealmList.add(com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.copyOrUpdate(realm, (com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.StatusSeenByColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.StatusSeenBy.class), seenByItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.devlomi.fireapp.model.realms.Status object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Status.class);
        long pkColumnIndex = columnInfo.statusIdIndex;
        String primaryKeyValue = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
        String realmGet$userId = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$timestamp(), false);
        String realmGet$thumbImg = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$thumbImg();
        if (realmGet$thumbImg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbImgIndex, rowIndex, realmGet$thumbImg, false);
        }
        String realmGet$content = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
        }
        String realmGet$localPath = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$localPath();
        if (realmGet$localPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.localPathIndex, rowIndex, realmGet$localPath, false);
        }

        com.devlomi.fireapp.model.realms.TextStatus textStatusObj = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$textStatus();
        if (textStatusObj != null) {
            Long cachetextStatus = cache.get(textStatusObj);
            if (cachetextStatus == null) {
                cachetextStatus = com_devlomi_fireapp_model_realms_TextStatusRealmProxy.insert(realm, textStatusObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.textStatusIndex, rowIndex, cachetextStatus, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$type(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$duration(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.seenCountIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenCount(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.seenCountSentIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenCountSent(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$isSeen(), false);

        RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> seenByList = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenBy();
        if (seenByList != null) {
            OsList seenByOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.seenByIndex);
            for (com.devlomi.fireapp.model.realms.StatusSeenBy seenByItem : seenByList) {
                Long cacheItemIndexseenBy = cache.get(seenByItem);
                if (cacheItemIndexseenBy == null) {
                    cacheItemIndexseenBy = com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.insert(realm, seenByItem, cache);
                }
                seenByOsList.addRow(cacheItemIndexseenBy);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Status.class);
        long pkColumnIndex = columnInfo.statusIdIndex;
        com.devlomi.fireapp.model.realms.Status object = null;
        while (objects.hasNext()) {
            object = (com.devlomi.fireapp.model.realms.Status) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
            String realmGet$userId = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$timestamp(), false);
            String realmGet$thumbImg = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$thumbImg();
            if (realmGet$thumbImg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbImgIndex, rowIndex, realmGet$thumbImg, false);
            }
            String realmGet$content = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
            }
            String realmGet$localPath = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$localPath();
            if (realmGet$localPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.localPathIndex, rowIndex, realmGet$localPath, false);
            }

            com.devlomi.fireapp.model.realms.TextStatus textStatusObj = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$textStatus();
            if (textStatusObj != null) {
                Long cachetextStatus = cache.get(textStatusObj);
                if (cachetextStatus == null) {
                    cachetextStatus = com_devlomi_fireapp_model_realms_TextStatusRealmProxy.insert(realm, textStatusObj, cache);
                }
                table.setLink(columnInfo.textStatusIndex, rowIndex, cachetextStatus, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$type(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$duration(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.seenCountIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenCount(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.seenCountSentIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenCountSent(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$isSeen(), false);

            RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> seenByList = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenBy();
            if (seenByList != null) {
                OsList seenByOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.seenByIndex);
                for (com.devlomi.fireapp.model.realms.StatusSeenBy seenByItem : seenByList) {
                    Long cacheItemIndexseenBy = cache.get(seenByItem);
                    if (cacheItemIndexseenBy == null) {
                        cacheItemIndexseenBy = com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.insert(realm, seenByItem, cache);
                    }
                    seenByOsList.addRow(cacheItemIndexseenBy);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.devlomi.fireapp.model.realms.Status object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Status.class);
        long pkColumnIndex = columnInfo.statusIdIndex;
        String primaryKeyValue = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
        String realmGet$userId = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$timestamp(), false);
        String realmGet$thumbImg = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$thumbImg();
        if (realmGet$thumbImg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbImgIndex, rowIndex, realmGet$thumbImg, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thumbImgIndex, rowIndex, false);
        }
        String realmGet$content = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex, false);
        }
        String realmGet$localPath = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$localPath();
        if (realmGet$localPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.localPathIndex, rowIndex, realmGet$localPath, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.localPathIndex, rowIndex, false);
        }

        com.devlomi.fireapp.model.realms.TextStatus textStatusObj = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$textStatus();
        if (textStatusObj != null) {
            Long cachetextStatus = cache.get(textStatusObj);
            if (cachetextStatus == null) {
                cachetextStatus = com_devlomi_fireapp_model_realms_TextStatusRealmProxy.insertOrUpdate(realm, textStatusObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.textStatusIndex, rowIndex, cachetextStatus, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.textStatusIndex, rowIndex);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$type(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$duration(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.seenCountIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenCount(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.seenCountSentIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenCountSent(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$isSeen(), false);

        OsList seenByOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.seenByIndex);
        RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> seenByList = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenBy();
        if (seenByList != null && seenByList.size() == seenByOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = seenByList.size();
            for (int i = 0; i < objects; i++) {
                com.devlomi.fireapp.model.realms.StatusSeenBy seenByItem = seenByList.get(i);
                Long cacheItemIndexseenBy = cache.get(seenByItem);
                if (cacheItemIndexseenBy == null) {
                    cacheItemIndexseenBy = com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, seenByItem, cache);
                }
                seenByOsList.setRow(i, cacheItemIndexseenBy);
            }
        } else {
            seenByOsList.removeAll();
            if (seenByList != null) {
                for (com.devlomi.fireapp.model.realms.StatusSeenBy seenByItem : seenByList) {
                    Long cacheItemIndexseenBy = cache.get(seenByItem);
                    if (cacheItemIndexseenBy == null) {
                        cacheItemIndexseenBy = com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, seenByItem, cache);
                    }
                    seenByOsList.addRow(cacheItemIndexseenBy);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.Status.class);
        long pkColumnIndex = columnInfo.statusIdIndex;
        com.devlomi.fireapp.model.realms.Status object = null;
        while (objects.hasNext()) {
            object = (com.devlomi.fireapp.model.realms.Status) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
            String realmGet$userId = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$timestamp(), false);
            String realmGet$thumbImg = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$thumbImg();
            if (realmGet$thumbImg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbImgIndex, rowIndex, realmGet$thumbImg, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thumbImgIndex, rowIndex, false);
            }
            String realmGet$content = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex, false);
            }
            String realmGet$localPath = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$localPath();
            if (realmGet$localPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.localPathIndex, rowIndex, realmGet$localPath, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.localPathIndex, rowIndex, false);
            }

            com.devlomi.fireapp.model.realms.TextStatus textStatusObj = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$textStatus();
            if (textStatusObj != null) {
                Long cachetextStatus = cache.get(textStatusObj);
                if (cachetextStatus == null) {
                    cachetextStatus = com_devlomi_fireapp_model_realms_TextStatusRealmProxy.insertOrUpdate(realm, textStatusObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.textStatusIndex, rowIndex, cachetextStatus, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.textStatusIndex, rowIndex);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$type(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.durationIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$duration(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.seenCountIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenCount(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.seenCountSentIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenCountSent(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenIndex, rowIndex, ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$isSeen(), false);

            OsList seenByOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.seenByIndex);
            RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> seenByList = ((com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) object).realmGet$seenBy();
            if (seenByList != null && seenByList.size() == seenByOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = seenByList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.devlomi.fireapp.model.realms.StatusSeenBy seenByItem = seenByList.get(i);
                    Long cacheItemIndexseenBy = cache.get(seenByItem);
                    if (cacheItemIndexseenBy == null) {
                        cacheItemIndexseenBy = com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, seenByItem, cache);
                    }
                    seenByOsList.setRow(i, cacheItemIndexseenBy);
                }
            } else {
                seenByOsList.removeAll();
                if (seenByList != null) {
                    for (com.devlomi.fireapp.model.realms.StatusSeenBy seenByItem : seenByList) {
                        Long cacheItemIndexseenBy = cache.get(seenByItem);
                        if (cacheItemIndexseenBy == null) {
                            cacheItemIndexseenBy = com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, seenByItem, cache);
                        }
                        seenByOsList.addRow(cacheItemIndexseenBy);
                    }
                }
            }

        }
    }

    public static com.devlomi.fireapp.model.realms.Status createDetachedCopy(com.devlomi.fireapp.model.realms.Status realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.devlomi.fireapp.model.realms.Status unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.devlomi.fireapp.model.realms.Status();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.devlomi.fireapp.model.realms.Status) cachedObject.object;
            }
            unmanagedObject = (com.devlomi.fireapp.model.realms.Status) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_devlomi_fireapp_model_realms_StatusRealmProxyInterface unmanagedCopy = (com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) unmanagedObject;
        com_devlomi_fireapp_model_realms_StatusRealmProxyInterface realmSource = (com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$statusId(realmSource.realmGet$statusId());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$timestamp(realmSource.realmGet$timestamp());
        unmanagedCopy.realmSet$thumbImg(realmSource.realmGet$thumbImg());
        unmanagedCopy.realmSet$content(realmSource.realmGet$content());
        unmanagedCopy.realmSet$localPath(realmSource.realmGet$localPath());

        // Deep copy of textStatus
        unmanagedCopy.realmSet$textStatus(com_devlomi_fireapp_model_realms_TextStatusRealmProxy.createDetachedCopy(realmSource.realmGet$textStatus(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$duration(realmSource.realmGet$duration());
        unmanagedCopy.realmSet$seenCount(realmSource.realmGet$seenCount());
        unmanagedCopy.realmSet$seenCountSent(realmSource.realmGet$seenCountSent());
        unmanagedCopy.realmSet$isSeen(realmSource.realmGet$isSeen());

        // Deep copy of seenBy
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$seenBy(null);
        } else {
            RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> managedseenByList = realmSource.realmGet$seenBy();
            RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> unmanagedseenByList = new RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy>();
            unmanagedCopy.realmSet$seenBy(unmanagedseenByList);
            int nextDepth = currentDepth + 1;
            int size = managedseenByList.size();
            for (int i = 0; i < size; i++) {
                com.devlomi.fireapp.model.realms.StatusSeenBy item = com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.createDetachedCopy(managedseenByList.get(i), nextDepth, maxDepth, cache);
                unmanagedseenByList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.devlomi.fireapp.model.realms.Status update(Realm realm, StatusColumnInfo columnInfo, com.devlomi.fireapp.model.realms.Status realmObject, com.devlomi.fireapp.model.realms.Status newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_devlomi_fireapp_model_realms_StatusRealmProxyInterface realmObjectTarget = (com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) realmObject;
        com_devlomi_fireapp_model_realms_StatusRealmProxyInterface realmObjectSource = (com_devlomi_fireapp_model_realms_StatusRealmProxyInterface) newObject;
        Table table = realm.getTable(com.devlomi.fireapp.model.realms.Status.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.statusIdIndex, realmObjectSource.realmGet$statusId());
        builder.addString(columnInfo.userIdIndex, realmObjectSource.realmGet$userId());
        builder.addInteger(columnInfo.timestampIndex, realmObjectSource.realmGet$timestamp());
        builder.addString(columnInfo.thumbImgIndex, realmObjectSource.realmGet$thumbImg());
        builder.addString(columnInfo.contentIndex, realmObjectSource.realmGet$content());
        builder.addString(columnInfo.localPathIndex, realmObjectSource.realmGet$localPath());

        com.devlomi.fireapp.model.realms.TextStatus textStatusObj = realmObjectSource.realmGet$textStatus();
        if (textStatusObj == null) {
            builder.addNull(columnInfo.textStatusIndex);
        } else {
            com.devlomi.fireapp.model.realms.TextStatus cachetextStatus = (com.devlomi.fireapp.model.realms.TextStatus) cache.get(textStatusObj);
            if (cachetextStatus != null) {
                builder.addObject(columnInfo.textStatusIndex, cachetextStatus);
            } else {
                builder.addObject(columnInfo.textStatusIndex, com_devlomi_fireapp_model_realms_TextStatusRealmProxy.copyOrUpdate(realm, (com_devlomi_fireapp_model_realms_TextStatusRealmProxy.TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.TextStatus.class), textStatusObj, true, cache, flags));
            }
        }
        builder.addInteger(columnInfo.typeIndex, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.durationIndex, realmObjectSource.realmGet$duration());
        builder.addInteger(columnInfo.seenCountIndex, realmObjectSource.realmGet$seenCount());
        builder.addBoolean(columnInfo.seenCountSentIndex, realmObjectSource.realmGet$seenCountSent());
        builder.addBoolean(columnInfo.isSeenIndex, realmObjectSource.realmGet$isSeen());

        RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> seenByList = realmObjectSource.realmGet$seenBy();
        if (seenByList != null) {
            RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy> seenByManagedCopy = new RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy>();
            for (int i = 0; i < seenByList.size(); i++) {
                com.devlomi.fireapp.model.realms.StatusSeenBy seenByItem = seenByList.get(i);
                com.devlomi.fireapp.model.realms.StatusSeenBy cacheseenBy = (com.devlomi.fireapp.model.realms.StatusSeenBy) cache.get(seenByItem);
                if (cacheseenBy != null) {
                    seenByManagedCopy.add(cacheseenBy);
                } else {
                    seenByManagedCopy.add(com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.copyOrUpdate(realm, (com_devlomi_fireapp_model_realms_StatusSeenByRealmProxy.StatusSeenByColumnInfo) realm.getSchema().getColumnInfo(com.devlomi.fireapp.model.realms.StatusSeenBy.class), seenByItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.seenByIndex, seenByManagedCopy);
        } else {
            builder.addObjectList(columnInfo.seenByIndex, new RealmList<com.devlomi.fireapp.model.realms.StatusSeenBy>());
        }

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

}
