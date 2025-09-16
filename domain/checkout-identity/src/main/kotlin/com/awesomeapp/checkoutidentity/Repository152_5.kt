package com.awesomeapp.checkoutidentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.notificationcontact.Api68_6


@Singleton
class Repository152_5 @Inject constructor(
    private val api0: Api80_6,
    private val api1: Api96_6,
    private val api2: Api68_6
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