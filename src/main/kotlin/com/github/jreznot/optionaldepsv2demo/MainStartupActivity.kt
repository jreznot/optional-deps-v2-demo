package com.github.jreznot.optionaldepsv2demo

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class MainStartupActivity : ProjectActivity {
    override suspend fun execute(project: Project) {
        println("Hi Main")
    }
}