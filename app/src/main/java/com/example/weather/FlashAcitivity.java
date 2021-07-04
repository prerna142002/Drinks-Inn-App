package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class FlashAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_acitivity);
        Toast toast = Toast.makeText(getApplicationContext(),"CLICK ANYWHERE ON SCREEN TO START ORDERING", Toast.LENGTH_LONG);
        toast.show();
    }
    public void open(View view)
    {
        Intent intent = new Intent(FlashAcitivity.this, MainActivity.class);
        startActivity(intent);
    }
}