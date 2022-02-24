package com.example.localizationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn_press: Button
    lateinit var btn_shared_prefs: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        btn_press = findViewById(R.id.btn_press)
        btn_shared_prefs = findViewById(R.id.btn_shared_prefs)

        btn_press.setOnClickListener{
            val intent = Intent(applicationContext, LanguageActivity::class.java)
            startActivity(intent)
        }

        btn_shared_prefs.setOnClickListener{
            val intent = Intent(applicationContext, PreferenceActivity::class.java)
            startActivity(intent)
        }
    }
}