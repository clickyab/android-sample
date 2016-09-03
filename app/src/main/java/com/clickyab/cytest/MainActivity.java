package com.clickyab.cytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.clickyab.ClickYabAdListener;
import com.clickyab.ClickYabFullAd;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    Button btn350_50, btn300_250, btn320_480, btnFull;

    private void initView() {
        btn350_50 = (Button) findViewById(R.id.btn350_50);
        btn350_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
                startActivity(new Intent(MainActivity.this, Banner350_50.class));
            }
        });

        btn300_250 = (Button) findViewById(R.id.btn300_250);
        btn300_250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
                startActivity(new Intent(MainActivity.this, Banner300_250.class));
            }
        });

        btn320_480 = (Button) findViewById(R.id.btn320_480);
        btn320_480.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
                startActivity(new Intent(MainActivity.this, Banner320_480.class));
            }
        });

        btnFull = (Button) findViewById(R.id.btnFull);
        btnFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ClickYabFullAd myads = new ClickYabFullAd(MainActivity.this , "14dfcf577a0ac50d58b73ef2d2b9101a",
                new ClickYabAdListener() {
                    @Override
                    public void onLoadFinished() {
                        Toast.makeText(getApplicationContext(), "بنر حاوی تبلیغ است", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onNoAds() {
                        Toast.makeText(getApplicationContext(), "این سایز بنر حاوی تبلیغ نمی باشد", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onClose() {
                        Toast.makeText(getApplicationContext(),"بنر در حال بسته شدن است",Toast.LENGTH_SHORT).show();
                    }
                });
                myads.show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
}
