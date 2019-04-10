plugins {
    androidApplication()
    kotlinAndroid()
    androidExtensions()
}

android {
    compileSdkVersion (28)
    defaultConfig {
        applicationId = "com.mehulk.motionlayout"
        minSdkVersion (15)
        targetSdkVersion (28)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21")
    implementation ("com.android.support:appcompat-v7:28.0.0")
    //implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    implementation ("com.android.support.constraint:constraint-layout:2.0.0-alpha4")
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("com.android.support.test:runner:1.0.2")
    androidTestImplementation ("com.android.support.test.espresso:espresso-core:3.0.2")
}