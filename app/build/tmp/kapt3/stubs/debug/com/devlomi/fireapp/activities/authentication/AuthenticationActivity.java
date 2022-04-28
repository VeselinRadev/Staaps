package com.devlomi.fireapp.activities.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001eH\u0014J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\tH\u0016J\u0018\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006-"}, d2 = {"Lcom/devlomi/fireapp/activities/authentication/AuthenticationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/devlomi/fireapp/activities/authentication/AuthCallbacks;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "authCallback", "Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "currentPhoneNumber", "", "isCancelled", "", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "setNavHostFragment", "(Landroidx/navigation/fragment/NavHostFragment;)V", "navigation", "Landroidx/navigation/NavController;", "resendToken", "Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "storedVerificationId", "viewModel", "Lcom/devlomi/fireapp/activities/authentication/AuthenticationViewModel;", "getViewModel", "()Lcom/devlomi/fireapp/activities/authentication/AuthenticationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "cancelVerificationRequest", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setLoading", "signInWithCredential", "credential", "Lcom/google/firebase/auth/PhoneAuthCredential;", "startSplashActivity", "verifyCode", "code", "verifyPhoneNumber", "phoneNumber", "countryCode", "app_debug"})
public final class AuthenticationActivity extends androidx.appcompat.app.AppCompatActivity implements com.devlomi.fireapp.activities.authentication.AuthCallbacks {
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isCancelled = false;
    private java.lang.String storedVerificationId = "";
    private com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken resendToken;
    private com.google.firebase.auth.FirebaseAuth auth;
    private androidx.navigation.NavController navigation;
    private com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks authCallback;
    @org.jetbrains.annotations.NotNull()
    public androidx.navigation.fragment.NavHostFragment navHostFragment;
    private java.lang.String currentPhoneNumber = "";
    private java.util.HashMap _$_findViewCache;
    
    private final com.devlomi.fireapp.activities.authentication.AuthenticationViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.fragment.NavHostFragment getNavHostFragment() {
        return null;
    }
    
    public final void setNavHostFragment(@org.jetbrains.annotations.NotNull()
    androidx.navigation.fragment.NavHostFragment p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void verifyPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
    }
    
    @java.lang.Override()
    public void verifyCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    @java.lang.Override()
    public void cancelVerificationRequest() {
    }
    
    private final void signInWithCredential(com.google.firebase.auth.PhoneAuthCredential credential) {
    }
    
    private final void setLoading(boolean setLoading) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void startSplashActivity() {
    }
    
    public AuthenticationActivity() {
        super();
    }
}