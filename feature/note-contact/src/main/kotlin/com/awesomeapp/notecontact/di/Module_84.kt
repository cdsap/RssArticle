package com.awesomeapp.notecontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecontact.Viewmodel84_1
import com.awesomeapp.notecontact.Activity84_2
import com.awesomeapp.notecontact.Activity84_3
import com.awesomeapp.notecontact.Fragment84_4
import com.awesomeapp.notecontact.Repository84_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.notecontact.Api84_6

@Module
@InstallIn(SingletonComponent::class)
object Module_84 {
    @Provides
    @Singleton
    fun provideRepository84_5(
        api0: Api20_6 = Api20_6(),
        api1: Api16_6 = Api16_6(),
        api2: Api36_6 = Api36_6(),
        api3: Api12_6 = Api12_6()
    ): Repository84_5 {
        return Repository84_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi84_6(): Api84_6 {
        return Api84_6()
    }
}