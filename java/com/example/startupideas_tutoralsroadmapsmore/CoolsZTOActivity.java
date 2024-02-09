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

public class CoolsZTOActivity extends AppCompatActivity {
    TextView tvh, tvb1, tvb2, tvb3;
    ImageView iv_pic1, iv_pic2;
    ImageView ivBack;
    int key ;

    NativeAd nativeAd1, nativeAd2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cools_ztoactivity);
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
        tvh=findViewById(R.id.tvHead_ZTO);
        tvb1=findViewById(R.id.tvBody_ZTO1);
        tvb2=findViewById(R.id.tvBody_ZTO2);
        tvb3=findViewById(R.id.tvBody_ZTO3);
        iv_pic1=findViewById(R.id.ivpicZTO1);
        iv_pic2=findViewById(R.id.ivpicZTO2);
        ivBack=findViewById(R.id.ivpicZTO_backiconreal);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CoolsZTOActivity.this, LCoolZTOActivity.class);
                startActivity(intent);
            }
        });

        key  = getIntent().getExtras().getInt("keyval_zto");


        if(key==1){
            tvh.setText(R.string.string_lcztoaivN1);
            tvb1.setText(R.string.string_lcztoaiv11);
            tvb2.setText(R.string.string_lcztoaiv12);
            tvb3.setText(R.string.string_lcztoaiv13);
            iv_pic1.setImageResource(R.drawable.lcztoaiv11);
            iv_pic2.setImageResource(R.drawable.lcztoaiv12);
        }
        if(key ==2){
            tvh.setText(R.string.string_lcztoaivN2);
            tvb1.setText(R.string.string_lcztoaiv21);
            tvb2.setText(R.string.string_lcztoaiv22);
            tvb3.setText(R.string.string_lcztoaiv23);
            iv_pic1.setImageResource(R.drawable.lcztoaiv2);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==3){
            tvh.setText(R.string.string_lcztoaivN3);
            tvb1.setText(R.string.string_lcztoaiv31);
            tvb2.setText(R.string.string_lcztoaiv32);
            tvb3.setText(R.string.string_lcztoaiv33);
            iv_pic1.setImageResource(R.drawable.lcztoaiv3);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==4){
            tvh.setText(R.string.string_lcztoaivN4);
            tvb1.setText(R.string.string_lcztoaiv41);
            tvb2.setText(R.string.string_lcztoaiv42);
            tvb3.setText(R.string.string_lcztoaiv43);
            iv_pic1.setImageResource(R.drawable.lcztoaiv4);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==5){
            tvh.setText(R.string.string_lcztoaivN5);
            tvb1.setText(R.string.string_lcztoaiv51);
            tvb2.setText(R.string.string_lcztoaiv52);
            tvb3.setText(R.string.string_lcztoaiv53);
            iv_pic1.setImageResource(R.drawable.lcztoaiv5);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==6){
            tvh.setText(R.string.string_lcztoaivN6);
            tvb1.setText(R.string.string_lcztoaiv61);
            tvb2.setText(R.string.string_lcztoaiv62);
            tvb3.setText(R.string.string_lcztoaiv63);
            iv_pic1.setImageResource(R.drawable.random_pic_backing);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==7){
            tvh.setText(R.string.string_lcztoaivN7);
            tvb1.setText(R.string.string_lcztoaiv71);
            tvb2.setText(R.string.string_lcztoaiv72);
            tvb3.setText(R.string.string_lcztoaiv73);
            iv_pic1.setImageResource(R.drawable.random_pic_backing);
            iv_pic2.setImageResource(R.drawable.random_pic_backing);
        }
        if(key ==8){
            tvh.setText(R.string.string_lcztoaivN8);
            tvb1.setText(R.string.string_lcztoaiv81);
            tvb2.setText(R.string.string_lcztoaiv82);
            tvb3.setText(R.string.string_lcztoaiv83);
            iv_pic1.setImageResource(R.drawable.lcztoaiv81);
            iv_pic2.setImageResource(R.drawable.lcztoaiv82);
        }
        if(key ==9){
            tvh.setText(R.string.string_lcztoaivN9);
            tvb1.setText(R.string.string_lcztoaiv91);
            tvb2.setText(R.string.string_lcztoaiv92);
            tvb3.setText(R.string.string_lcztoaiv93);
            iv_pic1.setImageResource(R.drawable.lcztoaiv91);
            iv_pic2.setImageResource(R.drawable.lcztoaiv92);
        }
        if(key ==10){
            tvh.setText(R.string.string_lcztoaivN10);
            tvb1.setText(R.string.string_lcztoaiv101);
            tvb2.setText(R.string.string_lcztoaiv102);
            tvb3.setText(R.string.string_lcztoaiv103);
            iv_pic1.setImageResource(R.drawable.lcztoaiv101);
            iv_pic2.setImageResource(R.drawable.lcztoaiv102);
        }

        refreshAd1();
        refreshAd2();
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(CoolsZTOActivity.this, LCoolZTOActivity.class);
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
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholderZTOreal);
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
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholderZTOreal2);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView2(unifiedNativeAd, adView);
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis11);
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
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis11);
                cl_1.setVisibility(View.GONE);
            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());

    }
}