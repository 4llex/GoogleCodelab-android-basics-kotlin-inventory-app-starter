package com.example.inventory.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuario")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "name") val userName: String,
    @ColumnInfo(name = "idade") val userIdade: Int,
    @ColumnInfo(name = "nacionalidade") val userNacionalidade: String
)
