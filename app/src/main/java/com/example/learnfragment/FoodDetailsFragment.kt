package com.example.learnfragment

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import coil.load

class FoodDetailsFragment : Fragment() {
    @SuppressLint("MissingInflatedId")
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

        val bundle = arguments
        if (bundle != null) {
            val foodItem = bundle.getSerializable("foodItem") as FoodItems?
            if (foodItem != null) {
                val foodBackgroundHero = view.findViewById<ImageView>(R.id.backgroundHero)
                val foodNameText = view.findViewById<TextView>(R.id.foodName)
                val foodPriceText = view.findViewById<TextView>(R.id.foodPrice)
                val foodDescText = view.findViewById<TextView>(R.id.foodDesc)
                val foodLocationText = view.findViewById<TextView>(R.id.foodLocation)
                val foodButton = view.findViewById<Button>(R.id.foodButton)

                foodBackgroundHero.load(foodItem.image)
                foodNameText.text = foodItem.name
                foodPriceText.text = foodItem.price
                foodDescText.text = foodItem.desc
                foodLocationText.text = foodItem.address
                foodButton.text = "Tambahkan ke Keranjang - ${foodItem.price}"

                foodLocationText.setOnClickListener {
                    val mapsUrl = foodItem.mapsUrl
                    val mapsIntent = Intent(Intent.ACTION_VIEW)
                    mapsIntent.data = Uri.parse(mapsUrl)
                    startActivity(mapsIntent)
                }
            }
        }

        val backButton = view.findViewById<ImageView>(R.id.backIcon)
        backButton.setOnClickListener {
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, HomeFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return view
    }
}
