package com.abedkhan.makeup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {
    CardView face,hair,hand,nails,lips,legs,skin,eyes;
    MeowBottomNavigation meowBottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

face=findViewById(R.id.face);
hair=findViewById(R.id.hair);
nails=findViewById(R.id.nails);
hand=findViewById(R.id.hand);
legs=findViewById(R.id.legs);
skin=findViewById(R.id.skin);
lips=findViewById(R.id.lips);
eyes=findViewById(R.id.eyes);
meowBottomNavigation=findViewById(R.id.bottommenu);


face.setOnClickListener(view -> {
    Intent intent=new Intent(MainActivity.this,facecare.class);
    startActivity(intent);
});

hair.setOnClickListener(view -> {
    Intent intent=new Intent(MainActivity.this,haircare.class);
    startActivity(intent);
});

skin.setOnClickListener(view -> {
    Intent intent=new Intent(MainActivity.this,skincare.class);
    startActivity(intent);
});

lips.setOnClickListener(view -> {
    Intent intent=new Intent(MainActivity.this,facecare.class);
    startActivity(intent);
});

eyes.setOnClickListener(view -> {
    Intent intent=new Intent(MainActivity.this,eyecare.class);
    startActivity(intent);
});

nails.setOnClickListener(view -> {
    Intent intent=new Intent(MainActivity.this,skincare.class);
    startActivity(intent);
});

hand.setOnClickListener(view -> {
    Intent intent=new Intent(MainActivity.this,haircare.class);
    startActivity(intent);
});

legs.setOnClickListener(view -> {
    Intent intent=new Intent(MainActivity.this,facecare.class);
    startActivity(intent);
});

//meowBottomNavigation.setCount(1,"10");
//
////
meowBottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_baseline_home_24));
meowBottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_baseline_favorite_24));
meowBottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_baseline_settings_24));
        meowBottomNavigation.show(1,true);


        meowBottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {


                switch (model.getId()){
                    case 1:

                        break;

                    case 2:


                        break;

                    case 3:

                        break;
                }

                return null;
            }
        });

        meowBottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){

                    case 1:

                        break;
                }

                return null;
            }
        });

        meowBottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){

                    case 2:

                        break;
                }

                return null;
            }
        });

        meowBottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch (model.getId()){

                    case 3:

                        break;
                }

                return null;
            }
        });


    }
}