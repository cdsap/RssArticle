package com.awesomeapp.listcheckout

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
import com.awesomeapp.fileidentity.Repository180_5
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.statuslogin.Repository124_5
import com.awesomeapp.accountidentity.Repository168_5
import com.awesomeapp.eventlogin.Repository128_5
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.logidentity.Repository172_5


@HiltViewModel
class Viewmodel233_1 @Inject constructor(
    private val repository0: Repository180_5,
    private val repository1: Repository148_5,
    private val repository2: Repository156_5,
    private val repository3: Repository140_5,
    private val repository4: Repository124_5,
    private val repository5: Repository168_5,
    private val repository6: Repository128_5,
    private val repository7: Repository132_5,
    private val repository8: Repository172_5
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