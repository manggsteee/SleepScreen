package hoang.phuc.sleepscreen.ui.components.timecontainer

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalTime
import java.time.format.DateTimeFormatter

@Composable
fun TimeSurface(
    modifier: Modifier = Modifier,
    time: LocalTime) {
    Surface(
        color = Color(0xfff5f4f4),
        shape = RoundedCornerShape(16.dp),
        modifier = modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
    ) {
        val formattedTime = time.format(DateTimeFormatter.ofPattern("HH:mm"))
        Text(
            text = formattedTime,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleSmall.copy(fontSize = 14.sp),
            color = Color(0xDC5D5C5D),
            modifier = Modifier.padding(vertical = 5.dp, horizontal = 8.dp)
            )
    }
}

@Preview
@Composable
fun TimeSurfaceReview(){
    val localTime = LocalTime.of(8,0)
    TimeSurface(time = localTime)
}