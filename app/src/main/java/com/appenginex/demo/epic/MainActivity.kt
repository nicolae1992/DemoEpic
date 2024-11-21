package com.appenginex.demo.epic

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appenginex.demo.epic.domain.ImageItem
import com.appenginex.demo.epic.ui.components.CustomActionBar
import com.appenginex.demo.epic.ui.components.MenuSection
import com.appenginex.demo.epic.ui.components.verticalListView
import com.appenginex.demo.epic.ui.theme.DemoEpicTheme
import com.appenginex.demo.epic.utils.fakeData.FakeDataProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listVertical = FakeDataProvider.getFakeImageList()
        setContent {
            DemoEpicTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        CustomActionBar()
                    }
                ) { innerPadding ->
                    LazyVerticalStaggeredGridSample(
                        modifier = Modifier.padding(innerPadding),
                        itemDashBoard = listVertical
                    )
                }
            }
        }
    }
}

@Composable
fun LazyVerticalStaggeredGridSample(
    modifier: Modifier,
    itemDashBoard: List<ImageItem>
) {
    val cellConfiguration = if (LocalConfiguration.current.orientation == ORIENTATION_LANDSCAPE) {
        StaggeredGridCells.Adaptive(minSize = 175.dp)
    } else StaggeredGridCells.Fixed(2)

    LazyVerticalStaggeredGrid(
        modifier = modifier.padding(horizontal = 15.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalItemSpacing = 10.dp,
        columns = cellConfiguration
    ) {
        item(span = StaggeredGridItemSpan.FullLine) {
            MenuSection(modifier = Modifier.padding(vertical = 8.dp))
        }

        item(span = StaggeredGridItemSpan.FullLine) {
            Text(
                text = "Popular Frames",
                fontSize = 24.sp,
                color = Color(0xFF333333),
                fontWeight = FontWeight.Bold
            )
        }

        verticalListView(items = itemDashBoard)

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoEpicTheme {
        LazyVerticalStaggeredGridSample(
            modifier = Modifier,
            itemDashBoard = FakeDataProvider.getFakeImageList()
        )
    }
}