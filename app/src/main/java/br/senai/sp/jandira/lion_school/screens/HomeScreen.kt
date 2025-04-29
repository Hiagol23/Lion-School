package br.senai.sp.jandira.lion_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(45.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(30.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(R.drawable.lionschool),
                        contentDescription = stringResource(R.string.app_name),
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = stringResource(R.string.lionschool),
                        color = Color(0xFF3347B0),
                        fontSize = 49.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(120.dp))

                Text(
                    text = stringResource(R.string.titulo),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(6.dp)
                        .background(Color(0xFFFFC23D), shape = RoundedCornerShape(3.dp))
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = stringResource(R.string.descricao),
                    color = Color.Gray,
                    fontSize = 14.5.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                        .padding(12.dp)
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(13.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFC23D)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .border(
                            width = 2.5.dp,
                            color = Color(0xFF3347B0),
                            shape = RoundedCornerShape(13.dp)
                        )
                ) {
                    Text(
                        text = stringResource(R.string.botao),
                        color = Color(0xFF3347B0),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Spacer(modifier = Modifier.height(100.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Image(
                        painter = painterResource(R.drawable.youtube),
                        contentDescription = "YouTube",
                        modifier = Modifier.size(40.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.twitter),
                        contentDescription = "Twitter",
                        modifier = Modifier.size(40.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.instagram),
                        contentDescription = "Instagram",
                        modifier = Modifier.size(40.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.facebook),
                        contentDescription = "Facebook",
                        modifier = Modifier.size(40.dp)
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
