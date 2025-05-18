package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.AppDestinations.FIRST_ROUTE
import com.example.navigation.AppDestinations.HOME_ROUTE
import com.example.navigation.View.GetStartedFirstSceen
import com.example.navigation.View.GetStartedThirdSceen
import com.example.navigation.View.GetStartedsecondScreen
import com.example.navigation.View.SplashScreen
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppScreen(innerPadding)
                }
            }
        }
    }
}


object AppDestinations {
    const val HOME_ROUTE = "Splash"
    const val FIRST_ROUTE = "First"
    const val SECOND_ROUTE= "Second"
    const val THIRD_ROUTE=  "THIRD"
}

@Composable
fun AppScreen(innerPadding: PaddingValues,) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppDestinations.HOME_ROUTE
    ) {
        composable(AppDestinations.HOME_ROUTE) {
            SplashScreen(navController,FIRST_ROUTE)
        }
        composable(AppDestinations.FIRST_ROUTE) {
            val title="Easy Time Management"
            val content="With management based on priority and daily tasks, it will give you convenience in managing and determining the tasks that must be done first"
            val resource=R.drawable.bg_1
            GetStartedFirstSceen(title = title,
                content = content,
                resource = resource,
                navController = navController,
                ResId = AppDestinations.SECOND_ROUTE,
            )
        }
        composable (AppDestinations.SECOND_ROUTE){
            val title= "Increase Work Effectiveness"
            val content= "Time management and the determination of more important tasks will give your job statistics better and always improve"
            val resource=R.drawable.bg_2
            GetStartedsecondScreen(title = title,
                content = content,
                resource = resource,
                navController = navController,
                ResId = AppDestinations.THIRD_ROUTE,
                )
        }
        composable  (AppDestinations.THIRD_ROUTE){
            val title="Reminder Notification"
            val content="The advantage of this application is that it also provides reminders for you so you don't forget to keep doing your assignments well and according to the time you have set"
            val resource=R.drawable.bg_3
            GetStartedThirdSceen(title=title,
                content=content,
                resouce = resource,
                navController = navController,
                ResId = AppDestinations.HOME_ROUTE,
            )
        }

    }
}
