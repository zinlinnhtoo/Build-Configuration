package com.example.shared.data.models

import com.example.shared.data.vos.RestaurantVO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

object RestaurantModelImpl: BaseModel(), RestaurantModel {
    override fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mRestaurantApi.getRestaurant()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onSuccess(it.data ?: listOf())
            }, {
                onFailure(it.localizedMessage ?: "No Internet Connection")
            })
    }
}