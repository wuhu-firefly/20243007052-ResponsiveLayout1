plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.lab1.linear"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.lab1.linear"
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
