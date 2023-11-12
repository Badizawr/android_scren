package com.example.my_first_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_first_app.ui.theme.My_first_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_first_appTheme {
                WelcomeScreen2()
            }
        }
    }
}

@Composable
fun WelcomeScreen2(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 375.dp)
            .requiredHeight(height = 812.dp)
            .clip(shape = RoundedCornerShape(40.dp))
            .background(
                brush = Brush.linearGradient(
                    0f to Color(0xff92a3fd),
                    1f to Color(0xff9dceff),
                    start = Offset(375f, 812f),
                    end = Offset(-89.84f, -249.85f)
                )
            )
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 30.dp,
                    y = 712.dp
                )
                .requiredWidth(width = 315.dp)
                .requiredHeight(height = 60.dp)
                .clip(shape = RoundedCornerShape(99.dp))
                .background(color = Color.White))
        Text(
            text = "Get Started",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 140.dp,
                    y = 730.dp
                ))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 95.dp,
                    y = 351.dp
                )
                .requiredWidth(width = 185.dp)
                .requiredHeight(height = 90.dp)
        ) {
            Text(
                text = "Everybody Can Train",
                color = Color(0xff7b6f72),
                style = TextStyle(
                    fontSize = 18.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 70.dp
                    )
                    .requiredWidth(width = 185.dp)
                    .requiredHeight(height = 20.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 11.dp,
                        y = 0.dp
                    )
                    .requiredWidth(width = 168.dp)
                    .requiredHeight(height = 75.dp)
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(
                            color = Color(0xff1d1617),
                            fontSize = 36.sp,
                            fontWeight = FontWeight.Bold)
                        ) {append("Fitness")}
                        withStyle(style = SpanStyle(
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold)) {append("X")}},
                    modifier = Modifier
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
        }
    }
}

@Preview(widthDp = 375, heightDp = 812)
@Composable
private fun WelcomeScreen2Preview() {
    WelcomeScreen2(Modifier)
}