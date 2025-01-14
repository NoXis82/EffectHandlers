package com.example.effecthandlers.side_effect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
fun SideEffectDemo(nonComposeCounter: Int) {
    SideEffect {
        println("Called after every successful recomposition")
    }
}