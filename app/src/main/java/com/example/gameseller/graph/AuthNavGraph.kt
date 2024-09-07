package com.example.gameseller.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.gameseller.routes.AuthRouteScreen
import com.example.gameseller.routes.Graph
import com.example.gameseller.screen.LoginScreen

fun NavGraphBuilder.authNavGraph(rootNavController: NavHostController) {
    navigation(
        route = Graph.AuthGraph, startDestination = AuthRouteScreen.Login.route
    ) {

        composable(
            route = AuthRouteScreen.Login.route
        ) {
            LoginScreen(navController = rootNavController)
        }

    }
}