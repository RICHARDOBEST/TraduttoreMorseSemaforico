package com.example.traduttoremorsesemaforico.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.traduttore.TraduttoreMorseSemaforico

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TraduttoreScreen()
        }
    }
}

@Composable
fun TraduttoreScreen() {
    val traduttore = TraduttoreMorseSemaforico()
    var inputText by remember { mutableStateOf(TextFieldValue("")) }
    var morseText by remember { mutableStateOf("") }
    var semaforicoText by remember { mutableStateOf("") }

    // Impostiamo il background dell'app su bianco
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White) // Sfondo bianco
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Titolo centrato
        Text(
            text = "Traduttore Morse e Semaforico",
            style = MaterialTheme.typography.h4.copy(fontSize = 24.sp),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Campo di testo
        TextField(
            value = inputText,
            onValueChange = { inputText = it },
            label = { Text("Inserisci il messaggio da tradurre") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            singleLine = true
        )

        // Bottone per la traduzione
        Button(
            onClick = {
                morseText = traduttore.traduciMorse(inputText.text)
                semaforicoText = traduttore.traduciSemaforico(inputText.text)
            },
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Text("Traduci")
        }

        // Output: Morse e Semaforico, allineato a sinistra
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Morse: $morseText",
                style = MaterialTheme.typography.body1.copy(fontSize = 20.sp, color = Color.Black),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "Semaforico: $semaforicoText",
                style = MaterialTheme.typography.body1.copy(fontSize = 20.sp, color = Color.Black),
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
    }
}
