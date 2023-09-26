package com.example.learnfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import coil.load

class FoodDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_food_details, container, false)

        val imageViews: Array<ImageView> = arrayOf(
            view.findViewById(R.id.backIcon),
            view.findViewById(R.id.locationIcon),
        )
        val imageUrls = arrayOf(
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/icons/icon_back.png",
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/icons/icon_shop.png",
        )

        for (i in imageViews.indices) {
            imageViews[i].load(imageUrls[i])
        }

        return view
    }
}