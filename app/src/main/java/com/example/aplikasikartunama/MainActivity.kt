package com.example.aplikasikartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplikasikartunama.ui.theme.AplikasiKartuNamaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplikasiKartuNamaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    KartuNama()
                }
            }
        }
    }
}
@Composable
fun KartuNama(){
    Column {
        Row(Modifier.weight(1.5f)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray)
                    .padding(50.dp),

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .background(Color.White)
                        .height(120.dp)
                        .width(120.dp)
                        .fillMaxWidth()


                    ,
                    painter = painterResource(R.drawable.faceless_muslim_bearded),
                    contentDescription = null,
                )
                Text(
                    modifier = Modifier
                        .padding(vertical = 15.dp),

                    text = "Hainur Rasyid",
                    color = Color.White,
                    fontSize = 28.sp,
                    // fontWeight = FontWeight.Bold,
                )
                Text(

                    text = "Newbie Kotlin Enthusiast",
                    color = Color.Green,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }

        Row(Modifier.weight(1f)) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.DarkGray),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){

                kontakDetail(
                    icon = Icons.Default.Phone,
                    text = "+62 (123) 444 555 666",
                )
                kontakDetail(
                    icon = Icons.Rounded.Share,
                    text = "@Android.Dev",
                )
                kontakDetail(
                    icon = Icons.Default.Email,
                    text = "Hainur.Rasyid@gmail.com",
                )

                kontakDetail(
                    icon = Icons.Default.Home,
                    text = "Kisaran, North Sumatra, Indonesia",
                )


            }

        }

    }
}

@Composable
fun kontakDetail(icon: ImageVector, text: String) {
    Row(
        modifier = Modifier
            .width(320.dp)
            .height(60.dp)
            .padding(5.dp)
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .padding(10.dp),
            tint = Color.Green,
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
        Text(text = text, fontWeight = FontWeight.Medium, color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AplikasiKartuNamaTheme {
        KartuNama()
    }
}