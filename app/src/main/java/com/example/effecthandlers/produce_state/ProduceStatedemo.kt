package com.example.effecthandlers.produce_state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

@Composable
fun produceStateDemo(countUpTo: Int): State<Int> {
    //flow<Int> {
//        var value = 0
//        emit(value)
//        while (value < countUpTo) {
//            delay(1000L)
//            value++
//            emit(value)
//        }
//  }
    return produceState(initialValue = 0) {
        while (value < countUpTo) {
            delay(1000L)
            value++
        }
    }
}