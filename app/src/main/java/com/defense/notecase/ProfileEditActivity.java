package com.defense.notecase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class ProfileEditActivity extends AppCompatActivity {

    private ImageView back;
    private EditText nameEdit,dobEdit,phoneNumEdit,baEdit,emailEdit,unitEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);
        back = findViewById(R.id.back);
        nameEdit = findViewById(R.id.nameEdit);
        dobEdit = findViewById(R.id.dobEdit);
        phoneNumEdit = findViewById(R.id.phoneNumEdit);
        baEdit = findViewById(R.id.baEdit);
        emailEdit = findViewById(R.id.emailEdit);
        unitEdit = findViewById(R.id.unitEdit);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileEditActivity.this,UserProfileActivity.class));
                finish();
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