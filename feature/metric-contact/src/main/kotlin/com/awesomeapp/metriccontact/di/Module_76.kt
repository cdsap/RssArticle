package com.awesomeapp.metriccontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.metriccontact.Viewmodel76_1
import com.awesomeapp.metriccontact.Activity76_2
import com.awesomeapp.metriccontact.Activity76_3
import com.awesomeapp.metriccontact.Fragment76_4
import com.awesomeapp.metriccontact.Repository76_5
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.metriccontact.Api76_6

@Module
@InstallIn(SingletonComponent::class)
object Module_76 {
    @Provides
    @Singleton
    fun provideRepository76_5(
        api0: Api48_6 = Api48_6(),
        api1: Api40_6 = Api40_6(),
        api2: Api4_6 = Api4_6(),
        api3: Api60_6 = Api60_6(),
        api4: Api8_6 = Api8_6(),
        api5: Api56_6 = Api56_6(),
        api6: Api20_6 = Api20_6()
    ): Repository76_5 {
        return Repository76_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi76_6(): Api76_6 {
        return Api76_6()
    }
}