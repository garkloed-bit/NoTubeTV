package com.ycngmn.notubetv.ui.theme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.darkColorScheme
import androidx.tv.material3.Typography

private val MasterDarkColorScheme = darkColorScheme(
    primary = Color(0xFFE50914),
    onPrimary = Color.White,
    secondary = Color(0xFFE50914),
    onSecondary = Color.White,
    background = Color(0xFF000000),
    onBackground = Color.White,
    surface = Color(0xFF000000),
    onSurface = Color.White,
    surfaceVariant = Color(0xFF121212),
    onSurfaceVariant = Color.White,
    border = Color(0xFFE50914)
)

@Composable
fun NoTubeTVTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = MasterDarkColorScheme,
        content = content
    )
}
