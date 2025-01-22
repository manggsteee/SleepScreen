package hoang.phuc.sleepscreen.ui.components.screencontainer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import hoang.phuc.sleepscreen.ui.components.timecontainer.TimeList
import java.time.LocalTime

@Composable
fun MainContainer(
    startTime: LocalTime,
    endTime: LocalTime,
    repeatTime: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .background(Color(0xfff5f4f4))
            .fillMaxSize()
    ) {
        TimeList(
            repeatTime = repeatTime,
            startTime = startTime,
            endTime = endTime
        )
    }
}