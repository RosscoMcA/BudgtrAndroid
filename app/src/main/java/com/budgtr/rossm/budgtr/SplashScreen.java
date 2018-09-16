package com.budgtr.rossm.budgtr;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        setTheme(R.style.Theme_AppCompat_NoActionBar);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent transferTo = new Intent(SplashScreen.this, MainActivity.class );
                SplashScreen.this.startActivity(transferTo);
                SplashScreen.this.finish();
            }

        },1000);
    }
}
