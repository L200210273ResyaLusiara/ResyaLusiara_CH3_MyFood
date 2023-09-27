package com.example.learnfragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coil.load

class HomeFragment : Fragment() {
    private var isListView = true
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
            view.findViewById(R.id.galleryIcon),
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
            "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/icons/icon_gallery.png",
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
        val listBtn = view.findViewById<ImageView>(R.id.listIcon)
        val galleryBtn = view.findViewById<ImageView>(R.id.galleryIcon)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter = FoodListsAdapter(foodItems)
        recyclerView.adapter = adapter

        adapter.setOnItemClickListener {foodItem ->
            navigateToFoodDetails(foodItem)
        }

        listBtn.setOnClickListener {
            if (!isListView) {
                recyclerView.layoutManager = LinearLayoutManager(requireContext())
                isListView = true
                adapter.notifyDataSetChanged()
            }
        }

        galleryBtn.setOnClickListener {
            if (isListView) {
                val spacingInPixels = resources.getDimensionPixelSize(R.dimen.grid_spacing)
                recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
                recyclerView.addItemDecoration(GridSpacingItemDecoration(2, spacingInPixels, true))
                isListView = false
                adapter.notifyDataSetChanged()
            }
        }

        return view
    }

    private fun navigateToFoodDetails(foodItem: FoodItems) {
        val bundle = Bundle()
        bundle.putSerializable("foodItem", foodItem)

        val foodDetailsFragment = FoodDetailsFragment()
        foodDetailsFragment.arguments = bundle

        val loadFragment = requireActivity().supportFragmentManager.beginTransaction()
        loadFragment.replace(R.id.fragmentContainer, foodDetailsFragment)
        loadFragment.addToBackStack(null)
        loadFragment.commit()
    }
}
