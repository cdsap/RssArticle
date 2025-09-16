package com.awesomeapp.mediacart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.searchcheckout.Api208_6


@Singleton
class Repository292_5 @Inject constructor(
    private val api0: Api236_6,
    private val api1: Api204_6,
    private val api2: Api216_6,
    private val api3: Api240_6,
    private val api4: Api232_6,
    private val api5: Api192_6,
    private val api6: Api208_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() },
                        { api6.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}