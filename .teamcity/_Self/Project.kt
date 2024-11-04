package _Self

import _Self.buildTypes.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({

    buildType(MainProjectConfigB)
    buildType(MainProjectConfigA)

    subProject(SubprojectB.Project)
    subProject(SubProjectA.Project)
})
