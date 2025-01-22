package hoang.phuc.sleepscreen.ui.components.timecontainer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalTime

@Composable
fun TimeList(
    repeatTime: String,
    startTime: LocalTime,
    endTime: LocalTime,
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color.White,
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .padding(
                horizontal = 16.dp,
                vertical = 16.dp
            )
            .height(150.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            TimeRow(
                modifier = Modifier
                    .weight(1f),
                text = "Bắt đầu chặn",
                time = startTime
            )
            TimeRow(
                modifier = Modifier
                    .weight(1f),
                text = "Kết thúc chặn",
                time = endTime
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ListName("Ngày lặp lại")
                Text(
                    text = repeatTime,
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 15.sp),
                    color = Color(0xC95D5C5D),
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun TimeListReview() {
    val startTime = LocalTime.of(8, 0)
    val endTime = LocalTime.of(9, 0)
    val repeatTime = "Tối T6 đến Tối T7"
    TimeList(
        repeatTime = repeatTime,
        startTime = startTime,
        endTime = endTime
    )
}

