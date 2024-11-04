package SubprojectA

import SubprojectA.buildTypes.*
import jetbrains.buildServer.configs.kotlin.*

object Project : Project({
    id("SubprojectA")
    name = "Subproject A"

    buildType(SubprojectA_ConfigA)
    buildType(SubprojectA_ConfigB)
    buildType(SubprojectA_ConfigC)
})
