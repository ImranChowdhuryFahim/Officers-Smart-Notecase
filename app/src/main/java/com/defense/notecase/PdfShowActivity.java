package com.defense.notecase;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class PdfShowActivity extends AppCompatActivity {
    private String path;
    private Uri uri;
    private PDFView pdfView;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_show);
        pdfView = findViewById(R.id.pdfView);

        path = getIntent().getStringExtra("path");
        File file = new File(path);

        pdfView.fromFile(file).load();
    }
}