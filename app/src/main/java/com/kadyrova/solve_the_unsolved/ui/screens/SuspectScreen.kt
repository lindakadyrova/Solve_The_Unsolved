package com.kadyrova.solve_the_unsolved.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kadyrova.solve_the_unsolved.data.Suspect
import com.kadyrova.solve_the_unsolved.data.suspects

@Composable
fun SuspectScreen() {
    var selectedSuspect by remember {
        mutableStateOf<Suspect?>(null)
    }

    var resultMessage by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Suspects")

        suspects.forEach { suspect ->
            var expanded by remember {
                mutableStateOf(false)
            }
            Card(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .clickable {
                        expanded = !expanded
                        selectedSuspect = suspect
                        resultMessage = ""
                    }
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(suspect.name)
                    if (expanded) {
                        Text("Motive: ${suspect.motive}")
                        Text("Alibi: ${suspect.alibi}")
                        Text("Clue: ${suspect.clue}")

                        Button(onClick = {
                            resultMessage = if (suspect.isCulprit) {
                                "Correct! You solved the case."
                            } else {
                                "Wrong suspect. Try again."
                            }
                        }) {
                            Text("Accuse Suspect")
                        }
                    }
                    Text("Motive: ${suspect.motive}")
                    Text("Alibi: ${suspect.alibi}")
                }
            }
        }



        if (resultMessage.isNotEmpty()) {
            Text(resultMessage)
        }
    }
}