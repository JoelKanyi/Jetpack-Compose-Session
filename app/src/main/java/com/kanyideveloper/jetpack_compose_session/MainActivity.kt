package com.kanyideveloper.jetpack_compose_session

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kanyideveloper.jetpack_compose_session.ui.theme.JetpackComposeSessionTheme
import com.kanyideveloper.jetpack_compose_session.ui.theme.MyBlue
import com.kanyideveloper.jetpack_compose_session.ui.theme.MyGreen
import com.kanyideveloper.jetpack_compose_session.ui.theme.MyPink

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeSessionTheme {
                Scaffold(
                    topBar = {
                        MyTopAppBar()
                    }
                ) {
                    LazyColumn(
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        item {
                            MyBalance()
                        }

                        item {
                            Spacer(modifier = Modifier.height(16.dp))
                            MyLoan()
                        }

                        item {
                            Spacer(modifier = Modifier.height(16.dp))
                            MyInvestment()
                        }

                        item { 
                            Spacer(modifier = Modifier.height(12.dp))
                            Text(text = "Recent Activity")
                        }
                        
                        items(10){
                            RecentActivityItem()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RecentActivityItem() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = Color.White,
        elevation = 3.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = null,
                    tint = MyGreen
                )

                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Nkechi Aniugbo",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "WALLET TOPUP",
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp
                    )
                }
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "$300,000",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    color = Color.Green
                )
                
                Spacer(modifier = Modifier.height(4.dp))
                
                Text(
                    text = "Jan 19, 2019",
                    fontWeight = FontWeight.Light,
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
fun MyLoan() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = MyGreen,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(.7f)
            ) {
                Text(
                    text = "Apply for a loan",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Text(
                    text = "Receive funds in your account in as little as 5 minutes",
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp
                )
            }

            Image(
                painter = painterResource(id = R.drawable.credit_card),
                contentDescription = null,
            )
        }
    }
}

@Composable
fun MyInvestment() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = MyPink,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(.7f)
            ) {
                Text(
                    text = "Apply for a loan",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Text(
                    text = "Receive funds in your account in as little as 5 minutes",
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp
                )
            }

            Image(
                painter = painterResource(id = R.drawable.credit_card),
                contentDescription = null,
            )
        }
    }
}

@Composable
fun MyBalance() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        backgroundColor = MyBlue,
    ) {
        Column(modifier = Modifier.padding(18.dp)) {
            Text(
                text = "BALANCE",
                color = Color.White
            )
            
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$300,000.25",
                    color = Color.White,
                    fontSize = 20.sp
                )
                Button(onClick = { /*TODO*/ }) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = null)
                        Text(text = "Topup")
                    }
                }
            }
        }
    }
}

@Composable
fun MyTopAppBar() {
    TopAppBar(
        backgroundColor = Color.White,
        elevation = 0.dp,
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                   Image(
                       modifier = Modifier
                           .size(50.dp)
                           .clip(CircleShape),
                       painter = painterResource(id = R.drawable.car),
                       contentDescription = null,
                       contentScale = ContentScale.Crop
                   )

                    Text(
                        text = "Hello, Chidinma",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = null
                )
            }
        }
    )
}