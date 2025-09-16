package com.awesomeapp.sharecheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sharecheckout.Viewmodel212_1
import com.awesomeapp.sharecheckout.Activity212_2
import com.awesomeapp.sharecheckout.Activity212_3
import com.awesomeapp.sharecheckout.Fragment212_4
import com.awesomeapp.sharecheckout.Repository212_5
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.sharecheckout.Api212_6

@Module
@InstallIn(SingletonComponent::class)
object Module_212 {
    @Provides
    @Singleton
    fun provideRepository212_5(
        api0: Api124_6 = Api124_6(),
        api1: Api136_6 = Api136_6(),
        api2: Api132_6 = Api132_6(),
        api3: Api152_6 = Api152_6()
    ): Repository212_5 {
        return Repository212_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi212_6(): Api212_6 {
        return Api212_6()
    }
}