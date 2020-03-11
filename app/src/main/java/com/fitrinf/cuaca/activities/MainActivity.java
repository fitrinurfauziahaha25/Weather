package com.fitrinf.cuaca.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fitrinf.cuaca.R;
import com.fitrinf.cuaca.fragment.WeatherFragment;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainactivity, new WeatherFragment()).commit();
    }
}
