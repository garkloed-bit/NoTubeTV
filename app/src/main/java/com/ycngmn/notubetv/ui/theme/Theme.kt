package com.ycngmn.notubetv.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.darkColorScheme

private val MasterDarkColorScheme = darkColorScheme(
    primary = NetflixRed,
    onPrimary = Color.White,
    secondary = NetflixRed,
    onSecondary = Color.White,
    background = AmoledBlack,
    onBackground = Color.White,
    surface = AmoledBlack,
    onSurface = Color.White,
    surfaceVariant = Color(0xFF121212),
    onSurfaceVariant = Color.White,
    border = NetflixRed
)

@Composable
fun NoTubeTVTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = MasterDarkColorScheme,
        typography = Typography,
        content = content
    )
}
