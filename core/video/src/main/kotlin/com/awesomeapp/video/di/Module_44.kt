package com.awesomeapp.video.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.video.Viewmodel44_1
import com.awesomeapp.video.Activity44_2
import com.awesomeapp.video.Activity44_3
import com.awesomeapp.video.Fragment44_4
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.video.Api44_6

@Module
@InstallIn(SingletonComponent::class)
object Module_44 {
    @Provides
    @Singleton
    fun provideRepository44_5(): Repository44_5 {
        return Repository44_5()
    }

    @Provides
    @Singleton
    fun provideApi44_6(): Api44_6 {
        return Api44_6()
    }
}