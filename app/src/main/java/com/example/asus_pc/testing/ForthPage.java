package com.example.asus_pc.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForthPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_page);
    }

    public void PDFViewer(View view) {

        Intent intent = new Intent(this, PDFViewer.class );
        //SecondPage sama dengan nama activity baru(activity_second_page.xml
        startActivity(intent);

    }
}
