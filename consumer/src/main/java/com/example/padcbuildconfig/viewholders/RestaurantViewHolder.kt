package com.example.padcbuildconfig.viewholders

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.shared.data.vos.RestaurantVO
import kotlinx.android.synthetic.main.view_holder_restaurant.view.*

class RestaurantViewHolder(itemView: View) : ViewHolder(itemView) {
    @SuppressLint("SetTextI18n")
    fun bindData(restaurant: RestaurantVO) {
        Glide.with(itemView.context)
            .load(restaurant.imageUrl)
            .into(itemView.ivRestaurant)

        itemView.tvRestaurantName.text = restaurant.name
        itemView.tvCategory.text = restaurant.category
        itemView.tvPrice.text = "${restaurant.deliveryPrice.toString()} MMK"
        itemView.tvRating.text = restaurant.rating.toString()
    }
}