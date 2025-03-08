package com.penmenstudios.scriptwriterapp.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun DashboardTopBar() {
    TopAppBar(
        title = { Text("Scripts Dashboard", fontWeight = FontWeight.Bold) },
        actions = {
            IconButton(onClick = { /* TODO: Implement Search */ }) {
                Icon(Icons.Default.Search, contentDescription = "Search")
            }
            IconButton(onClick = { /* TODO: Implement Settings */ }) {
                Icon(Icons.Default.Settings, contentDescription = "Settings")
            }
        }
    )
}
