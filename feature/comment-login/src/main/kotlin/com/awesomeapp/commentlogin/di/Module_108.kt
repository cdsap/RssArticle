package com.awesomeapp.commentlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.commentlogin.Viewmodel108_1
import com.awesomeapp.commentlogin.Activity108_2
import com.awesomeapp.commentlogin.Activity108_3
import com.awesomeapp.commentlogin.Fragment108_4
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.commentlogin.Api108_6

@Module
@InstallIn(SingletonComponent::class)
object Module_108 {
    @Provides
    @Singleton
    fun provideRepository108_5(
        api0: Api56_6 = Api56_6(),
        api1: Api20_6 = Api20_6(),
        api2: Api36_6 = Api36_6(),
        api3: Api60_6 = Api60_6(),
        api4: Api24_6 = Api24_6(),
        api5: Api28_6 = Api28_6(),
        api6: Api4_6 = Api4_6(),
        api7: Api40_6 = Api40_6(),
        api8: Api48_6 = Api48_6(),
        api9: Api8_6 = Api8_6(),
        api10: Api44_6 = Api44_6(),
        api11: Api12_6 = Api12_6()
    ): Repository108_5 {
        return Repository108_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11)
    }

    @Provides
    @Singleton
    fun provideApi108_6(): Api108_6 {
        return Api108_6()
    }
}