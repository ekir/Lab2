package com.example.ekir.lab2;

import com.example.ekir.lab2.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import java.io.IOException;
import java.io.InputStream;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class DrawBitmapActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new BitmapView(this));

    }

    public class BitmapView extends View {
        Bitmap lion = null;

        public BitmapView(Context context) {
            super(context);
            lion = load_bitmap("lion.png",context);
        }

        Bitmap load_bitmap(String filename,Context context) {
            Bitmap result = null;
            try {
                AssetManager assets = context.getAssets();
                InputStream istream = assets.open(filename);
                BitmapFactory.Options options=new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                result = BitmapFactory.decodeStream(istream,null,options);
                istream.close();
                return result;
            } catch (IOException e) {
                return null;
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.RED);

            canvas.drawBitmap(lion,canvas.getWidth()/2,canvas.getHeight()/2,null);
        }
    }
}
