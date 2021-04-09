package com.defense.notecase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import es.dmoral.toasty.Toasty;

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
                if(!validateRfId())
                {
                    return;
                }
                if(destination.equals("editProfile"))
                {
                    startActivity(new Intent(AuthenticationActivity.this,ProfileEditActivity.class));
                    finish();
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                }
                else if(destination.equals("pdf"))
                {
                    Intent intent = new Intent(AuthenticationActivity.this,FileUploadActivity.class);
                    intent.putExtra("type","pdf");
                    startActivity(intent);
                    finish();
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                }
                else if(destination.equals("image"))
                {
                    Intent intent = new Intent(AuthenticationActivity.this,FileUploadActivity.class);
                    intent.putExtra("type","image");
                    startActivity(intent);
                    finish();
                    overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
                }
            }
        });


    }

    private boolean validateRfId() {
        String val = rfId.getText().toString().trim();
        if(val.isEmpty())
        {
            rfId.setError("Field can't be empty");
            return false;
        }
        else if(val.equals("123"))
        {
            return true;
        }
        else {
            Toasty.warning(AuthenticationActivity.this,"RfId do not match.",Toasty.LENGTH_SHORT).show();
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right);
    }
}