package com.example.shared.data.models

import com.example.shared.data.vos.RestaurantVO

interface RestaurantModel {
    fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onFailure: (String) -> Unit
    )
}