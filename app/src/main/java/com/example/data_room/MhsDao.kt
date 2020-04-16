package com.example.data_room

import androidx.room.*

@Dao
interface MhsDao{
    @Query("Select * from mhs_entity")
    fun getAll(): List<MhsEntity>

    @Query("SELECT * FROM MHS_ENTITY WHERE nama like :nama")
    fun findByName(nama: String): MhsEntity

    @Insert
    fun insertAll(vararg mhsData: MhsEntity)

    @Delete
    fun deleteData(mhs: MhsEntity)

    @Update
    fun updateData(vararg  mhsData: MhsEntity)
}