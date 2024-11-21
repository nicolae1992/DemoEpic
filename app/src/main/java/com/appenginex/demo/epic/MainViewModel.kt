package com.appenginex.demo.epic

import androidx.lifecycle.ViewModel
import com.appenginex.demo.epic.domain.ImageItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {
    private val _state = MutableStateFlow<List<ImageItem>>(emptyList())
    val state: StateFlow<List<ImageItem>> = _state.asStateFlow()
}