package com.example.tiketkereta.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiketkereta.screen.destinations.HomeScreenDestination
import com.example.tiketkereta.screen.destinations.LoginScreenDestination
import com.example.tiketkereta.ui.theme.ColorPrimary
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.EmptyDestinationsNavigator

@Destination
@Composable
fun RegisterScreen(navigator: DestinationsNavigator) {

    var name by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
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
                .padding(top = 4.dp)
        )

        BasicTextField(
            value = name,
            onValueChange = { name = it },
            textStyle = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 14.sp,
                color = ColorPrimary
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 12.dp)
                .border(width = 1.dp, color = ColorPrimary, shape = RoundedCornerShape(8.dp))
                .padding(horizontal = 16.dp, vertical = 10.dp),
            decorationBox = {
                if (name.isEmpty()) {
                    Text(
                        text = "Name",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = ColorPrimary.copy(
                                alpha = 0.6F
                            )
                        ),
                        modifier = Modifier.weight(1F)
                    )
                }
                it.invoke()
            }
        )

        BasicTextField(
            value = email,
            onValueChange = { email = it },
            textStyle = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 14.sp,
                color = ColorPrimary
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 12.dp)
                .border(width = 1.dp, color = ColorPrimary, shape = RoundedCornerShape(8.dp))
                .padding(horizontal = 16.dp, vertical = 10.dp),
            decorationBox = {
                if (email.isEmpty()) {
                    Text(
                        text = "Email",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = ColorPrimary.copy(
                                alpha = 0.6F
                            )
                        ),
                        modifier = Modifier.weight(1F)
                    )
                }
                it.invoke()
            }
        )

        BasicTextField(
            value = password,
            onValueChange = { password = it },
            textStyle = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 14.sp,
                color = ColorPrimary
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 12.dp)
                .border(width = 1.dp, color = ColorPrimary, shape = RoundedCornerShape(8.dp))
                .padding(horizontal = 16.dp, vertical = 10.dp),
            decorationBox = {
                if (password.isEmpty()) {
                    Text(
                        text = "Password",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = ColorPrimary.copy(
                                alpha = 0.6F
                            )
                        ),
                        modifier = Modifier.weight(1F)
                    )
                }
                it.invoke()
            }
        )

        Button(
            onClick = {
                navigator.navigate(HomeScreenDestination)
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = ColorPrimary
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(130.dp)
                .padding(top = 24.dp)
        ) {
            Text(text = "REGISTER")
        }
    }
}

@Preview
@Composable
private fun RegisterScreenPreview() {
    RegisterScreen(EmptyDestinationsNavigator)
}