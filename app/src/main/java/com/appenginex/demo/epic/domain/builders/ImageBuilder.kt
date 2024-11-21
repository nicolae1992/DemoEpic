package com.appenginex.demo.epic.domain.builders

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.appenginex.demo.epic.R
import com.appenginex.demo.epic.domain.ImageItem

class ImageBuilder {
    private var thumbnail: Int = R.drawable.ic_launcher_background
    private var isLock: Boolean = false
    private var size: Dp = 246.dp

    fun setThumbnail(thumbnail: Int) = apply { this.thumbnail = thumbnail }
    fun setLock(isLock: Boolean) = apply { this.isLock = isLock }
    fun setSize(size: Dp) = apply { this.size = size }

    fun build(): ImageItem {
        return ImageItem(
            thumbnail = this.thumbnail,
            isLock = isLock,
            size = size
        )
    }
}