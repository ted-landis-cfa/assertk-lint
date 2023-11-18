plugins {
    id("java-library")
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.androidLint)
}

lint {
    htmlReport = true
    textReport = true
    absolutePaths = false
    ignoreTestSources = true
    warningsAsErrors = true

    disable += "JavaPluginLanguageLevel"
}

dependencies {
    compileOnly(libs.bundles.lint.api)
    testImplementation(libs.bundles.lint.tests)
}