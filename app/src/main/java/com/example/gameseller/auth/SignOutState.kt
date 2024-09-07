package com.example.gameseller.auth

data class SignOutState(
    val isLoading: Boolean = false,
    val isSuccess: String? = "",
    val isError: String? = "",
)