package hoang.phuc.sleepscreen.ui.components.appbar

import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import hoang.phuc.sleepscreen.ui.components.button.SaveButton

@Composable
fun AppBarBottom(
    onClick: () -> Unit,
    modifier: Modifier = Modifier) {
    BottomAppBar(
        containerColor = Color.White,
        modifier = modifier
    ){
        SaveButton(onClick = onClick)
    }
}