package com.example.padcbuildconfig.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.padcbuildconfig.R
import com.example.padcbuildconfig.adapters.RestaurantAdapter
import com.example.shared.data.vos.RestaurantVO
import com.example.shared.mvp.presenters.MainPresenter
import com.example.shared.mvp.presenters.MainPresenterImpl
import com.example.shared.mvp.views.MainView
import com.example.shared.showSnackBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var mRestaurantAdapter: RestaurantAdapter

    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpPresenter()
        setUpToolbar()
        setUpRecyclerView()
        mPresenter.onUiReady()
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this)[MainPresenterImpl::class.java]
        mPresenter.initPresenter(this)
    }

    private fun setUpToolbar() {
        setSupportActionBar(toolBar)
        supportActionBar?.title = "Welcome To ${getString(R.string.app_name)}"
    }

    private fun setUpRecyclerView() {
        mRestaurantAdapter = RestaurantAdapter()
        rvRestaurant.adapter = mRestaurantAdapter
        rvRestaurant.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun showRestaurants(restaurants: List<RestaurantVO>) {
        mRestaurantAdapter.setNewData(restaurants)
    }

    override fun showError(errorMessage: String) {
        showSnackBar(errorMessage)
    }
}