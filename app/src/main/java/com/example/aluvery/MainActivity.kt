package com.example.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    FirstComposable()
                }
            }
        }
    }
}

@Composable
fun FirstComposable() {
    Text(text = "O primeiro hahaha")
    Text(text = "155555555555555555")
}
@Preview(
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES,
)
@Preview(
    showBackground = true,
)
@Composable
fun FirstComposablePreview() {
    AluveryTheme {
        Surface {
            FirstComposable()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "1ª linha")
        Text(text = "2ª linha")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "1ª linha")
        Text(text = "2ª linha")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "1ª linha")
        Text(text = "2ª linha")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomLayout() {
    Column(modifier = Modifier
        .background(Color.LightGray)
        .padding(5.dp)
        .fillMaxHeight()
        .fillMaxWidth()) {
        Text(text = "1ª linha")
        Text(text = "2ª linha")
        Row(modifier = Modifier
            .background(Color.Magenta)
            .padding(5.dp, 10.dp)
            .fillMaxWidth(0.65f)) {
            Text(text = "3ª linha")
            Text(text = "4ª linha")
        }
        Box(modifier = Modifier
            .background(Color.Green)
            .padding(20.dp)
            .width(150.dp)
            .height(100.dp)) {
            Row(modifier = Modifier
                .background(Color.Blue)
                .padding(3.dp)
                .fillMaxWidth()) {
                Text(text = "5ª linha")
                Text(text = "6ª linha")
            }
            Column(modifier = Modifier
                .background(Color.Yellow)
                .padding(5.dp)
                .fillMaxHeight(0.5f)) {
                Text(text = "7ª linha")
                Text(text = "8ª linha")
            }
        }
    }
}