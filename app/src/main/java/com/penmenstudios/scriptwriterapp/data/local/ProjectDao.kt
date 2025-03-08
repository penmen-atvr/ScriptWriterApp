package com.penmenstudios.scriptwriterapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProjectDao {
    @Insert
    suspend fun insertProject(project: Project)

    @Query("SELECT * FROM projects ORDER BY createdAt DESC")
    suspend fun getAllProjects(): List<Project>
}
