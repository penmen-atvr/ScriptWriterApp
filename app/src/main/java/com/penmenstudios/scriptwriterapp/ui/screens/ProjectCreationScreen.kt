package com.penmenstudios.scriptwriterapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ProjectCreationScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Create New Project") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            var projectName by remember { mutableStateOf("") }

            OutlinedTextField(
                value = projectName,
                onValueChange = { projectName = it },
                label = { Text("Project Name") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { /* TODO: Save Project and Navigate Back */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Create Project")
            }
        }
    }
}
