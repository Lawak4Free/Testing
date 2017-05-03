package com.example.asus_pc.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFViewer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer2);

        PDFView pdfView1 = (PDFView) findViewById(R.id.pdfView2);
        pdfView1.fromAsset("LawakKampus1.pdf").load();
    }
}
