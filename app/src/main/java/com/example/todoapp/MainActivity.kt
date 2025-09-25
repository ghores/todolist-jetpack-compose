package com.example.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.todoapp.navigation.SetupNavigation
import com.example.todoapp.ui.components.SetStatusBarColor
import com.example.todoapp.ui.theme.TodoAppTheme
import com.example.todoapp.ui.theme.statusBarColor
import com.example.todoapp.ui.viewmodels.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navcontroller: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoAppTheme {
                SetStatusBarColor(color = MaterialTheme.colors.statusBarColor)
                navcontroller = rememberNavController()
                SetupNavigation(
                    navController = navcontroller,
                    sharedViewModel = sharedViewModel
                )
            }
        }
    }
}