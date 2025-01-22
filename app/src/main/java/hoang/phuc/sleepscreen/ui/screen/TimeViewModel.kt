package hoang.phuc.sleepscreen.ui.screen

import androidx.lifecycle.ViewModel
import hoang.phuc.sleepscreen.data.TimeContents
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class TimeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(TimeContents())
    val uiState: StateFlow<TimeContents> = _uiState.asStateFlow()
}