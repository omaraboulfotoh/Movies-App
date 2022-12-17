-if class com.android.model.movie.MovieModel
-keepnames class com.android.model.movie.MovieModel
-if class com.android.model.movie.MovieModel
-keep class com.android.model.movie.MovieModelJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.android.model.movie.MovieModel
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.android.model.movie.MovieModel
-keepclassmembers class com.android.model.movie.MovieModel {
    public synthetic <init>(java.lang.Integer,java.lang.String,java.lang.String,java.lang.String,java.lang.Double,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.Float,java.lang.Integer,java.lang.Boolean,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
