package com.example.startupideas_tutoralsroadmapsmore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
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

public class EA_ts_3 extends AppCompatActivity {
    NativeAd nativeAd1, nativeAd2;
    ImageView pBack;
    CardView LI_C1, LI_C2, LI_C3, LI_C4, LI_C5, LI_C6, LI_C7, LI_C8, LI_C9, LI_C10, LI_C11, LI_C12;
    private InterstitialAd interstitialStaticAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea_ts3);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        pBack=findViewById(R.id.back_ea_ts_3);


        pBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int val = preferences.getInt("sp_eats3", 1);


                if(val==1){
                    Intent intent1 = new Intent(EA_ts_3.this, TutorialActivity.class);
                    startActivity(intent1);
                }
                else if(val==2){
                    Intent intent1 = new Intent(EA_ts_3.this, activity_navigation_drawer.class);
                    startActivity(intent1);
                }
            }
        });
        LI_C1 = findViewById(R.id.LI_C1);
        LI_C2 = findViewById(R.id.LI_C2);
        LI_C3 = findViewById(R.id.LI_C3);
        LI_C4 = findViewById(R.id.LI_C4);
        LI_C5 = findViewById(R.id.LI_C5);
        LI_C6 = findViewById(R.id.LI_C6);
        LI_C7 = findViewById(R.id.LI_C7);
        LI_C8 = findViewById(R.id.LI_C8);
        LI_C9 = findViewById(R.id.LI_C9);
        LI_C10 = findViewById(R.id.LI_C10);
        LI_C11 = findViewById(R.id.LI_C11);
        LI_C12 = findViewById(R.id.LI_C12);


        LI_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 40);
                intent.putExtra("keyI_RPSA", 999 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 41);
                intent.putExtra("keyI_RPSA",  1111);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 42);
                intent.putExtra("keyI_RPSA", 1111 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 43);
                intent.putExtra("keyI_RPSA", 999 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 44);
                intent.putExtra("keyI_RPSA", 1111 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 45);
                intent.putExtra("keyI_RPSA",  999);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 46);
                intent.putExtra("keyI_RPSA",  3333);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 47);
                intent.putExtra("keyI_RPSA", 2222 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 48);
                intent.putExtra("keyI_RPSA", 3333 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 49);
                intent.putExtra("keyI_RPSA", 2222 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 50);
                intent.putExtra("keyI_RPSA", 3333 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_C12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EA_ts_3.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 51);
                intent.putExtra("keyI_RPSA", 2222 );

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 3);
                editor.apply();

                startActivity(intent);

            }
        });

        refreshAd1();
        loadStaticImageInterstitialAd();
    }
    @Override
    public void onBackPressed(){
      if(interstitialStaticAd!=null){
          interstitialStaticAd.show(this);
      }else{
          SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
          int val = preferences.getInt("sp_eats3", 1);


          if(val==1){
              Intent intent1 = new Intent(EA_ts_3.this, TutorialActivity.class);
              startActivity(intent1);
          }
          else if(val==2){
              Intent intent1 = new Intent(EA_ts_3.this, activity_navigation_drawer.class);
              startActivity(intent1);
          }
      }
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
     private void refreshAd1() {
        AdLoader.Builder builder = new AdLoader.Builder(this, getString(R.string.NATIVE_VIDEO_AD_ID));

        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd unifiedNativeAd) {

                if (nativeAd1 != null) {
                    nativeAd1.destroy();
                }
                nativeAd1 = unifiedNativeAd;
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholder6qrt);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView1(unifiedNativeAd, adView);
                frameLayout.removeAllViews();
                frameLayout.addView(adView);


            }
        }).build();

        NativeAdOptions adOptions = new NativeAdOptions.Builder().build();
        builder.withNativeAdOptions(adOptions);

        AdLoader adLoader = builder.withAdListener(new AdListener() {
            public void onAdFailedToLoad(int i) {
                Snackbar.make(findViewById(android.R.id.content),"Turn on Internet Connection\nfor the Best User Experience!",Snackbar.LENGTH_SHORT).show();

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
                        EA_ts_3.this.interstitialStaticAd = interstitialAd;
                        interstitialAd.setFullScreenContentCallback(
                                new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when fullscreen content is dismissed.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        EA_ts_3.this.interstitialStaticAd = null;
                                        //if connection established
                                        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                                        int val = preferences.getInt("sp_eats3", 1);


                                        if(val==1){
                                            Intent intent1 = new Intent(EA_ts_3.this, TutorialActivity.class);
                                            startActivity(intent1);
                                        }
                                        else if(val==2){
                                            Intent intent1 = new Intent(EA_ts_3.this, activity_navigation_drawer.class);
                                            startActivity(intent1);
                                        }
                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when fullscreen content failed to show.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        EA_ts_3.this.interstitialStaticAd = null;


                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        Toast.makeText(getApplicationContext(), "Tap close for Back.", Toast.LENGTH_LONG).show();

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