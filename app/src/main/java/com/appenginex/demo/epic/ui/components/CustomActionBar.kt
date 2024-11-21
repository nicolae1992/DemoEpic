package com.appenginex.demo.epic.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.appenginex.demo.epic.R
import com.appenginex.demo.epic.ui.theme.DemoEpicTheme

@Composable
fun CustomActionBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center
    ) {
        IconButton(onClick = {}) {
            Image(
                painter = painterResource(R.drawable.action_remove_ad),
                contentDescription = "Remove Ads",
                modifier = Modifier.size(44.dp)
            )
        }
        Image(
            painter = painterResource(R.drawable.action_logo_menu),
            contentDescription = "Logo Menu",
            modifier = Modifier.fillMaxWidth().weight(1f)
        )
        IconButton(onClick = {}) {
            Image(
                painter = painterResource(R.drawable.action_settings),
                contentDescription = "Remove Ads",
                modifier = Modifier.size(44.dp)
            )
        }
    }
}

@Preview
@Composable
private fun CustomActionBarPreview() {
    DemoEpicTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            CustomActionBar(modifier = Modifier.padding(innerPadding))
        }
    }
}