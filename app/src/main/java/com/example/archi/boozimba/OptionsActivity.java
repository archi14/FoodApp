package com.example.archi.boozimba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OptionsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    String[] names;
    int [] images;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        names = new String[]{"Foxeb Breakup","Johnny's Hangouts","Bros and Hoes","The Avaitor Club"};
        images = new int[]{R.drawable.images, R.drawable.images2, R.drawable.images3, R.drawable.images4};
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerAdapter = new RecyclerAdapter(getApplicationContext(),names,images);
        recyclerView.setAdapter(recyclerAdapter);

    }
}
