package hoang.phuc.sleepscreen.ui.components.appbar

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarTop(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(
                text = text,
                style = MaterialTheme.typography.titleMedium.copy(fontSize = 18.sp),
                fontWeight = FontWeight.SemiBold,
                color = Color(0xF75D5C5D),
                modifier = Modifier
                    .padding(start = 70.dp)
            )
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.White
        ),
        modifier = modifier,
        navigationIcon = {
            IconButton(onClick = onClick) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                    contentDescription = "Back"
                )
            }
        }
    )
}