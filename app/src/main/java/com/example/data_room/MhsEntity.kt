package com.example.data_room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mhs_entity")
data class MhsEntity(
    @PrimaryKey(autoGenerate = true) var nim:Int,
    @ColumnInfo(name = "nama") var nama:String,
    @ColumnInfo(name = "alamat") var alamat:String
)