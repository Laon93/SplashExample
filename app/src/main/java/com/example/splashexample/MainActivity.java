package com.example.splashexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // splash start
        Intent intent = new Intent( this, SplashActivity.class);
        startActivity( intent );

        setTheme( R.style.AppTheme );
        setContentView(R.layout.activity_main);
    }
}
