package com.devlomi.fireapp.activities.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/devlomi/fireapp/activities/authentication/StateEvent;", "", "()V", "AuthResult", "NumberEntered", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$NumberEntered;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult;", "app_debug"})
public abstract class StateEvent {
    
    private StateEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/devlomi/fireapp/activities/authentication/StateEvent$NumberEntered;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent;", "phoneNumber", "", "(Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class NumberEntered extends com.devlomi.fireapp.activities.authentication.StateEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String phoneNumber = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhoneNumber() {
            return null;
        }
        
        public NumberEntered(@org.jetbrains.annotations.NotNull()
        java.lang.String phoneNumber) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.devlomi.fireapp.activities.authentication.StateEvent.NumberEntered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String phoneNumber) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent;", "()V", "CodeAutoRetrievalTimeOut", "CodeSent", "VerificationCompleted", "VerificationFailed", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult$VerificationCompleted;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult$VerificationFailed;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult$CodeSent;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult$CodeAutoRetrievalTimeOut;", "app_debug"})
    public static abstract class AuthResult extends com.devlomi.fireapp.activities.authentication.StateEvent {
        
        private AuthResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult$VerificationCompleted;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult;", "authCredential", "Lcom/google/firebase/auth/PhoneAuthCredential;", "(Lcom/google/firebase/auth/PhoneAuthCredential;)V", "getAuthCredential", "()Lcom/google/firebase/auth/PhoneAuthCredential;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class VerificationCompleted extends com.devlomi.fireapp.activities.authentication.StateEvent.AuthResult {
            @org.jetbrains.annotations.NotNull()
            private final com.google.firebase.auth.PhoneAuthCredential authCredential = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.firebase.auth.PhoneAuthCredential getAuthCredential() {
                return null;
            }
            
            public VerificationCompleted(@org.jetbrains.annotations.NotNull()
            com.google.firebase.auth.PhoneAuthCredential authCredential) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.firebase.auth.PhoneAuthCredential component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.devlomi.fireapp.activities.authentication.StateEvent.AuthResult.VerificationCompleted copy(@org.jetbrains.annotations.NotNull()
            com.google.firebase.auth.PhoneAuthCredential authCredential) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult$VerificationFailed;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult;", "exception", "Lcom/google/firebase/FirebaseException;", "(Lcom/google/firebase/FirebaseException;)V", "getException", "()Lcom/google/firebase/FirebaseException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class VerificationFailed extends com.devlomi.fireapp.activities.authentication.StateEvent.AuthResult {
            @org.jetbrains.annotations.NotNull()
            private final com.google.firebase.FirebaseException exception = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.firebase.FirebaseException getException() {
                return null;
            }
            
            public VerificationFailed(@org.jetbrains.annotations.NotNull()
            com.google.firebase.FirebaseException exception) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.firebase.FirebaseException component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.devlomi.fireapp.activities.authentication.StateEvent.AuthResult.VerificationFailed copy(@org.jetbrains.annotations.NotNull()
            com.google.firebase.FirebaseException exception) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult$CodeSent;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult;", "code", "", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class CodeSent extends com.devlomi.fireapp.activities.authentication.StateEvent.AuthResult {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String code = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode() {
                return null;
            }
            
            public CodeSent(@org.jetbrains.annotations.NotNull()
            java.lang.String code) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.devlomi.fireapp.activities.authentication.StateEvent.AuthResult.CodeSent copy(@org.jetbrains.annotations.NotNull()
            java.lang.String code) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult$CodeAutoRetrievalTimeOut;", "Lcom/devlomi/fireapp/activities/authentication/StateEvent$AuthResult;", "p0", "", "(Ljava/lang/String;)V", "getP0", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class CodeAutoRetrievalTimeOut extends com.devlomi.fireapp.activities.authentication.StateEvent.AuthResult {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String p0 = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getP0() {
                return null;
            }
            
            public CodeAutoRetrievalTimeOut(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.devlomi.fireapp.activities.authentication.StateEvent.AuthResult.CodeAutoRetrievalTimeOut copy(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}