package com.awesomeapp.sessionlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionlogin.Viewmodel120_1
import com.awesomeapp.sessionlogin.Activity120_2
import com.awesomeapp.sessionlogin.Activity120_3
import com.awesomeapp.sessionlogin.Fragment120_4
import com.awesomeapp.sessionlogin.Repository120_5
import com.awesomeapp.share.Api16_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.sessionlogin.Api120_6

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api16_6 = Api16_6(),
        api1: Api8_6 = Api8_6(),
        api2: Api28_6 = Api28_6(),
        api3: Api56_6 = Api56_6(),
        api4: Api32_6 = Api32_6(),
        api5: Api60_6 = Api60_6(),
        api6: Api24_6 = Api24_6(),
        api7: Api36_6 = Api36_6(),
        api8: Api48_6 = Api48_6(),
        api9: Api52_6 = Api52_6()
    ): Repository120_5 {
        return Repository120_5(api0, 
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
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}