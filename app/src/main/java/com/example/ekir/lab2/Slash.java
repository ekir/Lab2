package com.example.ekir.lab2;

import com.example.ekir.lab2.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class Slash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int k = 3;
        setContentView(R.layout.activity_slash);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            public void run() {

                // make sure we close the splash screen so the user won't come back when it presses back key

                finish();
                Intent intent = new Intent(Slash.this, MainActivity.class);
                Slash.this.startActivity(intent);
            }

        }, 2000);
    }
}
