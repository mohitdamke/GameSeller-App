package com.example.gameseller.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    Column {
        Text(text = "SearchScreen")
    }
}