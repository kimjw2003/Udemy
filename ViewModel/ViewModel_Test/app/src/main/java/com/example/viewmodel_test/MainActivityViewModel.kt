package com.example.viewmodel_test

import androidx.lifecycle.ViewModel

class MainActivityViewModel() : ViewModel(){
    private var number : Int = 0


    fun getCurrentNumber() :Int{
        return number
    }

    fun getUpdatedNumber(numberEt: Int):Int{
        number += numberEt

        return number
    }
}