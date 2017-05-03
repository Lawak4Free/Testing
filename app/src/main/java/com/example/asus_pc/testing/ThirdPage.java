package com.example.asus_pc.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
    }


    public void PDFViewer3(View view) {

        Intent intent = new Intent(this, PDFViewer3.class );
        //SecondPage sama dengan nama activity baru(activity_second_page.xml
        startActivity(intent);

    }
}
