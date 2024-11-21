package com.appenginex.demo.epic.utils.fakeData

import com.appenginex.demo.epic.utils.fakeData.FakeDataProvider
import com.appenginex.demo.epic.domain.ImageItem
import com.appenginex.demo.epic.utils.fakeData.FakeImage.generateFakeImageList


object FakeDataProvider {
    fun getFakeImageList(): List<ImageItem> {
        return generateFakeImageList()
    }
}