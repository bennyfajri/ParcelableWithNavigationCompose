package com.drsync.parcelablewithnavigationcompose.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.drsync.parcelablewithnavigationcompose.Person
import com.drsync.parcelablewithnavigationcompose.screens.SharedViewModel
import com.drsync.parcelablewithnavigationcompose.screens.details.DetailScreen
import com.drsync.parcelablewithnavigationcompose.screens.home.HomeScreen


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    val sharedViewModel: SharedViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController, sharedViewModel = sharedViewModel)
        }
        composable(route = Screen.Details.route) {
            DetailScreen(navController = navController, sharedViewModel = sharedViewModel)
        }
    }
}