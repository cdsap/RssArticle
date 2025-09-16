package com.awesomeapp.calendaridentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.calendaridentity.Viewmodel176_1
import com.awesomeapp.calendaridentity.Activity176_2
import com.awesomeapp.calendaridentity.Activity176_3
import com.awesomeapp.calendaridentity.Fragment176_4
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.calendaridentity.Api176_6

@Module
@InstallIn(SingletonComponent::class)
object Module_176 {
    @Provides
    @Singleton
    fun provideRepository176_5(
        api0: Api108_6 = Api108_6(),
        api1: Api96_6 = Api96_6(),
        api2: Api92_6 = Api92_6(),
        api3: Api120_6 = Api120_6()
    ): Repository176_5 {
        return Repository176_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi176_6(): Api176_6 {
        return Api176_6()
    }
}