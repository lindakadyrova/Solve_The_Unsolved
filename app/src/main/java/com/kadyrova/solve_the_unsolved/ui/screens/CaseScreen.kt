package com.kadyrova.solve_the_unsolved.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kadyrova.solve_the_unsolved.data.Case
import com.kadyrova.solve_the_unsolved.data.cases
import com.kadyrova.solve_the_unsolved.ui.components.AppScreen
import com.kadyrova.solve_the_unsolved.ui.theme.Solve_The_UnsolvedTheme

@Composable
fun CaseScreen() {
    var selectedCase by remember { mutableStateOf<Case?>(null) }

    if (selectedCase == null) {
        AppScreen {
            Text(
                text = "Solve The Unsolved",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Choose a case to investigate",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.primary

            )

            Spacer(modifier = Modifier.height(16.dp))

            cases.forEach { caseItem ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .clickable { selectedCase = caseItem },
                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = caseItem.title,
                            style = MaterialTheme.typography.titleMedium
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = caseItem.description,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    } else {
        SuspectScreen(selectedCase!!.suspects)
    }
}


@Preview(showBackground = true)
@Composable
fun CaseScreenPreview() {
    Solve_The_UnsolvedTheme {
        CaseScreen()
    }
}