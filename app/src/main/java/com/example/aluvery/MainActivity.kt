package com.example.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
}
@Preview(
    showBackground = true,
    heightDp = 100,
    widthDp = 100,
    uiMode = UI_MODE_NIGHT_YES,
)
@Preview(
    showBackground = true,
    heightDp = 100,
    widthDp = 100,
)
@Composable
fun FirstComposablePreview() {
    AluveryTheme {
        Surface {
            FirstComposable()
        }
    }
}