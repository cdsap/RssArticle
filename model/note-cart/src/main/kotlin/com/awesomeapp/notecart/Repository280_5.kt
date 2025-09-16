package com.awesomeapp.notecart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.settingcheckout.Api216_6


@Singleton
class Repository280_5 @Inject constructor(
    private val api0: Api192_6,
    private val api1: Api188_6,
    private val api2: Api224_6,
    private val api3: Api212_6,
    private val api4: Api228_6,
    private val api5: Api220_6,
    private val api6: Api232_6,
    private val api7: Api216_6
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
                        { api6.fetchData() },
                        { api7.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}