package com.awesomeapp.maplogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.maplogin.Viewmodel136_1
import com.awesomeapp.maplogin.Activity136_2
import com.awesomeapp.maplogin.Activity136_3
import com.awesomeapp.maplogin.Fragment136_4
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.maplogin.Api136_6

@Module
@InstallIn(SingletonComponent::class)
object Module_136 {
    @Provides
    @Singleton
    fun provideRepository136_5(
        api0: Api76_6 = Api76_6()
    ): Repository136_5 {
        return Repository136_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi136_6(): Api136_6 {
        return Api136_6()
    }
}