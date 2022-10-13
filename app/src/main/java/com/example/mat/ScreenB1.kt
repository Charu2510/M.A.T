package com.example.mat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenB1(navController: NavController) {

        Card(
           // shape = RoundedCornerShape(20.dp),
            backgroundColor = Color(136, 8, 8),
            modifier = Modifier.fillMaxWidth()//.padding(10.dp)
        ) {


            LazyColumn(
                modifier = Modifier
                    //.fillMaxSize()
                    //    .background(Color.Gray)
                    .padding(10.dp),
                //verticalArrangement = Arrangement.spacedBy(4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    Text(
                        text = "Menstruation is the recurring discharge of blood, cervical mucus," +
                                " vaginal secretions, and endometrial tissue of a non-pregnant female humans " +
                                ". In humans, it usually " +
                                "recurs at about four week intervals, or about a month, thus the Latin derivation of" +
                                " the term from menses, meaning months.",
                        fontSize = 27.sp,
                        fontFamily = FontFamily.Cursive,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                }

                item {
                    Image(
                        painter = painterResource(id = R.drawable.i1),
                        modifier = Modifier
                            .size(250.dp)
                            .shadow(
                                elevation = 12.dp,
                                shape = CircleShape,
                                clip = true,
                            )
                            .clip(RoundedCornerShape(15.dp)),
                         contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                }

                item {
                    Image(
                        painter = painterResource(id = R.drawable.i3),
                        modifier = Modifier
                            .size(250.dp)
                            .shadow(
                                elevation = 12.dp,
                                shape = CircleShape,
                                clip = true,
                            )
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.height(20.dp))


                }
                item {
                    Image(
                        painter = painterResource(id = R.drawable.i5),
                        modifier = Modifier
                            .size(250.dp)
                            .shadow(
                                elevation = 12.dp,
                                shape = CircleShape,
                                clip = true,
                            )
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                }


                item {
                    Image(
                        painter = painterResource(id = R.drawable.i2),
                        modifier = Modifier
                            .size(250.dp)
                            .shadow(
                                elevation = 12.dp,
                                shape = CircleShape,
                                clip = true,
                            )
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                }
                item {
                    Image(
                        painter = painterResource(id = R.drawable.i4),
                        modifier = Modifier
                            .size(250.dp)
                            .shadow(
                                elevation = 12.dp,
                                shape = CircleShape,
                                clip = true,
                            )
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                }
                item {
                    Image(
                        painter = painterResource(id = R.drawable.i6),
                        modifier = Modifier
                            .size(250.dp)
                            .shadow(
                                elevation = 12.dp,
                                shape = CircleShape,
                                clip = true,
                            )
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )


                }
            }
        }
}
