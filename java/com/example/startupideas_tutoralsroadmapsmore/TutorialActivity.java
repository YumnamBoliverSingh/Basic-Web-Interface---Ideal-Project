package com.example.startupideas_tutoralsroadmapsmore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class TutorialActivity extends AppCompatActivity {
    ConstraintLayout cl_egt, cl_rmtipo;
    ConstraintLayout cl_obi, kaka_no_2, cl_bibs, cl_isc;
    ConstraintLayout cl_li1, cl_li2, cl_li3, cl_li4, cl_li5, cl_li6, cl_li7, cl_li8, cl_li9, cl_li10, cl_li11, cl_li12, cl_li13, cl_li14, cl_li15;
    NativeAd nativeAd1, nativeAd2;
    ProgressBar proManHnzz;
    ImageView back;
    LinearLayout loadMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        getSupportActionBar().hide();
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }
         //initializes..
        loadMore=findViewById(R.id.CL_lmch);
        proManHnzz=findViewById(R.id.ProgressBAr_mMAnHnzzz);

        cl_obi=findViewById(R.id.CL_ob);
        kaka_no_2=findViewById(R.id.CL_ani);
        cl_bibs=findViewById(R.id.CL_bibs);
        cl_isc=findViewById(R.id.CL_isc);

        cl_egt=findViewById(R.id.CL_egt);
        cl_rmtipo=findViewById(R.id.CL_rmtipo);

        cl_li1=findViewById(R.id.CL_listitem1);
        cl_li2=findViewById(R.id.CL_listitem2);
        cl_li3=findViewById(R.id.CL_listitem3);
        cl_li4=findViewById(R.id.CL_listitem4);
        cl_li5=findViewById(R.id.CL_listitem5);
        cl_li6=findViewById(R.id.CL_listitem6);
        cl_li7=findViewById(R.id.CL_listitem7);
        cl_li8=findViewById(R.id.CL_listitem8);
        cl_li9=findViewById(R.id.CL_listitem9);
        cl_li10=findViewById(R.id.CL_listitem10);
        cl_li11=findViewById(R.id.CL_listitem11);
        cl_li12=findViewById(R.id.CL_listitem12);
        cl_li13=findViewById(R.id.CL_listitem13);
        cl_li14=findViewById(R.id.CL_listitem14);
        cl_li15=findViewById(R.id.CL_listitem15);
//
        back=findViewById(R.id.AT_backiconreal);

//
//
//HAndle The 4, 2, 15 s  -----------------------------------------------------------------------------------------------------
//a Block Of 4 CLs...
        cl_obi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_eats1", 1);
                editor.apply();

                Intent intent = new Intent(TutorialActivity.this, EA_ts_1.class);
                startActivity(intent);
            }
        });
        kaka_no_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_eats2", 1);
                editor.apply();

                Intent intent = new Intent(TutorialActivity.this, DuplicateActivity.class);
                startActivity(intent);
            }
        });


        cl_bibs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_eats3", 1);
                editor.apply();

                Intent intent = new Intent(TutorialActivity.this, EA_ts_3.class);
                startActivity(intent);
            }
        });
        cl_isc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_eats4", 1);
                editor.apply();

                Intent intent = new Intent(TutorialActivity.this, EA_ts_4.class);
                startActivity(intent);
            }
        });

        //a Block of 2 CLs...

        cl_rmtipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorialActivity.this, LBasicChaptersActivity.class);

                SharedPreferences preferencesx = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editorx = preferencesx.edit();
                editorx.putInt("sp_basic", 2);
                editorx.apply();

                startActivity(intent);
            }
        });

        cl_egt.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorialActivity.this, LCoolZTOActivity.class);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_coolsZto", 2);
                editor.apply();

                startActivity(intent);
            }
        });


        //List Item For The Articles: 1,2,3, ... ,15
        cl_li1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://inc42.com/startups/30-startups-to-watch-the-startups-that-caught-our-eye-in-february-2022/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://www.entrepreneur.com/slideshow/367322");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://www.thekickassentrepreneur.com/the-most-profitable-small-businesses-to-open-now/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://medium.com/authority-magazine/ten-entrepreneurs-share-how-they-turned-their-hobbies-into-successful-careers-22e574e35e2");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://explodingtopics.com/blog/startup-trends");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://userguiding.com/blog/startup-statistics-trends/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://financesonline.com/entrepreneurship-trends/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://succeedfeed.com/wake-up-early-morning-quotes/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://www.cloudways.com/blog/best-startups-watch-out/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://explodingtopics.com/blog/saas-trends");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://mystratupideas.blogspot.com/2017/12/14-things-to-consider-in-selecting.html");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://www.ecommerceceo.com/ecommerce-affiliate-marketing/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://www.techfunnel.com/fintech/profit-maximization/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://nextwhatbusiness.com/10-things-to-consider-in-starting-product-based-business/");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });
        cl_li15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //No Internet !!
                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Intent intent = new Intent(TutorialActivity.this, HotTopicsFifteenTutorialsArticlesWebView.class);
                    intent.putExtra("val_articleNumber", "https://www.entrepreneur.com/article/289956");
                    startActivity(intent);
                }else{
                    Snackbar.make(findViewById(android.R.id.content),"No Internet",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Loading Failed", Toast.LENGTH_LONG).show();
                }

            }
        });


        loadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cm.getActiveNetworkInfo();
                boolean connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();

                if(connected==true){
                    Toast.makeText(getApplicationContext(), "Loading Completed", Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(getApplicationContext(), "Internet Recommended", Toast.LENGTH_LONG).show();

                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TutorialActivity.this, activity_navigation_drawer.class);
                startActivity(intent);
            }
        });
         refreshAd1();
        refreshAd2();

    }
    @Override
    public void onBackPressed(){
        Intent intent=new Intent(TutorialActivity.this, activity_navigation_drawer.class);
        startActivity(intent);
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
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholder2);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView1(unifiedNativeAd, adView);
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis1);
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
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis1);
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
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholder3);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView2(unifiedNativeAd, adView);
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis2);
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
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis2);
                cl_1.setVisibility(View.VISIBLE);
            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());

    }
}