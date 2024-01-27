package com.example.varosok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class add extends AppCompatActivity {
    private Button addButtonAddPage;
    private Button backButtonBackPage;
    private EditText nameTextAddPage;
    private EditText countryTextAddPage;
    private EditText populationTextAddPage;
    private EditText editTextIdAddPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add2);
    }
}