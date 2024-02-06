package br.senai.sp.jandira.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   TelaLogin()
                }
            }
        }
    }
}

@Composable
fun TelaLogin() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF742BF5)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {

            Text(
                text = "Login",
                fontSize = 48.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 48.dp)
            )

            Box(
                modifier = Modifier
                    .background(
                        color = Color(0xFF0EAEBD),
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(horizontal = 16.dp)
            ){
                Column(
                    modifier = Modifier.padding(42.dp)
                ) {
                    Text(
                        text = "Email",
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    TextField(value = "", onValueChange = {})

                    Text(
                        text = "Senha",
                        color = Color.White,
                        modifier = Modifier.padding(top = 16.dp, bottom = 4.dp)
                    )
                    TextField(value = "", onValueChange = {})

                    Row(
                        modifier = Modifier.width(280.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(checked = true, onCheckedChange ={})
                        Text(text = "Lembrar")

                    }
                }
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(350.dp)
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0EAEBD))
            ) {
                Text(
                    text = "Entrar",
                    fontSize = 24.sp
                )
            }

            Box{
                Text(
                    text = "Desenvolvido por DSBIT-B",
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }






        }
        }

    }


@Composable
fun Teste() {
    Surface(
        modifier = Modifier
            .width(300.dp)
            .height(500.dp),
        color = Color.Blue
    )
    {
        Box(
            modifier = Modifier
                .padding(top = 32.dp, end = 32.dp, bottom = 60.dp)
                .background(Color.Cyan)
        ){
            Text(
                text = "Olá mundo",
                modifier = Modifier
                    .align(Alignment.Center)
                    .offset(0.dp, 100.dp)

            )
            Box(modifier = Modifier
                .background(Color.Gray)
                .width(100.dp)
                .height(100.dp)
                .align(Alignment.TopCenter)
                .offset(-20.dp, 0.dp)
            )

        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    LayoutsTheme {
        TelaLogin()
    }
}
@Preview(showSystemUi = true)
@Composable
fun TestePreview() {
    LayoutsTheme {
        Teste()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Olá $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LayoutsTheme {
        Greeting("Android")
    }

}