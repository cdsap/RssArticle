package com.awesomeapp.logincontact

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Repository52_5 @Inject constructor(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            "Data from Repository52_5 Repository"
    }
}