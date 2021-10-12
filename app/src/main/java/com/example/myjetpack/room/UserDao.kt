package com.example.myjetpack.room

import androidx.room.*
import androidx.room.Dao

@Dao
interface UserDao {

    @Query("select * from users where id = :id")
    fun getUserByID(id : Long):User

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUset(user: User)

    @Delete
    fun deleteUserByUser(user: User)

    @Update
    fun updateUserByUser(user: User)

    @Query("SELECT * FROM users")
    fun getAllUser():List<User>

    @Query("SELECT * FROM users WHERE id IN (:userIds)")
    fun loadUserByIDs(userIds : LongArray):List<User>

    @Query("SELECT * FROM users WHERE user_name LIKE:name")
    fun findByName(name:String) : User

    @Delete
    fun deleteUser(users : List<User>)
}