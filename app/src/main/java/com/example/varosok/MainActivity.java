package com.example.varosok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button listButtonMainPage;
    private Button addButtonMainPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listButtonMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, add.class);
            startActivity(intent);
            finish();
            }
        });

        addButtonMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, List.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void init(){
        listButtonMainPage = findViewById(R.id.listButtonMainPage);
        addButtonMainPage = findViewById(R.id.addButtonMainPage);
    }
}