package com.example.tododesignsystem_ranikini.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tododesignsystem_ranikini.ui.theme.LocalSpacing

@Composable
fun TodoCard(title: String, subtitle: String) {

    val spacing = LocalSpacing.current

    Surface(
        tonalElevation = 4.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(spacing.medium),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                Icons.Default.Check,
                contentDescription = "Task Icon",
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(spacing.medium))

            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodyLarge
                )

                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}