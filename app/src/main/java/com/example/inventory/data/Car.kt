package com.example.inventory.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "car") // this entity is not been used
data class Car(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "name") val carName: String,
    @ColumnInfo(name = "marca") val marca: String,
    @ColumnInfo(name = "owner") val owner: String
)

