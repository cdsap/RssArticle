package com.awesomeapp.alarmcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcart.Viewmodel276_1
import com.awesomeapp.alarmcart.Activity276_2
import com.awesomeapp.alarmcart.Activity276_3
import com.awesomeapp.alarmcart.Fragment276_4
import com.awesomeapp.alarmcart.Repository276_5
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.alarmcart.Api276_6

@Module
@InstallIn(SingletonComponent::class)
object Module_276 {
    @Provides
    @Singleton
    fun provideRepository276_5(
        api0: Api192_6 = Api192_6(),
        api1: Api224_6 = Api224_6(),
        api2: Api220_6 = Api220_6(),
        api3: Api200_6 = Api200_6(),
        api4: Api188_6 = Api188_6(),
        api5: Api216_6 = Api216_6(),
        api6: Api232_6 = Api232_6(),
        api7: Api196_6 = Api196_6(),
        api8: Api212_6 = Api212_6(),
        api9: Api240_6 = Api240_6(),
        api10: Api208_6 = Api208_6(),
        api11: Api236_6 = Api236_6(),
        api12: Api228_6 = Api228_6(),
        api13: Api184_6 = Api184_6(),
        api14: Api204_6 = Api204_6()
    ): Repository276_5 {
        return Repository276_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11, 
        api12, 
        api13, 
        api14)
    }

    @Provides
    @Singleton
    fun provideApi276_6(): Api276_6 {
        return Api276_6()
    }
}