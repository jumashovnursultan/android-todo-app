package com.nursultan.todoapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nursultan.todoapp.ui.screens.LoginScreen
import com.nursultan.todoapp.ui.screens.TodoScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("todo") {
            LoginScreen()
        }
    }
}