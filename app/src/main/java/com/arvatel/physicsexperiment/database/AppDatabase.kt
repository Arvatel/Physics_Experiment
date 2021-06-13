package com.arvatel.physicsexperiment.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.arvatel.physicsexperiment.database.SlidingEntity


@Database (
    entities = [SlidingEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract val slidingDao: SlidingDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }

    }

}