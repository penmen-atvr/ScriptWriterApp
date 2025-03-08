package com.penmenstudios.scriptwriterapp.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add

@Composable
fun AddProjectFab(navController: NavHostController) {
    FloatingActionButton(
        onClick = { navController.navigate("project_creation") }, // ✅ Navigate to Create Project
        containerColor = Color.Blue
    ) {
        Icon(Icons.Default.Add, contentDescription = "Add Project")
    }
}
