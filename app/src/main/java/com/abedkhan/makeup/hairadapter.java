package com.abedkhan.makeup;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class hairadapter extends RecyclerView.Adapter<hairviewholder> {
    List<hair>hairlist;

    Context context;

    public hairadapter(List<hair> hairlist,Context context) {
        this.hairlist = hairlist;
        this.context = context;
    }


    @NonNull
    @Override
    public hairviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.facerecyclerview,parent,false);

        hairviewholder hairviewholder=new hairviewholder(view);

        return hairviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull hairviewholder holder, int position) {

//hair............
        String title =hairlist.get(position).getTitle();
        String sdis =hairlist.get(position).getShortdis();
        holder.title.setText(title);
        holder.shortdis.setText(sdis);
  //show image by link..............
        String image=hairlist.get(position).getImage();
        Glide.with(context).load(image).into(holder.imageView);



        holder.cardView.setOnClickListener(view -> {
            Intent intent = new Intent(context,displayfacedata.class);
            intent.putExtra("title",hairlist.get(position).getTitle());
            intent.putExtra("discription",hairlist.get(position).getDiscription());
            intent.putExtra("image",hairlist.get(position).getImage());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return hairlist.size();
    }
}
