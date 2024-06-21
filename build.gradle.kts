plugins {
    id("com.android.application") version "8.5.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.10" apply false
}

// Optionally include dependency management, if using versions catalog or dependencies block
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            // Define your versions and libraries here
            version("androidPlugin", "8.5.0")
            version("kotlinPlugin", "1.8.10")
            version("serializationPlugin", "1.8.10")
            // Add other versions and libraries as needed
        }
    }
}
