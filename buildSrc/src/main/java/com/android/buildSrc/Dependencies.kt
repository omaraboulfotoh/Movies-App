@file:Suppress("PackageDirectoryMismatch")

object Dependencies {

    //Support
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"

    //UI
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val swipeRefreshLayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayoutVersion}"
    const val animationLib = "com.daimajia.androidanimations:library:${Versions.animation}"

    //Testing
    const val junit4 = "junit:junit:${Versions.junit4Version}"
    const val junitExtensions = "androidx.test.ext:junit:${Versions.junitExtensionsVersion}"
    const val junitExtensionsKtx = "androidx.test.ext:junit-ktx:${Versions.junitExtensionsVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
    const val mockk = "io.mockk:mockk:${Versions.mockkVersion}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectricVersion}"
    const val androidArchCoreTest =
        "androidx.arch.core:core-testing:${Versions.androidArchCoreTest}"
    const val truth = "com.google.truth:truth:${Versions.truthVersion}"


    //DI
    const val daggerHilt = "com.google.dagger:hilt-android:${Versions.daggerHiltVersion}"
    const val daggerHiltCompiler =
        "com.google.dagger:hilt-android-compiler:${Versions.daggerHiltVersion}"

    //2.42
    //Networking
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitMoshiConverter =
        "com.squareup.retrofit2:converter-moshi:${Versions.retrofitVersion}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"
    const val sandwish = "com.github.skydoves:sandwich:${Versions.sandwishVersion}"

    //Json
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshiVersion}"
    const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshiVersion}"
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"

    //Threading
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val coroutinesCoreAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesVersion}"

    //Code Style
    const val ktlint = "com.pinterest:ktlint:${Versions.ktlintVersion}"

    //Jetpack Compose
    const val composeMaterial = "androidx.compose.material:material:${Versions.composeVersion}"
    const val composeAnimation = "androidx.compose.animation:animation:${Versions.composeVersion}"
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val composeActivity =
        "androidx.activity:activity-compose:${Versions.composeActivityVersion}"
    const val composeViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModelVersion}"
    const val composeLiveData =
        "androidx.compose.runtime:runtime-livedata:${Versions.composeVersion}"
    const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val composeConstraintLayout =
        "androidx.constraintlayout:constraintlayout-compose:${Versions.composeConstraintLayoutVersion}"
    const val composeNavigation =
        "androidx.navigation:navigation-compose:${Versions.composeNavigationVersion}"
    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
    const val accompanistSwipeRefresh =
        "com.google.accompanist:accompanist-swiperefresh:${Versions.accompanistSwipeRefresh}"
    const val lottieCompose = "com.airbnb.android:lottie-compose:${Versions.lottieVersion}"

    //Navigation
    const val navigationComponent =
        "androidx.navigation:navigation-ui-ktx:${Versions.composeNavigationVersion}"
    const val navigationComponentFrag =
        "androidx.navigation:navigation-fragment-ktx:${Versions.composeNavigationVersion}"


    const val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacy}"

    //Data (Room - DataStore)
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"
    const val datastore = "androidx.datastore:datastore:${Versions.datastoreVersion}"
    const val datastorePrefers =
        "androidx.datastore:datastore-preferences:${Versions.datastoreVersion}"
    const val picasso = "com.squareup.picasso:picasso:${Versions.picassoVersion}"

    //Lifecycle
    const val lifecycle_viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeycycleVersion}"
    const val lifecycle_liveData =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeycycleVersion}"
    const val lifecycle_runtime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeycycleVersion_runtime}"


    //Firebase
    const val firebase_bom = "com.google.firebase:firebase-bom:${Versions.firebaseBomVersion}"
    const val firebaseAuth = "com.google.firebase:firebase-auth-ktx"
    const val firebaseDyamicLinks = "com.google.firebase:firebase-dynamic-links-ktx"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"
    val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"

    // utils
    const val timber = "com.jakewharton.timber:timber:${Versions.timber_version}"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.stdlib_version}"
    const val annotations = "androidx.annotation:annotation:1.2.0"
    const val uiPinView = "com.github.GoodieBag:Pinview:1.4"

    const val koin_core = "io.insert-koin:koin-core:${Versions.koin}"

    const val koin_android = "io.insert-koin:koin-android:${Versions.koin}"

    const val koin_java_compat = "io.insert-koin:koin-android-compat:${Versions.koin}"

    const val koin_viewmodel = "io.insert-koin:koin-android-viewmodel:${Versions.koin}"

    const val rxandroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxandroid}"

    const val rxjava = "io.reactivex.rxjava3:rxjava:${Versions.rxjava3}"
    const val rxKotlin = "io.reactivex.rxjava3:rxkotlin:${Versions.rxKotlin}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val DATE_TIME = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.DATE_TIME}"
    const val ATOMICS = "org.jetbrains.kotlinx:atomicfu:${Versions.ATOMICS}"


    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.Android.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.Android.MATERIAL}"

    // Compose
    const val ACTIVITY_COMPOSE =
        "androidx.activity:activity-compose:${Versions.Android.ACTIVITY_COMPOSE}"
    const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.Android.COMPOSE}"
    const val COMPOSE_UI_UTIL = "androidx.compose.ui:ui-util:${Versions.Android.COMPOSE_UTIL}"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.Android.COMPOSE}"
    const val COMPOSE_UI_TOOLING_PREVIEW =
        "androidx.compose.ui:ui-tooling-preview:${Versions.Android.COMPOSE}"
    const val COMPOSE_MATERIAL = "androidx.compose.material:material:${Versions.Android.COMPOSE}"
    const val COMPOSE_MATERIAL_ICONS_EXTENDED =
        "androidx.compose.material:material-icons-extended:${Versions.Android.COMPOSE}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout-compose:${Versions.Android.CONSTRAINT_LAYOUT}"
    const val MATERIAL3 = "androidx.compose.material3:material3:${Versions.Android.MATERIAL3}"

    // Navigation
    const val COMPOSE =
        "androidx.navigation:navigation-compose:${Versions.Android.NAVIGATION}"
    const val HILT = "androidx.hilt:hilt-navigation-compose:${Versions.Injection.COMPOSE}"
    const val COMPOSE_DESTINATION =
        "io.github.raamcosta.compose-destinations:core:${Versions.Android.COMPOSE_DESTINATION}"
    const val COMPOSE_DESTINATION_KSP =
        "io.github.raamcosta.compose-destinations:ksp:${Versions.Android.COMPOSE_DESTINATION}"

    const val COMPOSE_VIEW_MODEL =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.Android.VIEW_MODEL}"

    const val CORE = "androidx.core:core-ktx:${Versions.Android.CORE_KTX}"
    const val COLLECTION =
        "androidx.collection:collection-ktx:${Versions.Android.COLLECTION_KTX}"
    const val ACTIVITY = "androidx.activity:activity-ktx:${Versions.Android.ACTIVITY_KTX}"
    const val FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.Android.FRAGMENT_KTX}"
    const val PALETTE = "androidx.palette:palette-ktx:${Versions.Android.PALETTE_KTX}"
    const val WORKER = "androidx.work:work-runtime-ktx:${Versions.Android.WORKER_KTX}"
    const val HILT_WORKER = "androidx.hilt:hilt-work:${Versions.Android.HILT_WORKER_KTX}"
    const val HILT_COMPILER =
        "androidx.hilt:hilt-compiler:${Versions.Android.HILT_WORKER_KTX}"

    const val PAGER =
        "com.google.accompanist:accompanist-pager:${Versions.Android.ACCOMPANIST_PAGER}"
    const val PAGER_INDICATORS =
        "com.google.accompanist:accompanist-pager-indicators:${Versions.Android.ACCOMPANIST_PAGER_INDICATORS}"
    const val SYSTEM_UI_CONTROLLER =
        "com.google.accompanist:accompanist-systemuicontroller:${Versions.Android.ACCOMPANIST_SYSTEM_UI}"

    const val COIL = "io.coil-kt:coil-compose:${Versions.COIL}"
}
