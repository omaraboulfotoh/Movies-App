-if class com.android.model.responses.base.BaseWrapper
-keepnames class com.android.model.responses.base.BaseWrapper
-if class com.android.model.responses.base.BaseWrapper
-keep class com.android.model.responses.base.BaseWrapperJsonAdapter {
    public <init>(com.squareup.moshi.Moshi,java.lang.reflect.Type[]);
}
-if class com.android.model.responses.base.BaseWrapper
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.android.model.responses.base.BaseWrapper
-keepclassmembers class com.android.model.responses.base.BaseWrapper {
    public synthetic <init>(java.lang.Object,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
