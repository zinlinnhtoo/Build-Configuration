package com.example.padcbuildconfig

import android.app.Application
import com.example.shared.data.models.RestaurantModelImpl

class RestaurantDeliveryApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        RestaurantModelImpl.initRetrofitWithBaseUrl(BuildConfig.ENDPOINT)
    }
}