plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.21" apply false
    id("kotlin-kapt") apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
