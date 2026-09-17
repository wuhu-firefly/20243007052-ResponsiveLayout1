plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.lab1.constraint"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.lab1.constraint"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}
