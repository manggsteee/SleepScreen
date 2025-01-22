package hoang.phuc.sleepscreen.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import hoang.phuc.sleepscreen.ui.components.appbar.AppBarBottom
import hoang.phuc.sleepscreen.ui.components.appbar.AppBarTop
import hoang.phuc.sleepscreen.ui.components.screencontainer.MainContainer

@Composable
fun MyApp(
    modifier: Modifier = Modifier,
    viewModel: TimeViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    Scaffold(
        topBar = {
            AppBarTop()
        },
        bottomBar = {
            AppBarBottom()
        },
        modifier = modifier
    ) {
        MainContainer(
            startTime = uiState.startTime,
            endTime = uiState.endTime,
            repeatTime = uiState.repeatTime,
            modifier = modifier
                .padding(it)
        )
    }
}



