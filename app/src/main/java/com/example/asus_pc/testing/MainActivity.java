package com.example.asus_pc.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SecondPage(View view) {

        Intent intent = new Intent(this, SecondPage.class );
        //SecondPage sama dengan nama activity baru(activity_second_page.xml
        startActivity(intent);

    }

    public void ThirdPage(View view) {

        Intent intent = new Intent(this, ThirdPage.class );
        //SecondPage sama dengan nama activity baru(activity_second_page.xml
        startActivity(intent);

    }

    public void ForthPage(View view) {

        Intent intent = new Intent(this, ForthPage.class );
        //SecondPage sama dengan nama activity baru(activity_second_page.xml
        startActivity(intent);

    }

    public void PDFViewer(View view) {

        Intent intent = new Intent(this, PDFViewer.class );
        //SecondPage sama dengan nama activity baru(activity_second_page.xml
        startActivity(intent);

    }

}
