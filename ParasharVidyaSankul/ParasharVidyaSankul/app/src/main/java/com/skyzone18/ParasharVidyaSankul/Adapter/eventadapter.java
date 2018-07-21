package com.skyzone18.ParasharVidyaSankul.Adapter;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skyzone18.ParasharVidyaSankul.R;
import com.skyzone18.ParasharVidyaSankul.Rest.Datum;


import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created by Rahul Patel on 2/16/2018.
 */

public class eventadapter extends RecyclerView.Adapter<eventadapter.ViewHolder> {

    List<Datum> eventlist;
    Context contet;
    Boolean flag = false;
    String monthname;
    String day;

    public eventadapter(Context context, List<Datum> items) {
        this.eventlist = items;
       this.contet = context;
    }
    @Override
    public eventadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_event_data, null);


        return new eventadapter.ViewHolder(itemview);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(final eventadapter.ViewHolder holder, final int position) {

        holder.evet_name.setText(eventlist.get(position).getTitle());


        // date set
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date newDate = null;
        try {
            newDate = format.parse(eventlist.get(position).getEventdate());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        format = new SimpleDateFormat("dd/MM/yyyy");
        String maindate = format.format(newDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String newDateStr = null;
        try {
            newDateStr = simpleDateFormat.format(simpleDateFormat.parse(maindate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        String str[] = newDateStr.split("/");
//        day = str[0];
//        Integer month = Integer.valueOf(str[1]);
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.MONTH, month);
//        SimpleDateFormat sortDateFormat = new SimpleDateFormat("MMM");
//        sortDateFormat.setCalendar(calendar);
//        monthname = sortDateFormat.format(calendar.getTime());
        holder.evet_date.setText("DATE : " + newDateStr);
//        holder.tvmonth.setText(monthname);


        holder.evet_dis.setText(eventlist.get(position).getPlace());

    //    holder.evet_dis.setBackgroundColor(Color.TRANSPARENT);
    }

    @Override
    public int getItemCount() {
        return eventlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView evet_name, evet_dis;
        TextView tvmonth, evet_date;
        CardView event_liner;

        public ViewHolder(View itemView) {
            super(itemView);

            evet_name = (TextView) itemView.findViewById(R.id.evet_name);
            evet_dis = (TextView) itemView.findViewById(R.id.evet_dis);
            event_liner = (CardView) itemView.findViewById(R.id.evet_liner);
            evet_date = (TextView) itemView.findViewById(R.id.evet_date);
//            tvmonth = (TextView) itemView.findViewById(R.id.tv_month);


        }
    }
}
