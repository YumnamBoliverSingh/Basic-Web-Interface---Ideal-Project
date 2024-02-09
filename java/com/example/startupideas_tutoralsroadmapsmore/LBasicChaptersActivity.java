package com.example.startupideas_tutoralsroadmapsmore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

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

public class LBasicChaptersActivity extends AppCompatActivity {
    TextView li1, li2, li3, li4, li5, li6, li7, li8;
    ImageView back;
    NativeAd nativeAd;
    InterstitialAd interstitialVideoAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbasic_chapters);
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
        getSupportActionBar().hide();
        li1=findViewById(R.id.tvALBC1);
        li2=findViewById(R.id.tvALBC2);
        li3=findViewById(R.id.tvALBC3);
        li4=findViewById(R.id.tvALBC4);
        li5=findViewById(R.id.tvALBC5);
        li6=findViewById(R.id.tvALBC6);
        li7=findViewById(R.id.tvALBC7);
        li8=findViewById(R.id.tvALBC8);

        back=findViewById(R.id.BC_backicon);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int vil = preferences.getInt("sp_basic", 1);

                if(vil == 1){
                    Intent intent1 = new Intent(LBasicChaptersActivity.this, activity_navigation_drawer.class);
                    startActivity(intent1);
                }
                else if(vil==2){
                    Intent intent1 = new Intent(LBasicChaptersActivity.this, TutorialActivity.class);
                    startActivity(intent1);
                }

            }
        });

        li1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 1);
                startActivity(intent);
            }
        });
        li2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 2);
                startActivity(intent);
            }
        });
        li3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 3);
                startActivity(intent);
            }
        });
        li4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 4);
                startActivity(intent);
            }
        });
        li5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 5);
                startActivity(intent);
            }
        });
        li6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 6);
                startActivity(intent);
            }
        });
        li7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 7);
                startActivity(intent);
            }
        });
        li8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LBasicChaptersActivity.this, BasicChaptersActivity.class);
                intent.putExtra("keyval_ba", 8);
                startActivity(intent);
            }
        });

        refreshAd();
        loadVideoInterstitialAd();


    }
    @Override
    public void onBackPressed() {
        if(interstitialVideoAd!=null){
            interstitialVideoAd.show(this);
        }else{
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            int val = preferences.getInt("sp_basic", 1);

            if(val == 1){
                Intent intent1 = new Intent(LBasicChaptersActivity.this, activity_navigation_drawer.class);
                startActivity(intent1);
            }
            else if(val==2){
                Intent intent1 = new Intent(LBasicChaptersActivity.this, TutorialActivity.class);
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
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholderALBC);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView(unifiedNativeAd, adView);
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis6);
                cl_1.setVisibility(View.GONE);
                frameLayout.removeAllViews();
                frameLayout.addView(adView);


            }
        }).build();

        NativeAdOptions adOptions = new NativeAdOptions.Builder().build();
        builder.withNativeAdOptions(adOptions);

        AdLoader adLoader = builder.withAdListener(new AdListener() {
            public void onAdFailedToLoad(int i) {
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis6);
                cl_1.setVisibility(View.VISIBLE);
            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());

    }
    //................................................................................................................

    private void loadVideoInterstitialAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(
                this,
                getString(R.string.INTERSTITIAL_VIDEO_AD_ID),
                adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        LBasicChaptersActivity.this.interstitialVideoAd = interstitialAd;
                        interstitialAd.setFullScreenContentCallback(
                                new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when fullscreen content is dismissed.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        Toast.makeText(getApplicationContext(), "Use the App's Built In Back Button\n\t\t\t\t(Recommended)", Toast.LENGTH_LONG).show();

                                        LBasicChaptersActivity.this.interstitialVideoAd = null;


                                        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                                        int val = preferences.getInt("sp_basic", 1);

                                        if(val == 1){
                                            Intent intent1 = new Intent(LBasicChaptersActivity.this, activity_navigation_drawer.class);
                                            startActivity(intent1);
                                        }
                                        else if(val==2){
                                            Intent intent1 = new Intent(LBasicChaptersActivity.this, TutorialActivity.class);
                                            startActivity(intent1);
                                        }



                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when fullscreen content failed to show.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        LBasicChaptersActivity.this.interstitialVideoAd = null;


                                        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                                        int val = preferences.getInt("sp_basic", 1);

                                        if(val == 1){
                                            Intent intent1 = new Intent(LBasicChaptersActivity.this, activity_navigation_drawer.class);
                                            startActivity(intent1);
                                        }
                                        else if(val==2){
                                            Intent intent1 = new Intent(LBasicChaptersActivity.this, TutorialActivity.class);
                                            startActivity(intent1);
                                        }





                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        // Called when fullscreen content is shown.
                                        Toast.makeText(getApplicationContext(), "Use the Built-in back button, as it won't load any ad!", Toast.LENGTH_LONG).show();

                                    }
                                });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        interstitialVideoAd = null;


                    }
                });
    }
 }




