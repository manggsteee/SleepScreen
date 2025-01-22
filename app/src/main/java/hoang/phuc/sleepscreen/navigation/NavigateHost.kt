package hoang.phuc.sleepscreen.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import hoang.phuc.sleepscreen.ui.screen.homescreen.HomeScreen
import hoang.phuc.sleepscreen.ui.screen.nextscreen.NextScreen
import hoang.phuc.sleepscreen.ui.screen.timescreen.TimeScreen

@Composable
fun NavigateHost(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME_SCREEN.name,
        modifier = modifier
    ) {
        composable(route = Routes.HOME_SCREEN.name) {
            HomeScreen(
                onClick = {
                    navController.navigate(Routes.TIME_SCREEN.name)
                }
            )
        }
        composable(route = Routes.TIME_SCREEN.name) {
            TimeScreen(
                onBackClick = {
                    navController.navigateUp()
                },
                onClick = {
                    navController.navigate(Routes.NEXT_SCREEN.name)
                }
            )
        }
        composable(route = Routes.NEXT_SCREEN.name) {
            NextScreen(
                onClick = {
                    navController.navigateUp()
                }
            )
        }
    }
}