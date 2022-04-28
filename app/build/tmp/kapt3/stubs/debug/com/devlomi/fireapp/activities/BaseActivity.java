package com.devlomi.fireapp.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\rH&J\b\u0010!\u001a\u00020\u0013H\u0016J\u0012\u0010\"\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u0013H\u0014J\b\u0010&\u001a\u00020\u0013H\u0014J\b\u0010\'\u001a\u00020\u0013H\u0014J\b\u0010(\u001a\u00020\u0013H\u0014J\u0006\u0010)\u001a\u00020\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/devlomi/fireapp/activities/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/devlomi/fireapp/Base;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "fireManager", "Lcom/devlomi/fireapp/utils/network/FireManager;", "getFireManager", "()Lcom/devlomi/fireapp/utils/network/FireManager;", "needsUpdate", "", "newMessageHandler", "Lcom/devlomi/fireapp/utils/NewMessageHandler;", "presenceUtil", "Lcom/devlomi/fireapp/utils/PresenceUtil;", "attachDeletedMessageListener", "", "attachNewCallsListener", "attachNewGroupListener", "attachNewMessageListener", "deleteDeletedMessage", "Lio/reactivex/Completable;", "messageId", "", "deleteMessage", "deleteNewCall", "callId", "deleteNewGroupEvent", "groupId", "enablePresence", "goingToUpdateActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "startUpdateActivity", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.devlomi.fireapp.Base {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private com.devlomi.fireapp.utils.PresenceUtil presenceUtil;
    @org.jetbrains.annotations.NotNull()
    private final com.devlomi.fireapp.utils.network.FireManager fireManager = null;
    private com.devlomi.fireapp.utils.NewMessageHandler newMessageHandler;
    private boolean needsUpdate = false;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    public abstract boolean enablePresence();
    
    @org.jetbrains.annotations.NotNull()
    public final com.devlomi.fireapp.utils.network.FireManager getFireManager() {
        return null;
    }
    
    public void goingToUpdateActivity() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    public final void startUpdateActivity() {
    }
    
    private final void attachNewGroupListener() {
    }
    
    private final void attachDeletedMessageListener() {
    }
    
    private final void attachNewMessageListener() {
    }
    
    private final void attachNewCallsListener() {
    }
    
    private final io.reactivex.Completable deleteMessage(java.lang.String messageId) {
        return null;
    }
    
    private final io.reactivex.Completable deleteDeletedMessage(java.lang.String messageId) {
        return null;
    }
    
    private final io.reactivex.Completable deleteNewGroupEvent(java.lang.String groupId) {
        return null;
    }
    
    private final io.reactivex.Completable deleteNewCall(java.lang.String callId) {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public BaseActivity() {
        super();
    }
}