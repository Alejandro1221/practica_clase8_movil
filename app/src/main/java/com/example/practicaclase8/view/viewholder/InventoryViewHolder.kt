package com.example.practicaclase8.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.practicaclase8.databinding.ItemInventoryBinding
import com.example.practicaclase8.model.Inventory

class InventoryViewHolder (binding: ItemInventoryBinding):RecyclerView.ViewHolder(binding.root){
    val bindingItem = binding

    fun setItemInventory(inventory: Inventory){
        bindingItem.tvName.text = inventory.name
        bindingItem.tvPrice.text = "$ ${inventory.price}"
        bindingItem.tvQuantity.text = "${inventory.quantity}"
    }

}