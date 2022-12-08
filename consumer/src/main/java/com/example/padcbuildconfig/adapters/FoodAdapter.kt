//package com.example.padcbuildconfig.adapters
//
//import android.annotation.SuppressLint
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.padcbuildconfig.R
//
//class FoodAdapter: RecyclerView.Adapter<FoodViewholder>() {
//
//    private var mFoods: List<FoodVO> = listOf()
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewholder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_food, parent, false)
//        return FoodViewholder(view)
//    }
//
//    override fun onBindViewHolder(holder: FoodViewholder, position: Int) {
//        if (mFoods.isNotEmpty()) {
//            holder.bindData(mFoods[position])
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return mFoods.count()
//    }
//
//    @SuppressLint("NotifyDataSetChanged")
//    fun setNewData(data: List<FoodVO>) {
//        mFoods = data
//        notifyDataSetChanged()
//    }
//}