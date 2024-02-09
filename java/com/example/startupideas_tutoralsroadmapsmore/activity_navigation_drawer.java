package com.example.startupideas_tutoralsroadmapsmore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.multidex.MultiDex;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class activity_navigation_drawer extends AppCompatActivity {
        InterstitialAd interstitialStaticAd, interstitialVideoAd;
       ImageView btnBasic, btnZeroToOne;
       LinearLayout ll_bookmarks, ll_upgrade, ll_discussions, ll_tutorials, ll_ideas, ll_mindset;
       ImageView aaIV1, aaIV2, aaIV3;
       ImageView adIV1, adIV2, adIV3;
       ConstraintLayout cl_discussions, cl_tutorials, cl_ideas;
       TextView tv_ipo, tv_lean, tv_bstrap, tv_sentrp, tv_crwdfnd, tv_htcs, tv_qifths, tv_dgem;
       TextView tv_hdianipo, tv_brfns;
       TextView tv_obi, tv_bibc, tv_bibs, tv_isc;
       DrawerLayout navDrawer;
       ImageView BTNnavDrawer, activityTutorial;
       ConstraintLayout chapters_bundle;
       ConstraintLayout cl_ipo, cl_lean, cl_bstrap, cl_sentrp, cl_crwdfnd, cl_htcs, cl__qifths, cl_dg;
       ConstraintLayout article_item_cl1, article_item_cl2, article_item_cl3, article_item_cl4, article_item_cl5, article_item_cl6, article_item_cl7, article_item_cl8, article_item_cl9, article_item_cl10, article_item_cl11, article_item_cl12, article_item_cl13;
       String bH, wN, sTP, bTP, httptbs;
       char iN;
       NativeAd nativeAd1, nativeAd2;

       ImageView searchIcon, notiIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });
        chapters_bundle=findViewById(R.id.chapters);
        navDrawer = findViewById(R.id.nav_drawer_layout);

        getSupportActionBar().hide();

        searchIcon=findViewById(R.id.searchIcon);
        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
                if(connected==false){
                    Toast.makeText(getApplicationContext(), "Connection can't be established!", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(activity_navigation_drawer.this, SearchActivity.class);
                    startActivity(intent);
                }
            }
        });
        notiIcon=findViewById(R.id.notiIcon);
        notiIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_navigation_drawer.this, NotificationActivity.class);
                startActivity(intent);
             }
        });

        aaIV1=findViewById(R.id.arrow_above1);
        aaIV2=findViewById(R.id.arrow_above2);
        aaIV3=findViewById(R.id.arrow_above3);
        adIV1=findViewById(R.id.arrow_down1);
        adIV2=findViewById(R.id.arrow_down2);
        adIV3=findViewById(R.id.arrow_down3);

        //Bookmarks, Upgrade, ... , Mindset.
        ll_bookmarks=findViewById(R.id.ll_bookmarks);
        ll_upgrade=findViewById(R.id.ll_upgrade);
        ll_discussions=findViewById(R.id.ll_discussions);
        ll_tutorials=findViewById(R.id.ll_tutorials);
        ll_ideas=findViewById(R.id.ll_ideas);
        ll_mindset=findViewById(R.id.ll_motivation);
        btnBasic=findViewById(R.id.ivHSCV2);
        btnZeroToOne=findViewById(R.id.ivHSCV1);
        //navigation Left Bar Pane Items
        cl_discussions=findViewById(R.id.cl_discussions);
        cl_tutorials=findViewById(R.id.cl_tutorials);
        cl_ideas=findViewById(R.id.cl_ideas);
        //TextView for ConstraintLayout blocks..
        tv_ipo=findViewById(R.id.tv_ipo1);
        tv_lean=findViewById(R.id.tv_lean2);
        tv_bstrap=findViewById(R.id.tv_bstrap3);
        tv_sentrp=findViewById(R.id.tv_sentrps4);
        tv_crwdfnd=findViewById(R.id.tv_crwdfnd5);
        tv_htcs=findViewById(R.id.tv_htcs6);
        tv_qifths=findViewById(R.id.tv_qifths7);
        tv_dgem=findViewById(R.id.tv_dgem8);

        tv_hdianipo=findViewById(R.id.tv_approachipo1);
        tv_brfns=findViewById(R.id.tv_roadmaps2);

        tv_obi=findViewById(R.id.tv_obi1);
        tv_bibc=findViewById(R.id.tv_bibc2);
        tv_bibs=findViewById(R.id.tv_bibs3);
        tv_isc=findViewById(R.id.tv_isc4);
        activityTutorial=findViewById(R.id.ive);
        BTNnavDrawer=findViewById(R.id.nav_btn);

        cl_ipo=findViewById(R.id.tvHT1);
        cl_lean=findViewById(R.id.tvHT7);
        cl_bstrap=findViewById(R.id.tvHT4);
        cl_sentrp=findViewById(R.id.tvHT6);
        cl_crwdfnd=findViewById(R.id.tvHT5);
        cl_htcs=findViewById(R.id.tvHT8);
        cl__qifths=findViewById(R.id.tvHT3);
        cl_dg=findViewById(R.id.tvHT2);

        article_item_cl1=findViewById(R.id.likeLV_CV_article1);
        article_item_cl2=findViewById(R.id.likeLV_CV_article2);
        article_item_cl3=findViewById(R.id.likeLV_CV_article3);
        article_item_cl4=findViewById(R.id.likeLV_CV_article4);
        article_item_cl5=findViewById(R.id.likeLV_CV_article5);
        article_item_cl6=findViewById(R.id.likeLV_CV_article6);
        article_item_cl7=findViewById(R.id.likeLV_CV_article7);
        article_item_cl8=findViewById(R.id.likeLV_CV_article8);
        article_item_cl9=findViewById(R.id.likeLV_CV_article9);
        article_item_cl10=findViewById(R.id.likeLV_CV_article10);
        article_item_cl11=findViewById(R.id.likeLV_CV_article11);
        article_item_cl12=findViewById(R.id.likeLV_CV_article12);
        article_item_cl13=findViewById(R.id.likeLV_CV_article13);

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }
//--------------------------------------------- ~~ Chapters Bundle ~~ --------------------------------------------------------------
        chapters_bundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
                if(connected==true){
                    Snackbar.make(findViewById(android.R.id.content),"Feature releasing soon!",Snackbar.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "No internet!", Toast.LENGTH_LONG).show();
                }

            }
        });
//....----------------------------------------------- ~~ Articles Of The Main Page. Face of The App... Articles ~~ ..............---------------- :

        article_item_cl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                intent.putExtra("D_webViewhttps_token_string", "https://www.forbes.com/advisor/investing/what-is-a-startup/");
                startActivity(intent);
            }
        });
        article_item_cl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                intent.putExtra("D_webViewhttps_token_string", "http://www.awesomeazinglife.com/2019/12/09/entrepreneurs-are-visionary-leaders/");
                startActivity(intent);
            }
        });
        article_item_cl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                intent.putExtra("D_webViewhttps_token_string", "https://www.myonlineca.in/legal-adda-powered-by-myonlineca/why-flipkart-registered-in-singapore");
                startActivity(intent);
            }
        });
        article_item_cl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                intent.putExtra("D_webViewhttps_token_string", "https://www.cewcomms.com/blog/2018/8/6/the-skills-and-mindset-you-need-to-thrive-in-a-startup");
                startActivity(intent);
            }
        });


        //article LV like CL :   5-------1
        article_item_cl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (interstitialVideoAd != null) {

                    interstitialVideoAd.show(activity_navigation_drawer.this);

                } else {
                    bH=getString(R.string.boldH1);
                    wN=getString(R.string.writerN_1);
                    sTP=getString(R.string.sTextPlain_1);
                    bTP=getString(R.string.bTextPlain_1);
                    iN='a';
                    httptbs=getString(R.string.http1);

                    Intent intent = new Intent(activity_navigation_drawer.this, InjectStringsActivity.class);

                    intent.putExtra("boldHeadline",bH);
                    intent.putExtra("writerName", wN);
                    intent.putExtra("sTextPlain", sTP);
                    intent.putExtra("bTextPlain", bTP);
                    intent.putExtra("imageNumber", iN);
                    intent.putExtra("httpTBS", httptbs);

                    startActivity(intent);
                }

            }
        });
        //article LV like CL :6----2
        article_item_cl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (interstitialVideoAd != null) {

                    interstitialVideoAd.show(activity_navigation_drawer.this);

                } else {
                    bH=getString(R.string.boldH2);
                    wN=getString(R.string.writerN_2);
                    sTP=getString(R.string.sTextPlain_2);
                    bTP=getString(R.string.bTextPlain_2);
                    iN='b';
                    httptbs=getString(R.string.http2);

                    Intent intent = new Intent(activity_navigation_drawer.this, InjectStringsActivity.class);

                    intent.putExtra("boldHeadline",bH);
                    intent.putExtra("writerName", wN);
                    intent.putExtra("sTextPlain", sTP);
                    intent.putExtra("bTextPlain", bTP);
                    intent.putExtra("imageNumber", iN);
                    intent.putExtra("httpTBS", httptbs);

                    startActivity(intent);
                }

            }
        });
        //article LV like CL :7---3
        article_item_cl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialVideoAd != null) {

                    interstitialVideoAd.show(activity_navigation_drawer.this);

                } else {
                    bH=getString(R.string.boldH3);
                    wN=getString(R.string.writerN_3);
                    sTP=getString(R.string.sTextPlain_3);
                    bTP=getString(R.string.bTextPlain_3);
                    iN='c';
                    httptbs=getString(R.string.http3);

                    Intent intent = new Intent(activity_navigation_drawer.this, InjectStringsActivity.class);

                    intent.putExtra("boldHeadline",bH);
                    intent.putExtra("writerName", wN);
                    intent.putExtra("sTextPlain", sTP);
                    intent.putExtra("bTextPlain", bTP);
                    intent.putExtra("imageNumber", iN);
                    intent.putExtra("httpTBS", httptbs);

                    startActivity(intent);
                }




            }
        });
        //article LV like CL :8---4
        article_item_cl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialVideoAd != null) {

                    interstitialVideoAd.show(activity_navigation_drawer.this);

                } else {

                    bH=getString(R.string.boldH4);
                    wN=getString(R.string.writerN_4);
                    sTP=getString(R.string.sTextPlain_4);
                    bTP=getString(R.string.bTextPlain_4);
                    iN='d';
                    httptbs=getString(R.string.http4);

                    Intent intent = new Intent(activity_navigation_drawer.this, InjectStringsActivity.class);

                    intent.putExtra("boldHeadline",bH);
                    intent.putExtra("writerName", wN);
                    intent.putExtra("sTextPlain", sTP);
                    intent.putExtra("bTextPlain", bTP);
                    intent.putExtra("imageNumber", iN);
                    intent.putExtra("httpTBS", httptbs);

                    startActivity(intent);
                }




            }
        });
        //article LV like CL :9---5
        article_item_cl9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialVideoAd != null) {

                    interstitialVideoAd.show(activity_navigation_drawer.this);

                } else {


                    bH=getString(R.string.boldH5);
                    wN=getString(R.string.writerN_5);
                    sTP=getString(R.string.sTextPlain_5);
                    bTP=getString(R.string.bTextPlain_5);
                    iN='e';
                    httptbs=getString(R.string.http5);

                    Intent intent = new Intent(activity_navigation_drawer.this, InjectStringsActivity.class);

                    intent.putExtra("boldHeadline",bH);
                    intent.putExtra("writerName", wN);
                    intent.putExtra("sTextPlain", sTP);
                    intent.putExtra("bTextPlain", bTP);
                    intent.putExtra("imageNumber", iN);
                    intent.putExtra("httpTBS", httptbs);

                    startActivity(intent);
                }



            }
        });
        //article LV like CL :10-----6
        article_item_cl10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialVideoAd != null) {

                    interstitialVideoAd.show(activity_navigation_drawer.this);

                } else {

                    bH=getString(R.string.boldH6);
                    wN=getString(R.string.writerN_6);
                    sTP=getString(R.string.sTextPlain_6);
                    bTP=getString(R.string.bTextPlain_6);
                    iN='f';
                    httptbs=getString(R.string.http6);

                    Intent intent = new Intent(activity_navigation_drawer.this, InjectStringsActivity.class);

                    intent.putExtra("boldHeadline",bH);
                    intent.putExtra("writerName", wN);
                    intent.putExtra("sTextPlain", sTP);
                    intent.putExtra("bTextPlain", bTP);
                    intent.putExtra("imageNumber", iN);
                    intent.putExtra("httpTBS", httptbs);

                    startActivity(intent);
                }




            }
        });
        //article LV like CL :11-----7
        article_item_cl11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialVideoAd != null) {

                    interstitialVideoAd.show(activity_navigation_drawer.this);

                } else {
                    bH=getString(R.string.boldH7);
                    wN=getString(R.string.writerN_7);
                    sTP=getString(R.string.sTextPlain_7);
                    bTP=getString(R.string.bTextPlain_7);
                    iN='g';
                    httptbs=getString(R.string.http7);

                    Intent intent = new Intent(activity_navigation_drawer.this, InjectStringsActivity.class);

                    intent.putExtra("boldHeadline",bH);
                    intent.putExtra("writerName", wN);
                    intent.putExtra("sTextPlain", sTP);
                    intent.putExtra("bTextPlain", bTP);
                    intent.putExtra("imageNumber", iN);
                    intent.putExtra("httpTBS", httptbs);

                    startActivity(intent);
                }




            }
        });
        //article LV like CL :12-----8
        article_item_cl12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialVideoAd != null) {

                    interstitialVideoAd.show(activity_navigation_drawer.this);

                } else {
                    bH=getString(R.string.boldH8);
                    wN=getString(R.string.writerN_8);
                    sTP=getString(R.string.sTextPlain_8);
                    bTP=getString(R.string.bTextPlain_8);
                    iN='h';
                    httptbs=getString(R.string.http8);

                    Intent intent = new Intent(activity_navigation_drawer.this, InjectStringsActivity.class);

                    intent.putExtra("boldHeadline",bH);
                    intent.putExtra("writerName", wN);
                    intent.putExtra("sTextPlain", sTP);
                    intent.putExtra("bTextPlain", bTP);
                    intent.putExtra("imageNumber", iN);
                    intent.putExtra("httpTBS", httptbs);

                    startActivity(intent);

                }






            }
        });
        //article LV like CL :13------9
        article_item_cl13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialVideoAd != null) {

                    interstitialVideoAd.show(activity_navigation_drawer.this);

                } else {
                    bH=getString(R.string.boldH9);
                    wN=getString(R.string.writerN_9);
                    sTP=getString(R.string.sTextPlain_9);
                    bTP=getString(R.string.bTextPlain_9);
                    iN='i';
                    httptbs=getString(R.string.http9);

                    Intent intent = new Intent(activity_navigation_drawer.this, InjectStringsActivity.class);

                    intent.putExtra("boldHeadline",bH);
                    intent.putExtra("writerName", wN);
                    intent.putExtra("sTextPlain", sTP);
                    intent.putExtra("bTextPlain", bTP);
                    intent.putExtra("imageNumber", iN);
                    intent.putExtra("httpTBS", httptbs);

                    startActivity(intent);
                }




            }
        });




//....----------------------------------------------- ~~ To Either of The Four Tutorials Activity ~~ ..............---------------- :
        tv_obi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_eats1", 2);
                editor.apply();

                Intent intent = new Intent(activity_navigation_drawer.this, EA_ts_1.class);
                startActivity(intent);
            }
        });
        tv_bibc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_eats2", 2);
                editor.apply();


                Intent intent = new Intent(activity_navigation_drawer.this, DuplicateActivity.class);
                startActivity(intent);
            }
        });
        tv_bibs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_eats3", 2);
                editor.apply();


                Intent intent = new Intent(activity_navigation_drawer.this, EA_ts_3.class);
                startActivity(intent);
            }
        });
        tv_isc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_eats4", 2);
                editor.apply();


                Intent intent = new Intent(activity_navigation_drawer.this, EA_ts_4.class);
                startActivity(intent);
            }
        });



//BLOCK: 1   (start) Navigation Drawer Layout ------------------------------------------------------------------------------------
        BTNnavDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the navigation drawer is not open then open it, if its already open then close it.
                if(!navDrawer.isDrawerOpen(GravityCompat.START))
                    navDrawer.openDrawer(Gravity.LEFT);
                else
                    navDrawer.closeDrawer(Gravity.RIGHT);

            }
        });
        btnBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_navigation_drawer.this, LBasicChaptersActivity.class);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_basic", 1);
                editor.apply();

                startActivity(intent);
            }
        });
        btnZeroToOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_navigation_drawer.this, LCoolZTOActivity.class);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_coolsZto", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        //Make gone The Visibilities of Discussions, Tutorials, Ideas
        cl_discussions.setVisibility(View.GONE);
        cl_tutorials.setVisibility(View.GONE);
        cl_ideas.setVisibility(View.GONE);
        //Make Gone The Visibilities of aaIV1, aaIV2, aaIV3
        aaIV1.setVisibility(View.GONE);
        aaIV2.setVisibility(View.GONE);
        aaIV3.setVisibility(View.GONE);
        //SharedPreference ...............
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);        SharedPreferences.Editor editor = preferences.edit();
        boolean yesornoaa1 = preferences.getBoolean("yesornoaa1", false);
        boolean yesornoaa2 = preferences.getBoolean("yesornoaa2", false);
        boolean yesornoaa3 = preferences.getBoolean("yesornoaa3", false);
        //Setting of the visibiities of Arrows:^1, ^2, ^3...    da1, da2, da3... & Discussions, Tutorials, Ideas...
        if(yesornoaa1==true){
            aaIV1.setVisibility(View.VISIBLE);
            adIV1.setVisibility(View.GONE);
            cl_discussions.setVisibility(View.VISIBLE);
        }else{
            aaIV1.setVisibility(View.GONE);
            adIV1.setVisibility(View.VISIBLE);
        }
        if(yesornoaa2==true){
            aaIV2.setVisibility(View.VISIBLE);
            adIV2.setVisibility(View.GONE);
            cl_tutorials.setVisibility(View.VISIBLE);
        }else{
            aaIV2.setVisibility(View.GONE);
            adIV2.setVisibility(View.VISIBLE);
        }
        if(yesornoaa3==true){
            aaIV3.setVisibility(View.VISIBLE);
            adIV3.setVisibility(View.GONE);
            cl_ideas.setVisibility(View.VISIBLE);
        }else{
            aaIV3.setVisibility(View.GONE);
            adIV3.setVisibility(View.VISIBLE);
        }

        ll_bookmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( activity_navigation_drawer.this, "Bookmarks feature will be releasing soon.", Toast.LENGTH_LONG).show();

            }
        });
        ll_upgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( activity_navigation_drawer.this, "Upgrade feature will be releasing soon.", Toast.LENGTH_LONG).show();
            }
        });
        ll_discussions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean yesornoD = preferences.getBoolean("yesornoD", false);
                if(yesornoD ==true){
                    editor.putBoolean("yesornoD",false);
                    cl_discussions.setVisibility(View.GONE);
                    editor.putBoolean("yesornoaa1",false);
                    aaIV1.setVisibility(View.GONE);
                    adIV1.setVisibility(View.VISIBLE);
                    editor.apply();
                }else{
                    editor.putBoolean("yesornoD",true);
                    cl_discussions.setVisibility(View.VISIBLE);
                    editor.putBoolean("yesornoaa1",true);
                    aaIV1.setVisibility(View.VISIBLE);
                    adIV1.setVisibility(View.GONE);
                    editor.apply();
                }
            }
        });
        ll_tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean yesornoT = preferences.getBoolean("yesornoT", false);

                if(yesornoT==true){
                    editor.putBoolean("yesornoT",false);
                    cl_tutorials.setVisibility(View.GONE);
                    editor.putBoolean("yesornoaa2",false);
                    aaIV2.setVisibility(View.GONE);
                    adIV2.setVisibility(View.VISIBLE);
                    editor.apply();
                }else{
                    editor.putBoolean("yesornoT",true);
                    cl_tutorials.setVisibility(View.VISIBLE);
                    editor.putBoolean("yesornoaa2",true);
                    aaIV2.setVisibility(View.VISIBLE);
                    adIV2.setVisibility(View.GONE);
                    editor.apply();
                }
            }
        });
        ll_ideas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean yesornoI = preferences.getBoolean("yesornoI", false);

                if(yesornoI==true){
                    editor.putBoolean("yesornoI",false);
                    cl_ideas.setVisibility(View.GONE);
                    aaIV3.setVisibility(View.GONE);
                    adIV3.setVisibility(View.VISIBLE);
                    editor.putBoolean("yesornoaa3",false);
                    editor.apply();
                }else{
                    editor.putBoolean("yesornoI",true);
                    cl_ideas.setVisibility(View.VISIBLE);
                    aaIV3.setVisibility(View.VISIBLE);
                    editor.putBoolean("yesornoaa3",true);
                    adIV3.setVisibility(View.GONE);
                    editor.apply();
                }
            }
        });
        ll_mindset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(activity_navigation_drawer.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://succeedfeed.com/wake-up-early-morning-quotes/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        //TextView 2, 10, 4 ......
        tv_hdianipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_navigation_drawer.this, LCoolZTOActivity.class);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_coolsZto", 1);
                editor.apply();
                startActivity(intent);
            }
        });
        tv_brfns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_navigation_drawer.this, LBasicChaptersActivity.class);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_basic", 1);
                editor.apply();
                startActivity(intent);
            }
        });


        tv_ipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.investopedia.com/terms/i/ipo.asp");
                    startActivity(intent);
                }
            }
        });
        tv_lean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.investopedia.com/terms/l/lean-startup.asp");

                    startActivity(intent);
                }
            }
        });
        tv_bstrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://fullscale.io/blog/how-to-bootstrap-a-startup/");
                    startActivity(intent);
                }
            }
        });
        tv_sentrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.pmi.org/learning/library/scalable-enterprise-project-management-framework-5979");
                    startActivity(intent);
                }
            }
        });
        tv_crwdfnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.spectroomz.com/how-does-crowdfunding-work-the-definitive-guide");
                    startActivity(intent);
                }
            }
        });
        tv_htcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://stripe.com/en-in/atlas/guides/founder-stress");
                    startActivity(intent);
                }
            }
        });
        tv_qifths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.thekitchn.com/50-quick-suppers-for-hot-summer-nights-233871");
                    startActivity(intent);
                }
            }
        });
        tv_dgem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://openstax.org/books/entrepreneurship/pages/1-2-entrepreneurial-vision-and-goals");
                    startActivity(intent);
                }
            }
        });

//-----------------------------------------------------------------------------------Hash Tags on the Front End directly on the main page ------------------------------------------------------------------------------

        cl_ipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.investopedia.com/terms/i/ipo.asp");
                    startActivity(intent);
                }
            }
        });
        cl_lean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.investopedia.com/terms/l/lean-startup.asp");

                    startActivity(intent);}
            }
        });
        cl_bstrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://fullscale.io/blog/how-to-bootstrap-a-startup/");
                    startActivity(intent);
                }
            }
        });
        cl_sentrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.pmi.org/learning/library/scalable-enterprise-project-management-framework-5979");
                    startActivity(intent);
                }
            }
        });
        cl_crwdfnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.spectroomz.com/how-does-crowdfunding-work-the-definitive-guide");
                    startActivity(intent);
                }
            }
        });
        cl_htcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://stripe.com/en-in/atlas/guides/founder-stress");
                    startActivity(intent);
                }
            }
        });
        cl__qifths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://www.thekitchn.com/50-quick-suppers-for-hot-summer-nights-233871");
                    startActivity(intent);
                }
            }
        });
        cl_dg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==false){
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();

                }else {
                    Intent intent = new Intent(activity_navigation_drawer.this, DiscussionActivity.class);
                    intent.putExtra("D_webViewhttps_token_string", "https://openstax.org/books/entrepreneurship/pages/1-2-entrepreneurial-vision-and-goals");
                    startActivity(intent);
                }
            }
        });



//BLOCK: 1 (end)  NAVIGATION DRAWER LAYOUT -----------------------------------------------------------------------------------------------------------------------------------------------------------------


//ACTIVITY TUTORIAL
        activityTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_navigation_drawer.this, TutorialActivity.class);
                startActivity(intent);
            }
        });
//Intents Receiving  on the MAin -----------------------------------------------------------------------------------------------------------------------------------------


        loadStaticImageInterstitialAd();
        refreshAd1();
        refreshAd2();
    }
    @Override
    public void onBackPressed(){
        if(interstitialStaticAd!=null){
            interstitialStaticAd.show(this);
        }else{
            ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

            if(connected!=true){
                Toast.makeText(getApplicationContext(), "No internet!", Toast.LENGTH_LONG).show();
            }
        }
    }




    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


    private void populateUnifiedNativeAdView1(NativeAd nativeAd, NativeAdView adView) {




        adView.setMediaView((MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));


        ((TextView) Objects.requireNonNull(adView.getHeadlineView())).setText(nativeAd.getHeadline());
        Objects.requireNonNull(adView.getMediaView()).setMediaContent(Objects.requireNonNull(nativeAd.getMediaContent()));


        if (nativeAd.getBody() == null) {
            Objects.requireNonNull(adView.getBodyView()).setVisibility(View.INVISIBLE);

        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            Objects.requireNonNull(adView.getCallToActionView()).setVisibility(View.INVISIBLE);
        } else {
            Objects.requireNonNull(adView.getCallToActionView()).setVisibility(View.VISIBLE);
            ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }
        if (nativeAd.getIcon() == null) {
            Objects.requireNonNull(adView.getIconView()).setVisibility(View.GONE);
        } else {
            ((ImageView) Objects.requireNonNull(adView.getIconView())).setImageDrawable(nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getPrice() == null) {
            Objects.requireNonNull(adView.getPriceView()).setVisibility(View.INVISIBLE);

        } else {
            Objects.requireNonNull(adView.getPriceView()).setVisibility(View.VISIBLE);
            ((TextView) adView.getPriceView()).setText(nativeAd.getPrice());
        }
        if (nativeAd.getStore() == null) {
            Objects.requireNonNull(adView.getStoreView()).setVisibility(View.INVISIBLE);
        } else {
            Objects.requireNonNull(adView.getStoreView()).setVisibility(View.VISIBLE);
            ((TextView) adView.getStoreView()).setText(nativeAd.getStore());
        }
        if (nativeAd.getStarRating() == null) {
            Objects.requireNonNull(adView.getStarRatingView()).setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) Objects.requireNonNull(adView.getStarRatingView())).setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            Objects.requireNonNull(adView.getAdvertiserView()).setVisibility(View.INVISIBLE);
        } else
            ((TextView) Objects.requireNonNull(adView.getAdvertiserView())).setText(nativeAd.getAdvertiser());
        adView.getAdvertiserView().setVisibility(View.VISIBLE);


        adView.setNativeAd(nativeAd);


    }
    private void populateUnifiedNativeAdView2(NativeAd nativeAd, NativeAdView adView) {




        adView.setMediaView((MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));


        ((TextView) Objects.requireNonNull(adView.getHeadlineView())).setText(nativeAd.getHeadline());
        Objects.requireNonNull(adView.getMediaView()).setMediaContent(Objects.requireNonNull(nativeAd.getMediaContent()));


        if (nativeAd.getBody() == null) {
            Objects.requireNonNull(adView.getBodyView()).setVisibility(View.INVISIBLE);

        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            Objects.requireNonNull(adView.getCallToActionView()).setVisibility(View.INVISIBLE);
        } else {
            Objects.requireNonNull(adView.getCallToActionView()).setVisibility(View.VISIBLE);
            ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }
        if (nativeAd.getIcon() == null) {
            Objects.requireNonNull(adView.getIconView()).setVisibility(View.GONE);
        } else {
            ((ImageView) Objects.requireNonNull(adView.getIconView())).setImageDrawable(nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getPrice() == null) {
            Objects.requireNonNull(adView.getPriceView()).setVisibility(View.INVISIBLE);

        } else {
            Objects.requireNonNull(adView.getPriceView()).setVisibility(View.VISIBLE);
            ((TextView) adView.getPriceView()).setText(nativeAd.getPrice());
        }
        if (nativeAd.getStore() == null) {
            Objects.requireNonNull(adView.getStoreView()).setVisibility(View.INVISIBLE);
        } else {
            Objects.requireNonNull(adView.getStoreView()).setVisibility(View.VISIBLE);
            ((TextView) adView.getStoreView()).setText(nativeAd.getStore());
        }
        if (nativeAd.getStarRating() == null) {
            Objects.requireNonNull(adView.getStarRatingView()).setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) Objects.requireNonNull(adView.getStarRatingView())).setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            Objects.requireNonNull(adView.getAdvertiserView()).setVisibility(View.INVISIBLE);
        } else
            ((TextView) Objects.requireNonNull(adView.getAdvertiserView())).setText(nativeAd.getAdvertiser());
        adView.getAdvertiserView().setVisibility(View.VISIBLE);


        adView.setNativeAd(nativeAd);


    }
    private void refreshAd1() {
        AdLoader.Builder builder = new AdLoader.Builder(this, getString(R.string.NATIVE_VIDEO_AD_ID));

        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd unifiedNativeAd) {

                if (nativeAd1 != null) {
                    nativeAd1.destroy();
                }
                nativeAd1 = unifiedNativeAd;
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholderAmain1);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView1(unifiedNativeAd, adView);
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis3);
                cl_1.setVisibility(View.GONE);
                frameLayout.removeAllViews();
                frameLayout.addView(adView);



            }
        }).build();

        NativeAdOptions adOptions = new NativeAdOptions.Builder().build();
        builder.withNativeAdOptions(adOptions);

        AdLoader adLoader = builder.withAdListener(new AdListener() {
            public void onAdFailedToLoad(int i) {
                Snackbar.make(findViewById(android.R.id.content),"Turn on Internet Connection\nfor the Best User Experience!",Snackbar.LENGTH_SHORT).show();
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis3);
                cl_1.setVisibility(View.VISIBLE);
            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());

    }
    private void refreshAd2() {
        AdLoader.Builder builder = new AdLoader.Builder(this, getString(R.string.NATIVE_STATIC_AD_ID));

        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd unifiedNativeAd) {

                if (nativeAd2 != null) {
                    nativeAd2.destroy();
                }
                nativeAd2 = unifiedNativeAd;
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholderAmain2);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView2(unifiedNativeAd, adView);
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis4);
                cl_1.setVisibility(View.GONE);
                frameLayout.removeAllViews();
                frameLayout.addView(adView);


            }
        }).build();

        NativeAdOptions adOptions = new NativeAdOptions.Builder().build();
        builder.withNativeAdOptions(adOptions);

        AdLoader adLoader = builder.withAdListener(new AdListener() {
            public void onAdFailedToLoad(int i) {
                Snackbar.make(findViewById(android.R.id.content),"Turn on Internet Connection\nfor the Best User Experience!",Snackbar.LENGTH_SHORT).show();
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis4);
                cl_1.setVisibility(View.VISIBLE);
            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());

    }


    private void loadStaticImageInterstitialAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(
                this,
                getString(R.string.INTERSTITIAL_STATIC_AD_ID),
                adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        activity_navigation_drawer.this.interstitialStaticAd = interstitialAd;
                        interstitialAd.setFullScreenContentCallback(
                                new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when fullscreen content is dismissed.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        activity_navigation_drawer.this.interstitialStaticAd = null;
                                        //if connection established
                                            moveTaskToBack(true);
                                            android.os.Process.killProcess(android.os.Process.myPid());
                                            System.exit(1);
                                        Toast.makeText(getApplicationContext(), "Application Exited!", Toast.LENGTH_LONG).show();

                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when fullscreen content failed to show.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        activity_navigation_drawer.this.interstitialStaticAd = null;

                                        moveTaskToBack(true);
                                        android.os.Process.killProcess(android.os.Process.myPid());
                                        System.exit(1);

                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        Toast.makeText(getApplicationContext(), "Tap close for Exiting.", Toast.LENGTH_LONG).show();

                                    }
                                });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        interstitialStaticAd = null;

                    }
                });
    }

}