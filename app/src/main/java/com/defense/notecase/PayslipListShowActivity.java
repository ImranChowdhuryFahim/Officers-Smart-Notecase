package com.defense.notecase;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.LinearLayout;

import com.defense.notecase.Adapter.PayslipAdapter;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class PayslipListShowActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private PayslipAdapter adapter;
    private File[] flists;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payslip);


        File f = new File(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)));
        if (f.exists() && f.isDirectory()) {

            flists = f.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {

                    Log.e("MIS", "sdsdsdsds " + file.getName());

                    return file.getName().toLowerCase().contains("reportviewer") && file.getName().toLowerCase().contains(".pdf");

                }
            });
            String s = "wait a minute, i'm debugging";
            recyclerView=(RecyclerView)findViewById(R.id.fileList);
            recyclerView.setHasFixedSize(true);
            layoutManager=new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            adapter=new PayslipAdapter(flists,this);
            recyclerView.setAdapter(adapter);
        }
    }
}