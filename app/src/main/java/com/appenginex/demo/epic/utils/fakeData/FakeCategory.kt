package com.appenginex.demo.epic.utils.fakeData

import com.appenginex.demo.epic.R
import com.appenginex.demo.epic.domain.Category
import com.appenginex.demo.epic.domain.builders.CategoryBuilder
import com.appenginex.demo.epic.utils.EMPTY

object FakeCategory {
    fun generateFakeCategoryList(): List<Category> {
        return listOf(
            CategoryBuilder()
                .setIcon(R.drawable.menu_1)
                .setName("Single Frames")
                .build(),
            CategoryBuilder()
                .setIcon(R.drawable.menu_2)
                .setName("Double Frames")
                .build(),
            CategoryBuilder()
                .setIcon(R.drawable.menu_3)
                .setName("Triple Frames")
                .build(),
            CategoryBuilder()
                .setIcon(R.drawable.menu_4)
                .setName("Collage")
                .build(),
            CategoryBuilder()
                .setIcon(R.drawable.menu_5)
                .setName("Photo Edit")
                .build(),
            CategoryBuilder()
                .setIcon(R.drawable.menu_6)
                .setName("Add Text")
                .build(),
        )

    }
}