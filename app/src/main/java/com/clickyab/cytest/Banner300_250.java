package com.clickyab.cytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.clickyab.ClickYabAdListener;
import com.clickyab.LargeBanner;

public class Banner300_250 extends Activity {

    private static final String TAG = Banner300_250.class.getSimpleName();
    LargeBanner largeBanner;

    private void initView() {
        largeBanner = (LargeBanner) findViewById(R.id.largeBanner);
        largeBanner.setClickYabAdListener(new ClickYabAdListener() {
            @Override
            public void onNoAds() {
                Toast.makeText(getApplicationContext(), "این سایز بنر حاوی تبلیغ نمی باشد", Toast.LENGTH_LONG).show();
                Banner300_250.this.finish();
                startActivity(new Intent(Banner300_250.this, MainActivity.class));
            }

            @Override
            public void onClose() {
                Toast.makeText(getApplicationContext(),"بنر در حال بسته شدن است",Toast.LENGTH_SHORT).show();
                Banner300_250.this.finish();
                startActivity(new Intent(Banner300_250.this, MainActivity.class));
            }

            @Override
            public void onOpen() {
                Toast.makeText(getApplicationContext(), "بنر حاوی تبلیغ است", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner300_250);
        initView();
        Toast.makeText(getApplicationContext(), "بنر در حال بارگزاری است", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Banner300_250.this.finish();
        startActivity(new Intent(Banner300_250.this, MainActivity.class));
    }
}
