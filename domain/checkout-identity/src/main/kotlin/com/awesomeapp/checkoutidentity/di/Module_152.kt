package com.awesomeapp.checkoutidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Viewmodel152_1
import com.awesomeapp.checkoutidentity.Activity152_2
import com.awesomeapp.checkoutidentity.Activity152_3
import com.awesomeapp.checkoutidentity.Fragment152_4
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.checkoutidentity.Api152_6

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api80_6 = Api80_6(),
        api1: Api96_6 = Api96_6(),
        api2: Api68_6 = Api68_6()
    ): Repository152_5 {
        return Repository152_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}