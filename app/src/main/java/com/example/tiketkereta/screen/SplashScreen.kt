package com.example.tiketkereta.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiketkereta.R
import com.example.tiketkereta.screen.destinations.LoginScreenDestination
import com.example.tiketkereta.screen.destinations.RegisterScreenDestination
import com.example.tiketkereta.ui.theme.ColorPrimary
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.EmptyDestinationsNavigator

@RootNavGraph(start = true)
@Destination
@Composable
fun SplashScreen(navigator: DestinationsNavigator) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "TIKET KERETA",
            fontSize = 44.sp,
            color = ColorPrimary,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 22.dp)
        )
        Text(
            text = "BELI AJA DI SINI",
            fontSize = 16.sp,
            color = ColorPrimary,
            modifier = Modifier
                .padding(top = 12.dp)
        )

        Box(
            modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
                .padding(top = 30.dp)
                .paint(
                    painter = painterResource(id = R.drawable.bg_splash),
                    contentScale = ContentScale.FillBounds
                ),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 46.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        navigator.navigate(LoginScreenDestination)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = ColorPrimary
                    ),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .width(130.dp)
                ) {
                    Text(text = "LOGIN")
                }

                Button(
                    onClick = {
                        navigator.navigate(RegisterScreenDestination)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = ColorPrimary
                    ),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .width(130.dp)
                ) {
                    Text(text = "REGISTER")
                }
            }
        }
    }
}

@Preview
@Composable
private fun SplashScreenPreview() {
    SplashScreen(EmptyDestinationsNavigator)
}