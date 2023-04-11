package com.example.loadscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loadscreen.ui.theme.LoadScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoadScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    LoadScreen()
                }
            }
        }
    }
}

@Composable
fun LoadScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Image(
            painter = painterResource(id = R.drawable.load_pic),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        CircularProgressIndicator(
            modifier = Modifier.offset(y = 100.dp),
            color = Color(224, 180, 65))
   }
}


//@Composable
//fun MyScreen() {
//    val isLoading = remember { mutableStateOf(true) }
//    val data = remember { mutableStateOf("") }
//
//    LaunchedEffect(key1 = Unit) {
//        val newData = fetchDataFromInternet()
//        isLoading.value = false
//        data.value = newData
//    }
//
//    if (isLoading.value) {
//        LoadScreen()
//    } else {
//        //Mudar para a tela após a de carregamento aqui
//    }
//}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoadScreenTheme {
        LoadScreen()
    }
}