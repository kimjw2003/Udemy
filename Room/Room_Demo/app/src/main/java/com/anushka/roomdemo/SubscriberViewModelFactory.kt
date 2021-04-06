package com.anushka.roomdemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anushka.roomdemo.db.SubscriberRepositoty
import java.lang.IllegalArgumentException

class SubscriberViewModelFactory(private val repositoty: SubscriberRepositoty) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SubscriberViewmodel::class.java)){
            return SubscriberViewmodel(repositoty) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}