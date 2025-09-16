package com.awesomeapp.usercart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.listidentity.Api184_6


@Singleton
class Repository252_5 @Inject constructor(
    private val api0: Api228_6,
    private val api1: Api208_6,
    private val api2: Api204_6,
    private val api3: Api212_6,
    private val api4: Api232_6,
    private val api5: Api200_6,
    private val api6: Api220_6,
    private val api7: Api184_6
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