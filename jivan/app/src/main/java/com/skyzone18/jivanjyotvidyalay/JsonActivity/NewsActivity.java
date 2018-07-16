package com.skyzone18.jivanjyotvidyalay.JsonActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import com.skyzone18.jivanjyotvidyalay.R;


public class NewsActivity extends AppCompatActivity {
//    RecyclerView recyclerView;
//    // TextView tv;
//    ProgressDialog pDialog;
//    ApiService apiService;
//    ImageView ivnotfound;
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.app_news);
//        ivnotfound = (ImageView) findViewById(R.id.iv_notfound);
//        recyclerView = (RecyclerView) findViewById(R.id.news_recycle);
//
//        apiService = RetroClient.getClient().create(ApiService.class);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
        webView = (WebView) findViewById(R.id.actiwebview);
        webView.loadUrl("file:///android_asset/about1.html");
        webView.setBackgroundColor(Color.TRANSPARENT);
     
      ///  news();
    }
//    public void news() {
//        pDialog = new ProgressDialog(NewsActivity.this);
//        pDialog.setIndeterminate(false);
//        pDialog.setCancelable(false);
//        pDialog.show();
//        Call<Example> call = apiService.GetNews();
//        call.enqueue(new Callback<Example>() {
//            @Override
//            public void onResponse(Call<Example> call, retrofit2.Response<Example> response) {
//                pDialog.dismiss();
//                List<Datum> items = response.body().getData();
//                if (response.body().getData().size() == 0) {
//                    recyclerView.setVisibility(View.GONE);
//                    ivnotfound.setVisibility(View.VISIBLE);
//                } else {
//                    recyclerView.setAdapter(new newsadapter(NewsActivity.this, items));
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<Example> call, Throwable t) {
//                // Log error here since request failed
//                Log.e(">>>>>>", t.toString());
//                pDialog.dismiss();
//                //  imageView.setVisibility(View.GONE);
//                Toast.makeText(NewsActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menuinv, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {

            case android.R.id.home:
                finish();
                return true;

            case R.id.share:
                String appname = getString(R.string.app_name);
                String ExternalString = getString(R.string.String);
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, appname + "\n" + ExternalString + "\n" + "https://play.google.com/store/apps/details?id=" + getPackageName());
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                return true;

            case R.id.rate:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
                return true;

            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
