package com.awesomeapp.notecart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecart.Viewmodel280_1
import com.awesomeapp.notecart.Activity280_2
import com.awesomeapp.notecart.Activity280_3
import com.awesomeapp.notecart.Fragment280_4
import com.awesomeapp.notecart.Repository280_5
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.notecart.Api280_6

@Module
@InstallIn(SingletonComponent::class)
object Module_280 {
    @Provides
    @Singleton
    fun provideRepository280_5(
        api0: Api192_6 = Api192_6(),
        api1: Api188_6 = Api188_6(),
        api2: Api224_6 = Api224_6(),
        api3: Api212_6 = Api212_6(),
        api4: Api228_6 = Api228_6(),
        api5: Api220_6 = Api220_6(),
        api6: Api232_6 = Api232_6(),
        api7: Api216_6 = Api216_6()
    ): Repository280_5 {
        return Repository280_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi280_6(): Api280_6 {
        return Api280_6()
    }
}