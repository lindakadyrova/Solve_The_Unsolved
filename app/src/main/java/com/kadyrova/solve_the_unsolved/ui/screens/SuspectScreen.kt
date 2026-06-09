package com.kadyrova.solve_the_unsolved.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kadyrova.solve_the_unsolved.data.suspects

@Composable
fun SuspectScreen() {
    Column(modifier = Modifier.Companion.padding(16.dp)) {
        Text("Suspects")

        suspects.forEach { suspect ->
            Card(modifier = Modifier.Companion.padding(vertical = 8.dp)) {
                Column(modifier = Modifier.Companion.padding(12.dp)) {
                    Text(suspect.name)
                    Text("Motive: ${suspect.motive}")
                    Text("Alibi: ${suspect.alibi}")
                }
            }
        }
    }
}