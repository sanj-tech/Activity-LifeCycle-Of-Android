package com.jsstech.activitylifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("oncreate called","oncreate block");
    }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d("calling start","start block");

        }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("calling resume","resume block");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("pause start","pause block");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stop ","stop block");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("calling destory","destroy block");
    }
}
