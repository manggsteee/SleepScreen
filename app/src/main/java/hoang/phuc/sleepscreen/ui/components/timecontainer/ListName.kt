package hoang.phuc.sleepscreen.ui.components.timecontainer

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListName(
    text: String,
    modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = Color(0xDC5D5C5D),
        style = MaterialTheme.typography.titleSmall.copy(fontSize = 16.sp),
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(horizontal = 8.dp)
    )
}