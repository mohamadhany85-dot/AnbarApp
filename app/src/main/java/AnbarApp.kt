package com.anbar.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AnbarApp() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {
            // هنبني Home Screen بعدين
        }

        composable("needs") {
            // الاحتياجات
        }

        composable("debts") {
            // الديون
        }
    }
}
