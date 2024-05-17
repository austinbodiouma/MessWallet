package com.firstapp1.messwallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.firstapp1.messwallet.ui.theme.MessWalletTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessWalletTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    SignUpScreen()
                }
            }
        }
    }
}

@Composable
fun SplashScreen() {
    val gradient = Brush.linearGradient(
        0.0f to Color(0xFFADDDB2),
        500.0f to Color(0xFFA6BB8D),
        1.0f to Color(0xFF4E5C3D),
        start = Offset.Zero,
        end = Offset.Infinite
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(Alignment.CenterVertically)
            .wrapContentSize(Alignment.Center)
            .background(gradient),


        ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight(Alignment.CenterVertically)
                .wrapContentSize(Alignment.Center)
                .background(Color(0xFFADDDB2))


        ) {
            Row(
                modifier = Modifier
                    .wrapContentSize(Alignment.Center)
                    .wrapContentHeight(Alignment.CenterVertically),
                horizontalArrangement = Center,
                verticalAlignment = Alignment.CenterVertically,


                ) {
                Image(
                    painter = painterResource(id = R.drawable.wallo_removebg_preview),
                    contentDescription = null,
                    modifier = Modifier
                        .height(height = 93.dp)
                        .width(width = 92.dp),

                    )


                Text(
                    text = "MESS WALLET",
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                        .padding(8.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,

                    )
            }

        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(Alignment.Bottom)
            .wrapContentSize(Alignment.Center)


    ) {
        Row(modifier = Modifier
            .wrapContentSize(Alignment.BottomEnd)
            .wrapContentHeight(Alignment.CenterVertically),
            horizontalArrangement = Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {


            Text(
                modifier = Modifier
                    .padding(50.dp),
                text = "FROM B-TECH",
                color = Color(0xFF162C18),
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
            )
        }
    }
@Composable
fun SignUpScreen(){
   Column(modifier = Modifier
       .fillMaxSize()

       ) {
       Image(
           painter = painterResource(id = R.drawable.manlookingatwallet),
           contentDescription = "Column Background",
           modifier = Modifier
               .fillMaxSize(),
           contentScale = ContentScale.FillBounds
       )

   }
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){


        Row(
            modifier = Modifier
                .wrapContentSize(Alignment.Center)
                .wrapContentHeight(Alignment.CenterVertically)
                .padding(24.dp),
            horizontalArrangement = Center,
            verticalAlignment = Alignment.CenterVertically,


            ) {
            Image(

                painter = painterResource(id = R.drawable.wallo_removebg_preview),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(height = 93.dp)
                    .width(width = 92.dp)
                    .fillMaxSize()
                    ,

                )


            Text(
                text = "MESS WALLET",
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .padding(8.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,

                )

        }

        TextField(value = "First name", onValueChange = { })
        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        TextField(value = "Last name", onValueChange = {})
        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        TextField(value = "ID number", onValueChange = {})

        Spacer(modifier = Modifier.padding(bottom = 24.dp))
          TextField(value = "Password", onValueChange = {})

        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        var text by remember { mutableStateOf("Password")}
        TextField(value = "Confirm Password", onValueChange = {newText ->
            text = newText
     })
        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        TextField(value = "Enter M-pesa number", onValueChange = {})
        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF162C18),
                contentColor = Color.White), shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .width(222.dp))
            {
            Text(text = " Sign Up",)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MessWalletTheme {
        SignUpScreen()

    }
}