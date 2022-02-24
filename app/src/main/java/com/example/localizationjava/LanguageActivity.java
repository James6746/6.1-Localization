package com.example.localizationjava;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class LanguageActivity extends AppCompatActivity {

    Button btn_english;
    Button btn_uzbek;
    Button btn_chinese;
    Button btn_korean;
    Button btn_japan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        initViews();
    }

    private void initViews() {

        btn_english = findViewById(R.id.btn_English);
        btn_uzbek = findViewById(R.id.btn_uzbek);
        btn_chinese = findViewById(R.id.btn_chinese);
        btn_korean = findViewById(R.id.btn_korean);
        btn_japan = findViewById(R.id.btn_japan);

        btn_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocale("en");
            }
        });

        btn_uzbek.setOnClickListener(it -> {
            setLocale("uz");
        });

        btn_chinese.setOnClickListener(it -> {
            setLocale("zh");
        });

        btn_korean.setOnClickListener(it -> {
            setLocale("ko");
        });

        btn_japan.setOnClickListener(it -> {
            setLocale("ja");
        });


    }

    private void setLocale(String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.setLocale(locale);
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        finish();
    }
}