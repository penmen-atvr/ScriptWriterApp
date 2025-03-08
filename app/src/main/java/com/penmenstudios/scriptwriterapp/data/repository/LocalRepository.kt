package com.penmenstudios.scriptwriterapp.data.repository

import com.penmenstudios.scriptwriterapp.data.local.Project
import com.penmenstudios.scriptwriterapp.data.local.ProjectDao

class LocalRepository(private val projectDao: ProjectDao) {

    suspend fun insertProject(project: Project) {
        projectDao.insertProject(project)
    }

    suspend fun getAllProjects(): List<Project> {
        return projectDao.getAllProjects()
    }
}
