package com.penmenstudios.scriptwriterapp.ui.components

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add

@Composable
fun AddProjectFab(navController: NavHostController) {
    FloatingActionButton(
        onClick = { navController.navigate("project_creation") },
        containerColor = Color.Blue
    ) {
        Icon(Icons.Default.Add, contentDescription = "Add Project")
    }
}
