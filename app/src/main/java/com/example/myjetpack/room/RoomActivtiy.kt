package com.example.myjetpack.room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hutao.helplibrary.log.OsduiLog

class RoomActivtiy : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userDao = UserDateBase.getInstance(this).userDao();
        userDao.deleteUser(userDao.getAllUser())
        //插入数据
        for (i in (0 until 10)){
            val user = User(userName = "胡涛$i",address = "武汉$i")
            userDao.addUset(user)
        }
        //query所有数据
        userDao.getAllUser().forEach {
            OsduiLog.mtuiHintLog("Tag","==query==${it.id},${it.userName},${it.address},${it.sex}")
        }
    }
}