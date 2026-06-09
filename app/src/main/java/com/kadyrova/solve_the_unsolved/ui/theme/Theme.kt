package com.kadyrova.solve_the_unsolved.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val CrimeDarkColorScheme = darkColorScheme(
    primary = Color(0xFF777777),
    secondary = Color(0xFF8A8F98),
    tertiary = Color(0xFFD4AF37),
    background = Color(0xFF242A2A),
    surface = Color(0xFF242A2A),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.Black,
    onBackground = Color(0xFFF2F2F2),
    onSurface = Color(0xFFF2F2F2)
)

@Composable
fun Solve_The_UnsolvedTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = CrimeDarkColorScheme,
        typography = Typography,
        content = content
    )
}