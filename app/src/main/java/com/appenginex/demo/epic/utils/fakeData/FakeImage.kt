package com.appenginex.demo.epic.utils.fakeData

import androidx.compose.ui.unit.dp
import com.appenginex.demo.epic.R
import com.appenginex.demo.epic.domain.ImageItem
import com.appenginex.demo.epic.domain.builders.ImageBuilder

object FakeImage {
    fun generateFakeImageList(): List<ImageItem> {
        return listOf(
            ImageBuilder()
                .setThumbnail(R.drawable.image_3)
                .setLock(true)
                .setSize(312.dp)
                .build(),
            ImageBuilder()
                .setThumbnail(R.drawable.image_2)
                .setLock(false)
                .setSize(174.dp)
                .build(),
            ImageBuilder()
                .setThumbnail(R.drawable.image_8)
                .setLock(true)
                .setSize(311.dp)
                .build(),
            ImageBuilder()
                .setThumbnail(R.drawable.image_3v)
                .setLock(false)
                .setSize(174.dp)
                .build(),
            ImageBuilder()
                .setThumbnail(R.drawable.image_10)
                .setLock(true)
                .setSize(312.dp)
                .build(),
            ImageBuilder()
                .setThumbnail(R.drawable.image_6)
                .setLock(true)
                .setSize(174.dp)
                .build(),
            ImageBuilder()
                .setThumbnail(R.drawable.image_13)
                .setLock(true)
                .setSize(311.dp)
                .build(),
            ImageBuilder()
                .setThumbnail(R.drawable.image_7)
                .setLock(true)
                .setSize(174.dp)
                .build(),
            ImageBuilder()
                .setThumbnail(R.drawable.image_9)
                .setLock(true)
                .setSize(189.dp)
                .build(),
        )

    }
}