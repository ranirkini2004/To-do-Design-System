package com.example.tododesignsystem_ranikini.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tododesignsystem_ranikini.ui.components.TodoCard
import com.example.tododesignsystem_ranikini.ui.theme.LocalSpacing

@Composable
fun TodoHomeScreen() {

    val spacing = LocalSpacing.current

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = MaterialTheme.colorScheme.primary
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add Task")
            }
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(spacing.medium)
        ) {

            Text(
                text = "My Tasks",
                style = MaterialTheme.typography.headlineLarge
            )

            Spacer(modifier = Modifier.height(spacing.medium))

            TodoCard("Complete Assignment", "Due Today")
            Spacer(modifier = Modifier.height(spacing.small))
            TodoCard("Buy Groceries", "Milk, Bread")
        }
    }
}