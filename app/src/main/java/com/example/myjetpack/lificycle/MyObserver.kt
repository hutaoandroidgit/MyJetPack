package com.example.myjetpack.lificycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.hutao.helplibrary.log.OsduiLog

class MyObserver : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connectListrner(){
        OsduiLog.mtuiHintLog("Tag","===ON_RESUME===");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun disConnectListrner(){
        OsduiLog.mtuiHintLog("Tag","===ON_PAUSE===");
    }
}