plugins {
    id("com.gradle.develocity") version "3.17.3"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.0.1"
}

develocity {
    buildScan {
        termsOfUseUrl = "https://gradle.com/help/legal-terms-of-use"
        termsOfUseAgree = "yes"
        uploadInBackground = false
    }
}

rootProject.name = "kotlin-dsl"

