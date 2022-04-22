package com.example.smd_assignment_03_19l0995

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.smd_assignment_03_19l0995.model.Restaurants

@Dao
interface RestaurantDAO {
    @get:Query("SELECT * FROM restaurants")
    val getAll: List<Restaurants>

    @Query("SELECT * FROM restaurants WHERE name LIKE :name")
    fun getByName(name: String?): List<Restaurants?>?

    @Insert
    fun insert(restaurant: Restaurants?)

    @Query("SELECT * FROM restaurants WHERE rating >= :rating AND " +
            "name LIKE '%' || :name || '%'")
    fun getByFilter(
        name: String?,
        number: String?,
        rating: Float,
    ): List<Restaurants?>?
}

@Database(entities = [Restaurants::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): RestaurantDAO



}
