package com.awesomeapp.videocheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.videocheckout.Viewmodel240_1
import com.awesomeapp.videocheckout.Activity240_2
import com.awesomeapp.videocheckout.Activity240_3
import com.awesomeapp.videocheckout.Fragment240_4
import com.awesomeapp.videocheckout.Repository240_5
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.videocheckout.Api240_6

@Module
@InstallIn(SingletonComponent::class)
object Module_240 {
    @Provides
    @Singleton
    fun provideRepository240_5(
        api0: Api144_6 = Api144_6(),
        api1: Api148_6 = Api148_6(),
        api2: Api164_6 = Api164_6(),
        api3: Api152_6 = Api152_6(),
        api4: Api128_6 = Api128_6(),
        api5: Api140_6 = Api140_6(),
        api6: Api132_6 = Api132_6(),
        api7: Api160_6 = Api160_6(),
        api8: Api136_6 = Api136_6(),
        api9: Api156_6 = Api156_6(),
        api10: Api180_6 = Api180_6()
    ): Repository240_5 {
        return Repository240_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi240_6(): Api240_6 {
        return Api240_6()
    }
}