package com.example.asus_pc.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        populateListView();

        }

        private void populateListView() {

            //create a list of items
            String [] myChapters = {"Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5", "Chapter 6", "Chapter 7"};

            // build adapter
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    this,
                    R.layout.lawakkampuslayout, //layout to use
                    myChapters);    // items to be display


            //configure the list
            ListView list = (ListView) findViewById(R.id.listViewSecondPage);
            list.setAdapter(adapter);
        }

    }
