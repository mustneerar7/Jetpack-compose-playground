package com.mustneerar7.scrolablelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustneerar7.scrolablelist.data.Wallpaper
import com.mustneerar7.scrolablelist.data.getWallpapers
import com.mustneerar7.scrolablelist.ui.theme.ScrolableListTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ScrolableListTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background) {

          val walls = getWallpapers()
          WallpaperList(wallpapers = walls)
        }
      }
    }
  }
}

@Composable
fun WallpaperCard(wallpaper: Wallpaper, modifier: Modifier = Modifier){
  Card(modifier = modifier) {
    Column {
      Image(
        contentDescription = "",
        painter = painterResource(wallpaper.imageResource),
        modifier = Modifier
          .fillMaxWidth()
          .height(194.dp),
        contentScale = ContentScale.Crop
      )
    }
  }
}

@Composable
fun WallpaperList(wallpapers: List<Wallpaper>, modifier: Modifier = Modifier){
  LazyColumn(modifier = modifier){
    items(wallpapers){ wall ->
      WallpaperCard(
        wallpaper = wall,modifier.padding(
          start = 8.dp,
          end = 8.dp,
          bottom = 6.dp,
          top = 6.dp)
      )
    }
  }
}