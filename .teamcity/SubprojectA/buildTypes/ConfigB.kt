package SubprojectA.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object ConfigB : BuildType({
    name = "Config B"

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
