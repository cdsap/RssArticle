package com.awesomeapp.synccontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccontact.Viewmodel64_1
import com.awesomeapp.synccontact.Activity64_2
import com.awesomeapp.synccontact.Activity64_3
import com.awesomeapp.synccontact.Fragment64_4
import com.awesomeapp.synccontact.Repository64_5
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.synccontact.Api64_6

@Module
@InstallIn(SingletonComponent::class)
object Module_64 {
    @Provides
    @Singleton
    fun provideRepository64_5(
        api0: Api52_6 = Api52_6(),
        api1: Api12_6 = Api12_6(),
        api2: Api60_6 = Api60_6(),
        api3: Api28_6 = Api28_6(),
        api4: Api8_6 = Api8_6()
    ): Repository64_5 {
        return Repository64_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi64_6(): Api64_6 {
        return Api64_6()
    }
}