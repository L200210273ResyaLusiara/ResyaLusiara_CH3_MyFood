package com.example.learnfragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coil.load

class HomeFragment : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val imageViews: Array<ImageView> = arrayOf(
            view.findViewById(R.id.cartIcon),
            view.findViewById(R.id.profileIcon),
            view.findViewById(R.id.listIcon),
            view.findViewById(R.id.discountImage),
            view.findViewById(R.id.burgerImage),
            view.findViewById(R.id.mieImage),
            view.findViewById(R.id.snackImage),
            view.findViewById(R.id.makananImage)
        )
        val imageUrls = arrayOf(
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/icons/icon_cart.png",
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/icons/icon_profile.png",
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/icons/icon_list.png",
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_diskon.jpeg",
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_burger1.jpg",
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_mie3.jpg",
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_stick1.jpg",
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_makanan.jpg"
        )

        for (i in imageViews.indices) {
            imageViews[i].load(imageUrls[i])
        }

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter = FoodListsAdapter(foodItems)
        recyclerView.adapter = adapter

        return view
    }
}