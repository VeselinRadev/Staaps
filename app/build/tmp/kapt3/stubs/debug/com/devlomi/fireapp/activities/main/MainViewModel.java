package com.devlomi.fireapp.activities.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0006\u0010\u001c\u001a\u00020\u001dJ-\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 J-\u0010&\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u001e\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#H\u0002J \u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/J\u000e\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u0007J\b\u00102\u001a\u00020\u001dH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/devlomi/fireapp/activities/main/MainViewModel;", "Lcom/devlomi/fireapp/common/DisposableAndroidViewModel;", "context", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_queryTextChange", "Landroidx/lifecycle/MutableLiveData;", "", "_statusLiveData", "Lcom/devlomi/fireapp/activities/main/status/StatusFragmentEvent;", "lastSyncTime", "", "getLastSyncTime", "()J", "setLastSyncTime", "(J)V", "queryTextChange", "Landroidx/lifecycle/LiveData;", "getQueryTextChange", "()Landroidx/lifecycle/LiveData;", "realmHelper", "Lcom/devlomi/fireapp/utils/RealmHelper;", "kotlin.jvm.PlatformType", "statusLiveData", "getStatusLiveData", "checkForUpdate", "Lio/reactivex/Maybe;", "", "deleteOldMessagesIfNeeded", "", "fetchImageAndVideosStatuses", "users", "", "Lcom/devlomi/fireapp/model/realms/User;", "statusesIds", "", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchStatuses", "fetchTextStatuses", "handleStatus", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onQueryTextChange", "text", "updateUi", "Companion", "app_debug"})
public final class MainViewModel extends com.devlomi.fireapp.common.DisposableAndroidViewModel {
    private final com.devlomi.fireapp.utils.RealmHelper realmHelper = null;
    private long lastSyncTime = 0L;
    private final androidx.lifecycle.MutableLiveData<com.devlomi.fireapp.activities.main.status.StatusFragmentEvent> _statusLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _queryTextChange = null;
    private final android.app.Application context = null;
    public static final int WAIT_TIME = 15000;
    public static final com.devlomi.fireapp.activities.main.MainViewModel.Companion Companion = null;
    
    public final long getLastSyncTime() {
        return 0L;
    }
    
    public final void setLastSyncTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.devlomi.fireapp.activities.main.status.StatusFragmentEvent> getStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getQueryTextChange() {
        return null;
    }
    
    public final void onQueryTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void fetchStatuses(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.devlomi.fireapp.model.realms.User> users) {
    }
    
    private final void updateUi() {
    }
    
    private final void handleStatus(com.google.firebase.database.DataSnapshot dataSnapshot, java.util.List<java.lang.String> statusesIds) {
    }
    
    public final void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void deleteOldMessagesIfNeeded() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.lang.Boolean> checkForUpdate() {
        return null;
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/devlomi/fireapp/activities/main/MainViewModel$Companion;", "", "()V", "WAIT_TIME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}