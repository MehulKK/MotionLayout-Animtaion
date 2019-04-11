import org.gradle.api.Project
import org.gradle.api.artifacts.ExternalModuleDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.add
import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

class DependencyScope {

    internal val list = ArrayList<Dep>()

    /**
     * overridden + operator to add dependencies
     * */
    operator fun String.unaryPlus() = list.add(Dep(this) {})

    /**
     * Overridden invoke operator that treats a string with parenthesis as a function call
     * and provides a configuration block
     * */
    operator fun String.invoke(configuration: ExternalModuleDependency.() -> Unit = {}) {
        list.add(Dep(this, configuration))
    }
}

/**
 * Data class to hold dependency and its configuration block
 * */
internal data class Dep(val dependency: String, val config: ExternalModuleDependency.() -> Unit = {})

fun DependencyHandlerScope.`classpaths`(func: DependencyScope.() -> Unit) =
    DependencyScope().apply {
        func()
        list.forEach { dep ->
            dependencies.add("classpath", dep.dependency, dep.config)
        }
    }

fun DependencyHandlerScope.`implement`(func : DependencyScope.() -> Unit) =
    DependencyScope().apply{
    func()
        list.forEach { dep ->
            dependencies.add("implementation", dep.dependency, dep.config)
        }

}

fun PluginDependenciesSpec.`androidApplication`(): PluginDependencySpec =
    id(Plugins.androidApplication)

fun PluginDependenciesSpec.`kotlinAndroid`() =
    this.kotlin(Plugins.kotlinAndroid)

fun PluginDependenciesSpec.`androidExtensions`() =
    this.kotlin(Plugins.kotlinExtensions)

fun Project.`defaultFileTree`() = fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar")))