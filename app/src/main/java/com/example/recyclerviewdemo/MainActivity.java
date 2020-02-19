package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<String> dataSource = new ArrayList<>();
        dataSource.add("1你好啊");
        dataSource.add("2你好啊");
        dataSource.add("3你好啊");
        dataSource.add("4你好啊");
        dataSource.add("5你好啊");
        dataSource.add("6你好啊");
        dataSource.add("7你好啊");
        dataSource.add("8你好啊");

        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter(this);
        myRecyclerViewAdapter.setDataSource(dataSource);
        recyclerView.setAdapter(myRecyclerViewAdapter);

    }
}
