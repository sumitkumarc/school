package com.skyzone18.ParasharVidyaSankul.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.skyzone18.ParasharVidyaSankul.Fragment.MainFragment;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.CalanderActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.DownloadActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.EventActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.GalleryActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.HomeWorkActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.MediumstdActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.NewsActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.NoticeActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.StaffActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.TimeTableActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.TodayActivity;
import com.skyzone18.ParasharVidyaSankul.JsonActivity.VideoyActivity;
import com.skyzone18.ParasharVidyaSankul.R;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Toolbar mytoolbar;

    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    Boolean doubleBackToExitPressedOnce = false;
    FragmentTransaction mFragmentTransaction;


    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytoolbar = (Toolbar) findViewById(R.id.toolbar);
        //mytoolbar.setTitle("Home");
        mytoolbar.setTitle(R.string.app_name);
        setSupportActionBar(mytoolbar);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.navigationview);

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView, new MainFragment()).commit();

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        mDrawerLayout.closeDrawers();
                    }
                }, 200);


                if (menuItem.getItemId() == R.id.nav_about) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, AboutActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_aim) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, AimActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_mangement) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, MangementActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_academics) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, AcademicActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_admission) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, AdmissionActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_staff) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, StaffActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_faci) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, FacilityActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_event) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, EventActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_news) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, NewsActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_gallery) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, GalleryActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_ntc) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, NoticeActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_video) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, VideoyActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_homework) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, HomeWorkActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_timetable) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, MediumstdActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_calander) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, CalanderActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_student) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, StudentLoginActivity.class));
                }
                if (menuItem.getItemId() == R.id.nav_contact) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, ContactActivity.class));
                }


                if (menuItem.getItemId() == R.id.nav_share) {
                    String appname = getString(R.string.app_name);
                    String ExternalString = getString(R.string.String);
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, appname + "\n" + ExternalString + "\n" + "https://play.google.com/store/apps/details?id=" + getPackageName());
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);
                }
                
                return false;
            }

        });

        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mytoolbar, R.string.app_name, R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();


        View navHeaderView = mNavigationView.inflateHeaderView(R.layout.nav_header_main);
        ImageView headerIcon = (ImageView) navHeaderView.findViewById(R.id.imageView);


        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        Configuration config = getBaseContext().getResources().getConfiguration();

        String lang = settings.getString("LANG", "");
        if (!"".equals(lang) && !config.locale.getLanguage().equals(lang)) {
            Locale locale = new Locale(lang);
            Locale.setDefault(locale);
            config.locale = locale;
            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

//
//            int id = item.getItemId();
//            if (id == R.id.action_english) {
//                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("LANG", "en").commit();
//                restartInLocale(Locale.forLanguageTag("en"));
//
//            }
//            if (id == R.id.action_gujarati) {
//                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("LANG", "gu").commit();
//                restartInLocale(Locale.forLanguageTag("gu"));
//
//            }
//            if (id == R.id.action_hindi) {
//                PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("LANG", "hi").commit();
//                restartInLocale(Locale.forLanguageTag("hi"));
//
//            }

        switch (item.getItemId()) {
            case R.id.noti:
//                givenotification(getBaseContext());
                startActivity(new Intent(MainActivity.this, NewsActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void restartInLocale(Locale locale) {
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        Resources resources = getResources();
        resources.updateConfiguration(config, resources.getDisplayMetrics());
        recreate();

    }
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();

            System.exit(0);

            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit",
                Toast.LENGTH_SHORT).show();
    }

}
