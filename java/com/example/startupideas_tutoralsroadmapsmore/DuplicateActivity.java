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

public class DuplicateActivity extends AppCompatActivity {
    ImageView pBack;
    NativeAd nativeAd;
    CardView LI_B1, LI_B2, LI_B3, LI_B4, LI_B5, LI_B6, LI_B7, LI_B8, LI_B9 ;
    private InterstitialAd interstitialStaticAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duplicate);
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
        pBack=findViewById(R.id.back_ea_ts_2);




        pBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int val = preferences.getInt("sp_eats2", 1);


                if(val==1){
                    Intent intent1 = new Intent(DuplicateActivity.this, TutorialActivity.class);
                    startActivity(intent1);
                }
                else if(val==2) {
                    Intent intent1 = new Intent(DuplicateActivity.this, activity_navigation_drawer.class);
                    startActivity(intent1);
                }

            }
        });
//initializes..
        LI_B1 = findViewById(R.id.LI_B1);
        LI_B2 = findViewById(R.id.LI_B2);
        LI_B3 = findViewById(R.id.LI_B3);
        LI_B4 = findViewById(R.id.LI_B4);
        LI_B5 = findViewById(R.id.LI_B5);
        LI_B6 = findViewById(R.id.LI_B6);
        LI_B7 = findViewById(R.id.LI_B7);
        LI_B8 = findViewById(R.id.LI_B8);
        LI_B9 = findViewById(R.id.LI_Zoo);


        LI_B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 30);
                intent.putExtra("keyI_RPSA",  555);

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();

                startActivity(intent);

            }
        });
        LI_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 31);
                intent.putExtra("keyI_RPSA",  555);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 32);
                intent.putExtra("keyI_RPSA", 666 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 33);
                intent.putExtra("keyI_RPSA", 777 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 34);
                intent.putExtra("keyI_RPSA", 888 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 35);
                intent.putExtra("keyI_RPSA", 666 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 36);
                intent.putExtra("keyI_RPSA", 777 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA", 37);
                intent.putExtra("keyI_RPSA",  999);
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });
        LI_B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DuplicateActivity.this, ScrollingActivity.class);
                intent.putExtra("keyI_MISA",37 );
                intent.putExtra("keyI_RPSA", 1111 );
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("sp_scrollAct", 2);
                editor.apply();
                startActivity(intent);

            }
        });



        loadStaticImageInterstitialAd();
        refreshAd();
    }
    @Override
    public void onBackPressed(){
        if(interstitialStaticAd!=null){
            interstitialStaticAd.show(this);
        }else{
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            int val = preferences.getInt("sp_eats2", 1);


            if(val==1){
                Intent intent1 = new Intent(DuplicateActivity.this, TutorialActivity.class);
                startActivity(intent1);
            }
            else if(val==2) {
                Intent intent1 = new Intent(DuplicateActivity.this, activity_navigation_drawer.class);
                startActivity(intent1);
            }

        }
    }

    private void populateUnifiedNativeAdView(NativeAd nativeAd, NativeAdView adView) {




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
     private void refreshAd() {
        AdLoader.Builder builder = new AdLoader.Builder(this, getString(R.string.NATIVE_VIDEO_AD_ID));

        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd unifiedNativeAd) {

                if (nativeAd != null) {
                    nativeAd.destroy();
                }
                nativeAd = unifiedNativeAd;
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholder7qrt);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView(unifiedNativeAd, adView);
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
                        DuplicateActivity.this.interstitialStaticAd = interstitialAd;
                        interstitialAd.setFullScreenContentCallback(
                                new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when fullscreen content is dismissed.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        DuplicateActivity.this.interstitialStaticAd = null;

                                        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                                        int val = preferences.getInt("sp_eats2", 1);


                                        if(val==1){
                                            Intent intent1 = new Intent(DuplicateActivity.this, TutorialActivity.class);
                                            startActivity(intent1);
                                        }
                                        else if(val==2) {
                                            Intent intent1 = new Intent(DuplicateActivity.this, activity_navigation_drawer.class);
                                            startActivity(intent1);
                                        }
                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when fullscreen content failed to show.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        DuplicateActivity.this.interstitialStaticAd = null;

                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        Toast.makeText(getApplicationContext(), "Tap Close.", Toast.LENGTH_LONG).show();

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