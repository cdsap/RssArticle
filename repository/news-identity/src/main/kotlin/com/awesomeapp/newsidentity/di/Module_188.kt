package com.awesomeapp.newsidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.newsidentity.Viewmodel188_1
import com.awesomeapp.newsidentity.Activity188_2
import com.awesomeapp.newsidentity.Activity188_3
import com.awesomeapp.newsidentity.Fragment188_4
import com.awesomeapp.newsidentity.Repository188_5
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.newsidentity.Api188_6

@Module
@InstallIn(SingletonComponent::class)
object Module_188 {
    @Provides
    @Singleton
    fun provideRepository188_5(
        api0: Api124_6 = Api124_6(),
        api1: Api180_6 = Api180_6(),
        api2: Api128_6 = Api128_6(),
        api3: Api160_6 = Api160_6(),
        api4: Api172_6 = Api172_6(),
        api5: Api168_6 = Api168_6(),
        api6: Api176_6 = Api176_6(),
        api7: Api152_6 = Api152_6(),
        api8: Api164_6 = Api164_6(),
        api9: Api136_6 = Api136_6(),
        api10: Api148_6 = Api148_6(),
        api11: Api144_6 = Api144_6()
    ): Repository188_5 {
        return Repository188_5(api0, 
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
    fun provideApi188_6(): Api188_6 {
        return Api188_6()
    }
}