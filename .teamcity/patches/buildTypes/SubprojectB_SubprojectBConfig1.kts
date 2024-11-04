package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a buildType with id = 'SubprojectB_SubprojectBConfig1'
in the project with id = 'SubprojectB', and delete the patch script.
*/
create(RelativeId("SubprojectB"), BuildType({
    id("SubprojectB_SubprojectBConfig1")
    name = "SubprojectB: Config1"
}))

