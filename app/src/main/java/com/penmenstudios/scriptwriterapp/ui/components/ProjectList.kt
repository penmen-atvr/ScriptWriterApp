package com.penmenstudios.scriptwriterapp.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ProjectList(navController: NavController) {
    val sampleProjects = listOf("Short Film", "Feature Film", "TV Series")

    LazyColumn {
        items(sampleProjects) { project ->
            ProjectCard(project, navController)
        }
    }
}
