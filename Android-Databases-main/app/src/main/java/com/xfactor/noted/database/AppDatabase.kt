package com.xfactor.noted.database

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [List::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun listDao(): ListDao
}