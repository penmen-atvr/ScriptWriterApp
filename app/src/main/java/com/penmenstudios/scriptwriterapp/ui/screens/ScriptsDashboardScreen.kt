package com.penmenstudios.scriptwriterapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.penmenstudios.scriptwriterapp.ui.components.AddProjectFab
import com.penmenstudios.scriptwriterapp.ui.components.DashboardTopBar
import com.penmenstudios.scriptwriterapp.ui.components.ProjectCard

@Composable
fun ScriptsDashboardScreen(navController: NavHostController) {
    Scaffold(
        topBar = { DashboardTopBar() },
        floatingActionButton = { AddProjectFab() }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            ProjectList()
        }
    }
}

@Composable
fun ProjectList() {
    val sampleProjects = listOf("Short Film", "Feature Film", "TV Series")

    LazyColumn {
        items(sampleProjects) { project ->
            ProjectCard(project)
        }
    }
}
