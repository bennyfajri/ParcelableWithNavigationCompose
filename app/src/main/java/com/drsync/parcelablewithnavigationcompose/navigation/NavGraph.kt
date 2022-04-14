package com.drsync.parcelablewithnavigationcompose.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.drsync.parcelablewithnavigationcompose.Person
import com.drsync.parcelablewithnavigationcompose.screens.details.DetailScreen
import com.drsync.parcelablewithnavigationcompose.screens.home.HomeScreen


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Details.route) {
            LaunchedEffect(key1 = it) {
                val result = navController.previousBackStackEntry?.savedStateHandle?.get<Person>("person")
                Log.d("DetailScreen", "SetupNavGraph: ${result?.firstName}")
                Log.d("DetailScreen", "SetupNavGraph: ${result?.lastName}")
            }
            DetailScreen(navController = navController)
        }
    }
}