package com.awesomeapp.weathercontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathercontact.Viewmodel88_1
import com.awesomeapp.weathercontact.Activity88_2
import com.awesomeapp.weathercontact.Activity88_3
import com.awesomeapp.weathercontact.Fragment88_4
import com.awesomeapp.weathercontact.Repository88_5
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.weathercontact.Api88_6

@Module
@InstallIn(SingletonComponent::class)
object Module_88 {
    @Provides
    @Singleton
    fun provideRepository88_5(
        api0: Api56_6 = Api56_6(),
        api1: Api24_6 = Api24_6(),
        api2: Api52_6 = Api52_6()
    ): Repository88_5 {
        return Repository88_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi88_6(): Api88_6 {
        return Api88_6()
    }
}