package com.penmenstudios.scriptwriterapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.penmenstudios.scriptwriterapp.ui.screens.ScriptsDashboardScreen
import com.penmenstudios.scriptwriterapp.ui.screens.SettingsScreen
import com.penmenstudios.scriptwriterapp.ui.screens.ProjectCreationScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "dashboard") {
        composable("dashboard") { ScriptsDashboardScreen(navController) }
        composable("settings") { SettingsScreen(navController) }
        composable("project_creation") { ProjectCreationScreen(navController) }
    }
}
