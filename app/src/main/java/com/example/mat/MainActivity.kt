package com.example.mat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mat.ui.theme.MATTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MATTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier.fillMaxSize()
                        .background(Color(250, 160, 160))
                ) {
                    Navigation()
                }
            }
        }
    }
}

//@Composable
//fun mat()
//{
//    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally)
//    {
//        Text(text = "Period .", fontStyle = FontStyle.Italic,fontSize = 12.sp,
//            textAlign = TextAlign.Center)
//        Text(text = "An end to life sentence", fontSize = 10.sp,
//            fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center)
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    MATTheme {
//        mat()
//    }
//}