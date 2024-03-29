package com.mustneerar7.helloandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustneerar7.helloandroid.ui.theme.HelloAndroidTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      HelloAndroidTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {
          GreetingText(
            message = stringResource(R.string.happy_birthday_text),
            from = stringResource(R.string.signature_text)
          )
        }
      }
    }
  }
}

@Preview(
  device = Devices.PIXEL_4_XL,
)
@Composable
fun BirthdayCardPreview() {
  HelloAndroidTheme {
    GreetingText(message = "Happy Birthday Babar", from = " From Mustneer")
  }
}

@Composable
fun GreetingText(modifier: Modifier = Modifier, message: String, from: String) {
  val image = painterResource(R.drawable.androidparty)
  Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
    Image(
      painter = image,
      contentDescription = "Android Party",
      contentScale = ContentScale.Crop,
      alpha = 0.5F,
      modifier = Modifier.fillMaxSize()
    )
    Column(
      modifier = modifier.padding(16.dp), verticalArrangement = Arrangement.Center
    ) {
      Text(
        text = message,
        fontSize = 80.sp,
        lineHeight = 100.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight(600),
      )
      Text(
        text = from,
        fontSize = 32.sp,
        modifier = Modifier
          .align(Alignment.CenterHorizontally)
          .padding(16.dp),
      )
    }
  }
}