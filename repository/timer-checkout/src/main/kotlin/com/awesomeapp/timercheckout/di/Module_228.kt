package com.awesomeapp.timercheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timercheckout.Viewmodel228_1
import com.awesomeapp.timercheckout.Activity228_2
import com.awesomeapp.timercheckout.Activity228_3
import com.awesomeapp.timercheckout.Fragment228_4
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.timercheckout.Api228_6

@Module
@InstallIn(SingletonComponent::class)
object Module_228 {
    @Provides
    @Singleton
    fun provideRepository228_5(
        api0: Api160_6 = Api160_6(),
        api1: Api140_6 = Api140_6(),
        api2: Api128_6 = Api128_6()
    ): Repository228_5 {
        return Repository228_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi228_6(): Api228_6 {
        return Api228_6()
    }
}