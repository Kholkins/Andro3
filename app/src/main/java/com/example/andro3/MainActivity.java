package com.example.andro3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listV = (ListView) findViewById(R.id.listV);

        List<String> items = initData();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        listV.setAdapter(adapter);
    }

    private List<String> initData () {
        List<String> list = new ArrayList<>();

        list.add("iPhone");
        list.add("ZTE");
        list.add("Xiaomi");
        list.add("LG");
        list.add("Motorola");

        return list;
    }
}
