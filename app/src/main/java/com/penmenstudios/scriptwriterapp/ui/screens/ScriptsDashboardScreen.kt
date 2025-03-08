package com.penmenstudios.scriptwriterapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.penmenstudios.scriptwriterapp.data.local.Project
import com.penmenstudios.scriptwriterapp.ui.components.AddProjectFab
import com.penmenstudios.scriptwriterapp.ui.components.DashboardTopBar
import com.penmenstudios.scriptwriterapp.ui.components.ProjectCard
import com.penmenstudios.scriptwriterapp.viewmodel.ProjectViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScriptsDashboardScreen(navController: NavHostController, viewModel: ProjectViewModel = viewModel()) {
    val projects by viewModel.projects.collectAsState()

    Scaffold(
        topBar = { DashboardTopBar() },
        floatingActionButton = { AddProjectFab(navController) }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            if (projects.isEmpty()) {
                Text(
                    text = "No projects available. Create one!",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
            } else {
                LazyColumn {
                    items(projects) { project ->
                        ProjectCard(
                            title = project.name,
                            onClick = { navController.navigate("script_editor/${project.name}") }
                        )
                    }
                }
            }
        }
    }
}
