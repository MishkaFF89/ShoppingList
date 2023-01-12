package com.example.shoppinglist.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = UNDEFINDED_ID
) {
    companion object{
        const val UNDEFINDED_ID = -1
    }
}
