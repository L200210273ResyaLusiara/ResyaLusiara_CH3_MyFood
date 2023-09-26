package com.example.learnfragment

class FoodItems(
    val name: String,
    val price: String,
    val image: String,
)

val foodItems: List<FoodItems> = listOf(
    FoodItems("Ayam Goreng Kriuk", "15.000", "https://github.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/blob/push_assets/images/img_ayam_goreng3.jpg?raw=true"),
    FoodItems("Dim Sum", "10.000", "https://github.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/blob/push_assets/images/img_dimsum1.jpg?raw=true"),
    FoodItems("Mocca Coffee", "15.000", "https://github.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/blob/push_assets/images/img_coffe1.jpg?raw=true"),
    FoodItems("Mie Setan", "10.000", "https://github.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/blob/push_assets/images/img_image1.jpg?raw=true"),
    FoodItems("Pizza Sosis", "28.000", "https://github.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/blob/push_assets/images/img_pizza.jpg?raw=true"),
    FoodItems("Ayam Goreng Chiki", "12.000", "https://github.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/blob/push_assets/images/img_ayam_goreng1.jpg?raw=true")
)