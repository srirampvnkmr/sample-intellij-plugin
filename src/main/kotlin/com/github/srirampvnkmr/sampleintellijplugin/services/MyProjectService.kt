package com.github.srirampvnkmr.sampleintellijplugin.services

import com.github.srirampvnkmr.sampleintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
