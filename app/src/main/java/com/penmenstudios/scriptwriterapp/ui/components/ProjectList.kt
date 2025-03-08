package com.penmenstudios.scriptwriterapp.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ProjectList(navController: NavHostController) {
    val sampleProjects = listOf("Short Film", "Feature Film", "TV Series")

    LazyColumn {
        items(sampleProjects) { project ->
            ProjectCard(
                title = project,
                onClick = { navController.navigate("project_creation") } // ✅ Pass onClick action
            )
        }
    }
}
