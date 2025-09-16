package com.awesomeapp.searchcheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.calendaridentity.Api176_6


@Singleton
class Repository208_5 @Inject constructor(
    private val api0: Api168_6,
    private val api1: Api124_6,
    private val api2: Api172_6,
    private val api3: Api160_6,
    private val api4: Api176_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}