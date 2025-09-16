package com.awesomeapp.calendaridentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.sessionlogin.Api120_6


@Singleton
class Repository176_5 @Inject constructor(
    private val api0: Api108_6,
    private val api1: Api96_6,
    private val api2: Api92_6,
    private val api3: Api120_6
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