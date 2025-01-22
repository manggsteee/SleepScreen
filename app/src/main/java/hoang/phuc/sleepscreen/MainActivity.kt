package hoang.phuc.sleepscreen

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import hoang.phuc.sleepscreen.navigation.NavigateHost
import hoang.phuc.sleepscreen.ui.screen.timescreen.TimeScreen
import hoang.phuc.sleepscreen.ui.theme.SleepScreenTheme

class MainActivity : ComponentActivity() {
    private val TAG = "aaa"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SleepScreenTheme {
                val navController = rememberNavController()
                NavigateHost(navController = navController)
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onReStart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}

