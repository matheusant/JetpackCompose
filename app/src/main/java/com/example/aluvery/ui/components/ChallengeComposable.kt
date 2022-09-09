package com.example.aluvery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.example.aluvery.R
import com.example.aluvery.ui.theme.Purple200
import com.example.aluvery.ui.theme.Purple500
import com.example.aluvery.ui.theme.Purple700

//@Preview(showBackground = true)
@Composable
fun ChallengeComposableOne() {
    Row {
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .height(100.dp)
                .width(60.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Test 1", modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Text(
                text = "Test 2", modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChallengeComposableTwo() {
    Surface(
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier.padding(8.dp),
        elevation = 5.dp
    ) {
        Row(
            Modifier
                .height(250.dp)
                .width(350.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(100.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Purple700, Purple500, Purple200
                            )
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    Modifier
                        .size(100.dp)
                        .offset(x = 50.dp)
                        .align(Alignment.CenterEnd)
                        .clip(CircleShape)
                        .border(2.dp, Purple200, CircleShape)
                )
            }
            Spacer(modifier = Modifier.width(50.dp))
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .align(CenterVertically)
            ) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontWeight = FontWeight(400),
                    maxLines = 6,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}