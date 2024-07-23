buildscript {
    ext {
        kotlin_version = '1.8.0' // or your required Kotlin version
        gradle_plugin_version = '8.1.1' // or your required version
    }
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:$gradle_plugin_version"
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        // Add other dependencies if needed
    }
}