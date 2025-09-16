package com.awesomeapp.profilecheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.pushidentity.Api148_6


@Singleton
class Repository204_5 @Inject constructor(
    private val api0: Api164_6,
    private val api1: Api176_6,
    private val api2: Api152_6,
    private val api3: Api148_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}