package com.defense.notecase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DirectoryActivity extends AppCompatActivity {
    private ImageView avatar,scan,helpline,notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
        avatar = findViewById(R.id.avatar);
        scan = findViewById(R.id.scan);
        helpline = findViewById(R.id.helpline);
        notification = findViewById(R.id.notification);
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DirectoryActivity.this,UserProfileActivity.class));
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DirectoryActivity.this,UploadActivity.class));
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DirectoryActivity.this,HelpLineActivity.class));
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DirectoryActivity.this,NotificationActivity.class));
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