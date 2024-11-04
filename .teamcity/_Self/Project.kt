package MainProject

import MainProject.buildTypes.*

object Project : Project({
    id("MainProject")
    name = "Main Project"

    buildType(MainProject_MainProjectConfigA)
    buildType(MainProject_MainProjectConfigB)

    subProject(MainProject_SubprojectA.Project)
    subProject(MainProject_SubprojectB.Project)
    subProject(MainProject_SubprojectC.Project)
})
