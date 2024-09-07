package com.example.gameseller.nav_main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gameseller.bottom_navigation.BottomNavigationBar
import com.example.gameseller.graph.MainNavGraph
import com.example.gameseller.ui.theme.DarkBlack
import com.example.gameseller.ui.theme.Gray

@Composable
fun MainScreen(
    rootNavController: NavHostController = rememberNavController(),
    homeNavController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                navController = homeNavController,
                modifier = Modifier.background(Gray)
            )
        },
    ) { padding ->


        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Gray)
                .windowInsetsPadding(
                    WindowInsets.safeDrawing.only(
                        WindowInsetsSides.Horizontal + WindowInsetsSides.Bottom
                    )
                ),
        ) {
            MainNavGraph(
                rootNavController = rootNavController,
                homeNavController = homeNavController
            )
        }


    }
}
