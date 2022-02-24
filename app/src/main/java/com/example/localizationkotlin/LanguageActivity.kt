package com.example.localizationkotlin

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class LanguageActivity : AppCompatActivity() {
    lateinit var btn_english: Button
    lateinit var btn_uzbek: Button
    lateinit var btn_chinese: Button
    lateinit var btn_korean: Button
    lateinit var btn_japan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        initViews()
    }

    private fun initViews() {
        btn_english = findViewById(R.id.btn_English)
        btn_uzbek = findViewById(R.id.btn_uzbek)
        btn_chinese = findViewById(R.id.btn_chinese)
        btn_korean = findViewById(R.id.btn_korean)
        btn_japan = findViewById(R.id.btn_japan)

        btn_english.setOnClickListener { setLocale("en") }
        btn_uzbek.setOnClickListener { setLocale("uz") }
        btn_chinese.setOnClickListener {setLocale("zh") }
        btn_korean.setOnClickListener{ setLocale("ko") }
        btn_japan.setOnClickListener{ setLocale("ja") }
    }

    private fun setLocale(language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
        finish()
    }
}