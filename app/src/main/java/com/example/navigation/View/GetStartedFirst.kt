package com.example.navigation.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigation.R

@Composable
fun GetStartedFirstLogo(
    resource: Int=R.drawable.bg_1
){
    Image(painter = painterResource(resource),
        contentDescription = null,
        Modifier.size(
            height=260.dp,
            width=318.dp))
}
@Composable
fun GetStartedFirstTitle(title:String, content:String){
        Spacer(modifier = Modifier.padding(10.dp))
        Text(title, Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp)
        Spacer(modifier = Modifier.padding(10.dp))
        Text(content, Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Light,
            fontSize = 14.sp)
}
@Composable
fun GetStartedFirstMoveOn(ct_button:String="Next"
                          ,navController: NavController
                          ,ResId: String){
    MoveOn(ct_button, onclick = {navController.navigate(ResId)})
}


@Composable
fun GetStartedFirstSceen(title: String,
                         content: String,
                         ct_button:String="Next",
                         resource: Int,
                         navController: NavController,ResId:String){
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().padding(28.dp)){
            Spacer(modifier = Modifier.weight(1f))
            GetStartedFirstLogo(resource)
            GetStartedFirstTitle(title,content)
            Spacer(modifier = Modifier.weight(1f))
            GetStartedFirstMoveOn(ct_button,navController,ResId)
    }
}
