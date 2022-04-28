package com.devlomi.fireapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012J\u001a\u0010\u0014\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012J\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0013H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/devlomi/fireapp/utils/NewMessageHandler;", "", "context", "Landroid/content/Context;", "fireManager", "Lcom/devlomi/fireapp/utils/network/FireManager;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "(Landroid/content/Context;Lcom/devlomi/fireapp/utils/network/FireManager;Lio/reactivex/disposables/CompositeDisposable;)V", "getContext", "()Landroid/content/Context;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "getFireManager", "()Lcom/devlomi/fireapp/utils/network/FireManager;", "handleDeletedMessage", "", "map", "", "", "handleGroupEvent", "handleNewCall", "fireCall", "Lcom/devlomi/fireapp/model/realms/FireCall;", "handleNewGroup", "handleNewMessage", "phone", "message", "Lcom/devlomi/fireapp/model/realms/Message;", "saveMessageAndUpdateCount", "user", "Lcom/devlomi/fireapp/model/realms/User;", "setMessageStat", "messageId", "chatId", "app_debug"})
public final class NewMessageHandler {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.devlomi.fireapp.utils.network.FireManager fireManager = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    public final void handleNewMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.devlomi.fireapp.model.realms.Message message) {
    }
    
    private final void saveMessageAndUpdateCount(com.devlomi.fireapp.model.realms.Message message, java.lang.String phone) {
    }
    
    private final void saveMessageAndUpdateCount(com.devlomi.fireapp.model.realms.Message message, com.devlomi.fireapp.model.realms.User user) {
    }
    
    private final void setMessageStat(java.lang.String messageId, java.lang.String chatId) {
    }
    
    public final void handleDeletedMessage(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void handleGroupEvent(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void handleNewGroup(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void handleNewCall(@org.jetbrains.annotations.NotNull()
    com.devlomi.fireapp.model.realms.FireCall fireCall) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.devlomi.fireapp.utils.network.FireManager getFireManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    public NewMessageHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.devlomi.fireapp.utils.network.FireManager fireManager, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposables) {
        super();
    }
}