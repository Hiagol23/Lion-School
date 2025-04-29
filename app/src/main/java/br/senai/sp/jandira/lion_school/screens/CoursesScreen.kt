package br.senai.sp.jandira.lion_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.R

@Composable
fun CourseScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.lionschool),
                contentDescription = "Lion School",
                modifier = Modifier.size(65.dp)
            )
            Text(
                text = stringResource(R.string.lionschool),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF2B3DBE)
            )
        }

        Spacer(modifier = Modifier.height(5.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0xFFFFC23D))
        )

        Spacer(modifier = Modifier.height(12.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .background(
                    color = Color(0xFFF3F3F3),
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(horizontal = 12.dp),
            contentAlignment = Alignment.CenterStart,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(40.dp))
                Text(
                    text = stringResource(R.string.pesquisa),
                    color = Color.Gray,
                    fontSize = 20.sp,
                )
                Spacer(modifier = Modifier.width(100.dp))
                Image(
                    painter = painterResource(id = R.drawable.pesquisa),
                    contentDescription = "Ícone de busca",
                    modifier = Modifier.size(30.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.courses),
                contentDescription = "Courses",
                modifier = Modifier.size(35.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Courses",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2B3DBE)
            )
        }

        Spacer(modifier = Modifier.height(5.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(2.dp, color = Color(0xFFFFC23D), shape = RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFF3347B0), Color(0xFFCFD4EA))
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(16.dp)
        ) {
            Column {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .height(75.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .size(100.dp),
                        painter = painterResource(
                            R.drawable.ds


                        ),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                        ,
                        color = Color(0xFFFFC23D),
                        fontWeight = FontWeight.ExtraBold ,
                        fontSize = 76.sp,
                        text = stringResource(
                            R.string.ds
                        )
                    )
                }
                Column (modifier = Modifier
                    .padding(start = 25.dp)
                ) {
                    Text(
                        modifier = Modifier
                        ,
                        color = (
                                Color.White
                                ),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 16.sp,
                        text = stringResource(
                            R.string.titulods
                        )
                    )
                    Text(
                        modifier = Modifier
                        ,
                        color = (
                                Color.White
                                ),

                        fontSize = 14.sp,
                        text = stringResource(
                            R.string.subtitulods
                        )
                    )
                    Row (
                        modifier = Modifier
                            .height(45.dp),
                        verticalAlignment = Alignment.Bottom) {
                        Image(
                            modifier = Modifier

                                .size(16.dp),
                            painter = painterResource(
                                R.drawable.semestres
                            ),
                            contentDescription = ""
                        )
                        Text(
                            modifier = Modifier
                            ,
                            color = (
                                    Color.White
                                    ),

                            fontSize = 12.sp,
                            text = stringResource(
                                R.string.semestre
                            )
                        )
                    }
                }
            }
        }


        Spacer(modifier = Modifier.height(15.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(2.dp, color = Color(0xFFFFC23D), shape = RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFF3347B0), Color(0xFF9FA9E1))
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(16.dp)
        ) {
            Column {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .height(75.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .size(100.dp),
                        painter = painterResource(
                            R.drawable.rds


                        ),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                        ,
                        color = Color(0xFFFFC23D),
                        fontWeight = FontWeight.ExtraBold ,
                        fontSize = 76.sp,
                        text = stringResource(
                            R.string.rds
                        )
                    )
                }
                Column (modifier = Modifier
                    .padding(start = 25.dp)
                ) {
                    Text(
                        modifier = Modifier
                        ,
                        color = (
                                Color.White
                                ),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 16.sp,
                        text = stringResource(
                            R.string.titulords
                        )
                    )
                    Text(
                        modifier = Modifier
                        ,
                        color = (
                                Color.White
                                ),

                        fontSize = 14.sp,
                        text = stringResource(
                            R.string.subtitulords
                        )
                    )
                    Row (
                        modifier = Modifier
                            .height(45.dp),
                        verticalAlignment = Alignment.Bottom) {
                        Image(
                            modifier = Modifier

                                .size(16.dp),
                            painter = painterResource(
                                R.drawable.semestres
                            ),
                            contentDescription = ""
                        )
                        Text(
                            modifier = Modifier
                            ,
                            color = (
                                    Color.White
                                    ),

                            fontSize = 12.sp,
                            text = stringResource(
                                R.string.semestre
                            )
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(2.dp, color = Color(0xFFFFC23D), shape = RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFF5A659F), Color(0xFF9FA9E1))
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(16.dp)
        ) {
            Column {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .height(75.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .size(100.dp),
                        painter = painterResource(
                            R.drawable.ele


                        ),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier
                        ,
                        color = Color(0xFFFFC23D),
                        fontWeight = FontWeight.ExtraBold ,
                        fontSize = 76.sp,
                        text = stringResource(
                            R.string.ele
                        )
                    )
                }
                Column (modifier = Modifier
                    .padding(start = 25.dp)
                ) {
                    Text(
                        modifier = Modifier
                        ,
                        color = (
                                Color.White
                                ),
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 16.sp,
                        text = stringResource(
                            R.string.tituloele
                        )
                    )
                    Text(
                        modifier = Modifier
                        ,
                        color = (
                                Color.White
                                ),

                        fontSize = 14.sp,
                        text = stringResource(
                            R.string.subtituloele
                        )
                    )
                    Row (
                        modifier = Modifier
                            .height(45.dp),
                        verticalAlignment = Alignment.Bottom) {
                        Image(
                            modifier = Modifier

                                .size(16.dp),
                            painter = painterResource(
                                R.drawable.semestres
                            ),
                            contentDescription = ""
                        )
                        Text(
                            modifier = Modifier
                            ,
                            color = (
                                    Color.White
                                    ),

                            fontSize = 12.sp,
                            text = stringResource(
                                R.string.semestre
                            )
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CourseScreenPreview() {
    CourseScreen()
}