package com.example.jetpackcompose.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.jetpackcompose.navigation.destinations.listComposable
import com.example.jetpackcompose.navigation.destinations.taskComposable
import com.example.jetpackcompose.util.Constants.LIST_SCREEN

@SuppressLint("RememberReturnType")
@Composable
fun SetupNavigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }
    NavHost(navController = navController, startDestination = LIST_SCREEN) {
        listComposable(navigateToTaskScreen = screen.task)
        taskComposable(navigateToListScreen = screen.list)

    }
}