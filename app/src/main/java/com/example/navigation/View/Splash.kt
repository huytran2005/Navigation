package com.example.navigation.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigation.R
import com.example.navigation.ui.theme.ButtonColor
import com.example.navigation.ui.theme.ContentColor


@Composable
fun SplashTitle(sz:Int=102){
    Image(painter = painterResource(R.drawable.logo_uth),
        contentDescription = "Uth logo", Modifier.size(sz.dp))
}

@Composable
fun SplashContent(ct: String,cl: Color= ContentColor,fz: Int=30,wg: FontWeight= FontWeight.Bold){
    Text(text = ct, color = cl, fontSize =fz.sp, fontWeight = wg)
}

@Composable
fun MoveOn(ct:String="Next",onclick:()-> Unit){
    Button(onClick = onclick,
        Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(ButtonColor),

    ) {
        Text(ct, fontSize = 20.sp, fontWeight = FontWeigh)
    }
}

@Composable
fun SplashScreen(navController: NavController,resId: String){
    Column(modifier = Modifier.padding(10.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        SplashTitle()
        val content="UTH SmartTasks"
        SplashContent(content)
        Spacer(modifier = Modifier.weight(1f))

        MoveOn(onclick = {navController.navigate(resId)})
    }

}
