package com.example.lab7

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border // Import añadido
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AndroidBotCardScreen() {
    val context = LocalContext.current
    val skills = listOf("Kotlin", "Jetpack Compose", "Android SDK", "Material Design", "APIs REST")

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF5F5F5)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                shape = RoundedCornerShape(32.dp),
                elevation = CardDefaults.cardElevation(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color(0xFF6A1B9A),
                                    Color(0xFF4527A0)
                                )
                            )
                        )
                        .padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Imagen del bot
                    Image(
                        painter = painterResource(id = R.drawable.m12_c26_a7_p23),
                        contentDescription = "Android Bot",
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape)
                            .border(4.dp, Color.White, CircleShape), // Error corregido con import
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    // Nombre y título
                    Text(
                        text = "Juan Iriarte",
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Desarrollo Móvil",
                        color = Color(0xFFFFC107),
                        fontSize = 16.sp
                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    // Contacto
                    ContactInfoItem(icon = Icons.Filled.Email, info = "juan.iriarte1@utp.ac.pa") // Corregido: Filled
                    ContactInfoItem(icon = Icons.Filled.Phone, info = "+507 6873-5896") // Corregido: Filled
                    ContactInfoItem(icon = Icons.Filled.LocationOn, info = "Ciudad de Panamá") // Corregido: Filled

                    Spacer(modifier = Modifier.height(32.dp))

                    // Habilidades
                    Text(
                        text = "HABILIDADES TÉCNICAS",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.Start)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    SkillsList(skills = skills)

                    Spacer(modifier = Modifier.height(32.dp))

                    // Redes sociales
                    SocialMediaBar(
                        onLinkedIn = { openUrl(context, "#") },
                        onGitHub = { openUrl(context, "https://github.com/juaniriar7e") },
                        onTwitter = { openUrl(context, "#") }
                    )
                }
            }
        }
    }
}

private fun openUrl(context: android.content.Context, url: String) {
    val intent = android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(url))
    context.startActivity(intent)
}