package com.example.coroutines_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.DisposableHandle
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch{
            Log.d("Logd", "Hello from ${Thread.currentThread().name}")
        }

        CoroutineScope(Dispatchers.Main).launch{
            Log.d("Logd", "Hello from ${Thread.currentThread().name}")
        }
    }
}