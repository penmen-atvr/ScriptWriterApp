package com.penmenstudios.scriptwriterapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.penmenstudios.scriptwriterapp.ui.components.AddProjectFab
import com.penmenstudios.scriptwriterapp.ui.components.DashboardTopBar
import com.penmenstudios.scriptwriterapp.ui.components.ProjectCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScriptsDashboardScreen(navController: NavHostController) {
    Scaffold(
        topBar = { DashboardTopBar() },
        floatingActionButton = { AddProjectFab(navController) }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            ProjectList(navController)
        }
    }
}

@Composable
fun ProjectList(navController: NavHostController) {
    val sampleProjects = listOf("Short Film", "Feature Film", "TV Series")

    LazyColumn {
        items(sampleProjects) { project ->
            ProjectCard(title = project, onClick = { navController.navigate("project_creation") }) // ✅ Now valid
        }
    }
}
