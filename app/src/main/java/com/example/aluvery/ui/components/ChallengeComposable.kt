package com.example.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ChallengeComposableOne() {
    Row {
        Box(modifier = Modifier
            .background(Color.Blue)
            .height(100.dp)
            .width(60.dp))
        Column(modifier = Modifier
            .fillMaxWidth()) {
            Text(text = "Test 1", modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
                .padding(8.dp))
            Text(text = "Test 2", modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp))
        }
    }
}