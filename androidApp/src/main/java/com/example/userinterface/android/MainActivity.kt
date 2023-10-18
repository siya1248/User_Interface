package com.example.userinterface.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Place
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import android.widget.TextView
import com.example.userinterface.Greeting

class MainActivity : ComponentActivity() {
    private var counter by remember {mutableStateOf(0)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingView(counter, onIncrement = {counter++}, onDecrement={counter--})
                }
            }
        }
    }
}

@Composable
fun GreetingView(counter:Int, onIncrement:() -> Unit, onDecrement:() -> Unit) {

    Surface(

        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {

            Column(modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = " Counter: $counter",

                    modifier=Modifier.padding(8.dp))
            }
            Column {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier=Modifier.fillMaxWidth()
                )
                {
                    Button(
                        onClick = { onIncrement() }, shape = CircleShape
                    ) {
                        Text(text = "Increment", )
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {
                    Button(
                        onClick = { onDecrement() }, shape = CircleShape
                    ) {
                        Text(text = "Decrement")
                    }
                }
            }
        }
    }

@Preview
@Composable
