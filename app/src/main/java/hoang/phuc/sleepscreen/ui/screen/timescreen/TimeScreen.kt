package hoang.phuc.sleepscreen.ui.screen.timescreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import hoang.phuc.sleepscreen.ui.components.appbar.AppBarBottom
import hoang.phuc.sleepscreen.ui.components.appbar.AppBarTop
import hoang.phuc.sleepscreen.ui.components.timecontainer.TimeList

@Composable
fun TimeScreen(
    modifier: Modifier = Modifier,
    viewModel: TimeViewModel = viewModel(),
    onBackClick: () -> Unit,
    onClick: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    Scaffold(
        containerColor = Color(0xfff5f4f4),
        topBar = {
            AppBarTop(
                text = "Giờ đi ngủ cuối tuần",
                onClick = onBackClick
            )
        },
        bottomBar = {
            AppBarBottom(onClick = onClick)
        },
        modifier = modifier
    ) {
        TimeList(
            startTime = uiState.startTime,
            endTime = uiState.endTime,
            repeatTime = uiState.repeatTime,
            modifier = modifier
                .padding(it)
        )
    }
}



