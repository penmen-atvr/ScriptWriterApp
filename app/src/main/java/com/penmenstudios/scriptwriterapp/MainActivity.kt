package com.penmenstudios.scriptwriterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.*
import com.penmenstudios.scriptwriterapp.ui.theme.ScriptWriterAppTheme
import com.penmenstudios.scriptwriterapp.navigation.NavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScriptWriterAppTheme {
                val navController = rememberNavController()
                Surface(color = MaterialTheme.colorScheme.background) {
                    NavGraph(navController = navController)
                }
            }
        }
    }
}
