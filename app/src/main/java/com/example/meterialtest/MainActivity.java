package com.example.meterialtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (R.id.backup == itemId) {
            Toast.makeText(this, "you clicked backup", Toast.LENGTH_SHORT).show();
        } else if (R.id.delete == itemId) {
            Toast.makeText(this, "you clicked delete", Toast.LENGTH_SHORT).show();
        } else if (R.id.setting == itemId) {
            Toast.makeText(this, "you clicked setting", Toast.LENGTH_SHORT).show();
        } else {

        }
        return true;
    }
}