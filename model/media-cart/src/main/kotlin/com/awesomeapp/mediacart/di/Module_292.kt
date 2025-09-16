package com.awesomeapp.mediacart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacart.Viewmodel292_1
import com.awesomeapp.mediacart.Activity292_2
import com.awesomeapp.mediacart.Activity292_3
import com.awesomeapp.mediacart.Fragment292_4
import com.awesomeapp.mediacart.Repository292_5
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.mediacart.Api292_6

@Module
@InstallIn(SingletonComponent::class)
object Module_292 {
    @Provides
    @Singleton
    fun provideRepository292_5(
        api0: Api236_6 = Api236_6(),
        api1: Api204_6 = Api204_6(),
        api2: Api216_6 = Api216_6(),
        api3: Api240_6 = Api240_6(),
        api4: Api232_6 = Api232_6(),
        api5: Api192_6 = Api192_6(),
        api6: Api208_6 = Api208_6()
    ): Repository292_5 {
        return Repository292_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi292_6(): Api292_6 {
        return Api292_6()
    }
}