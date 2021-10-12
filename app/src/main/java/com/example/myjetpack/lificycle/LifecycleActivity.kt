package com.example.myjetpack.lificycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myjetpack.R


/**
 * 版权：hutao 版权所有
 * @author hutao
 * 版本：1.0
 * 创建日期：2021/10/9 21:04
 * 描述：LifecycleActivity.
 * 26.1.0 及其之后的版本，Activity和Fragment已经默认实现了LifecycleOwner接口
 */
class LifecycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lificycle)
        lifecycle.addObserver(MyObserver())
    }
}