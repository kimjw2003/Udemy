package com.anushka.dagger_study

import android.util.Log
import javax.inject.Inject

class MemoryCard{
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}