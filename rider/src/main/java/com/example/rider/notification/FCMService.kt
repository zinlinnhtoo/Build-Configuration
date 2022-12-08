package com.example.rider.notification

import android.app.PendingIntent
import android.util.Log
import com.example.rider.activities.RestaurantDetailActivity
import com.example.rider.sendNotification
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FCMService: FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("firebase_token", token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        sendNotification(
            this,
            title = message.data["title"] ?: "",
            body = message.data["body"] ?: "",
            pendingIntent = PendingIntent.getActivity(
                this,
                0,
                RestaurantDetailActivity.newIntent(this),
                PendingIntent.FLAG_IMMUTABLE
            )
        )
    }
}