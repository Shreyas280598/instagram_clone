package com.example.instagram

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        TopBar(name = "starks_ether")
        Spacer(modifier = Modifier.height(4.dp))
    }
}

@Composable
fun TopBar(
    name: String,
    modifier: Modifier = Modifier

) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier.fillMaxWidth()
    ) {
        val scope = rememberCoroutineScope()
        val snackBarHostState = remember { SnackbarHostState() }

        SnackbarHost(hostState = snackBarHostState)

        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            tint = Color.Black,
            modifier = modifier.size(26.dp)
        )
        Text(
            text = name,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        IconButton(onClick = {
            scope.launch {
                snackBarHostState.showSnackbar("This is bell icon")
            }
        }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_bell),
                contentDescription = "bell_icon",
                modifier = modifier.size(26.dp),
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_dotmenu),
            contentDescription = "bell_icon",
            tint = Color.Black,
            modifier = modifier.size(26.dp)
        )

    }

}

@Composable
fun ProfileSection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ){

            }
    }

}

@Composable
fun RoundImage(
        image:Painter,
        modifier: Modifier= Modifier
) {

}