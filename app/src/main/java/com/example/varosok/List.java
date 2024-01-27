package com.example.varosok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    private Button backButtonListPage;
    private ListView cityListview;
    private EditText editTextID;
    private List<Cities> cities = new ArrayList<>();
    private String url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        init() ;
    }
    public void init(){
        backButtonListPage = findViewById(R.id.backButtonListPage);
        cityListview = findViewById(R.id.listViewListPage);
        editTextID = findViewById(R.id.editTextId);



    }

}