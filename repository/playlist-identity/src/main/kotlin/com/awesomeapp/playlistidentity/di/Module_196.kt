package com.awesomeapp.playlistidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.playlistidentity.Viewmodel196_1
import com.awesomeapp.playlistidentity.Activity196_2
import com.awesomeapp.playlistidentity.Activity196_3
import com.awesomeapp.playlistidentity.Fragment196_4
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.playlistidentity.Api196_6

@Module
@InstallIn(SingletonComponent::class)
object Module_196 {
    @Provides
    @Singleton
    fun provideRepository196_5(
        api0: Api132_6 = Api132_6(),
        api1: Api156_6 = Api156_6(),
        api2: Api136_6 = Api136_6(),
        api3: Api172_6 = Api172_6(),
        api4: Api160_6 = Api160_6(),
        api5: Api176_6 = Api176_6(),
        api6: Api144_6 = Api144_6(),
        api7: Api128_6 = Api128_6(),
        api8: Api148_6 = Api148_6(),
        api9: Api140_6 = Api140_6()
    ): Repository196_5 {
        return Repository196_5(api0, 
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
    fun provideApi196_6(): Api196_6 {
        return Api196_6()
    }
}