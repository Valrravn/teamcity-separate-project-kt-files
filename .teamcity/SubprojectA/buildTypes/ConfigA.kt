package SubprojectA.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object ConfigA : BuildType({
    name = "Config A"

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
