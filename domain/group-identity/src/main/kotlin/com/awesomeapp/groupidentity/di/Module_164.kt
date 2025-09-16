package com.awesomeapp.groupidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.groupidentity.Viewmodel164_1
import com.awesomeapp.groupidentity.Activity164_2
import com.awesomeapp.groupidentity.Activity164_3
import com.awesomeapp.groupidentity.Fragment164_4
import com.awesomeapp.groupidentity.Repository164_5
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.groupidentity.Api164_6

@Module
@InstallIn(SingletonComponent::class)
object Module_164 {
    @Provides
    @Singleton
    fun provideRepository164_5(
        api0: Api104_6 = Api104_6(),
        api1: Api120_6 = Api120_6(),
        api2: Api68_6 = Api68_6(),
        api3: Api92_6 = Api92_6(),
        api4: Api108_6 = Api108_6(),
        api5: Api116_6 = Api116_6()
    ): Repository164_5 {
        return Repository164_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi164_6(): Api164_6 {
        return Api164_6()
    }
}