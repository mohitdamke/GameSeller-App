package com.example.gameseller.auth

import com.google.firebase.auth.AuthResult

data class GoogleSignInState(
    val isLoading: Boolean = false,
    val isSuccess: AuthResult? = null,
    val isError: String? = ""
)