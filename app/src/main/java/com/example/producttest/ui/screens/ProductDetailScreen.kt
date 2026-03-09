package com.example.producttest.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProductDetailScreen(title: String, price: String, description: String) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {

        Text(
            text = "Product Details",
            style = MaterialTheme.typography.headlineMedium,
            color = Color(0xFF2E7D32)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text("Title", color = Color.Gray)
                Text(title)

                Spacer(modifier = Modifier.height(16.dp))

                Text("Price", color = Color.Gray)
                Text("₹ $price", color = Color(0xFF2E7D32))

                Spacer(modifier = Modifier.height(16.dp))

                Text("Description", color = Color.Gray)
                Text(description)

            }

        }

    }

}