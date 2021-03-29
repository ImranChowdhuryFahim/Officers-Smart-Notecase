package com.defense.notecase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HelpLineActivity extends AppCompatActivity {
    private ImageView avatar,directory,scan,notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_line);
        avatar = findViewById(R.id.avataru);
        directory = findViewById(R.id.directory);
        scan = findViewById(R.id.scan_active);
        notification = findViewById(R.id.notification);
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelpLineActivity.this,UserProfileActivity.class));
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });
        directory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelpLineActivity.this,DirectoryActivity.class));
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelpLineActivity.this,UploadActivity.class));
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HelpLineActivity.this,NotificationActivity.class));
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}