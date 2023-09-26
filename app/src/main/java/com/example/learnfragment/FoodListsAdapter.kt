package com.example.learnfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class FoodListsAdapter(private val foodLists: List<FoodItems>) : RecyclerView.Adapter<FoodListsAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameView: TextView
        val priceView: TextView
        val imageView: ImageView
        init {
            nameView = view.findViewById(R.id.foodName)
            priceView = view.findViewById(R.id.foodPrice)
            imageView = view.findViewById(R.id.foodImage)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.food_lists, parent, false)
        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodItem = foodLists[position]
        holder.nameView.text = foodItem.name
        holder.priceView.text = foodItem.price
        holder.imageView.load(foodItem.image)
    }
    override fun getItemCount(): Int {
        return foodItems.size
    }
}