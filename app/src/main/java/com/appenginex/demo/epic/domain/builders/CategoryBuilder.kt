package com.appenginex.demo.epic.domain.builders

import com.appenginex.demo.epic.R
import com.appenginex.demo.epic.domain.Category
import com.appenginex.demo.epic.domain.ImageItem
import com.appenginex.demo.epic.utils.EMPTY

class CategoryBuilder {
    private var icon: Int = R.drawable.ic_launcher_background
    private var name: String = EMPTY

    fun setIcon(icon: Int) = apply { this.icon = icon }
    fun setName(name: String) = apply { this.name = name }

    fun build(): Category {
        return Category(
            icon = this.icon,
            name = this.name
        )
    }
}