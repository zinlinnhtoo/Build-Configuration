package com.example.shared.network.response

import com.example.shared.data.vos.RestaurantVO
import com.google.gson.annotations.SerializedName

data class GetRestaurantResponse(
    @SerializedName("code")
    val code: Int?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("data")
    val data: List<RestaurantVO>?
)
