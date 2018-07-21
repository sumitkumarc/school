package com.skyzone18.ParasharVidyaSankul.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.TimeTableActivity;
import com.skyzone18.ParasharVidyaSankul.Model.TouchImageView;
import com.skyzone18.ParasharVidyaSankul.R;
import com.skyzone18.ParasharVidyaSankul.Rest.Datum;

import java.util.List;

/**
 * Created by kevalt on 5/8/2018.
 */

public class TimeTableViewadapter extends RecyclerView.Adapter<TimeTableViewadapter.ViewHolder>{

    List<Datum> arralist;
    TimeTableActivity dactivity;
    public Dialog dialog;

    public TimeTableViewadapter(TimeTableActivity timeTableActivity, List<Datum> items) {

        dactivity = timeTableActivity;
        arralist = items;
    }

    @Override
    public TimeTableViewadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.singal_todayevant, null);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(TimeTableViewadapter.ViewHolder holder, final int position) {
        Glide.with(dactivity).load(arralist.get(position).getImagepath())
                .into(holder.imgcard);

        Log.d("DATA" , "MAIN" +arralist.get(position).getImagepath() );
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new Dialog(dactivity);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.show_fullscreen_image);
                TouchImageView imageView = (TouchImageView) dialog.findViewById(R.id.IMAGEID);

                Glide.with(dactivity)
                        .load(arralist.get(position).getImagepath())
                        .into(imageView);

                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arralist.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgcard, place, time;
        CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            imgcard = (ImageView) itemView.findViewById(R.id.imgcard);
            cardView = (CardView) itemView.findViewById(R.id.cardview);

        }
    }
}
