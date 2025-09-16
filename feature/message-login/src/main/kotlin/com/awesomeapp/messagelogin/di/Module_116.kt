package com.awesomeapp.messagelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.messagelogin.Viewmodel116_1
import com.awesomeapp.messagelogin.Activity116_2
import com.awesomeapp.messagelogin.Activity116_3
import com.awesomeapp.messagelogin.Fragment116_4
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.messagelogin.Api116_6

@Module
@InstallIn(SingletonComponent::class)
object Module_116 {
    @Provides
    @Singleton
    fun provideRepository116_5(
        api0: Api20_6 = Api20_6(),
        api1: Api12_6 = Api12_6(),
        api2: Api28_6 = Api28_6(),
        api3: Api48_6 = Api48_6(),
        api4: Api8_6 = Api8_6()
    ): Repository116_5 {
        return Repository116_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi116_6(): Api116_6 {
        return Api116_6()
    }
}