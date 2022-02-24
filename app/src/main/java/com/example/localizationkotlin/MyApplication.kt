package com.example.localizationkotlin

import android.app.Application
import managers.LocaleManager

class MyApplication: Application() {

    companion object{
        val Tag = MyApplication::class.java.simpleName
        var instance: MyApplication? = null
        var localeManager: LocaleManager? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        localeManager = LocaleManager(this)
        localeManager!!.setLocale(this)
    }
}