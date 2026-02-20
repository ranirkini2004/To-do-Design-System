package com.example.tododesignsystem_ranikini

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tododesignsystem_ranikini.ui.screens.TodoHomeScreen
import com.example.tododesignsystem_ranikini.ui.theme.TodoDesignSystemTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TodoDesignSystemTheme {
                TodoHomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TodoPreview() {
    TodoDesignSystemTheme {
        TodoHomeScreen()
    }
}