package com.example.smcwalletauth.auth

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.smcwalletauth.activity.Activity
import com.example.smcwalletauth.activity.DateRange
import com.example.smcwalletauth.navigation.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.GettingStarted.route
    ) {
        composable(
            route = Screen.GettingStarted.route
        ){
            GettingStartedScreen(navController = navController)
        }
        composable(
            route = Screen.ChangePassword.route
        ){
            ChangePassword()
        }
        composable(
            route = Screen.Otp.route
        ){
            Otp(navController = navController)
        }
        composable(
            route = Screen.ResetPassword.route
        ){
            ResetPassword()
        }
        composable(
            route = Screen.ForgotPassword.route
        ){
            ForgotPassword()
        }
        composable(
            route = Screen.SignUp.route
        ){
            SignUp(navController = navController)
        }
        composable(
            route = Screen.SignIn.route
        ){
            SignIn(navController = navController)
        }
        composable(
            route = Screen.VerificationSuccess.route
        ){
            VerificationSuccess(navController = navController)
        }
        composable(
            route = Screen.DateRange.route
        ){}
        composable(
            route = Screen.Activity.route
        ){
            Activity(navController = navController)
        }
    }
}