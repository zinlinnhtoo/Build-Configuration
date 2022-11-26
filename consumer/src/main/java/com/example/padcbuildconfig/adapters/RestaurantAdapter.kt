package com.example.padcbuildconfig.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.padcbuildconfig.R
import com.example.padcbuildconfig.viewholders.RestaurantViewHolder
import com.example.shared.data.vos.RestaurantVO

class RestaurantAdapter: Adapter<RestaurantViewHolder>() {

    private var mRestaurants: List<RestaurantVO> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_restaurant, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        if (mRestaurants.isNotEmpty()) {
            holder.bindData(mRestaurants[position])
        }
    }

    override fun getItemCount(): Int {
        return mRestaurants.count()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(restaurants: List<RestaurantVO>) {
        mRestaurants = restaurants
        notifyDataSetChanged()
    }
}