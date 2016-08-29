package com.clickyab.cytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.clickyab.ClickYabAdListener;
import com.clickyab.XlargeBannerPortrait;

public class Banner320_480 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner320_480);
        Toast.makeText(getApplicationContext(),"بنر در حال بارگزاری است",Toast.LENGTH_SHORT).show();
        XlargeBannerPortrait banner = (XlargeBannerPortrait) findViewById(R.id.xlargeBannerPortrait);

        banner.setClickYabAdListener(new ClickYabAdListener() {
            @Override
            public void onNoAds() {
                Toast.makeText(getApplicationContext(), "این سایز بنر حاوی تبلیغ نمی باشد", Toast.LENGTH_LONG).show();
                Banner320_480.this.finish();
                startActivity(new Intent(Banner320_480.this, MainActivity.class));
            }

            @Override
            public void onClose() {
                Toast.makeText(getApplicationContext(),"بنر در حال بسته شدن است",Toast.LENGTH_SHORT).show();
                Banner320_480.this.finish();
                startActivity(new Intent(Banner320_480.this, MainActivity.class));
            }

            @Override
            public void onOpen() {
                Toast.makeText(getApplicationContext(), "بنر حاوی تبلیغ است", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Banner320_480.this.finish();
        startActivity(new Intent(Banner320_480.this, MainActivity.class));
    }
}
