package com.awesomeapp.articlelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articlelogin.Viewmodel140_1
import com.awesomeapp.articlelogin.Activity140_2
import com.awesomeapp.articlelogin.Activity140_3
import com.awesomeapp.articlelogin.Fragment140_4
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.articlelogin.Api140_6

@Module
@InstallIn(SingletonComponent::class)
object Module_140 {
    @Provides
    @Singleton
    fun provideRepository140_5(
        api0: Api88_6 = Api88_6(),
        api1: Api76_6 = Api76_6(),
        api2: Api116_6 = Api116_6(),
        api3: Api72_6 = Api72_6(),
        api4: Api112_6 = Api112_6(),
        api5: Api100_6 = Api100_6()
    ): Repository140_5 {
        return Repository140_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi140_6(): Api140_6 {
        return Api140_6()
    }
}