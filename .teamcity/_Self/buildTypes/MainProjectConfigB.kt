package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object MainProjectConfigB : BuildType({
    name = "Main Project, Config B"

    steps {
        // Build Steps
    }

    dependencies {
        // Snapshot and artifact dependencies
    }

    triggers {
        // Triggers
    }
})
