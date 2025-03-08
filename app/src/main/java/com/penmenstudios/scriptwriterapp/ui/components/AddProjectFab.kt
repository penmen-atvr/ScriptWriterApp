package com.penmenstudios.scriptwriterapp.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AddProjectFab() {
    FloatingActionButton(
        onClick = { /* TODO: Navigate to Project Creation Screen */ },
        containerColor = Color.Blue
    ) {
        Icon(Icons.Default.Add, contentDescription = "Add Project")
    }
}
