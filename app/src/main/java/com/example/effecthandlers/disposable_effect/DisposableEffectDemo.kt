package com.example.effecthandlers.disposable_effect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleObserver

@Composable
fun DisposableEffectDemo() {
    val lifecycleOwner = LocalLifecycleOwner.current
//    val observer = LifecycleEventObserver { _, event ->
//        if (event == Lifecycle.Event.ON_PAUSE) {
//            println("On pause called")
//        }
//    }

    DisposableEffect(key1 = lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_PAUSE) {
                println("On pause called")
            }
        }

        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

}