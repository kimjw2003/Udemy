package com.anushka.notificationdemo

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val channelId = "com.anushka.notificationdemo.channel1"
    private var notifcationManager : NotificationManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notifcationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        createNotificationChannel(channelId, "DemoChannel", "this is a demo")

        button.setOnClickListener {
            displayNotification()
        }
    }

    private fun displayNotification(){
        val notificationId = 45
        val tapResultIntent = Intent(this, SecondActivity::class.java)
            val pendingIntent:PendingIntent = PendingIntent.getActivity(this, 0, tapResultIntent, PendingIntent.FLAG_UPDATE_CURRENT)

        val notification = NotificationCompat.Builder(this@MainActivity, channelId)
            .setContentTitle("Demo Title")
            .setContentText("Demo Content")
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .build()
        notifcationManager?.notify(notificationId, notification)
    }

    private fun createNotificationChannel(id : String, name : String, channelDescription : String){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel(id, name, importance).apply {
                description = channelDescription
            }
            notifcationManager?.createNotificationChannel(channel)
        }
    }

}
