package com.penmenstudios.scriptwriterapp.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings

@OptIn(ExperimentalMaterial3Api::class) // ✅ Fix for the experimental API warning
@Composable
fun DashboardTopBar() {
    TopAppBar(
        title = { Text("Scripts Dashboard", fontWeight = FontWeight.Bold) },
        actions = {
            IconButton(onClick = { /* TODO: Implement Search */ }) {
                Icon(Icons.Filled.Search, contentDescription = "Search")
            }
            IconButton(onClick = { /* TODO: Implement Settings */ }) {
                Icon(Icons.Filled.Settings, contentDescription = "Settings")
            }
        }
    )
}
