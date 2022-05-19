package com.example.daggerhiltsample

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MainViewModel @Inject constructor(
    @Named("String2") test: String
): ViewModel() {

    init {
        Log.d("MainViewModel", test)
    }
}
