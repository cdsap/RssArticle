package com.awesomeapp.photoidentity

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.pushidentity.Api148_6


@Singleton
class Repository192_5 @Inject constructor(
    private val api0: Api140_6,
    private val api1: Api168_6,
    private val api2: Api144_6,
    private val api3: Api180_6,
    private val api4: Api172_6,
    private val api5: Api148_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}