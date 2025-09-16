package com.awesomeapp.profile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.profile.Viewmodel8_1
import com.awesomeapp.profile.Activity8_2
import com.awesomeapp.profile.Activity8_3
import com.awesomeapp.profile.Fragment8_4
import com.awesomeapp.profile.Repository8_5
import com.awesomeapp.profile.Api8_6

@Module
@InstallIn(SingletonComponent::class)
object Module_8 {
    @Provides
    @Singleton
    fun provideRepository8_5(): Repository8_5 {
        return Repository8_5()
    }

    @Provides
    @Singleton
    fun provideApi8_6(): Api8_6 {
        return Api8_6()
    }
}