package com.example.uasmobile.activities;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;


import com.example.uasmobile.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void handlerkembali(View view) {
        finish();
    }
}
