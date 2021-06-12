package com.arvatel.physicsexperiment.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface SlidingDao {
    @Insert
    fun insertAll(vararg sliding: SlidingEntity)

    @Delete
    fun delete(sliding: SlidingEntity)

    @Query("SELECT * FROM sliding")
    fun getAll(): List<SlidingEntity>
}