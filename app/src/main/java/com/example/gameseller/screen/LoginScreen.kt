package com.example.gameseller.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.gameseller.routes.Graph
import com.example.gameseller.routes.MainRouteScreen
import kotlinx.coroutines.delay

@Composable
fun LoginScreen(modifier: Modifier = Modifier, navController: NavController) {

    Column {
        Text(text = "LoginScreen")

        Button(onClick = { navController.navigate(Graph.MainScreenGraph) }) {
            Text(text = "MAin")
        }
    }
}