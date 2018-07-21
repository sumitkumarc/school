package com.skyzone18.ParasharVidyaSankul.Adapter;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skyzone18.ParasharVidyaSankul.JsonActivity.HomeDetailActvity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.StanderActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.TimeTableActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.TimeTableStdActivity;
import com.skyzone18.ParasharVidyaSankul.R;
import com.skyzone18.ParasharVidyaSankul.Rest.Datum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevalt on 5/8/2018.
 */

public class TimeTableStandardAdapter extends RecyclerView.Adapter<TimeTableStandardAdapter.ViewHolder> {

    List<Datum> homelist;
    TimeTableStdActivity dactivity;

    public TimeTableStandardAdapter(TimeTableStdActivity timeTableStdActivity, ArrayList<Datum> dataitem) {
        this.homelist = dataitem;
        this.dactivity = timeTableStdActivity;

    }

    @Override
    public TimeTableStandardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_homework_data, null);

        return new TimeTableStandardAdapter.ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(TimeTableStandardAdapter.ViewHolder holder, final int position) {
        final String titlee = homelist.get(position).getName();


        //Log.e(">>>>>>", title);
        holder.name.setText(titlee);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String STDNAME = homelist.get(position).getName();
                String STDID = homelist.get(position).getStdId();

                //Toast.makeText(contet, pos, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(view.getContext(), TimeTableActivity.class);
                i.putExtra("STDNAME", STDNAME);
                i.putExtra("STDID", STDID);
                dactivity.startActivity(i);


            }
        });
    }

    @Override
    public int getItemCount() {
        return homelist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, dis;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.midum_name);
            cardView = (CardView) itemView.findViewById(R.id.card_midum);

        }
    }
}
