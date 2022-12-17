-if class com.android.model.responses.base.MoviesListResponse
-keepnames class com.android.model.responses.base.MoviesListResponse
-if class com.android.model.responses.base.MoviesListResponse
-keep class com.android.model.responses.base.MoviesListResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.android.model.responses.base.MoviesListResponse
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.android.model.responses.base.MoviesListResponse
-keepclassmembers class com.android.model.responses.base.MoviesListResponse {
    public synthetic <init>(java.util.List,int,int,int,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
