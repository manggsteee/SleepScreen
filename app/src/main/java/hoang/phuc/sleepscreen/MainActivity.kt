package hoang.phuc.sleepscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import hoang.phuc.sleepscreen.ui.screen.MyApp
import hoang.phuc.sleepscreen.ui.theme.SleepScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SleepScreenTheme {
                MyApp()
            }
        }
    }
}

