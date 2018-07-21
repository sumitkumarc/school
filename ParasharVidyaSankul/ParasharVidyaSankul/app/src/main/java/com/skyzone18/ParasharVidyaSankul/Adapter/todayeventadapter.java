package com.skyzone18.ParasharVidyaSankul.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.skyzone18.ParasharVidyaSankul.JsonActivity.TodayActivity;
import com.skyzone18.ParasharVidyaSankul.R;
import com.skyzone18.ParasharVidyaSankul.Rest.Datum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevalt on 2/24/2018.
 */

public class todayeventadapter extends RecyclerView.Adapter<todayeventadapter.ViewHolder> {

    List<Datum> arralist;
    Context contet;
    public Dialog dialog;

    public todayeventadapter(TodayActivity todayActivity, ArrayList<Datum> items) {
        this.arralist = items;
        this.contet = todayActivity;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.singal_todayevant, null);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        holder.tital.setText(arralist.get(position).getTitle());
//        holder.place.setText(arralist.get(position).getPlace());
//        holder.time.setText(arralist.get(position).getEventdate() + arralist.get(position).getEventtime() );
    }

    @Override
    public int getItemCount() {
        return arralist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tital, place, time;

        public ViewHolder(View itemView) {
            super(itemView);
//            tital = (TextView) itemView.findViewById(R.id.tvTital);
//            place = (TextView) itemView.findViewById(R.id.tvPalce);
//            time = (TextView) itemView.findViewById(R.id.tvTime);

        }
    }
}
