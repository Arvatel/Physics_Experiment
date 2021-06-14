package com.arvatel.physicsexperiment.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.arvatel.physicsexperiment.database.daos.SlidingDao
import com.arvatel.physicsexperiment.database.entities.SlidingEntity


// Example how to work with database
//val dao : SlidingDao = AppDatabase.getInstance(this).slidingDao
//
//val entity = SlidingEntity(0, 0, 0, 0, "brom")
//
//lifecycleScope.launch {
//    dao.insertAll(entity)
//}

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