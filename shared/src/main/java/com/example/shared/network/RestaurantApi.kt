package com.example.shared.network

import com.example.shared.network.response.GetRestaurantResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface RestaurantApi {
    @GET(END_POINT_GET_RESTAURANT)
    fun getRestaurant(): Observable<GetRestaurantResponse>
}