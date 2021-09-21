package com.jejec.stayactive.db

import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * DAO object is Data Access Object
 * an interface that describe all possible actions to perform the DataBase
 * */

@Dao
interface RunDAO {

    /* If you insert Run object that already exist it will replace the old one with the new one */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    /* Delete Run object from database */
    @Delete
    suspend fun deleteRun(run: Run)

    /* Return LiveData object which you can observe */
    // SQL Query to select all from running_table and sorted by descending based on timestamp
    @Query("SELECT * FROM running_table ORDER BY timestamp DESC")
    fun getAllRunsSortedByDate() : LiveData<List<Run>>

    // SQL Query to select all from running_table and sorted by descending based on timeInMillis
    @Query("SELECT * FROM running_table ORDER BY timeInMillis DESC")
    fun getAllRunsSortedByTimeInMillis() : LiveData<List<Run>>

    // SQL Query to select all from running_table and sorted by descending based on avgSpeedInKMH
    @Query("SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
    fun getAllRunsSortedByAvgSpeedInKMH() : LiveData<List<Run>>

    // SQL Query to select all from running_table and sorted by descending based on distanceInMeters
    @Query("SELECT * FROM running_table ORDER BY distanceInMeters DESC")
    fun getAllRunsSortedByDistanceInMeters() : LiveData<List<Run>>

    // SQL Query to select all from running_table and sorted by descending based on caloriesBurned
    @Query("SELECT * FROM running_table ORDER BY caloriesBurned DESC")
    fun getAllRunsSortedByCaloriesBurned() : LiveData<List<Run>>
}