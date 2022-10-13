package com.example.mat



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import androidx.navigation.NavController

@Composable
fun ScreenB3(navController: NavController){
    Card(
        // shape = RoundedCornerShape(20.dp),
        backgroundColor = Color(136, 8, 8),
        modifier = Modifier.fillMaxWidth()//.padding(10.dp)
    ) {
    LazyColumn(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally)
    {
        item{
            Box(modifier = Modifier
                .fillMaxSize()
                ) {
                Image(
                    painter = painterResource(id = R.drawable.calender),
                    contentDescription = "",
                   modifier = Modifier
                       .fillMaxSize()
                      // .clip(shape = RoundedCornerShape(20.dp))
                    , contentScale = ContentScale.Crop
                )

                Text(text = "When should be your next period ?", fontSize = 50.sp, fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center, color= Color(139, 0, 0),
                    modifier = Modifier.padding(start = 10.dp, top = 60.dp)
                )
            }
        }
        item{
            Spacer(modifier = Modifier.height(10.dp))
        }
        item{
            Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(text= "Menstrual phase",fontSize = 35.sp, style = TextStyle(textDecoration = TextDecoration.Underline),fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center, color= Color.White,
            )
                Text(text = "On average, women are in the menstrual phase of their cycle for 3 to 7 days. Some women have longer periods than others.",
                    fontSize = 25.sp,fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center, color= Color(255,234,233))
        }}
        item{
            Spacer(modifier = Modifier.height(25.dp))
        }
        item{
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Text(text= "Follicular phase",fontSize = 35.sp, style = TextStyle(textDecoration = TextDecoration.Underline),fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center, color= Color.White,
                )
                Text(text = "The average follicular phaseTrusted Source lasts for about 16 days. It can range from 11 to 27 days, depending on your cycle. It starts on the first day of your period (so there is some overlap with the menstrual phase) and ends when you ovulate.",
                    fontSize = 25.sp,fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center, color= Color(255,234,233))
            }}
        item{
            Spacer(modifier = Modifier.height(25.dp))
        }
        item{
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Text(text= "Ovulation phase",fontSize = 35.sp, style = TextStyle(textDecoration = TextDecoration.Underline),fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center, color= Color.White,
                )
                Text(text = "Ovulation happens at around day 14 if you have a 28-day cycle — right in the middle of your menstrual cycle. It lasts about 24 hours. After a day, the egg will die or dissolve if it isn’t fertilized.",
                    fontSize = 25.sp,fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center, color= Color(255,234,233))
            }}

    }}
}