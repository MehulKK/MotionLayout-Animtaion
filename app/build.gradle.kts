plugins {
    androidApplication()
    kotlinAndroid()
    androidExtensions()
}

android {
    compileSdkVersion (Configs.compileSdkVersion)
    defaultConfig {
        applicationId = Configs.applicationId
        minSdkVersion (Configs.minSdkVersion)
        targetSdkVersion (Configs.targetSdkVersion)
        versionCode = Configs.versionCode
        versionName = Configs.versionName
        dataBinding.isEnabled = true
        vectorDrawables.useSupportLibrary = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(defaultFileTree())
    implement {
        kotlinstdLib()
        androidAppcompact()
        constraintLayout()
    }
}