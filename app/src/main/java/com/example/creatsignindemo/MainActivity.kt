package com.example.creatsignindemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.creatsignindemo.createacc.CreateAccountScreen
import com.example.creatsignindemo.home.HomeScreen
import com.example.creatsignindemo.signin.SignInScreen
import com.example.creatsignindemo.ui.theme.CreatSignInDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreatSignInDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()

                    Navigation(navController = navController)
                }
            }
        }
    }
}

    @Composable
    fun Navigation(navController: NavHostController){

        NavHost(navController = navController, startDestination = "signin"){
            composable(route = "signin"){
                SignInScreen(
                    navigateToHome =  {
                        navController.navigate("home"){
                        launchSingleTop = true
                        popUpTo("signin"){
                            inclusive = true
                        }
                    }
                },
                    navigateToCreateAccount = {
                        navController.navigate("signup"){
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }

            composable(route = "signup"){
                CreateAccountScreen (
                    navigateToSignIn = {
                        navController.navigate("signin"){
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                    )
            }

            composable(route= "home"){
                HomeScreen()
            }
        }
    }


