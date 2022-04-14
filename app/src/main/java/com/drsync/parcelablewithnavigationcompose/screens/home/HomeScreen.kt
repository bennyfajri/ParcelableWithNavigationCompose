package com.drsync.parcelablewithnavigationcompose.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.drsync.parcelablewithnavigationcompose.Person
import com.drsync.parcelablewithnavigationcompose.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                val person = Person(firstName = "Benny", lastName = "Fajri")
                navController.currentBackStackEntry?.savedStateHandle?.set(
                    "person",
                    person
                )
                navController.navigate(Screen.Details.route)
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Home",
            style = TextStyle(
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold
            )
        )
    }
}