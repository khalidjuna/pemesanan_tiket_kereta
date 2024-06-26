package com.example.tiketkereta.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiketkereta.R
import com.example.tiketkereta.ui.theme.ColorPrimary
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.EmptyDestinationsNavigator

@Destination
@Composable
fun TrainScreen(navigator: DestinationsNavigator) {

    var from by remember { mutableStateOf("") }
    var to by remember { mutableStateOf("") }
    var depaeture by remember { mutableStateOf("") }
    var arrival by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.menu),
                contentDescription = "menu",
                modifier = Modifier
                    .size(42.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(text = "Hello Junax", fontSize = 14.sp)
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(52.dp)
                )
            }
        }

        BasicTextField(
            value = from,
            onValueChange = { from = it },
            textStyle = MaterialTheme.typography.bodyMedium.copy(
                fontSize = 14.sp,
                color = ColorPrimary
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 24.dp)
                .border(width = 1.dp, color = ColorPrimary, shape = RoundedCornerShape(8.dp))
                .padding(horizontal = 16.dp, vertical = 10.dp),
            decorationBox = {
                if (from.isEmpty()) {
                    Text(
                        text = "Kota asal",
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
            value = to,
            onValueChange = { to = it },
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
                if (to.isEmpty()) {
                    Text(
                        text = "Kota tujuan",
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
            value = depaeture,
            onValueChange = { depaeture = it },
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
                if (depaeture.isEmpty()) {
                    Text(
                        text = "Tanggal Pergi",
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
            value = arrival,
            onValueChange = { arrival = it },
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
                if (arrival.isEmpty()) {
                    Text(
                        text = "Jumlah penumpang",
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
    }
}

@Preview
@Composable
private fun TrainScreenPreview() {
    TrainScreen(EmptyDestinationsNavigator)
}