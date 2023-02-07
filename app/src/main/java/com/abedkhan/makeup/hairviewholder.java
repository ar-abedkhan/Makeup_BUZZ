package com.abedkhan.makeup;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class hairviewholder extends RecyclerView.ViewHolder {
    TextView title,shortdis;
    ImageView imageView;
 CardView cardView;


    public hairviewholder(@NonNull View itemView) {
        super(itemView);

        title=itemView.findViewById(R.id.bannertitle);
        shortdis=itemView.findViewById(R.id.shortdis);
        cardView=itemView.findViewById(R.id.face);
        imageView=itemView.findViewById(R.id.bannerimage);
    }
}
