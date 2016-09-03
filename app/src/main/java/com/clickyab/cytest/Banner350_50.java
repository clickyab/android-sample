package com.clickyab.cytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.clickyab.Banner;
import com.clickyab.ClickYabAdListener;

public class Banner350_50 extends Activity {
    Banner banner;

    private void initView() {
        banner = (Banner)findViewById(R.id.banner);
        banner.setClickYabAdListener(new ClickYabAdListener() {
            @Override
            public void onLoadFinished() {
                Toast.makeText(getApplicationContext(),"بنر حاوی تبلیغ است",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNoAds() {
                Toast.makeText(getApplicationContext(),"این سایز بنر حاوی تبلیغ نمی باشد",Toast.LENGTH_LONG).show();
                Banner350_50.this.finish();
                startActivity(new Intent(Banner350_50.this, MainActivity.class));
            }

            @Override
            public void onClose() {
                Toast.makeText(getApplicationContext(),"بنر در حال بسته شدن است",Toast.LENGTH_SHORT).show();
                Banner350_50.this.finish();
                startActivity(new Intent(Banner350_50.this, MainActivity.class));
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner350_50);
        initView();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Banner350_50.this.finish();
        startActivity(new Intent(Banner350_50.this, MainActivity.class));
    }
}
