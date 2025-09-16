package com.awesomeapp.eventlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.eventlogin.Viewmodel128_1
import com.awesomeapp.eventlogin.Activity128_2
import com.awesomeapp.eventlogin.Activity128_3
import com.awesomeapp.eventlogin.Fragment128_4
import com.awesomeapp.eventlogin.Repository128_5
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.eventlogin.Api128_6

@Module
@InstallIn(SingletonComponent::class)
object Module_128 {
    @Provides
    @Singleton
    fun provideRepository128_5(
        api0: Api64_6 = Api64_6(),
        api1: Api80_6 = Api80_6()
    ): Repository128_5 {
        return Repository128_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi128_6(): Api128_6 {
        return Api128_6()
    }
}