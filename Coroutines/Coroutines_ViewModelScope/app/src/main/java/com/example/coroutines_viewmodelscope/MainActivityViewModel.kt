package com.example.coroutines_viewmodelscope

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coroutines_viewmodelscope.model.UserData
import com.example.coroutines_viewmodelscope.model.UserRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {

    private var userRepository = UserRepository()
    var users : MutableLiveData<List<UserData>> = MutableLiveData()

    fun getUserData(){
        viewModelScope.launch {
            var result : List<UserData>? = null
            withContext(IO){
                result = userRepository.getUsers()
            }
                users.value = result
        }
    }
}