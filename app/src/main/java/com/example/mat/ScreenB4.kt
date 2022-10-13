package com.example.mat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenB4(navController: NavController) {
    val mainButtonColor = ButtonDefaults.buttonColors(backgroundColor = Color.White)
    LazyColumn(modifier= Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color(250, 128, 114)) ,
        horizontalAlignment = Alignment.CenterHorizontally){
             item{
                 Row(modifier = Modifier.padding(15.dp)) {
                     Button(colors = mainButtonColor,onClick = {  }, modifier = Modifier.size(70.dp),shape = CircleShape,
                         elevation =  ButtonDefaults.elevation(
                         defaultElevation = 30.dp,
                         pressedElevation = 35.dp,
                         disabledElevation = 0.dp
                     )) {
                         Text(text = "1", modifier = Modifier, fontSize = 30.sp,textAlign = TextAlign.Center, color = Color.Red)
                     }
                     Spacer(modifier = Modifier.width(8.dp))
                     Text(text ="Women shed impure blood during periods. ", fontWeight = FontWeight.Bold,fontSize = 30.sp,fontFamily = FontFamily.Cursive,   color= Color(136, 8, 8))

                 }
             }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }
        item{
            Text(text = "-------------------------------------------------------", textAlign = TextAlign.Center, color= Color.White)
        }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }
        item{
            Row(modifier = Modifier.padding(15.dp), ) {
                Column(modifier = Modifier.width(270.dp)) {
                    Text(text ="You cannot exercise while you are on your period. ", fontWeight = FontWeight.Bold, textAlign = TextAlign.End,fontSize = 30.sp,fontFamily = FontFamily.Cursive,   color= Color(136, 8, 8))

                }
               Spacer(modifier = Modifier.width(10.dp))
                Column() {
                    Button(colors = mainButtonColor,onClick = {  }, modifier = Modifier.size(70.dp),shape = CircleShape,
                        elevation =  ButtonDefaults.elevation(
                            defaultElevation = 30.dp,
                            pressedElevation = 35.dp,
                            disabledElevation = 0.dp
                        )) {
                        Text(text = "2", modifier = Modifier, fontSize = 30.sp,textAlign = TextAlign.Center, color = Color.Red)
                    }
                }


            }
        }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }
        item{
            Text(text = "------------------------------", textAlign = TextAlign.Center, color= Color.White)
        }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }

        item{
            Row(modifier = Modifier.padding(15.dp)) {
                Button(colors = mainButtonColor,onClick = {  }, modifier = Modifier.size(70.dp),shape = CircleShape,
                    elevation =  ButtonDefaults.elevation(
                        defaultElevation = 30.dp,
                        pressedElevation = 35.dp,
                        disabledElevation = 0.dp
                    )) {
                    Text(text = "3", modifier = Modifier, fontSize = 30.sp,textAlign = TextAlign.Center, color = Color.Red)
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(text ="Premenstrual syndrome (PMS) is only a mental state.", fontWeight = FontWeight.Bold,fontSize = 30.sp,fontFamily = FontFamily.Cursive,   color= Color(136, 8, 8))

            }
        }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }
        item{
            Text(text = "-------------------------------------------------------", textAlign = TextAlign.Center, color= Color.White)
        }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }
        item{
            Row(modifier = Modifier.padding(15.dp), ) {
                Column(modifier = Modifier.width(270.dp)) {
                    Text(text ="You shouldn’t wash your hair during your period.", fontWeight = FontWeight.Bold, textAlign = TextAlign.End,fontSize = 30.sp,fontFamily = FontFamily.Cursive,   color= Color(136, 8, 8))

                }
                Spacer(modifier = Modifier.width(10.dp))
                Column() {
                    Button(colors = mainButtonColor,onClick = {  }, modifier = Modifier.size(70.dp),shape = CircleShape,
                        elevation =  ButtonDefaults.elevation(
                            defaultElevation = 30.dp,
                            pressedElevation = 35.dp,
                            disabledElevation = 0.dp
                        )) {
                        Text(text = "4", modifier = Modifier, fontSize = 30.sp,textAlign = TextAlign.Center, color = Color.Red)
                    }
                }


            }
        }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }
        item{
            Text(text = "------------------------------", textAlign = TextAlign.Center, color= Color.White)
        }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }
        item{
            Row(modifier = Modifier.padding(15.dp)) {
                Button(colors = mainButtonColor,onClick = {  }, modifier = Modifier.size(70.dp),shape = CircleShape,
                    elevation =  ButtonDefaults.elevation(
                        defaultElevation = 30.dp,
                        pressedElevation = 35.dp,
                        disabledElevation = 0.dp
                    )) {
                    Text(text = "5", modifier = Modifier, fontSize = 30.sp,textAlign = TextAlign.Center, color = Color.Red)
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(text ="During periods, women should not visit sacred places.", fontWeight = FontWeight.Bold,fontSize = 30.sp,fontFamily = FontFamily.Cursive,   color= Color(136, 8, 8))

            }
        }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }
        item{
            Text(text = "-------------------------------------------------------", textAlign = TextAlign.Center, color= Color.White)
        }
        item{
            Spacer(modifier = Modifier.height(8.dp))
        }
        item{
            Row(modifier = Modifier.padding(15.dp), ) {
                Column(modifier = Modifier.width(270.dp)) {
                    Text(text ="Foods like curd, tamarind and pickle disturb the menstrual flow.", fontWeight = FontWeight.Bold, textAlign = TextAlign.End,fontSize = 30.sp,fontFamily = FontFamily.Cursive,   color= Color(136, 8, 8))

                }
                Spacer(modifier = Modifier.width(10.dp))
                Column() {
                    Button(colors = mainButtonColor,onClick = {  }, modifier = Modifier.size(70.dp),shape = CircleShape,
                        elevation =  ButtonDefaults.elevation(
                            defaultElevation = 30.dp,
                            pressedElevation = 35.dp,
                            disabledElevation = 0.dp
                        )) {
                        Text(text = "6", modifier = Modifier, fontSize = 30.sp,textAlign = TextAlign.Center, color = Color.Red)
                    }
                }


            }
        }
    }
}
