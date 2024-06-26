package com.example.tiketkereta.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
fun HomeScreen(navigator: DestinationsNavigator) {
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

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp)
        ) {
            items(menuItems) { item ->
                MenuItem(data = item)
            }
        }

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(trainItems) { item ->
                TrainItem(data = item)
            }
        }
    }
}

@Composable
fun TrainItem(data: Train) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(22.dp))
            .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(22.dp))
            .padding(14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.train),
            contentDescription = "train",
            modifier = Modifier.size(90.dp)
        )

        Column(
            modifier = Modifier
                .padding(start = 18.dp)
        ) {
            Text(
                text = data.title,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )

            Text(
                text = data.from,
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier
                    .padding(top = 4.dp)
            )

            Text(
                text = data.to,
                fontSize = 12.sp,
                color = Color.Black,
            )

            Text(
                text = "Durasi: ${data.duration}",
                fontSize = 12.sp,
                color = Color.LightGray,
            )

            Text(
                text = data.price,
                fontSize = 12.sp,
                color = Color.LightGray,
            )
        }
    }
}

@Composable
fun MenuItem(data: String) {
    Text(
        text = data,
        color = ColorPrimary,
        modifier = Modifier
            .border(color = ColorPrimary, width = 1.dp, shape = RoundedCornerShape(6.dp))
            .padding(vertical = 2.dp, horizontal = 10.dp)
    )
}

val trainItems = listOf(
    Train(
        title = "WIJAYA KUSUMA",
        from = "17:26 Surabaya Gubeng",
        to = "21:25 Solo Balapan",
        duration = "3j 59m",
        price = "Rp 225.000"
    ),
    Train(
        title = "MUTIARA SELATAN",
        from = "18:20 Surabaya Gubeng",
        to = "21:38 Solo Balapan",
        duration = "3j 18m",
        price = "Rp 240.000"
    ),
    Train(
        title = "BIMA",
        from = "19:20 Surabaya Gubeng",
        to = "22:24 Solo Balapan",
        duration = "3j 04M",
        price = "Rp 395.000"
    ),
    Train(
        title = "TURANGGA",
        from = "20:00 Surabaya Gubeng",
        to = "22:24 Solo Balapan",
        duration = "3j 04m",
        price = "Rp 355.000"
    ),
    Train(
        title = "WIJAYA KUSUMA",
        from = "17:26 Surabaya Gubeng",
        to = "21:25 Solo Balapan",
        duration = "3j 59m",
        price = "Rp 225.000"
    ),
    Train(
        title = "MUTIARA SELATAN",
        from = "18:20 Surabaya Gubeng",
        to = "21:38 Solo Balapan",
        duration = "3j 18m",
        price = "Rp 240.000"
    ),
    Train(
        title = "BIMA",
        from = "19:20 Surabaya Gubeng",
        to = "22:24 Solo Balapan",
        duration = "3j 04M",
        price = "Rp 395.000"
    ),
    Train(
        title = "TURANGGA",
        from = "20:00 Surabaya Gubeng",
        to = "22:24 Solo Balapan",
        duration = "3j 04m",
        price = "Rp 355.000"
    )
)

val menuItems = listOf(
    "Kam, 16",
    "Jum, 17",
    "Sab, 18",
    "Min, 19",
    "Sen, 20",
    "Sel, 21",
    "Rab, 22",
    "Kam, 23",
    "Jum, 24",
    "Sab, 25",
    "Min, 26",
    "Sen, 27"
)

data class Train(
    val title: String,
    val from: String,
    val to: String,
    val duration: String,
    val price: String
)

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(EmptyDestinationsNavigator)
}