package com.example.shoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shoppinglist.data.ShoppingItem
import com.example.shoppinglist.data.repositories.ShoppingRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private var repository: ShoppingRepository
) : ViewModel() {

    fun upsert(item: ShoppingItem) {
        viewModelScope.launch {
            repository.upsert(item)
        }
    }

    fun delete(item: ShoppingItem) {
        viewModelScope.launch {
            repository.delete(item)
        }
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()

}