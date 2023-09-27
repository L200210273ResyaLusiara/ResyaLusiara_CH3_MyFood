package com.example.learnfragment

import java.io.Serializable

class FoodItems(
    val name: String,
    val price: String,
    val desc: String,
    val address: String,
    val mapsUrl: String,
    val image: String,
) : Serializable

val foodItems: List<FoodItems> = listOf(
    FoodItems("Ayam Goreng Kriuk", "15.000", "Ayam Goreng Kriuk adalah hidangan ayam goreng yang renyah dan lezat.", "Jalan Sudirman No. 123, Jakarta", "https://www.google.com/maps?q=-6.2088,106.8450", "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_ayam_goreng3.jpg"),
    FoodItems("Dim Sum", "10.000", "Dim Sum adalah hidangan khas Cina yang terdiri dari berbagai jenis makanan kecil seperti pangsit dan dumpling.", "Jalan Thamrin No. 456, Jakarta", "https://www.google.com/maps?q=-6.1751,106.8650", "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_dimsum2.jpg"),
    FoodItems("Mocca Coffee", "15.000", "Mocca Coffee adalah kopi lezat dengan rasa khas mocca.", "Jalan Pangeran No. 789, Jakarta", "https://www.google.com/maps?q=-6.2088,106.8450", "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_coffe1.jpg"),
    FoodItems("Mie Setan", "10.000", "Mie Setan adalah hidangan mie pedas yang menggugah selera.", "Jalan Gatot Subroto No. 101, Jakarta", "https://www.google.com/maps?q=-6.1751,106.8650", "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_image1.jpg"),
    FoodItems("Pizza Sosis", "28.000", "Pizza Sosis adalah pizza lezat dengan berbagai topping sosis.", "Jalan Hayam Wuruk No. 234, Jakarta", "https://www.google.com/maps?q=-6.2088,106.8450", "https://github.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/blob/push_assets/images/img_pizza.jpg?raw=true"),
    FoodItems("Ayam Goreng Chiki", "12.000", "Ayam Goreng Chiki adalah hidangan ayam goreng khas dengan cita rasa yang unik.", "Jalan Diponegoro No. 567, Jakarta", "https://www.google.com/maps?q=-6.1751,106.8650", "https://raw.githubusercontent.com/L200210273ResyaLusiara/ResyaLusiara_CH3_MyFood/push_assets/images/img_ayam_goreng1.jpg")
)