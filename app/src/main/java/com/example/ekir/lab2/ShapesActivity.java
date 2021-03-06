package com.example.ekir.lab2;

import com.example.ekir.lab2.util.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import com.example.ekir.lab2.R;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class ShapesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new ShapesView(this));
    }

    public class ShapesView extends View {

        public ShapesView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.RED);

            Paint paint = new Paint();
            paint.setColor(Color.BLUE);




            canvas.drawRect(100, 200, 150, 250, paint );


            Path path = new Path();
            path.moveTo(10, 300);
            path.lineTo(10, 400);
            path.lineTo(canvas.getWidth(), 400);
            path.close();

            canvas.drawPath(path, paint);
        }
    }
}
