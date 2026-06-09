package com.kadyrova.solve_the_unsolved.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kadyrova.solve_the_unsolved.AppContent
import com.kadyrova.solve_the_unsolved.data.Suspect
import com.kadyrova.solve_the_unsolved.data.case1Suspects
import com.kadyrova.solve_the_unsolved.ui.components.AppScreen
import com.kadyrova.solve_the_unsolved.ui.theme.Solve_The_UnsolvedTheme

@Composable
fun SuspectScreen(suspects: List<Suspect>) {
    var resultMessage by remember { mutableStateOf("") }

   AppScreen {
        Text(
            text = "Suspects",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary,
        )

        Text(
            text = "Review the evidence and accuse the right person.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(16.dp))

        suspects.forEach { suspect ->
            var expanded by remember { mutableStateOf(false) }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable {
                        expanded = !expanded
                        resultMessage = ""
                    },
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = suspect.name,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    if (expanded) {
                        Spacer(modifier = Modifier.height(8.dp))

                        Text("Motive: ${suspect.motive}")
                        Text("Alibi: ${suspect.alibi}")
                        Text("Clue: ${suspect.clue}")

                        Spacer(modifier = Modifier.height(12.dp))

                        Button(
                            onClick = {
                                resultMessage = if (suspect.isCulprit) {
                                    "Correct! You solved the case."
                                } else {
                                    "Wrong suspect. Try again."
                                }
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Accuse Suspect")
                        }
                    }
                }
            }
        }

        if (resultMessage.isNotEmpty()) {
            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = resultMessage,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SuspectScreenPreview() {
    Solve_The_UnsolvedTheme {
        SuspectScreen(case1Suspects)
    }
}