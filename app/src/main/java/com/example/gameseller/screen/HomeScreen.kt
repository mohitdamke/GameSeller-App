package com.example.gameseller.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.gameseller.ui.theme.White

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    rootNavController: NavHostController,
    homeNavController: NavHostController
) {
    Column(modifier = modifier.fillMaxSize().background(White)) {
        Text(text = "HomeScreen")
    }
}