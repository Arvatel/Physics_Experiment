package com.arvatel.physicsexperiment.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database (entities = [SlidingDao::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun slidingDao(): SlidingDao
}