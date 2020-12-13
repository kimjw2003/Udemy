package com.example.coroutines_viewmodelscope.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun  getUsers() : List<UserData>{
        delay(8000)
        val users : List<UserData> = listOf(
            UserData(1, "Sam") ,
            UserData(2, "Taro"),
            UserData(3, "Jane"),
            UserData(4, "Amy")
        )
        return users
    }
}