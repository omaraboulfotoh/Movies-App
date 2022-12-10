-if class com.android.model.responses.base.error.AuthError
-keepnames class com.android.model.responses.base.error.AuthError
-if class com.android.model.responses.base.error.AuthError
-keep class com.android.model.responses.base.error.AuthErrorJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
