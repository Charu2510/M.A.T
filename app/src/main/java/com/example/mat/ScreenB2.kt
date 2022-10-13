package com.example.mat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenB2(navController: NavController){
//    Card(
//        // shape = RoundedCornerShape(20.dp),
//        backgroundColor = Color(136, 8, 8),
//        modifier = Modifier.fillMaxWidth()//.padding(10.dp),
//
//    ) {

        LazyColumn(modifier= Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(255,232,231)),
        horizontalAlignment = Alignment.CenterHorizontally)
        {
            item {
                Text(text = "Sanitary Pads",fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic,fontSize = 30.sp,
                    textAlign = TextAlign.Center, color= Color(136, 8, 8))
            }
            item{

                Card(modifier = Modifier.padding(10.dp),shape = RoundedCornerShape(20.dp),elevation = 7.dp,
                    backgroundColor = Color(136, 8, 8)) {
                    Column(){
                            Image(painter = painterResource(id = R.drawable.pads), contentDescription ="pads"
                                , modifier = Modifier
                                    .padding(10.dp)
                                    .fillMaxWidth()
                                    .height(194.dp)
                                    .clip(shape = RoundedCornerShape(20.dp)),
                            contentScale = ContentScale.Crop)
                            Text(text="It is a disposable absorbent pad used (as during menstruation) to absorb the uterine flow."
                                , fontSize = 30.sp,textAlign = TextAlign.Center, modifier = Modifier.padding(5.dp),
                                fontFamily = FontFamily.Cursive, color= Color.White)

                    }
                }

        }
            item {
                Spacer(modifier = Modifier.height(10.dp))
            }
            item {
                Text(text = "Tampons",fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic,fontSize = 30.sp,
                    textAlign = TextAlign.Center, color= Color(136, 8, 8))
            }
            item{

                Card(modifier = Modifier.padding(10.dp),shape = RoundedCornerShape(20.dp),elevation = 7.dp,
                    backgroundColor = Color(136, 8, 8)) {
                    Column(){
                        Image(painter = painterResource(id = R.drawable.tampons), contentDescription ="pads"
                            , modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth()
                                .height(194.dp)
                                .clip(shape = RoundedCornerShape(20.dp)),
                            contentScale = ContentScale.Crop)
                        Text(text="A tampon is a menstrual product designed to absorb blood and vaginal secretions by insertion into the vagina during menstruation. "
                            , fontSize = 30.sp,textAlign = TextAlign.Center, modifier = Modifier.padding(5.dp),
                            fontFamily = FontFamily.Cursive, color= Color.White)

                    }
                }

            }
            item {
                Spacer(modifier = Modifier.height(10.dp))
            }
            item {
                Text(text = "Menstrual Cup",fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic,fontSize = 30.sp,
                    textAlign = TextAlign.Center, color= Color(136, 8, 8))
            }
            item{

                Card(modifier = Modifier.padding(10.dp),shape = RoundedCornerShape(20.dp),elevation = 7.dp,
                    backgroundColor = Color(136, 8, 8)) {
                    Column(){
                        Image(painter = painterResource(id = R.drawable.cup), contentDescription ="pads"
                            , modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth()
                                .height(194.dp)
                                .clip(shape = RoundedCornerShape(20.dp)),
                            contentScale = ContentScale.Crop)
                        Text(text="A menstrual cup is a small, bell-shaped cup that a person can insert into their vagina to collect menstrual blood during a period. "
                            , fontSize = 30.sp,textAlign = TextAlign.Center, modifier = Modifier.padding(5.dp),
                            fontFamily = FontFamily.Cursive, color= Color.White)

                    }
                }

            }
    }

}