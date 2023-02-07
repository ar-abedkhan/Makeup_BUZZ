package com.abedkhan.makeup;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class skinadapter extends RecyclerView.Adapter<skinviewholder> {
    List<skin> skinlist;
    Context context;


    public skinadapter(List<skin> skinlist, Context context) {
        this.skinlist = skinlist;
        this.context = context;
    }

    @NonNull
    @Override
    public skinviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.facerecyclerview, parent, false);
        skinviewholder skinviewholder = new skinviewholder(view);

        return skinviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull skinviewholder holder, int position) {

        String title = skinlist.get(position).getTitle();
        String sdis = skinlist.get(position).getShortdis();

        holder.title.setText(title);
        holder.shortdis.setText(sdis);


        //show image by link
        String image = skinlist.get(position).getImage();
        Glide.with(context).load(image).into(holder.imageView);
////...........................
//        final skin skin_class = skinlist.get(position);
//
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("click", "click working");
//                Toast.makeText(holder.itemView.getContext(), "file not found", Toast.LENGTH_SHORT).show();
//                if (skin_class.getTitle().equalsIgnoreCase("done")) {
//                    if (!skin_class.getImage().equals("") && skin_class.getImage() != null) {
//                        if (!skin_class.getShortdis().equals("") && skin_class.getShortdis() != null) {
//                   /* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(model.getFilePath()));
//                    intent.setDataAndType(Uri.parse(model.getFilePath()), "video*//*");*/
//                            Intent intent = new Intent(holder.itemView.getContext(), skindisplay.class);
//                            intent.putExtra("title", skin_class.getImage());
//                            intent.putExtra("discription", skin_class.getImage());
//                            intent.putExtra("image", skin_class.getImage());
//                            holder.itemView.getContext().startActivity(intent);
//                        }
//                    } else {
//                        Toast.makeText(holder.itemView.getContext(), "file not found", Toast.LENGTH_SHORT).show();
//
//                    }
//                }
//            }
//        });
//





        holder.cardView.setOnClickListener(view -> {
            Intent intent = new Intent(context, displayfacedata.class);
            intent.putExtra("title", skinlist.get(position).getTitle());
            intent.putExtra("discription", skinlist.get(position).getDiscription());
            intent.putExtra("image", skinlist.get(position).getImage());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return skinlist.size();
    }
}
