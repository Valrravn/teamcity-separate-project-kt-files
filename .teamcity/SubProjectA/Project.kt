package SubProjectA

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("SubProjectA")
    name = "SubProject A"

    subProject(SubProjectA_SubprojectA2.Project)
    subProject(SubProjectA_SubprojectA1.Project)
})
