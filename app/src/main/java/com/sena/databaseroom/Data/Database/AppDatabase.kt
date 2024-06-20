package com.sena.databaseroom.Data.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sena.databaseroom.Data.Dao.UserDao
import com.sena.databaseroom.Data.Entitys.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun userDao():UserDao
}