package com.anushka.asyncawaitdemo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Main).launch {
            Log.d("Logd", "Cal Started...")

            val stock1 = async(IO) { getStock1() }
            val stock2 = async(IO) { getStock2() }

            val total = stock1.await()+stock2.await()
            Toast.makeText(applicationContext, "Total is $total", Toast.LENGTH_SHORT).show()

        }

    }
}

private suspend fun getStock1() : Int{
    delay(10000)
    Log.d("Logd", "Stock 1 Returned")
    return 55000
}

private suspend fun getStock2() : Int{
    delay(8000)
    Log.d("Logd", "Stock 2 Returned")
    return 35000
}