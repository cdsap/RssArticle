package com.awesomeapp.logincontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logincontact.Viewmodel52_1
import com.awesomeapp.logincontact.Activity52_2
import com.awesomeapp.logincontact.Activity52_3
import com.awesomeapp.logincontact.Fragment52_4
import com.awesomeapp.logincontact.Repository52_5
import com.awesomeapp.logincontact.Api52_6

@Module
@InstallIn(SingletonComponent::class)
object Module_52 {
    @Provides
    @Singleton
    fun provideRepository52_5(): Repository52_5 {
        return Repository52_5()
    }

    @Provides
    @Singleton
    fun provideApi52_6(): Api52_6 {
        return Api52_6()
    }
}