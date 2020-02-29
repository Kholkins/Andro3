package com.example.andro3.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.andro3.R;
import com.example.andro3.adapter.PhoneModelAdapter;
import com.example.andro3.pojo.PhoneModel;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listV = (ListView) findViewById(R.id.listV);

        //List<String> items = initData();
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        PhoneModelAdapter adapter = new PhoneModelAdapter(this, initData());
        listV.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    public void onAbout(MenuItem item){
        Toast.makeText(this,"Об авторе", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(this,"Выбраны настройки", Toast.LENGTH_SHORT).show();
                return true;

/*            case R.id.about:
                Toast.makeText(this,"Выбраны Об авторе", Toast.LENGTH_SHORT).show();
                return true;*/

            case R.id.site:
                Toast.makeText(this,"Выбран сайт", Toast.LENGTH_SHORT).show();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    private List<PhoneModel> initData () {
        List<PhoneModel> list = new ArrayList<PhoneModel>();

        list.add(new PhoneModel(1,"iPhone",1000));
        list.add(new PhoneModel(2,"ZTE",1060));
        list.add(new PhoneModel(3,"Xiaomi",6000));
        list.add(new PhoneModel(4,"LG",56000));
        list.add(new PhoneModel(5,"Motorola",7000));

        return list;
    }
}
