package com.kadyrova.solve_the_unsolved.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kadyrova.solve_the_unsolved.data.Case
import com.kadyrova.solve_the_unsolved.data.cases

@Composable
fun CaseScreen() {
    var selectedCase by remember { mutableStateOf<Case?>(null) }

    if (selectedCase == null) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Cases")

            cases.forEach { caseItem ->
                Card(
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .clickable {
                            selectedCase = caseItem
                        }
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(caseItem.title)
                        Text(caseItem.description)
                    }
                }
            }
        }
    } else {
        SuspectScreen()
    }
}