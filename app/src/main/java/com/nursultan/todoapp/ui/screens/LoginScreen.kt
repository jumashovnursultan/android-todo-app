package com.nursultan.todoapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.Add
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon

import androidx.compose.runtime.Composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Scaffold(
        topBar = {
            TopAppBar(

                title = { Text("Заголовок") }

            )
        },
        bottomBar = {
            BottomAppBar {
                Text("Низ экрана")
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* действие */ }) {
                Icon(Icons.Default.Add, contentDescription = "Добавить")
            }
        }
    ) { innerPadding ->
        // Основной контент — innerPadding обязателен!
        Column(modifier = Modifier.padding(innerPadding)) {
            Text("Основной контент")
        }
    }
}

