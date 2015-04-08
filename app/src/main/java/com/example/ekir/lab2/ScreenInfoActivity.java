package com.example.ekir.lab2;

import com.example.ekir.lab2.util.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.example.ekir.lab2.R;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class ScreenInfoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screen_info);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        TextView out = (TextView)findViewById(R.id.txt_MetricsOutput);
        String output="";
        output+="Density: "+Float.toString(metrics.density)+"\n";
        output+="Density DPI: "+Integer.toString(metrics.densityDpi)+"\n";
        output+="Scaled density: "+Float.toString(metrics.scaledDensity)+"\n";
        output+="Width: "+Integer.toString(metrics.widthPixels)+"\n";
        output+="Height: "+Integer.toString(metrics.heightPixels);

        out.setText(output);
    }
}
