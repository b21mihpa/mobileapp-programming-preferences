package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedPref = getSharedPreferences("store", MODE_PRIVATE);
        editor = sharedPref.edit();

        final Button button = findViewById(R.id.store_button);
        button.setOnClickListener(view -> {
            final EditText editText = findViewById(R.id.editText);
            editor.putString("message", editText.getText().toString());
            editor.apply();
            finish(); // return to activity that launched the intent
        });
    }
}
