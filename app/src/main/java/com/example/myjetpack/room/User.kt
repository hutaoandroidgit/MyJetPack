package com.example.myjetpack.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    @ColumnInfo(name = "user_name")
    var userName:String,
    @ColumnInfo(defaultValue = "china")
    var address:String,
){
    @Ignore
    var sex: Boolean = false
}


