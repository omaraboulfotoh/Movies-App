-if class com.android.model.responses.base.error.Error
-keepnames class com.android.model.responses.base.error.Error
-if class com.android.model.responses.base.error.Error
-keep class com.android.model.responses.base.error.ErrorJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.android.model.responses.base.error.Error
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.android.model.responses.base.error.Error
-keepclassmembers class com.android.model.responses.base.error.Error {
    public synthetic <init>(java.lang.String,java.lang.Long,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
