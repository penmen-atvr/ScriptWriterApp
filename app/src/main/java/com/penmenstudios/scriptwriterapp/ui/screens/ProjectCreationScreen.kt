package com.penmenstudios.scriptwriterapp.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ProjectCreationScreen(navController: NavHostController) {
    var projectName by remember { mutableStateOf("") }
    val context = LocalContext.current

    Scaffold(
        topBar = { TopAppBar(title = { Text("Create New Project") }) }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("Project Name:")
            BasicTextField(
                value = projectName,
                onValueChange = { projectName = it },
                modifier = Modifier.fillMaxWidth().padding(8.dp)
            )

            Button(
                onClick = {
                    if (projectName.isNotBlank()) {
                        Toast.makeText(context, "Project Created!", Toast.LENGTH_SHORT).show()
                        navController.navigate("scriptEditor/$projectName")
                    }
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("Create Project")
            }
        }
    }
}
