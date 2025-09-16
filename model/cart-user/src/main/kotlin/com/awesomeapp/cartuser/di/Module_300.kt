package com.awesomeapp.cartuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartuser.Viewmodel300_1
import com.awesomeapp.cartuser.Activity300_2
import com.awesomeapp.cartuser.Activity300_3
import com.awesomeapp.cartuser.Fragment300_4
import com.awesomeapp.cartuser.Repository300_5
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.cartuser.Api300_6

@Module
@InstallIn(SingletonComponent::class)
object Module_300 {
    @Provides
    @Singleton
    fun provideRepository300_5(
        api0: Api204_6 = Api204_6(),
        api1: Api192_6 = Api192_6(),
        api2: Api224_6 = Api224_6(),
        api3: Api216_6 = Api216_6(),
        api4: Api228_6 = Api228_6(),
        api5: Api220_6 = Api220_6(),
        api6: Api208_6 = Api208_6(),
        api7: Api232_6 = Api232_6(),
        api8: Api212_6 = Api212_6(),
        api9: Api196_6 = Api196_6(),
        api10: Api236_6 = Api236_6()
    ): Repository300_5 {
        return Repository300_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi300_6(): Api300_6 {
        return Api300_6()
    }
}