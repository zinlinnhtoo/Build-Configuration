package com.example.shared.mvp.presenters

import androidx.lifecycle.ViewModel
import com.example.shared.data.models.RestaurantModel
import com.example.shared.data.models.RestaurantModelImpl
import com.example.shared.mvp.views.MainView

class MainPresenterImpl: MainPresenter, ViewModel() {

    var mView: MainView? = null
    private val mRestaurantModel: RestaurantModel = RestaurantModelImpl

    override fun initPresenter(view: MainView) {
        mView = view
    }

    override fun onUiReady() {
        mRestaurantModel.getRestaurants(
            onSuccess = {mView?.showRestaurants(it)},
            onFailure = {mView?.showError(it)}
        )
    }
}