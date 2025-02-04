package com.example.effecthandlers.launched_effect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

@Composable
fun LaunchedEffectFlowDemo(
    viewModel: LaunchedEffectViewModel
) {

    LaunchedEffect(key1 = true) {
        viewModel.sharedFlow.collect { event ->
            when (event) {
                is LaunchedEffectViewModel.ScreenEvents.Navigate -> TODO()
                is LaunchedEffectViewModel.ScreenEvents.ShowSnackbar -> TODO()
            }
        }
    }

}