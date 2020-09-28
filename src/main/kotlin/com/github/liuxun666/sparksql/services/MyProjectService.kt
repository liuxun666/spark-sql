package com.github.liuxun666.sparksql.services

import com.intellij.openapi.project.Project
import com.github.liuxun666.sparksql.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
