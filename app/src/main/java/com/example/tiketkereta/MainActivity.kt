package com.example.tiketkereta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.tiketkereta.navigation.BottomNavigationBar
import com.example.tiketkereta.screen.NavGraphs
import com.example.tiketkereta.screen.destinations.BlankScreenDestination
import com.example.tiketkereta.screen.destinations.HomeScreenDestination
import com.example.tiketkereta.screen.destinations.TrainScreenDestination
import com.example.tiketkereta.ui.theme.TiketKeretaTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.rememberNavHostEngine

@OptIn(ExperimentalAnimationApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TiketKeretaTheme(darkTheme = false) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberAnimatedNavController()
                    val navHostEngine = rememberNavHostEngine()

                    val newsBackStackEntry by navController.currentBackStackEntryAsState()
                    val route = newsBackStackEntry?.destination?.route

                    BottomNavigationBar(
                        navController = navController,
                        showBottomBar = route in listOf(
                            HomeScreenDestination.route,
                            TrainScreenDestination.route,
                            BlankScreenDestination.route,
                        )
                    ) { paddingValues ->
                        Box(
                            modifier = Modifier.padding(paddingValues)
                        ) {
                            DestinationsNavHost(
                                navGraph = NavGraphs.root,
                                navController = navController,
                                engine = navHostEngine
                            )
                        }
                    }
                }
            }
        }
    }
}
