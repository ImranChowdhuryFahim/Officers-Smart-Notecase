package com.defense.notecase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AuthenticationActivity extends AppCompatActivity {
    private String destination;
    private EditText rfId;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        submit = findViewById(R.id.submit);
        rfId = findViewById(R.id.rfId);
        destination = getIntent().getStringExtra("destination");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(destination.equals("editProfile"))
                {
                    startActivity(new Intent(AuthenticationActivity.this,ProfileEditActivity.class));
                    finish();
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                }
            }
        });


    }
}