package com.example.latihanhalaman.view.screen

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihanhalaman.R

//@Preview(showBackground = true)
@Composable
fun SplashView(
    onMulaiButton: () -> Unit,
){
    Column (modifier = Modifier.
    fillMaxSize()
        .background(                               // Memberi warna background
            brush = Brush.linearGradient(           // Warna gradient
                colors = listOf(
                    Color(0xFFa9c346),  // kuning
                    Color(0xFF0b1306)   // hijau
                )
            )
        ),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(
            painter =  painterResource(id = R.drawable.umyy),
            contentDescription = "", modifier = Modifier.size(250.dp)
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {onMulaiButton()}, modifier = Modifier.
        fillMaxWidth().padding(32.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFd5d987),             // Warna latar belakang tombol
                contentColor = Color.Black                          // Warna teks tombol
            )
        ) {

            Text(text = "Mulai",
                fontSize = 23.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Monospace)
        }


    }
}