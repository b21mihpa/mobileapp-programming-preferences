package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sharedPref = getPreferences(MODE_PRIVATE);
        editor = sharedPref.edit();

        editor.putString("hello_world", "Hello, world!");
        editor.apply();

        Log.d("look_for_me", sharedPref.getString("hello_world", "Could not retrieve content."));
    }
}
