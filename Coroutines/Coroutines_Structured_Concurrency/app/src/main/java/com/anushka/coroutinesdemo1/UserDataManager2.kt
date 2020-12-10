package com.anushka.coroutinesdemo1

import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO

class UserDataManager2 {
        var count = 0
        lateinit var deferred: Deferred<Int>

    suspend fun getTotalUserCount():Int {
        coroutineScope {
            launch(IO) {
                delay(1000)
                count=50
            }
            deferred = async(IO) {
                delay(3000)
                return@async 70
            }
        }
        return count +deferred.await()

    }

}