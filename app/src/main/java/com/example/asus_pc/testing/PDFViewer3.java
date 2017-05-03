package com.example.asus_pc.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFViewer3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer3);

        PDFView pdfView2 = (PDFView) findViewById(R.id.pdfView3);
        pdfView2.fromAsset("Ujang.pdf").load();
    }
}
