package com.example.localizationkotlin

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import managers.PrefsManager

class PreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)

        initViews()
    }

    private fun initViews() {
        val et_email = findViewById<EditText>(R.id.et_email)
        val btn_save = findViewById<Button>(R.id.btn_shared_pref)

        btn_save.setOnClickListener {
            PrefsManager.getInstance(this)!!.saveData("email", et_email.text.toString())
        }

    }
}