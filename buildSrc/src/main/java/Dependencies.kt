
object Plugins{
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "android"
    const val kotlinExtensions = "android.extensions"
}

object Configs{
    const val applicationId = "com.mehulk.motionlayout"
    const val minSdkVersion = 15
    const val targetSdkVersion = 28
    const val versionCode = 1
    const val versionName = "1.0"
    const val compileSdkVersion = 28

}


object Versions{
    const val gradlePlugin = "3.3.2"
    const val kotlinPlugin = "1.3.21"

    const val kotlin = "1.3.21"

    //Support Libs
    const val androidSupport = "28.0.0"
    const val constraint = "2.0.0-alpha4"
}

const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinPlugin}"
const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePlugin}"


// Dependencies
const val kotlinstdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
const val androidAppcompact = "com.android.support:appcompat-v7:${Versions.androidSupport}"
const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraint}"