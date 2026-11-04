package com.example.lh_kotlinm_2026bmovgr1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Pantalla() }
    }
}

@Composable
fun Pantalla() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.color_fondo)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.saludo),
            color = colorResource(R.color.color_texto),
            fontSize = 28.sp
        )
    }
}

@Preview(name = "1 Vertical", locale = "es", device = "spec:width=411dp,height=891dp")
@Composable
fun PreviewVertical() { Pantalla() }

@Preview(name = "2 Vertical EN", locale = "en", device = "spec:width=411dp,height=891dp")
@Composable
fun PreviewVerticalEn() { Pantalla() }

@Preview(name = "3 Horizontal", locale = "es", device = "spec:width=891dp,height=411dp")
@Composable
fun PreviewHorizontal() { Pantalla() }

@Preview(name = "4 Horizontal EN", locale = "en", device = "spec:width=891dp,height=411dp")
@Composable
fun PreviewHorizontalEn() { Pantalla() }