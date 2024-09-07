package com.example.gameseller.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gameseller.routes.Graph
import com.example.gameseller.routes.MainRouteScreen
import com.example.gameseller.screen.AddPostScreen
import com.example.gameseller.screen.ChatScreen
import com.example.gameseller.screen.HomeScreen
import com.example.gameseller.screen.ProfileScreen
import com.example.gameseller.screen.SearchScreen

@Composable
fun MainNavGraph(
    rootNavController: NavHostController,
    homeNavController: NavHostController
) {


    NavHost(
        navController = homeNavController,
        route = Graph.MainScreenGraph,
        startDestination = MainRouteScreen.Home.route,
    ) {
        composable(route = MainRouteScreen.Home.route){
            HomeScreen(rootNavController = rootNavController, homeNavController = homeNavController)
        }

        composable(route = MainRouteScreen.Search.route){
            SearchScreen(navController = rootNavController)
        }

        composable(route = MainRouteScreen.AddPost.route){
            AddPostScreen(navController = homeNavController)
        }

        composable(route = MainRouteScreen.Chat.route){
            ChatScreen(navController = rootNavController)
        }

        composable(route = MainRouteScreen.Profile.route){
            ProfileScreen(navController = rootNavController)
        }
    }
}