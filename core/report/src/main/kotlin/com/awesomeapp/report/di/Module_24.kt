package com.awesomeapp.report.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.report.Viewmodel24_1
import com.awesomeapp.report.Activity24_2
import com.awesomeapp.report.Activity24_3
import com.awesomeapp.report.Fragment24_4
import com.awesomeapp.report.Repository24_5
import com.awesomeapp.report.Api24_6

@Module
@InstallIn(SingletonComponent::class)
object Module_24 {
    @Provides
    @Singleton
    fun provideRepository24_5(): Repository24_5 {
        return Repository24_5()
    }

    @Provides
    @Singleton
    fun provideApi24_6(): Api24_6 {
        return Api24_6()
    }
}