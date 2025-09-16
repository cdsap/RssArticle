package com.awesomeapp.postcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcart.Viewmodel256_1
import com.awesomeapp.postcart.Activity256_2
import com.awesomeapp.postcart.Activity256_3
import com.awesomeapp.postcart.Fragment256_4
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.postcart.Api256_6

@Module
@InstallIn(SingletonComponent::class)
object Module_256 {
    @Provides
    @Singleton
    fun provideRepository256_5(
        api0: Api212_6 = Api212_6(),
        api1: Api220_6 = Api220_6(),
        api2: Api188_6 = Api188_6(),
        api3: Api228_6 = Api228_6(),
        api4: Api204_6 = Api204_6(),
        api5: Api208_6 = Api208_6(),
        api6: Api192_6 = Api192_6(),
        api7: Api216_6 = Api216_6()
    ): Repository256_5 {
        return Repository256_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi256_6(): Api256_6 {
        return Api256_6()
    }
}