package com.anushka.coroutinesdemo1

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class UserDataManager {

    suspend fun getTotalUserCount() : Int {
        var count = 0
        CoroutineScope(IO).launch {
            delay(1000)
            count = 50
        }

        val deferred = CoroutineScope(IO).async {
            delay(3000)
            return@async 70
        }

        return count + deferred.await()
    }
}