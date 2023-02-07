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


public class faceadapter extends RecyclerView.Adapter<faceviewholder> {
    List<face>facecarelist;
    Context context;


    public faceadapter(List<face> facecarelist, Context context) {
        this.facecarelist = facecarelist;
        this.context = context;
    }

    @NonNull
    @Override
    public faceviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.facerecyclerview,parent,false);
        faceviewholder faceviewholder=new faceviewholder(view);

        return faceviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull faceviewholder holder, int position) {

        String title =facecarelist.get(position).getTitle();
        String sdis =facecarelist.get(position).getShortdis();

        holder.title.setText(title);
        holder.shortdis.setText(sdis);


        //show image by link
        String image=facecarelist.get(position).getImage();
        Glide.with(context).load(image).into(holder.imageView);


        holder.cardView.setOnClickListener(view -> {
            Intent intent = new Intent(context,displayfacedata.class);
            intent.putExtra("title",facecarelist.get(position).getTitle());
            intent.putExtra("discription",facecarelist.get(position).getDiscription());
            intent.putExtra("image",facecarelist.get(position).getImage());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return facecarelist.size();
    }
}
