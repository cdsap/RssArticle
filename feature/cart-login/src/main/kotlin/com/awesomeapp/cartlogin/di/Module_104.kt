package com.awesomeapp.cartlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartlogin.Viewmodel104_1
import com.awesomeapp.cartlogin.Activity104_2
import com.awesomeapp.cartlogin.Activity104_3
import com.awesomeapp.cartlogin.Fragment104_4
import com.awesomeapp.cartlogin.Repository104_5
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.cartlogin.Api104_6

@Module
@InstallIn(SingletonComponent::class)
object Module_104 {
    @Provides
    @Singleton
    fun provideRepository104_5(
        api0: Api52_6 = Api52_6(),
        api1: Api16_6 = Api16_6(),
        api2: Api40_6 = Api40_6(),
        api3: Api48_6 = Api48_6(),
        api4: Api28_6 = Api28_6(),
        api5: Api32_6 = Api32_6(),
        api6: Api4_6 = Api4_6(),
        api7: Api12_6 = Api12_6(),
        api8: Api8_6 = Api8_6(),
        api9: Api56_6 = Api56_6()
    ): Repository104_5 {
        return Repository104_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi104_6(): Api104_6 {
        return Api104_6()
    }
}