package com.example.dagger_hilt_example

import android.util.Log

class Data (private val subData: SubData) {

    fun getData(){
        Log.d("Logd", "get Data")
    }
    fun getSecondData(){
        subData.getSubData()
    }
}