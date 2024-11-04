package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object MainProjectConfigA : BuildType({
    name = "Main Project, Config A"

    steps {
        // Build Steps
    }

    parameters {
        // Build Parameters
    }

    dependencies {
        // Snapshot and artifact dependencies
    }

    triggers {
        // Triggers
    }
})
