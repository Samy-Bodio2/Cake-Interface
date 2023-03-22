package com.example.recipes.data

import androidx.annotation.DrawableRes
import com.example.recipes.R

//Ma data class recipe va me servir de classe de stockage pour les contenir les donnes de mon dessert

data class Recipe (
    var title: String,
    var category: String,
    val cookingTime: String,
    val energy: String,
    val rating: String,
    val description: String,
    val reviews: String,
    val ingredients: List<Ingredient>
        )

//@DrawableRes permet de preciser que ma variable image est une ressource de Drawable

data class Ingredient(@DrawableRes val image: Int,val title: String,val subtitle: String)

val strawberryCake = Recipe(
    title= "Strawberry Cake",
    category= "Desserts",
    cookingTime= "50 min",
    energy= "620 kcal",
    rating= "4,9",
    description= "This dessert is too funny to eat!!!!!!",
    reviews="84 photos   430 comments",
    ingredients = listOf(
        Ingredient(R.drawable.coins_200px,"Flour","450 g"),
        Ingredient(R.drawable.houh,"Pie","500g")
    )
)
