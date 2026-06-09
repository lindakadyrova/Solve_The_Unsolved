package com.kadyrova.solve_the_unsolved

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kadyrova.solve_the_unsolved.data.suspects
import com.kadyrova.solve_the_unsolved.ui.screens.SuspectScreen
import com.kadyrova.solve_the_unsolved.ui.theme.Solve_The_UnsolvedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Solve_The_UnsolvedTheme {
                SuspectScreen()
                }
            }
        }
    }
