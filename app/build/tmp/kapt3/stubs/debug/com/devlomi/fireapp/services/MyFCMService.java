package com.devlomi.fireapp.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/devlomi/fireapp/services/MyFCMService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "fireManager", "Lcom/devlomi/fireapp/utils/network/FireManager;", "newMessageHandler", "Lcom/devlomi/fireapp/utils/NewMessageHandler;", "updateChecker", "Lcom/devlomi/fireapp/utils/update/UpdateChecker;", "getUpdateChecker", "()Lcom/devlomi/fireapp/utils/update/UpdateChecker;", "updateChecker$delegate", "Lkotlin/Lazy;", "handleDeletedMessage", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "handleGroupEvent", "handleNewCall", "map", "handleNewGroup", "handleNewMessage", "onDestroy", "onMessageReceived", "onNewToken", "s", "", "app_debug"})
public final class MyFCMService extends com.google.firebase.messaging.FirebaseMessagingService {
    private com.devlomi.fireapp.utils.network.FireManager fireManager;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private com.devlomi.fireapp.utils.NewMessageHandler newMessageHandler;
    private final kotlin.Lazy updateChecker$delegate = null;
    
    private final com.devlomi.fireapp.utils.update.UpdateChecker getUpdateChecker() {
        return null;
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleNewCall(com.google.firebase.messaging.RemoteMessage map) {
    }
    
    private final void handleNewMessage(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleDeletedMessage(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleNewGroup(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleGroupEvent(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public MyFCMService() {
        super();
    }
}