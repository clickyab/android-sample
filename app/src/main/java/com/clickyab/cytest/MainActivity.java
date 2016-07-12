package com.clickyab.cytest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.clickyab.Banner;
import com.clickyab.ClickYabBannerAdListener;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banner  banner = (Banner) findViewById(R.id.banner_ad_view);
        banner.setClickYabBannerAdListener(new ClickYabBannerAdListener() {
            @Override
            public void onLoad(boolean b) {
                if (b) {
                    //Banner Has Advertise
                } else {
                    //Banner Has not any Advertise
                }
            }
        });
    }
}
