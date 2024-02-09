package com.example.startupideas_tutoralsroadmapsmore;

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

public class ScrollingActivity extends AppCompatActivity {
//    ConstraintLayout liCLRP1, liCLRP2, liCLRP3, liCLRP4, liCLRP5, liCLRP6, liCLRP7, liCLRP8, liCLRP9, liCLRP10, liCLRP11, liCLRP12, liCLRP13, liCLRP14, liCLRP15, liCLRP16, liCLRP17, liCLRP18, liCLRP19, liCLRP20, liCLRP21, liCLRP22, liCLRP23, liCLRP24, liCLRP25, liCLRP26, liCLRP27, liCLRP28, liCLRP29, liCLRP30, liCLRP31, liCLRP32, liCLRP33, liCLRP34, liCLRP35, liCLRP36, liCLRP37, liCLRP38, liCLRP39, liCLRP40, liCLRP41, liCLRP42, liCLRP43, liCLRP44, liCLRP45, liCLRP46, liCLRP47, liCLRP48, liCLRP49, liCLRP50, liCLRP51, liCLRP52, liCLRP53, liCLRP54, liCLRP55, liCLRP56, liCLRP57, liCLRP58, liCLRP59, liCLRP60, liCLRP61, liCLRP62, liCLRP63, liCLRP64, liCLRP65, liCLRP66, liCLRP67, liCLRP68, liCLRP69, liCLRP70, liCLRP71, liCLRP72, liCLRP73, liCLRP74;
//    boolean yesorno1, yesorno2, yesorno3, yesorno4, yesorno5, yesorno6, yesorno7, yesorno8, yesorno9, yesorno10, yesorno11, yesorno12, yesorno13, yesorno14, yesorno15, yesorno16, yesorno17, yesorno18, yesorno19, yesorno20, yesorno21, yesorno22, yesorno23, yesorno24, yesorno25, yesorno26, yesorno27, yesorno28, yesorno29, yesorno30, yesorno31, yesorno32, yesorno33, yesorno34, yesorno35, yesorno36, yesorno37, yesorno38, yesorno39, yesorno40, yesorno41, yesorno42, yesorno43, yesorno44, yesorno45, yesorno46, yesorno47, yesorno48, yesorno49, yesorno50, yesorno51, yesorno52, yesorno53, yesorno54, yesorno55, yesorno56, yesorno57, yesorno58, yesorno59, yesorno60, yesorno61, yesorno62, yesorno63, yesorno64, yesorno65, yesorno66, yesorno67, yesorno68, yesorno69, yesorno70, yesorno71, yesorno72, yesorno73, yesorno74, yesorno75, yesorno76, yesorno77, yesorno78;

    NativeAd nativeAd1, nativeAd2, nativeAd3;
    int tiINT;
    int tiCHAR;
     TextView thTV, tshTV, tB;
    LinearLayout goBack, goHome;
    ImageView toolBarIV;//Top Image

    ImageView iv_back_scroll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        getSupportActionBar().hide();



        tiINT = getIntent().getExtras().getInt("keyI_MISA", 1);
        tiCHAR = getIntent().getExtras().getInt("keyI_RPSA", 101);

        Toast.makeText(getApplicationContext(), "Loading raw data, please wait!", Toast.LENGTH_LONG).show();


        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.status_redChapters_basicnZTO));
        }
        //------------------------------------------ ~~ Bookmarked Icon ~~ ----------------------------------------------------

        //------------------------------------------------------------------ ~~ Button Jump To Home ~~ ------------------------------------------------------------------
        iv_back_scroll=findViewById(R.id.backScrolling);
        iv_back_scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int vu = preferences.getInt("sp_scrollAct", 1);



                if(vu==1){
                    Intent intent = new Intent(ScrollingActivity.this, EA_ts_1.class);
                    startActivity(intent);
                }  if(vu==2){
                    Intent intent = new Intent(ScrollingActivity.this, DuplicateActivity.class);
                    startActivity(intent);
                }  if(vu==3){
                    Intent intent = new Intent(ScrollingActivity.this, EA_ts_3.class);
                    startActivity(intent);
                }  if(vu==4){
                    Intent intent = new Intent(ScrollingActivity.this, EA_ts_4.class);
                    startActivity(intent);
                }  if(vu==6){
                    Intent intent = new Intent(ScrollingActivity.this, SearchActivity.class);
                    startActivity(intent);
                }
            }
        });
        goHome=findViewById(R.id.goHome);
        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollingActivity.this, activity_navigation_drawer.class);
                startActivity(intent);
            }
        });

        goBack=findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                int va = preferences.getInt("sp_scrollAct", 1);



                if(va==1){
                    Intent intent = new Intent(ScrollingActivity.this, EA_ts_1.class);
                    startActivity(intent);
                } if(va==2){
                    Intent intent = new Intent(ScrollingActivity.this, DuplicateActivity.class);
                    startActivity(intent);
                } if(va==3){
                    Intent intent = new Intent(ScrollingActivity.this, EA_ts_3.class);
                    startActivity(intent);
                } if(va==4){
                    Intent intent = new Intent(ScrollingActivity.this, EA_ts_4.class);
                    startActivity(intent);
                } if(va==6){
                    Intent intent = new Intent(ScrollingActivity.this, SearchActivity.class);
                    startActivity(intent);
                }
            }
        });

        //------------------------------------- ~~Top Head, Top Sub Header, & Body~~ ------------------------------------------------------------
        thTV = findViewById(R.id.head_SATV_L);
        tshTV = findViewById(R.id.head_SATV_S);
        tB = findViewById(R.id.tv_SABody);

        //------------------------------------ ~~ Top ImageView ~~ ----------------------------
        toolBarIV=findViewById(R.id.SCV_TB_collapseimageid);



        // ------------------------------------ ~~  Top Header, Top Sub Header & Text Body  ~~ --------------------------------------------------------------------
        //decide for the Top ImageView, String and the Textview including:  top bar image, top header, top sub header, & Text Body
        if(tiINT == 1){
            toolBarIV.setImageResource(R.drawable.samng1);
            thTV.setText(getString(R.string.SA_stringTH1));
            tshTV.setText(getString(R.string.SA_stringTSH1));
            tB.setText(getString(R.string.SA_stringTB1));
        }
        if(tiINT == 2){
            toolBarIV.setImageResource(R.drawable.samng2);

            thTV.setText(getString(R.string.SA_stringTH2));
            tshTV.setText(getString(R.string.SA_stringTSH2));
            tB.setText(getString(R.string.SA_stringTB2));
        }
        if(tiINT == 3){
            toolBarIV.setImageResource(R.drawable.samng3);

            thTV.setText(getString(R.string.SA_stringTH3));
            tshTV.setText(getString(R.string.SA_stringTSH3));
            tB.setText(getString(R.string.SA_stringTB3));
        }
        if(tiINT == 4){
            toolBarIV.setImageResource(R.drawable.samng4);

            thTV.setText(getString(R.string.SA_stringTH4));
            tshTV.setText(getString(R.string.SA_stringTSH4));
            tB.setText(getString(R.string.SA_stringTB4));
        }
        if(tiINT == 6){
            toolBarIV.setImageResource(R.drawable.samng6);

            thTV.setText(getString(R.string.SA_stringTH6));
            tshTV.setText(getString(R.string.SA_stringTSH6));
            tB.setText(getString(R.string.SA_stringTB6));
        }
        if(tiINT == 5){
            toolBarIV.setImageResource(R.drawable.samng5);

            thTV.setText(getString(R.string.SA_stringTH5));
            tshTV.setText(getString(R.string.SA_stringTSH5));
            tB.setText(getString(R.string.SA_stringTB5));
        }
        if(tiINT == 6){
            toolBarIV.setImageResource(R.drawable.samng6);

            thTV.setText(getString(R.string.SA_stringTH6));
            tshTV.setText(getString(R.string.SA_stringTSH6));
            tB.setText(getString(R.string.SA_stringTB6));
        }
        if(tiINT == 7){
            toolBarIV.setImageResource(R.drawable.samng7);

            thTV.setText(getString(R.string.SA_stringTH7));
            tshTV.setText(getString(R.string.SA_stringTSH7));
            tB.setText(getString(R.string.SA_stringTB7));
        }
        if(tiINT == 8){
            toolBarIV.setImageResource(R.drawable.samng8);

            thTV.setText(getString(R.string.SA_stringTH8));
            tshTV.setText(getString(R.string.SA_stringTSH8));
            tB.setText(getString(R.string.SA_stringTB8));
        }
        if(tiINT == 9){
            toolBarIV.setImageResource(R.drawable.samng9);

            thTV.setText(getString(R.string.SA_stringTH9));
            tshTV.setText(getString(R.string.SA_stringTSH9));
            tB.setText(getString(R.string.SA_stringTB9));
        }
        if(tiINT == 10){
            toolBarIV.setImageResource(R.drawable.samng10);

            thTV.setText(getString(R.string.SA_stringTH10));
            tshTV.setText(getString(R.string.SA_stringTSH10));
            tB.setText(getString(R.string.SA_stringTB10));
        }
        if(tiINT == 11){
            toolBarIV.setImageResource(R.drawable.samng11);

            thTV.setText(getString(R.string.SA_stringTH11));
            tshTV.setText(getString(R.string.SA_stringTSH11));
            tB.setText(getString(R.string.SA_stringTB11));
        }
        if(tiINT == 12){
            toolBarIV.setImageResource(R.drawable.samng12);

            thTV.setText(getString(R.string.SA_stringTH12));
            tshTV.setText(getString(R.string.SA_stringTSH12));
            tB.setText(getString(R.string.SA_stringTB12));
        }
        if(tiINT == 13){
            toolBarIV.setImageResource(R.drawable.samng13);

            thTV.setText(getString(R.string.SA_stringTH13));
            tshTV.setText(getString(R.string.SA_stringTSH13));
            tB.setText(getString(R.string.SA_stringTB13));
        }
        if(tiINT == 14){
            toolBarIV.setImageResource(R.drawable.samng14);

            thTV.setText(getString(R.string.SA_stringTH14));
            tshTV.setText(getString(R.string.SA_stringTSH14));
            tB.setText(getString(R.string.SA_stringTB14));
        }
        if(tiINT == 15){
            toolBarIV.setImageResource(R.drawable.samng15);

            thTV.setText(getString(R.string.SA_stringTH15));
            tshTV.setText(getString(R.string.SA_stringTSH15));
            tB.setText(getString(R.string.SA_stringTB15));
        }
        if(tiINT == 16){
            toolBarIV.setImageResource(R.drawable.samng16);

            thTV.setText(getString(R.string.SA_stringTH16));
            tshTV.setText(getString(R.string.SA_stringTSH16));
            tB.setText(getString(R.string.SA_stringTB16));
        }
        if(tiINT == 17){
            toolBarIV.setImageResource(R.drawable.samng17);

            thTV.setText(getString(R.string.SA_stringTH17));
            tshTV.setText(getString(R.string.SA_stringTSH17));
            tB.setText(getString(R.string.SA_stringTB17));
        }
        if(tiINT == 18){
            toolBarIV.setImageResource(R.drawable.samng18);

            thTV.setText(getString(R.string.SA_stringTH18));
            tshTV.setText(getString(R.string.SA_stringTSH18));
            tB.setText(getString(R.string.SA_stringTB18));
        }
        if(tiINT == 19){
            toolBarIV.setImageResource(R.drawable.samng19);

            thTV.setText(getString(R.string.SA_stringTH19));
            tshTV.setText(getString(R.string.SA_stringTSH19));
            tB.setText(getString(R.string.SA_stringTB19));
        }
        if(tiINT == 20){
            toolBarIV.setImageResource(R.drawable.samng20);

            thTV.setText(getString(R.string.SA_stringTH20));
            tshTV.setText(getString(R.string.SA_stringTSH20));
            tB.setText(getString(R.string.SA_stringTB20));
        }
        if(tiINT == 21){
            toolBarIV.setImageResource(R.drawable.samng21);

            thTV.setText(getString(R.string.SA_stringTH21));
            tshTV.setText(getString(R.string.SA_stringTSH21));
            tB.setText(getString(R.string.SA_stringTB21));
        }
        if(tiINT == 22){
            toolBarIV.setImageResource(R.drawable.samng22);

            thTV.setText(getString(R.string.SA_stringTH22));
            tshTV.setText(getString(R.string.SA_stringTSH22));
            tB.setText(getString(R.string.SA_stringTB22));
        }
        if(tiINT == 23){
            toolBarIV.setImageResource(R.drawable.samng23);

            thTV.setText(getString(R.string.SA_stringTH23));
            tshTV.setText(getString(R.string.SA_stringTSH23));
            tB.setText(getString(R.string.SA_stringTB23));
        }
        if(tiINT == 24){
            toolBarIV.setImageResource(R.drawable.samng24);

            thTV.setText(getString(R.string.SA_stringTH24));
            tshTV.setText(getString(R.string.SA_stringTSH24));
            tB.setText(getString(R.string.SA_stringTB24));
        }
        if(tiINT == 25){
            toolBarIV.setImageResource(R.drawable.samng25);

            thTV.setText(getString(R.string.SA_stringTH25));
            tshTV.setText(getString(R.string.SA_stringTSH25));
            tB.setText(getString(R.string.SA_stringTB25));
        }
        if(tiINT == 26){
            toolBarIV.setImageResource(R.drawable.samng26);

            thTV.setText(getString(R.string.SA_stringTH26));
            tshTV.setText(getString(R.string.SA_stringTSH26));
            tB.setText(getString(R.string.SA_stringTB26));
        }
        if(tiINT == 27){
            toolBarIV.setImageResource(R.drawable.samng27);

            thTV.setText(getString(R.string.SA_stringTH27));
            tshTV.setText(getString(R.string.SA_stringTSH27));
            tB.setText(getString(R.string.SA_stringTB27));
        }
        if(tiINT == 28){
            toolBarIV.setImageResource(R.drawable.samng28);

            thTV.setText(getString(R.string.SA_stringTH28));
            tshTV.setText(getString(R.string.SA_stringTSH28));
            tB.setText(getString(R.string.SA_stringTB28));
        }
        if(tiINT == 29){
            toolBarIV.setImageResource(R.drawable.samng29);

            thTV.setText(getString(R.string.SA_stringTH29));
            tshTV.setText(getString(R.string.SA_stringTSH29));
            tB.setText(getString(R.string.SA_stringTB29));
        }
        if(tiINT == 30){
            toolBarIV.setImageResource(R.drawable.samng30);

            thTV.setText(getString(R.string.SA_stringTH30));
            tshTV.setText(getString(R.string.SA_stringTSH30));
            tB.setText(getString(R.string.SA_stringTB30));
        }
        if(tiINT == 31){
            toolBarIV.setImageResource(R.drawable.samng31);

            thTV.setText(getString(R.string.SA_stringTH31));
            tshTV.setText(getString(R.string.SA_stringTSH31));
            tB.setText(getString(R.string.SA_stringTB31));
        }
        if(tiINT == 32){
            toolBarIV.setImageResource(R.drawable.samng32);

            thTV.setText(getString(R.string.SA_stringTH32));
            tshTV.setText(getString(R.string.SA_stringTSH32));
            tB.setText(getString(R.string.SA_stringTB32));
        }
        if(tiINT == 33){
            toolBarIV.setImageResource(R.drawable.samng33);

            thTV.setText(getString(R.string.SA_stringTH33));
            tshTV.setText(getString(R.string.SA_stringTSH33));
            tB.setText(getString(R.string.SA_stringTB33));
        }
        if(tiINT == 34){
            toolBarIV.setImageResource(R.drawable.samng34);

            thTV.setText(getString(R.string.SA_stringTH34));
            tshTV.setText(getString(R.string.SA_stringTSH34));
            tB.setText(getString(R.string.SA_stringTB34));
        }
        if(tiINT == 35){
            toolBarIV.setImageResource(R.drawable.samng35);

            thTV.setText(getString(R.string.SA_stringTH35));
            tshTV.setText(getString(R.string.SA_stringTSH35));
            tB.setText(getString(R.string.SA_stringTB35));
        }
        if(tiINT == 36){
            toolBarIV.setImageResource(R.drawable.samng36);

            thTV.setText(getString(R.string.SA_stringTH36));
            tshTV.setText(getString(R.string.SA_stringTSH36));
            tB.setText(getString(R.string.SA_stringTB36));
        }
        if(tiINT == 37){
            toolBarIV.setImageResource(R.drawable.samng37);

            thTV.setText(getString(R.string.SA_stringTH37));
            tshTV.setText(getString(R.string.SA_stringTSH37));
            tB.setText(getString(R.string.SA_stringTB37));
        }
        if(tiINT == 38){
            toolBarIV.setImageResource(R.drawable.samng38);

            thTV.setText(getString(R.string.SA_stringTH38));
            tshTV.setText(getString(R.string.SA_stringTSH38));
            tB.setText(getString(R.string.SA_stringTB38));
        }
        if(tiINT == 40){
            toolBarIV.setImageResource(R.drawable.samng40);

            thTV.setText(getString(R.string.SA_stringTH40));
            tshTV.setText(getString(R.string.SA_stringTSH40));
            tB.setText(getString(R.string.SA_stringTB40));
        }
        if(tiINT == 41){
            toolBarIV.setImageResource(R.drawable.samng41);

            thTV.setText(getString(R.string.SA_stringTH41));
            tshTV.setText(getString(R.string.SA_stringTSH41));
            tB.setText(getString(R.string.SA_stringTB41));
        }
        if(tiINT == 42){
            toolBarIV.setImageResource(R.drawable.samng42);

            thTV.setText(getString(R.string.SA_stringTH42));
            tshTV.setText(getString(R.string.SA_stringTSH42));
            tB.setText(getString(R.string.SA_stringTB42));
        }
        if(tiINT == 43){
            toolBarIV.setImageResource(R.drawable.samng43);

            thTV.setText(getString(R.string.SA_stringTH43));
            tshTV.setText(getString(R.string.SA_stringTSH43));
            tB.setText(getString(R.string.SA_stringTB43));
        }
        if(tiINT == 44){
            toolBarIV.setImageResource(R.drawable.samng44);

            thTV.setText(getString(R.string.SA_stringTH44));
            tshTV.setText(getString(R.string.SA_stringTSH44));
            tB.setText(getString(R.string.SA_stringTB44));
        }
        if(tiINT == 45){
            toolBarIV.setImageResource(R.drawable.samng45);

            thTV.setText(getString(R.string.SA_stringTH45));
            tshTV.setText(getString(R.string.SA_stringTSH45));
            tB.setText(getString(R.string.SA_stringTB45));
        }
        if(tiINT == 46){
            toolBarIV.setImageResource(R.drawable.samng46);

            thTV.setText(getString(R.string.SA_stringTH46));
            tshTV.setText(getString(R.string.SA_stringTSH46));
            tB.setText(getString(R.string.SA_stringTB46));
        }
        if(tiINT == 47){
            toolBarIV.setImageResource(R.drawable.samng47);

            thTV.setText(getString(R.string.SA_stringTH47));
            tshTV.setText(getString(R.string.SA_stringTSH47));
            tB.setText(getString(R.string.SA_stringTB47));
        }
        if(tiINT == 48){
            toolBarIV.setImageResource(R.drawable.samng48);

            thTV.setText(getString(R.string.SA_stringTH48));
            tshTV.setText(getString(R.string.SA_stringTSH48));
            tB.setText(getString(R.string.SA_stringTB48));
        }
        if(tiINT == 49){
            toolBarIV.setImageResource(R.drawable.samng49);

            thTV.setText(getString(R.string.SA_stringTH49));
            tshTV.setText(getString(R.string.SA_stringTSH49));
            tB.setText(getString(R.string.SA_stringTB49));
        }
        if(tiINT == 50){
            toolBarIV.setImageResource(R.drawable.samng50);

            thTV.setText(getString(R.string.SA_stringTH50));
            tshTV.setText(getString(R.string.SA_stringTSH50));
            tB.setText(getString(R.string.SA_stringTB50));
        }
        if(tiINT == 51){
            toolBarIV.setImageResource(R.drawable.samng51);

            thTV.setText(getString(R.string.SA_stringTH51));
            tshTV.setText(getString(R.string.SA_stringTSH51));
            tB.setText(getString(R.string.SA_stringTB51));
        }
        if(tiINT == 52){
            toolBarIV.setImageResource(R.drawable.samng52);

            thTV.setText(getString(R.string.SA_stringTH52));
            tshTV.setText(getString(R.string.SA_stringTSH52));
            tB.setText(getString(R.string.SA_stringTB52));
        }
        if(tiINT == 53){
            toolBarIV.setImageResource(R.drawable.samng53);

            thTV.setText(getString(R.string.SA_stringTH53));
            tshTV.setText(getString(R.string.SA_stringTSH53));
            tB.setText(getString(R.string.SA_stringTB53));
        }
        if(tiINT == 54){
            toolBarIV.setImageResource(R.drawable.samng54);

            thTV.setText(getString(R.string.SA_stringTH54));
            tshTV.setText(getString(R.string.SA_stringTSH54));
            tB.setText(getString(R.string.SA_stringTB54));
        }
        if(tiINT == 56){
            toolBarIV.setImageResource(R.drawable.samng56);

            thTV.setText(getString(R.string.SA_stringTH56));
            tshTV.setText(getString(R.string.SA_stringTSH56));
            tB.setText(getString(R.string.SA_stringTB56));
        }
        if(tiINT == 57){
            toolBarIV.setImageResource(R.drawable.samng57);

            thTV.setText(getString(R.string.SA_stringTH57));
            tshTV.setText(getString(R.string.SA_stringTSH57));
            tB.setText(getString(R.string.SA_stringTB57));
        }
        if(tiINT == 58){
            toolBarIV.setImageResource(R.drawable.samng58);

            thTV.setText(getString(R.string.SA_stringTH58));
            tshTV.setText(getString(R.string.SA_stringTSH58));
            tB.setText(getString(R.string.SA_stringTB58));
        }
        if(tiINT == 59){
            toolBarIV.setImageResource(R.drawable.samng59);

            thTV.setText(getString(R.string.SA_stringTH59));
            tshTV.setText(getString(R.string.SA_stringTSH59));
            tB.setText(getString(R.string.SA_stringTB59));
        }
        if(tiINT == 60){
            toolBarIV.setImageResource(R.drawable.samng60);

            thTV.setText(getString(R.string.SA_stringTH60));
            tshTV.setText(getString(R.string.SA_stringTSH60));
            tB.setText(getString(R.string.SA_stringTB60));
        }
        if(tiINT == 61){
            toolBarIV.setImageResource(R.drawable.samng61);

            thTV.setText(getString(R.string.SA_stringTH61));
            tshTV.setText(getString(R.string.SA_stringTSH61));
            tB.setText(getString(R.string.SA_stringTB61));
        }
        if(tiINT == 62){
            toolBarIV.setImageResource(R.drawable.samng62);

            thTV.setText(getString(R.string.SA_stringTH62));
            tshTV.setText(getString(R.string.SA_stringTSH62));
            tB.setText(getString(R.string.SA_stringTB62));
        }
        if(tiINT == 63){
            toolBarIV.setImageResource(R.drawable.samng63);

            thTV.setText(getString(R.string.SA_stringTH63));
            tshTV.setText(getString(R.string.SA_stringTSH63));
            tB.setText(getString(R.string.SA_stringTB63));
        }
        if(tiINT == 64){
            toolBarIV.setImageResource(R.drawable.samng64);

            thTV.setText(getString(R.string.SA_stringTH64));
            tshTV.setText(getString(R.string.SA_stringTSH64));
            tB.setText(getString(R.string.SA_stringTB64));
        }

        if(tiINT == 65){
            toolBarIV.setImageResource(R.drawable.samng64);

            thTV.setText(getString(R.string.SA_stringTH65));
            tshTV.setText(getString(R.string.SA_stringTSH65));
            tB.setText(getString(R.string.SA_stringTB65));
        }

        if(tiINT == 67){
            toolBarIV.setImageResource(R.drawable.samng67);

            thTV.setText(getString(R.string.SA_stringTH67));
            tshTV.setText(getString(R.string.SA_stringTSH67));
            tB.setText(getString(R.string.SA_stringTB67));
        }
        if(tiINT == 68){
            toolBarIV.setImageResource(R.drawable.samng68);

            thTV.setText(getString(R.string.SA_stringTH68));
            tshTV.setText(getString(R.string.SA_stringTSH68));
            tB.setText(getString(R.string.SA_stringTB68));
        }
        if(tiINT == 69){
            toolBarIV.setImageResource(R.drawable.samng69);

            thTV.setText(getString(R.string.SA_stringTH69));
            tshTV.setText(getString(R.string.SA_stringTSH69));
            tB.setText(getString(R.string.SA_stringTB69));
        }
        if(tiINT == 70){
            toolBarIV.setImageResource(R.drawable.samng70);

            thTV.setText(getString(R.string.SA_stringTH70));
            tshTV.setText(getString(R.string.SA_stringTSH70));
            tB.setText(getString(R.string.SA_stringTB70));
        }
        if(tiINT == 71){
            toolBarIV.setImageResource(R.drawable.samng71);

            thTV.setText(getString(R.string.SA_stringTH71));
            tshTV.setText(getString(R.string.SA_stringTSH71));
            tB.setText(getString(R.string.SA_stringTB71));
        }
        if(tiINT == 72){
            toolBarIV.setImageResource(R.drawable.samng72);

            thTV.setText(getString(R.string.SA_stringTH72));
            tshTV.setText(getString(R.string.SA_stringTSH72));
            tB.setText(getString(R.string.SA_stringTB72));
        }
        if(tiINT == 73){
            toolBarIV.setImageResource(R.drawable.samng73);

            thTV.setText(getString(R.string.SA_stringTH73));
            tshTV.setText(getString(R.string.SA_stringTSH73));
            tB.setText(getString(R.string.SA_stringTB73));
        }
        if(tiINT == 74){
            toolBarIV.setImageResource(R.drawable.samng74);

            thTV.setText(getString(R.string.SA_stringTH74));
            tshTV.setText(getString(R.string.SA_stringTSH74));
            tB.setText(getString(R.string.SA_stringTB74));
        }
        if(tiINT == 75){
            toolBarIV.setImageResource(R.drawable.samng74);

            thTV.setText(getString(R.string.SA_stringTH75));
            tshTV.setText(getString(R.string.SA_stringTSH75));
            tB.setText(getString(R.string.SA_stringTB75));
        }
        if(tiINT == 76){
            toolBarIV.setImageResource(R.drawable.samng76);

            thTV.setText(getString(R.string.SA_stringTH76));
            tshTV.setText(getString(R.string.SA_stringTSH76));
            tB.setText(getString(R.string.SA_stringTB76));
        }
        if(tiINT == 77){
            toolBarIV.setImageResource(R.drawable.samng77);

            thTV.setText(getString(R.string.SA_stringTH77));
            tshTV.setText(getString(R.string.SA_stringTSH77));
            tB.setText(getString(R.string.SA_stringTB77));
        }
        if(tiINT == 78){
            toolBarIV.setImageResource(R.drawable.samng78);

            thTV.setText(getString(R.string.SA_stringTH78));
            tshTV.setText(getString(R.string.SA_stringTSH78));
            tB.setText(getString(R.string.SA_stringTB78));
        }




        refreshAd1();
//        refreshAd2();
        refreshAd3();

    }
    @Override
    public void onBackPressed(){

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int vae = preferences.getInt("sp_scrollAct", 1);

        if(vae==1){
            Intent intent = new Intent(ScrollingActivity.this, EA_ts_1.class);
            startActivity(intent);
        }  if(vae==2){
            Intent intent = new Intent(ScrollingActivity.this, DuplicateActivity.class);
            startActivity(intent);
        }  if(vae==3){
            Intent intent = new Intent(ScrollingActivity.this, EA_ts_3.class);
            startActivity(intent);
        }  if(vae==4){
            Intent intent = new Intent(ScrollingActivity.this, EA_ts_4.class);
            startActivity(intent);
        }  if(vae==6){
            Intent intent = new Intent(ScrollingActivity.this, SearchActivity.class);
            startActivity(intent);
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
    private void populateUnifiedNativeAdView3(NativeAd nativeAd, NativeAdView adView) {




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
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholder9q);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView1(unifiedNativeAd, adView);
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis7);
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
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis7);
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
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholder11q);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView2(unifiedNativeAd, adView);
//                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis8);
//                cl_1.setVisibility(View.GONE);
                frameLayout.removeAllViews();
                frameLayout.addView(adView);


            }
        }).build();

        NativeAdOptions adOptions = new NativeAdOptions.Builder().build();
        builder.withNativeAdOptions(adOptions);

        AdLoader adLoader = builder.withAdListener(new AdListener() {
            public void onAdFailedToLoad(int i) {
                Snackbar.make(findViewById(android.R.id.content),"Turn on Internet Connection\nfor the Best User Experience!",Snackbar.LENGTH_SHORT).show();
//                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis8);
//                cl_1.setVisibility(View.VISIBLE);
            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());

    }
    private void refreshAd3() {
        AdLoader.Builder builder = new AdLoader.Builder(this, getString(R.string.NATIVE_STATIC_AD_ID));

        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd unifiedNativeAd) {

                if (nativeAd2 != null) {
                    nativeAd3.destroy();
                }
                nativeAd3 = unifiedNativeAd;
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholder10);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.ad_unified, null);
                populateUnifiedNativeAdView3(unifiedNativeAd, adView);
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis9);
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
                ConstraintLayout cl_1 = findViewById(R.id.cl_ad_visinvis9);
                cl_1.setVisibility(View.VISIBLE);
            }
        }).build();

        adLoader.loadAd(new AdRequest.Builder().build());

    }


}