package com.example.android.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //creating variables
    ListView myListView ;
    ArrayList<String> myArray;
    ArrayAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView)findViewById(R.id.myListView);
        myArray = new ArrayList<String>();
        myArray.add("One");
        myArray.add("Two");
        myArray.add("Three");
        myArray.add("Four");
        myArray.add("Five");
        myArray.add("Six");
        myArray.add("Seven");
        myArray.add("One");
        myArray.add("Two");
        myArray.add("Three");
        myArray.add("Four");
        myArray.add("Five");
        myArray.add("Six");
        myArray.add("Seven");
        myArray.add("One");
        myArray.add("Two");
        myArray.add("Three");
        myArray.add("Four");
        myArray.add("Five");
        myArray.add("Six");
        myArray.add("Seven");
        myArray.add("One");
        myArray.add("Two");
        myArray.add("Three");
        myArray.add("Four");
        myArray.add("Five");
        myArray.add("Six");
        myArray.add("Seven");
        //ArrayAdapter(Context context, int textViewResourceId, List<T> objects)
        myAdapter = new ArrayAdapter(MainActivity.this ,android.R.layout.simple_list_item_1, myArray);

        myListView.setAdapter(myAdapter);

    }
}
