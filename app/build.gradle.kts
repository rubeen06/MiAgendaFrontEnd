

plugins {
    alias(libs.plugins.androidApplication)

}

android {
    namespace = "com.example.miagenda"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.miagenda"
        minSdk = 19
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }


}

dependencies {
    // Bibliotecas de soporte de Android
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.vectordrawable)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)

    // Pruebas unitarias y de instrumentación
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Retrofit y OkHttp para networking
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.6.4")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.3")
    //gsno
    implementation ("com.google.code.gson:gson:2.8.8")
    implementation ("com.google.android.material:material:1.6.0") // Verifica que esta sea la última versión disponible


}
