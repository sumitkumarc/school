package com.skyzone18.ParasharVidyaSankul.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.CalanderActivity;
import com.skyzone18.ParasharVidyaSankul.Model.TouchImageView;
import com.skyzone18.ParasharVidyaSankul.R;
import com.skyzone18.ParasharVidyaSankul.Rest.Datum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevalt on 5/8/2018.
 */

public class Calnderadapter extends RecyclerView.Adapter<Calnderadapter.ViewHolder> {
    List<Datum> detailst;
    Context dactivty;
    String imurl;
    public String Hmdate;
    public Dialog dialog;

    public Calnderadapter(CalanderActivity calanderActivity, ArrayList<Datum> items) {
        this.detailst = items;
        this.dactivty = calanderActivity;

    }

    @Override
    public Calnderadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_single_data, null);


        return new Calnderadapter.ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(Calnderadapter.ViewHolder holder, final int position) {
        holder.title.setText(((Datum) this.detailst.get(position)).getTitle());
        holder.dis.setText(Html.fromHtml(detailst.get(position).getDetail()).toString());
        Glide.with(this.dactivty).load(((Datum) this.detailst.get(position)).getImagepath()).into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dialog = new Dialog(dactivty);
                dialog.requestWindowFeature(1);
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.show_fullscreen_image);
                Glide.with(dactivty).load((detailst.get(position)).getImagepath()).into((TouchImageView) dialog.findViewById(R.id.IMAGEID));
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return detailst.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView date;
        TextView dis;
        ImageView imageView;
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.news_title);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.dis = (TextView) itemView.findViewById(R.id.news_dis);
            this.cardView = (CardView) itemView.findViewById(R.id.cardview);
        }
    }
}
