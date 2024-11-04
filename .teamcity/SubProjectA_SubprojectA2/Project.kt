package SubProjectA_SubprojectA2

import SubProjectA_SubprojectA2.buildTypes.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("SubProjectA_SubprojectA2")
    name = "SubprojectA_2"

    buildType(SubProjectA_SubprojectA2_SubprojectA2Config2)
    buildType(SubProjectA_SubprojectA2_SubprojectA2Config1)
})
