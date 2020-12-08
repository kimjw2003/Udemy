package com.example.viewmodel_factory

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel(){
    private var number : Int = 0

    init{
        number = startingTotal
    }

    fun getCurrentNumber() :Int{
        return number
    }

    fun getUpdatedNumber(numberEt: Int):Int{
        number += numberEt

        return number
    }
}