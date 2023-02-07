package com.abedkhan.makeup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class splashscreen extends AppCompatActivity {

    ProgressBar progressBar;
    int count =2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        progressBar=findViewById(R.id.progressbar);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setProgress(count);
                Intent splashintent=new Intent(splashscreen.this,MainActivity.class);
                startActivity(splashintent);
                finish();

            }
        },count);




    }
}