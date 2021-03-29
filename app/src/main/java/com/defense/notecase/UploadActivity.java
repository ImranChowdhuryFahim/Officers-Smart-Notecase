package com.defense.notecase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UploadActivity extends AppCompatActivity {
    private ImageView avatar,directory,helpline,notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        avatar = findViewById(R.id.avataru);
        directory = findViewById(R.id.directory);
        helpline = findViewById(R.id.helpline);
        notification = findViewById(R.id.notification);
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UploadActivity.this,UserProfileActivity.class));
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });
        directory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UploadActivity.this,DirectoryActivity.class));
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UploadActivity.this,HelpLineActivity.class));
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UploadActivity.this,NotificationActivity.class));
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