package com.github.jreznot.optionaldepsv2demo.subpkg

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class SubModuleStartupActivity : ProjectActivity {
    override suspend fun execute(project: Project) {
        println("Hi Module")
    }
}