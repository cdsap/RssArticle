package com.awesomeapp.task.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.task.Viewmodel28_1
import com.awesomeapp.task.Activity28_2
import com.awesomeapp.task.Activity28_3
import com.awesomeapp.task.Fragment28_4
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.task.Api28_6

@Module
@InstallIn(SingletonComponent::class)
object Module_28 {
    @Provides
    @Singleton
    fun provideRepository28_5(): Repository28_5 {
        return Repository28_5()
    }

    @Provides
    @Singleton
    fun provideApi28_6(): Api28_6 {
        return Api28_6()
    }
}