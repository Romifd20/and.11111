package com.example.romi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = findViewById(R.id.fade);
        findViewById(R.id.btn).setOnClickListener(v -> {});
        if (!bt.getText().toString().equals("")){
            Toast.makeText(this,"ЗДРАСТВУЙТЕ МАМАЙ",Toast.LENGTH_SHORT).show();
        }

        EditText et = findViewById(R.id.textView);
        findViewById(R.id.button).setOnClickListener(v -> {
            if (!et.getText().toString().equals("")){
                Toast.makeText(this, "Добро пожаловать", Toast.LENGTH_SHORT).show();






            }
        });
    }
}
