package com.example.startupideas_tutoralsroadmapsmore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

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

public class BasicChaptersActivity extends AppCompatActivity {
    TextView tvh, tvb1, tvb2;
    NativeAd nativeAd1, nativeAd2 ;
    ImageView iv_pic;
    ImageView ivBack;
    String Fhead_string, Fbody_string1, Fbody_string2;
    int key_for_the_activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_chapters);
        getSupportActionBar().hide();


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        tvh=findViewById(R.id.tvHead_BC);
        tvb1=findViewById(R.id.tvBody_BC1);
        tvb2=findViewById(R.id.tvBody_BC2);
        iv_pic=findViewById(R.id.ivBC);
        ivBack=findViewById(R.id.BC_backiconreal);

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }





        key_for_the_activity = getIntent().getExtras().getInt("keyval_ba");
        if(key_for_the_activity==1){
            tvh.setText(R.string.string_startupBasicsN1);
            tvb1.setText(R.string.string_startupBasics11);
            tvb2.setText(R.string.string_startupBasics12);

            iv_pic.setImageResource(R.drawable.bctiv1);
        }
        if(key_for_the_activity==2){
            tvh.setText(R.string.string_startupBasicsN2);
            tvb1.setText(R.string.string_startupBasics21);
            tvb2.setText(R.string.string_startupBasics22);

            iv_pic.setImageResource(R.drawable.bctiv2);
        }
        if(key_for_the_activity==3){
            tvh.setText(R.string.string_startupBasicsN3);
            tvb1.setText(R.string.string_startupBasics31);
            tvb2.setText(R.string.string_startupBasics32);

            iv_pic.setImageResource(R.drawable.bctiv3);
        }
        if(key_for_the_activity==4){
            tvh.setText(R.string.string_startupBasicsN4);
            tvb1.setText(R.string.string_startupBasics41);
            tvb2.setText(R.string.string_startupBasics42);

            iv_pic.setImageResource(R.drawable.bctiv4);
        }
        if(key_for_the_activity==5){
            tvh.setText(R.string.string_startupBasicsN5);
            tvb1.setText(R.string.string_startupBasics51);
            tvb2.setText(R.string.string_startupBasics52);

            iv_pic.setImageResource(R.drawable.bctiv5);
        }
        if(key_for_the_activity==6){
            tvh.setText(R.string.string_startupBasicsN6);
            tvb1.setText(R.string.string_startupBasics61);
            tvb2.setText(R.string.string_startupBasics62);

            iv_pic.setImageResource(R.drawable.bctiv6);
        }
        if(key_for_the_activity==7){
            tvh.setText(R.string.string_startupBasicsN7);
            tvb1.setText(R.string.string_startupBasics71);
            tvb2.setText(R.string.string_startupBasics72);

            iv_pic.setImageResource(R.drawable.bctiv7);
        }
        if(key_for_the_activity==8){
            tvh.setText(R.string.string_startupBasicsN8);
            tvb1.setText(R.string.string_startupBasics81);
            tvb2.setText(R.string.string_startupBasics82);

            iv_pic.setImageResource(R.drawable.bctiv8);
        }



        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasicChaptersActivity.this, LBasicChaptersActivity.class);
                startActivity(intent);
            }
        });
        refreshAd1();
        refreshAd2();
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(BasicChaptersActivity.this, LBasicChaptersActivity.class);
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
        AdLoader.Builder builder = new AdLoader.Builder(this, getString(R.string.NATIVE_STATIC_AD_ID));

        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd unifiedNativeAd) {

                if (nativeAd1 != null) {
                    nativeAd1.destroy();
                }
                nativeAd1 = unifiedNativeAd;
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholderBCreal);
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
    private void refreshAd2() {
        AdLoader.Builder builder = new AdLoader.Builder(this, getString(R.string.NATIVE_VIDEO_AD_ID));

        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd unifiedNativeAd) {

                if (nativeAd2 != null) {
                    nativeAd2.destroy();
                }
                nativeAd2 = unifiedNativeAd;
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholderBCreal2);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView2(unifiedNativeAd, adView);
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis10);
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
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis10);
                cl_1.setVisibility(View.VISIBLE);
            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());

    }

}