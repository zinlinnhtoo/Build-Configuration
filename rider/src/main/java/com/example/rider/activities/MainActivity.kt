package com.example.rider.activities

import android.app.PendingIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.rider.R
import com.example.rider.sendNotification
import com.example.shared.showSnackBar
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            Log.d("firebase_token", it.result)
        }
    }

    override fun onResume() {
        super.onResume()
        showSnackBar("This is Rider App")

//        sendNotification(
//            this,
//            title = "Hello",
//            body = "This is rider app alflkdlfdskflsjdlfjsldfjlsdjflsjdflsdjflsdjflsjdfljsdlfjsdlfjlflsf lfdlfklajflaj lalfjlkdsfjlsjf l jljdkslaflsjdlfkjlsfjls",
//            pendingIntent = PendingIntent.getActivity(
//                this,
//                0,
//                RestaurantDetailActivity.newIntent(this),
//                PendingIntent.FLAG_IMMUTABLE
//            )
//        )
    }
}