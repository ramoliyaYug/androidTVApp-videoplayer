package com.example.tvapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.tvapp.data.model.Video
import com.example.tvapp.ui.screen.HomeScreen
import com.example.tvapp.ui.screen.VideoPlayerScreen
import com.example.tvapp.ui.theme.TvAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TvAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TvApp()
                }
            }
        }
    }
}

@Composable
fun TvApp() {
    var selectedVideo by remember { mutableStateOf<Video?>(null) }
    var showPlayer by remember { mutableStateOf(false) }

    if (showPlayer && selectedVideo != null) {
        VideoPlayerScreen(
            video = selectedVideo!!,
            onBackClick = {
                showPlayer = false
                selectedVideo = null
            }
        )
    } else {
        HomeScreen(
            onVideoClick = { video ->
                selectedVideo = video
                showPlayer = true
            }
        )
    }
}
