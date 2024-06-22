package com.example.effecthandlers.snapshot_flow

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.mapNotNull

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SnapshotFlowDemo() {
    val scaffoldState = rememberBottomSheetScaffoldState()
    LaunchedEffect(key1 = scaffoldState) {
        snapshotFlow { scaffoldState.snackbarHostState }
            .mapNotNull {
                it.currentSnackbarData
            }
            .distinctUntilChanged()
            .collect {
                println(it)
            }
    }
}