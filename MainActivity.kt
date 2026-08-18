package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WeatherApp()
        }
    }
}

@Composable
fun WeatherApp() {

    var city by remember { mutableStateOf("Душанбе") }
    var temperature by remember { mutableStateOf("29°C") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "🌤️ Погода",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = city,
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = temperature,
            style = MaterialTheme.typography.displayLarge
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("☀️ Ясно")
        Text("💧 Влажность: 40%")
        Text("💨 Ветер: 12 км/ч")

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                temperature = "30°C"
            }
        ) {
            Text("Обновить")
        }
    }
}