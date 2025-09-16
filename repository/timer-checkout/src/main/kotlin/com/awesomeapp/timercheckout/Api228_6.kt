package com.awesomeapp.timercheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class Api228_6 @Inject constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api228_6 API"
    }
}