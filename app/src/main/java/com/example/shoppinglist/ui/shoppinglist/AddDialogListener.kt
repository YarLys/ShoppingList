package com.example.shoppinglist.ui.shoppinglist

import com.example.shoppinglist.data.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}