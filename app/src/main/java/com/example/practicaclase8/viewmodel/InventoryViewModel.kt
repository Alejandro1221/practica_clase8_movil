package com.example.practicaclase8.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicaclase8.model.Inventory
import com.example.practicaclase8.repository.InventoryRepository
import kotlinx.coroutines.launch

class InventoryViewModel(application: Application): AndroidViewModel(application) {
    val context = getApplication<Application>()
    private val inventoryRepository = InventoryRepository(context)

    fun saveInventory(inventory: Inventory){
        viewModelScope.launch {
            inventoryRepository.saveInventory(inventory)
        }

    }
}