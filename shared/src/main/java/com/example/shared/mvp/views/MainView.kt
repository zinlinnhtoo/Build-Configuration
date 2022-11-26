package com.example.shared.mvp.views

import com.example.shared.data.vos.RestaurantVO

interface MainView {
    fun showRestaurants(restaurants: List<RestaurantVO>)
    fun showError(errorMessage: String)
}