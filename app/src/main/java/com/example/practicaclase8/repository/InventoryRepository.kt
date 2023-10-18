package com.example.practicaclase8.repository

import android.content.Context
import com.example.practicaclase8.data.InventoryDB
import com.example.practicaclase8.data.InventoryDao
import com.example.practicaclase8.model.Inventory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class InventoryRepository (val context: Context){
    private var inventoryDao: InventoryDao = InventoryDB.getDatabase(context).inventoryDao()

     suspend fun saveInventory(inventory: Inventory){
        withContext(Dispatchers.IO){
            inventoryDao.saveInventory(inventory)
        }
    }

}