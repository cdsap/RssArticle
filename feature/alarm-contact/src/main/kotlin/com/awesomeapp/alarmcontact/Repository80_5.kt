package com.awesomeapp.alarmcontact

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.profile.Api8_6


@Singleton
class Repository80_5 @Inject constructor(
    private val api0: Api52_6,
    private val api1: Api48_6,
    private val api2: Api16_6,
    private val api3: Api4_6,
    private val api4: Api28_6,
    private val api5: Api40_6,
    private val api6: Api24_6,
    private val api7: Api20_6,
    private val api8: Api44_6,
    private val api9: Api36_6,
    private val api10: Api32_6,
    private val api11: Api60_6,
    private val api12: Api12_6,
    private val api13: Api8_6
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
                        { api7.fetchData() },
                        { api8.fetchData() },
                        { api9.fetchData() },
                        { api10.fetchData() },
                        { api11.fetchData() },
                        { api12.fetchData() },
                        { api13.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}