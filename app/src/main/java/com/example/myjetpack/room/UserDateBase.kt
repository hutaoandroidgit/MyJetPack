package com.example.myjetpack.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [User::class],version = 1)
abstract class UserDateBase : RoomDatabase(){
    abstract fun userDao():UserDao
    //声明静态常量 静态方法 单例
    companion object{
        private var instance : UserDateBase? = null;
        fun getInstance(context : Context) : UserDateBase{
            if (instance == null){
                instance = Room
                        .databaseBuilder(context.applicationContext,UserDateBase::class.java,"user.db")
                    .addMigrations(object :Migration(1,2){
                        override fun migrate(database: SupportSQLiteDatabase) {
                            TODO("Not yet implemented")
                            //数据库升级降级 编写sql语句
                            database.execSQL("ALTER TABLE user ADD age INTEGER Default 0 not null ")
                        }
                    })
                    .allowMainThreadQueries().build()
            }
            return instance as UserDateBase
        }
    }
}