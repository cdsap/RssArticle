package com.awesomeapp.reportcheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.reportcheckout.Viewmodel220_1
import com.awesomeapp.reportcheckout.Activity220_2
import com.awesomeapp.reportcheckout.Activity220_3
import com.awesomeapp.reportcheckout.Fragment220_4
import com.awesomeapp.reportcheckout.Repository220_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.reportcheckout.Api220_6

@Module
@InstallIn(SingletonComponent::class)
object Module_220 {
    @Provides
    @Singleton
    fun provideRepository220_5(
        api0: Api132_6 = Api132_6(),
        api1: Api164_6 = Api164_6(),
        api2: Api180_6 = Api180_6()
    ): Repository220_5 {
        return Repository220_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi220_6(): Api220_6 {
        return Api220_6()
    }
}