package com.awesomeapp.videoidentity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.statuslogin.Repository124_5
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.documentlogin.Repository132_5


@HiltViewModel
class Viewmodel191_1 @Inject constructor(
    private val repository0: Repository148_5,
    private val repository1: Repository180_5,
    private val repository2: Repository124_5,
    private val repository3: Repository160_5,
    private val repository4: Repository164_5,
    private val repository5: Repository176_5,
    private val repository6: Repository156_5,
    private val repository7: Repository136_5,
    private val repository8: Repository132_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = coroutineScope {
                    val fetchers = listOf<suspend () -> String>(
                        { repository0.getData() },
                            { repository1.getData() },
                            { repository2.getData() },
                            { repository3.getData() },
                            { repository4.getData() },
                            { repository5.getData() },
                            { repository6.getData() },
                            { repository7.getData() },
                            { repository8.getData() }
                    )
                    val results = fetchers.map { fetcher ->
                        async { fetcher() }
                    }.awaitAll()
                    results.joinToString("")
                }
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: ${e.message}")
            }
        }
    }
}