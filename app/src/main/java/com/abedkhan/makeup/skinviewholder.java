package com.abedkhan.makeup;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class skinviewholder extends RecyclerView.ViewHolder {
    TextView title,shortdis;
    ImageView imageView;
//        LinearLayout layout;
CardView cardView;

    public skinviewholder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.bannertitle);
        shortdis=itemView.findViewById(R.id.shortdis);
        cardView=itemView.findViewById(R.id.face);
//        layout=itemView.findViewById(R.id.display);
        imageView=itemView.findViewById(R.id.bannerimage);
    }
}
