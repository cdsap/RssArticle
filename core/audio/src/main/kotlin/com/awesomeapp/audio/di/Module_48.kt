package com.awesomeapp.audio.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.audio.Viewmodel48_1
import com.awesomeapp.audio.Activity48_2
import com.awesomeapp.audio.Activity48_3
import com.awesomeapp.audio.Fragment48_4
import com.awesomeapp.audio.Repository48_5
import com.awesomeapp.audio.Api48_6

@Module
@InstallIn(SingletonComponent::class)
object Module_48 {
    @Provides
    @Singleton
    fun provideRepository48_5(): Repository48_5 {
        return Repository48_5()
    }

    @Provides
    @Singleton
    fun provideApi48_6(): Api48_6 {
        return Api48_6()
    }
}