package com.example.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
    Column {
        Text(text = "1ª linha")
        Text(text = "2ª linha")
        Row {
            Text(text = "3ª linha")
            Text(text = "4ª linha")
        }
        Box {
            Row {
                Text(text = "5ª linha")
                Text(text = "6ª linha")
            }
            Column {
                Text(text = "7ª linha")
                Text(text = "8ª linha")
            }
        }
    }
}