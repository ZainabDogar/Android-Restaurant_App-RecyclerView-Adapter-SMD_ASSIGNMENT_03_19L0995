package com.example.smd_assignment_03_19l0995.model
import androidx.room.*

@Entity
class Restaurants() {
    @PrimaryKey(autoGenerate = true)
    var id = 0

    @ColumnInfo(name = "name")
    var name: String = "default name"

    @ColumnInfo(name = "rating")
    var rating: Float = 0.0F

    @ColumnInfo(name = "phone")
    var phone: String = "0000-0000000"
}
