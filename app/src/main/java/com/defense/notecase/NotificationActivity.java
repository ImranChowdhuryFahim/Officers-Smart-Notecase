package com.defense.notecase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NotificationActivity extends AppCompatActivity {
    private ImageView directory,scan,helpline,avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        directory = findViewById(R.id.directory);
        avatar = findViewById(R.id.avataru);
        scan = findViewById(R.id.scan_active);
        helpline = findViewById(R.id.helplineu);

        directory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NotificationActivity.this,DirectoryActivity.class));
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });

        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NotificationActivity.this,UserProfileActivity.class));
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NotificationActivity.this,UploadActivity.class));
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });

        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NotificationActivity.this,HelpLineActivity.class));
                overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}