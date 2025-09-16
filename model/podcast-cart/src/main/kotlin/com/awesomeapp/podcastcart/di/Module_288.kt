package com.awesomeapp.podcastcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcart.Viewmodel288_1
import com.awesomeapp.podcastcart.Activity288_2
import com.awesomeapp.podcastcart.Activity288_3
import com.awesomeapp.podcastcart.Fragment288_4
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.podcastcart.Api288_6

@Module
@InstallIn(SingletonComponent::class)
object Module_288 {
    @Provides
    @Singleton
    fun provideRepository288_5(
        api0: Api216_6 = Api216_6(),
        api1: Api240_6 = Api240_6()
    ): Repository288_5 {
        return Repository288_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi288_6(): Api288_6 {
        return Api288_6()
    }
}