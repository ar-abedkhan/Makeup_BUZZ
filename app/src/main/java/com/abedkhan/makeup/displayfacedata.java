package com.abedkhan.makeup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class displayfacedata extends AppCompatActivity {

    TextView title,discription;
    ImageView image;

    String dimage,dtitle,ddescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayfacedata);

        title=findViewById(R.id.bannertitle);
        discription=findViewById(R.id.discriptionDisplay);
        image=findViewById(R.id.bannerimage);


        Intent intent=getIntent();
dimage=intent.getStringExtra("image");
dtitle=intent.getStringExtra("title");
ddescription=intent.getStringExtra("discription");



      Glide.with(displayfacedata.this).load(dimage).into(image);
      title.setText(dtitle);
      discription.setText(ddescription);






    }
}