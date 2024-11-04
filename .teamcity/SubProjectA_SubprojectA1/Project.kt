package SubProjectA_SubprojectA1

import SubProjectA_SubprojectA1.buildTypes.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("SubProjectA_SubprojectA1")
    name = "SubprojectA_1"

    buildType(SubProjectA_SubprojectA1_SubprojectA1Config1)
    buildType(SubProjectA_SubprojectA1_SubprojectA1Config2)
})
