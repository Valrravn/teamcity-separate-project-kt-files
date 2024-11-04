package SubprojectB

import SubprojectB.buildTypes.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("SubprojectB")
    name = "Subproject B"

    buildType(SubprojectB_SubprojectBConfig2)
    buildType(SubprojectB_SubprojectBConfig1)
})
