package com.sena.databaseroom.Data.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete
import androidx.room.OnConflictStrategy
import com.sena.databaseroom.Data.Entitys.UserEntity

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertUser(user:UserEntity):Long

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertUserList(people:List<UserEntity>):List<Long>

    @Update
    suspend fun updateUser(user: UserEntity):Int

    @Delete
    suspend fun deleteUser(user:UserEntity):Int

    @Query("SELECT * FROM UserEntity")
    suspend fun getAll():List<UserEntity>

    @Query("SELECT * FROM UserEntity WHERE uid IN (:userIds)")
    suspend fun getAllById(userIds:IntArray):List<UserEntity>
}