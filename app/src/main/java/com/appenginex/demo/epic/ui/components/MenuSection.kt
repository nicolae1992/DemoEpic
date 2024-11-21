package com.appenginex.demo.epic.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appenginex.demo.epic.ui.theme.DemoEpicTheme
import com.appenginex.demo.epic.utils.fakeData.FakeCategory.generateFakeCategoryList

@Composable
fun MenuSection(modifier: Modifier) {
    val categoryList = generateFakeCategoryList()
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
            .height(300.dp)
    ) {
        items(categoryList) { category ->
            MenuItem(
                icon = category.icon,
                title = category.name
            )
        }
    }
}

@Composable
private fun MenuItem(modifier: Modifier = Modifier, icon: Int, title: String) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier.size(100.dp),
            painter = painterResource(icon),
            contentDescription = title,
        )
        Text(
            text = title,
            fontSize = 14.sp,
            color = Color(0xFF232323),
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Preview
@Composable
private fun MenuItemPreview() {
    DemoEpicTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            MenuSection(modifier = Modifier.padding(innerPadding))
        }
    }
}