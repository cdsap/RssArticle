package com.awesomeapp.postcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcontact.Viewmodel60_1
import com.awesomeapp.postcontact.Activity60_2
import com.awesomeapp.postcontact.Activity60_3
import com.awesomeapp.postcontact.Fragment60_4
import com.awesomeapp.postcontact.Repository60_5
import com.awesomeapp.postcontact.Api60_6

@Module
@InstallIn(SingletonComponent::class)
object Module_60 {
    @Provides
    @Singleton
    fun provideRepository60_5(): Repository60_5 {
        return Repository60_5()
    }

    @Provides
    @Singleton
    fun provideApi60_6(): Api60_6 {
        return Api60_6()
    }
}