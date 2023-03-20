package com.example.smcwalletauth.navigation

sealed class Screen(val route: String) {
    object GettingStarted: Screen(route = "getting_started_screen")
    object Otp: Screen(route = "otp")
    object SignIn: Screen(route = "sign_in")
    object SignUp: Screen(route = "sign_up")
    object ChangePassword: Screen(route = "change_password")
    object ResetPassword: Screen(route = "reset_password")
    object ForgotPassword: Screen(route = "forgot_password")
    object VerificationSuccess: Screen(route = "verification_success")
    object DateRange: Screen(route = "date_range")
    object Activity: Screen(route = "activity")
}
