package com.arvatel.physicsexperiment.database

import androidx.room.*


// Coroutines for DB
// Each one is a function for accessing the DB
@Dao
interface SlidingDao {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(sliding: SlidingEntity)

    @Delete
    suspend fun delete(sliding: SlidingEntity)

    @Query("SELECT * FROM sliding WHERE horizontal_tilt = :hTilt")
    suspend fun getByHorizontalTilt(hTilt : Int): List<SlidingEntity>

    @Query("SELECT * FROM sliding WHERE id = :id")
    suspend fun getById(id : Int): List<SlidingEntity>
}