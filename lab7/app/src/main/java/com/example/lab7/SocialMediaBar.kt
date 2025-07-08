package com.example.lab7

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun SocialMediaBar(
    onLinkedIn: () -> Unit,
    onGitHub: () -> Unit,
    onTwitter: () -> Unit
) {
    Row(
        modifier = Modifier.padding(top = 16.dp)
    ) {
        // LinkedIn
        IconButton(onClick = onLinkedIn) {
            Icon(
                painter = painterResource(id = R.drawable.ic_linkedin),
                contentDescription = "LinkedIn",
                tint = Color.White,
                modifier = Modifier.size(36.dp)
            )
        }

        // GitHub
        IconButton(onClick = onGitHub) {
            Icon(
                painter = painterResource(id = R.drawable.ic_github),
                contentDescription = "GitHub",
                tint = Color.White,
                modifier = Modifier.size(36.dp)
            )
        }

        // Twitter (nota: el nombre debe ser ic_twitter, no ic.twitter)
        IconButton(onClick = onTwitter) {
            Icon(
                painter = painterResource(id = R.drawable.ic_twitter),
                contentDescription = "Twitter",
                tint = Color.White,
                modifier = Modifier.size(36.dp)
            )
        }
    }
}