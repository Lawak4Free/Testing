package com.example.asus_pc.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFViewer4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer4);

        PDFView pdfView3 = (PDFView) findViewById(R.id.pdfView4);
        pdfView3.fromAsset("Under18pdf").load();
    }
}
