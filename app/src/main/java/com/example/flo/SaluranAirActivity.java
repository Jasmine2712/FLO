package com.example.flo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SaluranAirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saluran_air);
    }

    public void home(View view) {
        Intent intent = new Intent(this, Success.class);
        startActivity(intent);
        finish();
    }
}