package com.awesomeapp.timercheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.eventlogin.Api128_6


@Singleton
class Repository228_5 @Inject constructor(
    private val api0: Api160_6,
    private val api1: Api140_6,
    private val api2: Api128_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}