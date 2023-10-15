package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Aldodada(name = "Aldiyar", email = "strong.aldiyar3@gmail.com", number = "87029282492")
                }
            }
        }
    }
}
@Composable
fun Aldodada(name: String, email: String, number: String, modifier: Modifier = Modifier){
    val back_image = painterResource(R.drawable.business_card_back)
    val logo_img = painterResource(R.drawable.android_logo)
    Box(modifier = modifier.fillMaxSize()){
        Image(
            painter = back_image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()

        )
        Box(modifier = Modifier
                .align(Alignment.Center)
                .height(150.dp)
            ){
            Image(
                painter = logo_img,
                contentDescription = null,
                modifier = Modifier
                    .height(120.dp)
                    .width(200.dp)
                    .align(Alignment.TopCenter),
                contentScale = ContentScale.Fit
            )
            Text(
                text = name,
                color = Color.White,
                style = TextStyle(fontSize = 23.sp),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
            )
        }

        Box(modifier = Modifier
                .align(Alignment.BottomCenter)
                .height(150.dp)
                .fillMaxWidth()
        ){
            Text(
                text = email,
                color = Color.White,
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(Alignment.TopCenter)
            )
            Text(
                text = number,
                color = Color.White,
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }

    }
}


@Preview(showBackground = false)
@Composable
fun BusinessCardPreview() {
    MyApplicationTheme {
        Aldodada(name = "Zhaksylyk Aldiyar", email = "strong.aldyar3@gmail.com", number = "87029282492")
    }
}
