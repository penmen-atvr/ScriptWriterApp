package com.penmenstudios.scriptwriterapp.ui.screens

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack // ✅ Updated import

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScriptEditorScreen(navController: NavHostController, scriptId: String?) {
    var scriptText by remember { mutableStateOf("") }
    var wordCount by remember { mutableStateOf(0) }

    // Auto-save logic (saves every 5 seconds)
    val handler = remember { Handler(Looper.getMainLooper()) }
    val saveRunnable = remember {
        Runnable {
            // TODO: Implement actual save logic (store in database)
            println("Auto-saving script: $scriptText")
        }
    }

    // Update word count whenever scriptText changes
    LaunchedEffect(scriptText) {
        wordCount = scriptText.split("\\s+".toRegex()).filter { it.isNotEmpty() }.size
        handler.removeCallbacks(saveRunnable)
        handler.postDelayed(saveRunnable, 5000) // Auto-save every 5 seconds
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Script Editor") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back") // ✅ Now using AutoMirrored
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text("Word Count: $wordCount", fontSize = 14.sp, modifier = Modifier.padding(bottom = 8.dp))

            BasicTextField(
                value = scriptText,
                onValueChange = { scriptText = it },
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                textStyle = LocalTextStyle.current.copy(fontSize = 18.sp)
            )
        }
    }
}
