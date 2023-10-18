package com.example.practicaclase8.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Inventory(
    @PrimaryKey (autoGenerate = true)
    val id:Int = 0,
    val name:String,
    val price:Int,
    val quantity:Int
)
