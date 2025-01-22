package hoang.phuc.sleepscreen.ui.screen.nextscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import hoang.phuc.sleepscreen.ui.components.appbar.AppBarTop

@Composable
fun NextScreen(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold (
        topBar = {
            AppBarTop(
                text = "Chào mừng",
                onClick = onClick)
        }
    ){
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(it),
            contentAlignment = Alignment.Center
        ) {
            Text("HELLO WORLD")
        }
    }
}