package com.example.smcwalletauth.auth

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.smcwalletauth.R
import com.example.smcwalletauth.navigation.Screen
import com.example.smcwalletauth.ui.theme.*

@Composable
fun GettingStartedScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.onboarding),
                contentScale = ContentScale.FillBounds
            )
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.size(450.dp))
            Text(textAlign = TextAlign.Center,
                text = "Welcome to Whale Tracker",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = HeaderText)
            Spacer(modifier = Modifier.size(8.dp))
            Text(textAlign = TextAlign.Center,
                text = "Starting today you can monitor tokens and holders on top projects here",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = SubText)
            Spacer(modifier = Modifier.size(28.dp))
            Button(onClick = {
                navController.navigate(route = Screen.SignUp.route)
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(contentColor = TextColor,
                    backgroundColor = Color.White)) {
                Text(text = "Get Started", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
            Spacer(modifier = Modifier.size(14.dp))
            Button(onClick = {
                navController.navigate(route = Screen.SignIn.route)
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(12.dp, 0.dp, 12.dp, 0.dp),
                shape = RoundedCornerShape(200.dp),
                colors = ButtonDefaults.buttonColors(contentColor = Color.White,
                    backgroundColor = Divider)) {
                Text(text = "I already have an account", fontSize = 16.sp, fontWeight = FontWeight.Medium)
            }
        }
    }
}