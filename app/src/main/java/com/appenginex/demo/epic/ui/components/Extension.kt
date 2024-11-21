package com.appenginex.demo.epic.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.appenginex.demo.epic.domain.ImageItem

fun LazyStaggeredGridScope.verticalListView(
    items: List<ImageItem>,
    itemModifier: Modifier = Modifier.imageBoxStyle()
) {
    items.forEachIndexed { index, item ->
        val span =
            if (index != 0 && index % 8 == 0) StaggeredGridItemSpan.FullLine else StaggeredGridItemSpan.SingleLane
        this@verticalListView.item(span = span) {
            AsyncImage(
                model = item.thumbnail,
                contentDescription = null,
                modifier = itemModifier
                    .fillMaxWidth()
                    .height(item.size),
                contentScale = ContentScale.Crop
            )
        }
    }
}

fun Modifier.imageBoxStyle(
    cornerRadius: Dp = 8.dp
): Modifier =
    this
        .fillMaxWidth()
        .clip(RoundedCornerShape(cornerRadius))
        .border(1.dp, Color(0xFFFFB7B7), RoundedCornerShape(cornerRadius))