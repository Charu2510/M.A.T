package com.example.mat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController){
    val mainButtonColor = ButtonDefaults.buttonColors(backgroundColor = Color(255, 255, 255))

    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally)
    {
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = ". Period .",fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic,fontSize = 50.sp,
            textAlign = TextAlign.Center, color= Color(136, 8, 8)
        )
        Text(text = "An end to life sentence", fontSize = 40.sp,
            fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center, color= Color(139, 0, 0)
        )
        Spacer(modifier = Modifier.height(80.dp))
        Button(colors = mainButtonColor,shape = RoundedCornerShape(15.dp),onClick = { navController.navigate(screen.ScreenB1.route) },
            elevation =  ButtonDefaults.elevation(
                defaultElevation = 30.dp,
                pressedElevation = 35.dp,
                disabledElevation = 0.dp
            )) {
            Text(text = " What is MENSTRUATION ? ", fontSize = 20.sp, color = Color(165, 42, 42))
        }

        Spacer(modifier = Modifier.height(40.dp))
        Button(colors = mainButtonColor,shape = RoundedCornerShape(15.dp),onClick = { navController.navigate(screen.ScreenB2.route) },
            elevation =  ButtonDefaults.elevation(
                defaultElevation = 30.dp,
                pressedElevation = 35.dp,
                disabledElevation = 0.dp
            )) {
            Text(text = "       Menstrual Products      ", fontSize = 20.sp, color = Color(165, 42, 42))
        }

        Spacer(modifier = Modifier.height(40.dp))
        Button(colors = mainButtonColor,shape = RoundedCornerShape(15.dp),onClick = { navController.navigate(screen.ScreenB3.route) },
            elevation =  ButtonDefaults.elevation(
                defaultElevation = 30.dp,
                pressedElevation = 35.dp,
                disabledElevation = 0.dp
            )) {
            Text(text = "         Track your Cycle         ", fontSize = 20.sp, color = Color(165, 42, 42))
        }

        Spacer(modifier = Modifier.height(40.dp))
        Button(colors = mainButtonColor,shape = RoundedCornerShape(15.dp),onClick = { navController.navigate(screen.ScreenB4.route) },
            elevation =  ButtonDefaults.elevation(
                defaultElevation = 30.dp,
                pressedElevation = 35.dp,
                disabledElevation = 0.dp
            )) {
            Text(text = " Decoding Myths and Taboo ", fontSize = 20.sp, color = Color(165, 42, 42))
        }
    }
}