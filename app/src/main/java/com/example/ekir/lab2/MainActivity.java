package com.example.ekir.lab2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button btn_draw_bitmap;
    Button btn_draw_circles;
    Button btn_screen_info;
    Button btn_shapes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_draw_bitmap = (Button)this.findViewById(R.id.btn_draw_bitmap_image);
        btn_draw_circles = (Button)this.findViewById(R.id.btn_draw_circles);
        btn_screen_info = (Button)this.findViewById(R.id.btn_screen_info);
        btn_shapes = (Button)this.findViewById(R.id.btn_shapes);

        btn_draw_bitmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrawBitmapActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        btn_draw_circles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrawCirclesActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        btn_screen_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScreenInfoActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        btn_shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShapesActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
