package com.penmenstudios.scriptwriterapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ScriptEditorScreen(navController: NavHostController, projectId: String?) {
    var scriptContent by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Editing: $projectId") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Write Your Script:")
            BasicTextField(
                value = scriptContent,
                onValueChange = { scriptContent = it },
                modifier = Modifier.fillMaxWidth().height(400.dp).padding(8.dp)
            )

            Button(
                onClick = { /* TODO: Save script */ },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("Save Script")
            }
        }
    }
}
