package com.example.ekir.lab2;

import com.example.ekir.lab2.util.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import com.example.ekir.lab2.R;

import java.util.Random;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see com.example.ekir.lab2.util.SystemUiHider
 */
public class DrawCirclesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new CirclesView(this));


    }

    public class CirclesView extends View {

        public CirclesView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.GREEN);
            Paint paint = new Paint();
            Random rand = new Random();
            int screen_width=800;
            int screen_height=800;
            for(int i=0;i<50;i++) {
                paint.setColor(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
                canvas.drawCircle(rand.nextInt(screen_width), rand.nextInt(screen_height), 50, paint);
            }
        }
    }
}
