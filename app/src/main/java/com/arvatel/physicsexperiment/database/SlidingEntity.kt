package com.arvatel.physicsexperiment.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sliding")
data class SlidingEntity(
    @PrimaryKey (autoGenerate = true) val id: Long,
    @ColumnInfo(name = "horizontal_tilt") val horizontalTilt: Int,
    @ColumnInfo(name = "vertical_tilt") val verticalTilt: Int,
    @ColumnInfo(name = "calculated_tilt") val calculatedTilt: Int,
    @ColumnInfo(name = "material") val material: String?,
)
