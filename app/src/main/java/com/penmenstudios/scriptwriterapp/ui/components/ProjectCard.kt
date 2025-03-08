package com.penmenstudios.scriptwriterapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ProjectCard(title: String, onClick: () -> Unit) { // ✅ Ensure onClick parameter exists
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }, // ✅ Call onClick when clicked
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Text(title, fontSize = 18.sp, fontWeight = FontWeight.Medium)
        }
    }
}
