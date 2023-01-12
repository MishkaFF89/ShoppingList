package com.example.shoppinglist.domain

interface ShopListRepository {

    fun getShopList (): List<ShopItem>

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem
}