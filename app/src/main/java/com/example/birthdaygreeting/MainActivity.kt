package com.example.birthdaygreeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.birthdaygreeting.ui.theme.BirthdayGreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayGreetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(message = "Happy Birthday Snippy!", from = "- From Snippy xox" )
                }
            }
        }
    }
}
@Composable
fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier)  {
    Column(modifier = modifier){
        Text(
        text = message,
        fontSize = 36.sp
        )
        Text(
        text = from,
        fontSize = 24.sp
        )
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(message = message, from = from )
    }
}

@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    BirthdayGreetingTheme {
        BirthdayGreetingWithImage(message = "Happy Birthday Snippy!", from ="- From Snippy")
    }
}