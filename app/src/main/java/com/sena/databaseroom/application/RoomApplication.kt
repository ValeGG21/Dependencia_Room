package com.sena.databaseroom.application

import android.app.Application
import androidx.room.Room
import com.sena.databaseroom.Data.Database.AppDatabase

class RoomApplication : Application() {
    companion object {
        lateinit var db: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "database-user"
        ).build()
    }
}
