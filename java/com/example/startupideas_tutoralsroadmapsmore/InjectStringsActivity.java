package com.example.startupideas_tutoralsroadmapsmore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.multidex.MultiDex;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
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

public class InjectStringsActivity extends AppCompatActivity {
    String bH, wN, sTP, bTP, httptbs;
    char iN;
    TextView bhTV, wnTV, stpTV, btpTV, inTV, httptbsTV, name2, txtOnline;
    ImageView iv;
    WebView webView;
    Button btn;
    ProgressBar progress;  //InterstitialAd interstitialStaticAd;
    boolean tf;
    private InterstitialAd interstitialVideoAd, interstitialStaticAd;
    NativeAd nativeAd;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inject_strings);

        getSupportActionBar().hide();
        Bundle extras = getIntent().getExtras();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }


        if(extras!=null){
            bH = extras.getString("boldHeadline");
            wN = extras.getString("writerName");
            sTP =  extras.getString("sTextPlain");
            bTP =  extras.getString("bTextPlain");
            iN =  extras.getChar("imageNumber");
            httptbs =  extras.getString("httpTBS");
        }

        back=findViewById(R.id.backInject);
        bhTV =findViewById(R.id.tvb1header);
        wnTV = findViewById(R.id.tvn1);
        stpTV = findViewById(R.id.tvstp2);
        btpTV = findViewById(R.id.tvbis3);
        iv=findViewById(R.id.ivP);
        name2 = findViewById(R.id.tvn2);
        webView = findViewById(R.id.wvwebcommon_id);
        btn=findViewById(R.id.btn);
        progress=findViewById(R.id.iCPB);
        txtOnline = findViewById(R.id.txtOnline);



        progress.setVisibility(View.GONE);
        txtOnline.setVisibility(View.GONE);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InjectStringsActivity.this, activity_navigation_drawer.class);
                startActivity(intent);
            }
        });
        //1
        if(iN=='a'){
            iv.setImageResource(R.drawable.amanda_richardson);
        }
        //2
        if(iN=='b'){
            iv.setImageResource(R.drawable.john_jantsch);
        }
        //3
        if(iN=='c'){
            iv.setImageResource(R.drawable.patrick_campbell);
        }
        //4
        if(iN=='d'){
            iv.setImageResource(R.drawable.maggie_leung);
        }
        //5
        if(iN=='e'){
            iv.setImageResource(R.drawable.joanna_wiebe);
        }
        //6
        if(iN=='f'){
            iv.setImageResource(R.drawable.jason_fried);
        }
        //7
        if(iN=='g'){
            iv.setImageResource(R.drawable.chris_von_wilpert);
        }
        //8
        if(iN=='h'){
            iv.setImageResource(R.drawable.matthew_barby);
        }
        //9
        if(iN=='i'){
            iv.setImageResource(R.drawable.janet_choi);
        }

        bhTV.setText(bH);
        wnTV.setText(wN);
        stpTV.setText(sTP);
        btpTV.setText(bTP);
        name2.setText(wN);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

                //Showing a simple Toast Message to the user when The Google AdMob Sdk Initialization is Completed

            }
        });

        loadVideoInterstitialAd();
        loadStaticImageInterstitialAd();







        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//if connection unavailable
                boolean haveConnectedWifi = false;
                boolean haveConnectedMobile = false;

                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo[] netInfo = cm.getAllNetworkInfo();
                for (NetworkInfo ni : netInfo) {
                    if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                        if (ni.isConnected())
                            haveConnectedWifi = true;
                    if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                        if (ni.isConnected())
                            haveConnectedMobile = true;
                }
                tf= haveConnectedWifi || haveConnectedMobile;

                loadVideoInterstitialAd();
                loadStaticImageInterstitialAd();
                if(tf==false) {
                    Snackbar.make(view, "Please Check Your Internet Connection!!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else {


                    if (interstitialStaticAd != null) {

                        interstitialStaticAd.show(InjectStringsActivity.this);


                    } else {
                        //if connection established
                        Toast.makeText(getApplicationContext(), "Loading Content", Toast.LENGTH_SHORT).show();
                        webView.getSettings().setJavaScriptEnabled(true); // enable javascript
                        webView.getSettings().setLoadWithOverviewMode(true);
                        webView.getSettings().setUseWideViewPort(true);

                        webView.setWebViewClient(new WebViewClient() {

                            @Override
                            public void onPageStarted(WebView view, String url, Bitmap facIcon) {
                                //showProgressBar();
                                progress.setVisibility(View.VISIBLE);
                                txtOnline.setVisibility(View.VISIBLE);
                            }

                            @Override
                            public void onPageFinished(WebView view, String url) {
                                // hideProgressBar();
                                super.onPageFinished(view, url);
                                progress.setVisibility(View.GONE);
                                txtOnline.setVisibility(View.GONE);

                                Toast.makeText(getApplicationContext(), "Articles ready!!\nScroll down", Toast.LENGTH_SHORT).show();

                            }
                        });
                        //if connection established
                        webView.loadUrl(httptbs);


                    }

                }

            }
        });


        refreshAd();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onBackPressed() {

        if(interstitialVideoAd!=null){
            interstitialVideoAd.show(this );
        }else{
            Intent intent = new Intent(InjectStringsActivity.this, activity_navigation_drawer.class);
            startActivity(intent);
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
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholderInject);
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

            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());

    }

    private void loadVideoInterstitialAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(
                this,
                 getString(R.string.NATIVE_VIDEO_AD_ID),
                adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        InjectStringsActivity.this.interstitialVideoAd = interstitialAd;
                        interstitialAd.setFullScreenContentCallback(
                                new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when fullscreen content is dismissed.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        InjectStringsActivity.this.interstitialVideoAd = null;
                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when fullscreen content failed to show.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        InjectStringsActivity.this.interstitialVideoAd = null;
                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        // Called when fullscreen content is shown.
                                    }
                                });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        interstitialVideoAd = null;

                        String error = String.format("domain: %s, code: %d, message: %s", loadAdError.getDomain(), loadAdError.getCode(), loadAdError.getMessage());

                    }
                });
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
                        InjectStringsActivity.this.interstitialStaticAd = interstitialAd;
                        interstitialAd.setFullScreenContentCallback(
                                new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when fullscreen content is dismissed.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        InjectStringsActivity.this.interstitialStaticAd = null;
                                        //if connection established
                                        Toast.makeText(getApplicationContext(), "Loading Content", Toast.LENGTH_SHORT).show();
                                        webView.getSettings().setJavaScriptEnabled(true); // enable javascript
                                        webView.getSettings().setLoadWithOverviewMode(true);
                                        webView.getSettings().setUseWideViewPort(true);

                                        webView.setWebViewClient(new WebViewClient() {

                                            @Override
                                            public void onPageStarted(WebView view, String url, Bitmap facIcon) {
                                                //showProgressBar();
                                                progress.setVisibility(View.VISIBLE);
                                                txtOnline.setVisibility(View.VISIBLE);
                                            }

                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                // hideProgressBar();
                                                super.onPageFinished(view, url);
                                                progress.setVisibility(View.GONE);
                                                txtOnline.setVisibility(View.GONE);

                                                Toast.makeText(getApplicationContext(), "Articles ready!!\nScroll down", Toast.LENGTH_SHORT).show();

                                            }
                                        });
                                        //if connection established
                                        webView.loadUrl(httptbs);

                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when fullscreen content failed to show.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        InjectStringsActivity.this.interstitialStaticAd = null;
                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        // Called when fullscreen content is shown.


                                    }
                                });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        interstitialStaticAd = null;

                        //            String error = String.format("domain: %s, code: %d, message: %s", loadAdError.getDomain(), loadAdError.getCode(), loadAdError.getMessage());

                    }
                });
    }



}