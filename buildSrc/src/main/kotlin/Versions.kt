import kotlin.String
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
  const val de_fayard_buildsrcversions_gradle_plugin: String = "0.5.0" // available: "0.7.0"

  const val com_android_tools_build_gradle: String = "3.5.3"

  const val gradle_maven_publish_plugin: String = "0.8.0"

  const val androidx_test_ext_junit: String = "1.1.0" // available: "1.1.1"

  const val androidx_test_runner: String = "1.2.0"

  const val org_jetbrains_kotlin: String = "1.3.61"

  const val androidx_arch_core: String = "2.1.0"

  const val work_runtime_ktx: String = "2.2.0"

  const val room_compiler: String = "2.0.0" // available: "2.2.2"

  const val espresso_core: String = "3.1.1" // available: "3.2.0"

  const val assertj_core: String = "3.14.0"

  const val lint_gradle: String = "26.5.3"

  const val junit_junit: String = "4.12"

  const val appcompat: String = "1.0.2" // available: "1.1.0"

  const val core_ktx: String = "1.1.0"

  const val io_mockk: String = "1.8.13" // available: "1.9.3"

  const val timber: String = "4.7.1"

  const val okhttp: String = "3.11.0" // available: "4.2.2"

  const val aapt2: String = "3.5.3-5435860"

  const val gson: String = "2.8.6"

  /**
   *
   * See issue 19: How to update Gradle itself?
   * https://github.com/jmfayard/buildSrcVersions/issues/19
   */
  const val gradleLatestVersion: String = "6.0.1"

  const val gradleCurrentVersion: String = "5.4.1"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
  inline get() =
      id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)