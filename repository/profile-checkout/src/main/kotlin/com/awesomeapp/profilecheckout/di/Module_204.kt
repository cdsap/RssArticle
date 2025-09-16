package com.awesomeapp.profilecheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.profilecheckout.Viewmodel204_1
import com.awesomeapp.profilecheckout.Activity204_2
import com.awesomeapp.profilecheckout.Activity204_3
import com.awesomeapp.profilecheckout.Fragment204_4
import com.awesomeapp.profilecheckout.Repository204_5
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.profilecheckout.Api204_6

@Module
@InstallIn(SingletonComponent::class)
object Module_204 {
    @Provides
    @Singleton
    fun provideRepository204_5(
        api0: Api164_6 = Api164_6(),
        api1: Api176_6 = Api176_6(),
        api2: Api152_6 = Api152_6(),
        api3: Api148_6 = Api148_6()
    ): Repository204_5 {
        return Repository204_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi204_6(): Api204_6 {
        return Api204_6()
    }
}