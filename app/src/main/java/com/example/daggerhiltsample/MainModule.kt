package com.example.daggerhiltsample

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object MainModule {

    @ViewModelScoped
    @Provides
    @Named("String2")
    fun provideString2(
        @ApplicationContext context: Context,
        @Named("String1") testString1: String,
        number: Int,
        control: Boolean
    ): String =
        if(control) {
            "${context.getString(R.string.test)} - $testString1- $number"
        } else {
            "${context.getString(R.string.test)} - $testString1"
        }

    @ViewModelScoped
    @Provides
    fun provideBoolean() : Boolean = true
}