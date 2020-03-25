package com.example.mylacalization1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String [] st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        st = getResources().getStringArray(R.array.array_technology);
        ArrayAdapter aa = new ArrayAdapter<String>(this,R.layout.mylist,st);

        lv = (ListView) findViewById(R.id.listView);

        lv.setAdapter(aa);

    }
}
