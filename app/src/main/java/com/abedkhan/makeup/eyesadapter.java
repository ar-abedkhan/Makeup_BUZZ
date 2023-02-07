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

public class eyesadapter extends RecyclerView.Adapter<eyesviewholder> {
    List<eyes> eyeslist;
    Context context;


    public eyesadapter(List<eyes> eyeslist, Context context) {
        this.eyeslist = eyeslist;
        this.context = context;
    }

    @NonNull
    @Override
    public eyesviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.facerecyclerview,parent,false);
        eyesviewholder eyesviewholder=new eyesviewholder(view);

        return eyesviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull eyesviewholder holder, int position) {

        String title =eyeslist.get(position).getTitle();
        String sdis =eyeslist.get(position).getShortdis();

        holder.title.setText(title);
        holder.shortdis.setText(sdis);


        //show image by link
        String image=eyeslist.get(position).getImage();
        Glide.with(context).load(image).into(holder.imageView);


        holder.cardView.setOnClickListener(view -> {
            Intent intent = new Intent(context,displayfacedata.class);
            intent.putExtra("title",eyeslist.get(position).getTitle());
            intent.putExtra("discription",eyeslist.get(position).getDiscription());
            intent.putExtra("image",eyeslist.get(position).getImage());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return eyeslist.size();
    }
}
