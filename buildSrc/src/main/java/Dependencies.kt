
object Plugins{
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "android"
    const val kotlinExtensions = "android.extensions"
}


object Versions{
    const val gradlePlugin = "3.3.2"
    const val kotlinPlugin = "1.3.21"
}

const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinPlugin}"
const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePlugin}"