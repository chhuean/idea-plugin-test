package com.github.chhuean.ideaplugintest.services

import com.github.chhuean.ideaplugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
