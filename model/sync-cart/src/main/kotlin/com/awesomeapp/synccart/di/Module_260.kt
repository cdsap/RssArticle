package com.awesomeapp.synccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccart.Viewmodel260_1
import com.awesomeapp.synccart.Activity260_2
import com.awesomeapp.synccart.Activity260_3
import com.awesomeapp.synccart.Fragment260_4
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.synccart.Api260_6

@Module
@InstallIn(SingletonComponent::class)
object Module_260 {
    @Provides
    @Singleton
    fun provideRepository260_5(
        api0: Api208_6 = Api208_6(),
        api1: Api216_6 = Api216_6(),
        api2: Api196_6 = Api196_6(),
        api3: Api228_6 = Api228_6(),
        api4: Api236_6 = Api236_6(),
        api5: Api184_6 = Api184_6(),
        api6: Api224_6 = Api224_6(),
        api7: Api200_6 = Api200_6(),
        api8: Api204_6 = Api204_6(),
        api9: Api232_6 = Api232_6()
    ): Repository260_5 {
        return Repository260_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi260_6(): Api260_6 {
        return Api260_6()
    }
}