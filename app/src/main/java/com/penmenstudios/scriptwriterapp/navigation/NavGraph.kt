package com.penmenstudios.scriptwriterapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.penmenstudios.scriptwriterapp.ui.screens.ScriptsDashboardScreen
import com.penmenstudios.scriptwriterapp.ui.screens.ProjectCreationScreen
import com.penmenstudios.scriptwriterapp.ui.screens.ScriptEditorScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "dashboard") {
        composable("dashboard") { ScriptsDashboardScreen(navController) }
        composable("createProject") { ProjectCreationScreen(navController) }
        composable("scriptEditor/{projectId}") { backStackEntry ->
            val projectId = backStackEntry.arguments?.getString("projectId")
            ScriptEditorScreen(navController, projectId)
        }
    }
}
