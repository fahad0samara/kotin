package com.example.auth.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier



import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.auth.R

@Composable
fun Login() {
    var username = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(color = Color.Cyan)
    )


    {
        Image(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp),
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Login Image",

            )
        Text(text = "Login", fontSize = 20.sp, color = Color.Red)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "pleas sign in to continue", fontSize = 20.sp, color = Color.Red)

        Spacer(modifier = Modifier.height(20.dp))

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Username", fontSize = 20.sp, color = Color.Red)
            BasicTextField(
                value = username.value,
                onValueChange = { username.value = it },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Password", fontSize = 20.sp, color = Color.Red)
            BasicTextField(
                value = password.value,
                onValueChange = { password.value = it },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Forget Password", fontSize = 20.sp, color = Color.Red)
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Login", fontSize = 20.sp, color = Color.Red)
            Spacer(modifier = Modifier.height(20.dp))


    }
}






@Composable
@Preview
fun LoginPreview() {
    Login()
}


