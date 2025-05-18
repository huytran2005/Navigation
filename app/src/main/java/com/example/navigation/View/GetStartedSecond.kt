package com.example.navigation.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navigation.R

@Composable
fun GetStartedSecondLogo(resource:Int=R.drawable.bg_2){
    GetStartedFirstLogo(resource = resource)
}

@Composable
fun GetStartedSecondTitle(title: String,content:String){
    GetStartedFirstTitle(title, content)
}
@Composable
fun GetStartedSecondMoveOn(ct: String="Next",navController: NavController,ResId: String){
    Row {
        Image(painter = painterResource(R.drawable.bt_back),
            contentDescription = null,
            modifier = Modifier.size(53.dp).clickable{navController.popBackStack()})
        Spacer(Modifier.padding(20.dp))
        MoveOn(ct,{navController.navigate(ResId)})
    }
}

@Composable
fun GetStartedsecondScreen(title: String,
                           content: String,
                           ct: String="Next",
                           resource:Int,
                           navController: NavController,ResId: String){
    Column(Modifier.fillMaxSize().padding(28.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Spacer(Modifier.weight(1f))
        GetStartedSecondLogo(resource = resource)

        GetStartedSecondTitle(title,content)
        Spacer(Modifier.weight(1f))
        GetStartedSecondMoveOn(ct,navController,ResId)
    }

}
