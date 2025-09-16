package com.awesomeapp.forecastcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.forecastcheckout.Viewmodel236_1
import com.awesomeapp.forecastcheckout.Activity236_2
import com.awesomeapp.forecastcheckout.Activity236_3
import com.awesomeapp.forecastcheckout.Fragment236_4
import com.awesomeapp.forecastcheckout.Repository236_5
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.forecastcheckout.Api236_6

@Module
@InstallIn(SingletonComponent::class)
object Module_236 {
    @Provides
    @Singleton
    fun provideRepository236_5(
        api0: Api172_6 = Api172_6(),
        api1: Api160_6 = Api160_6(),
        api2: Api176_6 = Api176_6(),
        api3: Api124_6 = Api124_6(),
        api4: Api180_6 = Api180_6(),
        api5: Api140_6 = Api140_6(),
        api6: Api148_6 = Api148_6(),
        api7: Api156_6 = Api156_6(),
        api8: Api128_6 = Api128_6(),
        api9: Api164_6 = Api164_6(),
        api10: Api168_6 = Api168_6()
    ): Repository236_5 {
        return Repository236_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi236_6(): Api236_6 {
        return Api236_6()
    }
}