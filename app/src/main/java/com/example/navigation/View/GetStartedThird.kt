package com.example.navigation.View

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.navigation.R

@Composable
fun GetStartedThirdSceen(title:String,
                         content:String,
                         resouce:Int,
                         ct_button: String="Get Started",
                         navController: NavController, ResId: String){
    GetStartedsecondScreen(
        title=title,
        content=content,
        ct = ct_button,
        resource =resouce ,
        navController = navController,
        ResId=ResId)
}
