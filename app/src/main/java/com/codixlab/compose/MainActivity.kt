package com.codixlab.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codixlab.compose.ui.MyApplicationTheme
import com.codixlab.compose.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()

        }
    }
}

@Composable
fun Greeting() {
    val image = imageResource(id = R.drawable.header)
    MaterialTheme {
        Column(modifier = Modifier.padding(16.dp).fillMaxHeight()) {
            val modifier = Modifier.preferredHeight(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(5.dp))
            Image(
                image,
                modifier = modifier,
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.preferredHeight(16.dp))
            Text(text = "You can make updates to your " +
                    "submission and app settings " +
                    "up until your request is locked " +
                    "for review",style = typography.h6,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis)
            Text(text = "Karachi, Pakistan",style = typography.body2)
            Text(text = "10 December",style = typography.body2)
        }
    }

}

@Preview
@Composable
fun DefaultPreview() {
    Greeting()
}
