package com.example.localizationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_press;
    Button btn_shared_prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {

        btn_press = findViewById(R.id.btn_press);
        btn_shared_prefs = findViewById(R.id.btn_shared_prefs);

        btn_press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LanguageActivity.class);
                startActivity(intent);
            }
        });
    }
}